package com.fasterxml.jackson.databind;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: MappingIterator.java */
/* loaded from: classes4.dex */
public class n<T> implements Iterator<T>, Closeable {

    /* renamed from: b, reason: collision with root package name */
    public int f342184b = 0;

    public final boolean a() {
        int i12 = this.f342184b;
        if (i12 == 0) {
            return false;
        }
        if (i12 != 1) {
            return i12 != 2;
        }
        throw null;
    }

    public final T b() {
        int i12 = this.f342184b;
        if (i12 == 0) {
            throw new NoSuchElementException();
        }
        if ((i12 == 1 || i12 == 2) && !a()) {
            throw new NoSuchElementException();
        }
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f342184b != 0) {
            this.f342184b = 0;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        try {
            return a();
        } catch (JsonMappingException e12) {
            throw new RuntimeJsonMappingException(e12.getMessage(), e12);
        } catch (IOException e13) {
            throw new RuntimeException(e13.getMessage(), e13);
        }
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            b();
            throw null;
        } catch (JsonMappingException e12) {
            throw new RuntimeJsonMappingException(e12.getMessage(), e12);
        } catch (IOException e13) {
            throw new RuntimeException(e13.getMessage(), e13);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
