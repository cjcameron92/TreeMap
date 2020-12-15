package com.github.cjcameron92.treemap;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TreeMap<T extends Listener> implements Iterable<T> {

    protected List<T> listeners = new LinkedList<>();

    public void invoke() {
        listeners.forEach(T::invoke);
    }

    public void addListener(T listener) {
        if (!listeners.contains(listener)) this.listeners.add(listener);
    }

    public void removeListener(T listener) {
        this.listeners.remove(listener);
    }

    public List<T> getListeners() {
        return listeners;
    }

    @Override
    public Iterator<T> iterator() {
        return listeners.iterator();
    }
}
