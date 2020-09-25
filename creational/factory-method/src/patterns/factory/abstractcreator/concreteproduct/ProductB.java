package patterns.factory.abstractcreator.concreteproduct;

import patterns.factory.abstractcreator.product.Product;

public class ProductB implements Product {
    @Override
    public void doSomething() {
        System.out.println(getClass().getSimpleName());
    }
}
