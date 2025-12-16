package com.squareup.tape2;

import com.avito.android.remote.model.AdvertStatus;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: InMemoryObjectQueue.java */
/* loaded from: classes7.dex */
final class b<T> extends c<T> {

    /* renamed from: d, reason: collision with root package name */
    public boolean f366484d;

    /* renamed from: c, reason: collision with root package name */
    public int f366483c = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f366482b = new ArrayDeque();

    /* compiled from: InMemoryObjectQueue.java */
    public final class a implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<T> f366485b;

        /* renamed from: c, reason: collision with root package name */
        public int f366486c = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f366487d;

        public a(Iterator<T> it) {
            this.f366487d = b.this.f366483c;
            this.f366485b = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (b.this.f366483c == this.f366487d) {
                return this.f366485b.hasNext();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public final T next() {
            b bVar = b.this;
            if (bVar.f366484d) {
                throw new IllegalStateException(AdvertStatus.CLOSED);
            }
            if (bVar.f366483c != this.f366487d) {
                throw new ConcurrentModificationException();
            }
            T next = this.f366485b.next();
            this.f366486c++;
            return next;
        }

        @Override // java.util.Iterator
        public final void remove() {
            b bVar = b.this;
            if (bVar.f366484d) {
                throw new IllegalStateException(AdvertStatus.CLOSED);
            }
            if (bVar.f366483c != this.f366487d) {
                throw new ConcurrentModificationException();
            }
            if (bVar.f366482b.size() == 0) {
                throw new NoSuchElementException();
            }
            if (this.f366486c != 1) {
                throw new UnsupportedOperationException("Removal is only permitted from the head.");
            }
            try {
                bVar.d(1);
                this.f366487d = bVar.f366483c;
                this.f366486c--;
            } catch (IOException e12) {
                throw new RuntimeException("todo: throw a proper error", e12);
            }
        }
    }

    @Override // com.squareup.tape2.c
    public final void a(T t12) {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f366484d = true;
    }

    @Override // com.squareup.tape2.c
    public final void d(int i12) throws IOException {
        if (this.f366484d) {
            throw new IOException(AdvertStatus.CLOSED);
        }
        this.f366483c++;
        this.f366482b.removeFirst();
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return new a(this.f366482b.iterator());
    }

    @Override // com.squareup.tape2.c
    public final int size() {
        return this.f366482b.size();
    }
}
