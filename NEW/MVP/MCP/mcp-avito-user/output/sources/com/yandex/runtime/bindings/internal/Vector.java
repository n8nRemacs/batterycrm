package com.yandex.runtime.bindings.internal;

import com.yandex.runtime.NativeObject;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.RandomAccess;

/* loaded from: classes8.dex */
class Vector<E> extends AbstractList<E> implements RandomAccess {
    private ArrayList<E> list;
    private int listSize = sizeNative();
    private NativeObject nativeObject;

    public Vector(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // java.util.AbstractList, java.util.List
    public synchronized E get(int i12) {
        E e12;
        try {
            if (this.list == null) {
                this.list = new ArrayList<>(this.listSize);
                for (int i13 = 0; i13 != this.listSize; i13++) {
                    this.list.add(null);
                }
            }
            e12 = this.list.get(i12);
            if (e12 == null) {
                e12 = getNative(i12);
                this.list.set(i12, e12);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return e12;
    }

    public native E getNative(int i12);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.listSize;
    }

    public native int sizeNative();
}
