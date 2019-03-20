package io.github.dunwu.javacore.generics.entity;

/**
 * @author Zhang Peng
 * @date 2019-03-20
 */
public class MyMap<K,V> {
    private K key;
    private V value;

    public MyMap(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyMap{" + "key=" + key + ", value=" + value + '}';
    }
}
