package com.fasterxml.jackson.databind.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: LRUMap.java */
/* loaded from: classes4.dex */
public class q<K, V> implements s<K, V>, Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final transient int f342623b;

    /* renamed from: c, reason: collision with root package name */
    public final transient ConcurrentHashMap<K, V> f342624c;

    /* renamed from: d, reason: collision with root package name */
    public transient int f342625d;

    public q(int i12, int i13) {
        this.f342624c = new ConcurrentHashMap<>(i12, 0.8f, 4);
        this.f342623b = i13;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.f342625d = objectInputStream.readInt();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f342625d);
    }

    @Override // com.fasterxml.jackson.databind.util.s
    public final Object a(Serializable serializable, Object obj) {
        if (this.f342624c.size() >= this.f342623b) {
            synchronized (this) {
                if (this.f342624c.size() >= this.f342623b) {
                    this.f342624c.clear();
                }
            }
        }
        return this.f342624c.putIfAbsent(obj, serializable);
    }

    public final void b(Serializable serializable, Object obj) {
        if (this.f342624c.size() >= this.f342623b) {
            synchronized (this) {
                if (this.f342624c.size() >= this.f342623b) {
                    this.f342624c.clear();
                }
            }
        }
        this.f342624c.put(serializable, obj);
    }

    @Override // com.fasterxml.jackson.databind.util.s
    public final V get(Object obj) {
        return this.f342624c.get(obj);
    }

    public Object readResolve() {
        int i12 = this.f342625d;
        return new q(i12, i12);
    }
}
