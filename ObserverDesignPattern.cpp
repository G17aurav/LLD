#include <bits/stdc++.h>
using namespace std;

class Observer {
public:
    virtual void update(int quantity) = 0;
};

class Inventory {
private:
    int quantity = 0;
    vector<Observer*> observers;

public:
    void registerObserver(Observer* observer) {
        observers.push_back(observer);
    }

    void removeObserver(Observer* observer) {
        for (auto it = observers.begin(); it != observers.end();) {
            if (*it == observer) {
                it = observers.erase(it);
            } else {
                ++it;
            }
        }
    }

    void notifyObservers() {
        for (Observer* observer : observers) {
            observer->update(quantity);
        }
    }

    void setQuantity(int q) {
        quantity = q;
        notifyObservers();
    }
};

class Display : public Observer {
private:
    string name;

public:
    Display(const string& displayName) : name(displayName) {}

    void update(int quantity) override {
        cout << name << ": Quantity = " << quantity <<endl;
    }
};

int main() {
    Inventory inventory;

    Display display1("Inventory Manager");
    Display display2("User 1");
    Display display3("User 2");

    inventory.registerObserver(&display1);
    inventory.registerObserver(&display2);
    inventory.registerObserver(&display3);

    cout << "\nSetting quantity to 60:"<<endl;
    inventory.setQuantity(60);

    cout << "\nRemoving 'User 2' as an observer."<<endl;
    inventory.removeObserver(&display3);

    cout << "\nSetting quantity to 20:"<<endl;
    inventory.setQuantity(20);

    return 0;
}
