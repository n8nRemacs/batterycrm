package com.squareup.tape2;

import java.io.Closeable;
import java.io.OutputStream;

/* compiled from: ObjectQueue.java */
/* loaded from: classes7.dex */
public abstract class c<T> implements Iterable<T>, Closeable {

    /* compiled from: ObjectQueue.java */
    public interface a<T> {
        void a(T t12, OutputStream outputStream);

        T b(byte[] bArr);
    }

    public static <T> c<T> b(e eVar, a<T> aVar) {
        return new com.squareup.tape2.a(eVar, aVar);
    }

    public abstract void a(T t12);

    public abstract void d(int i12);

    public abstract boolean isEmpty();

    public abstract int size();
}
