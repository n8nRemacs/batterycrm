package io.sentry.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* compiled from: CircularFifoQueue.java */
/* loaded from: classes8.dex */
public class a<E> extends AbstractCollection<E> implements Queue<E>, Serializable {
    private static final long serialVersionUID = -8423413834657610406L;

    /* renamed from: b, reason: collision with root package name */
    public transient E[] f405227b;

    /* renamed from: c, reason: collision with root package name */
    public transient int f405228c;

    /* renamed from: d, reason: collision with root package name */
    public transient int f405229d;

    /* renamed from: e, reason: collision with root package name */
    public transient boolean f405230e;

    /* renamed from: f, reason: collision with root package name */
    public final int f405231f;

    /* compiled from: CircularFifoQueue.java */
    /* renamed from: io.sentry.util.a$a, reason: collision with other inner class name */
    public class C11534a implements Iterator<E> {

        /* renamed from: b, reason: collision with root package name */
        public int f405232b;

        /* renamed from: c, reason: collision with root package name */
        public int f405233c = -1;

        /* renamed from: d, reason: collision with root package name */
        public boolean f405234d;

        public C11534a() {
            this.f405232b = a.this.f405228c;
            this.f405234d = a.this.f405230e;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f405234d || this.f405232b != a.this.f405229d;
        }

        @Override // java.util.Iterator
        public final E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f405234d = false;
            int i12 = this.f405232b;
            this.f405233c = i12;
            a aVar = a.this;
            int i13 = i12 + 1;
            this.f405232b = i13 < aVar.f405231f ? i13 : 0;
            return aVar.f405227b[i12];
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i12;
            int i13 = this.f405233c;
            if (i13 == -1) {
                throw new IllegalStateException();
            }
            a aVar = a.this;
            int i14 = aVar.f405228c;
            if (i13 == i14) {
                aVar.remove();
                this.f405233c = -1;
                return;
            }
            int i15 = i13 + 1;
            int i16 = aVar.f405231f;
            if (i14 >= i13 || i15 >= (i12 = aVar.f405229d)) {
                while (i15 != aVar.f405229d) {
                    if (i15 >= i16) {
                        E[] eArr = aVar.f405227b;
                        eArr[i15 - 1] = eArr[0];
                    } else {
                        E[] eArr2 = aVar.f405227b;
                        int i17 = i15 - 1;
                        if (i17 < 0) {
                            i17 = i16 - 1;
                        }
                        eArr2[i17] = eArr2[i15];
                        i15++;
                        if (i15 >= i16) {
                        }
                    }
                    i15 = 0;
                }
            } else {
                E[] eArr3 = aVar.f405227b;
                System.arraycopy(eArr3, i15, eArr3, i13, i12 - i15);
            }
            this.f405233c = -1;
            int i18 = aVar.f405229d - 1;
            if (i18 < 0) {
                i18 = i16 - 1;
            }
            aVar.f405229d = i18;
            aVar.f405227b[i18] = null;
            aVar.f405230e = false;
            int i19 = this.f405232b - 1;
            if (i19 < 0) {
                i19 = i16 - 1;
            }
            this.f405232b = i19;
        }
    }

    public a() {
        this(32);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i12 = this.f405231f;
        this.f405227b = (E[]) new Object[i12];
        int i13 = objectInputStream.readInt();
        for (int i14 = 0; i14 < i13; i14++) {
            ((E[]) this.f405227b)[i14] = objectInputStream.readObject();
        }
        this.f405228c = 0;
        boolean z12 = i13 == i12;
        this.f405230e = z12;
        if (z12) {
            this.f405229d = 0;
        } else {
            this.f405229d = i13;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        C11534a c11534a = new C11534a();
        while (c11534a.hasNext()) {
            objectOutputStream.writeObject(c11534a.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(E e12) {
        if (e12 == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        int size = size();
        int i12 = this.f405231f;
        if (size == i12) {
            remove();
        }
        E[] eArr = this.f405227b;
        int i13 = this.f405229d;
        int i14 = i13 + 1;
        this.f405229d = i14;
        eArr[i13] = e12;
        if (i14 >= i12) {
            this.f405229d = 0;
        }
        if (this.f405229d == this.f405228c) {
            this.f405230e = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f405230e = false;
        this.f405228c = 0;
        this.f405229d = 0;
        Arrays.fill(this.f405227b, (Object) null);
    }

    @Override // java.util.Queue
    public final E element() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return peek();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new C11534a();
    }

    @Override // java.util.Queue
    public final boolean offer(E e12) {
        add(e12);
        return true;
    }

    @Override // java.util.Queue
    public final E peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f405227b[this.f405228c];
    }

    @Override // java.util.Queue
    public final E poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public final E remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        E[] eArr = this.f405227b;
        int i12 = this.f405228c;
        E e12 = eArr[i12];
        if (e12 != null) {
            int i13 = i12 + 1;
            this.f405228c = i13;
            eArr[i12] = null;
            if (i13 >= this.f405231f) {
                this.f405228c = 0;
            }
            this.f405230e = false;
        }
        return e12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i12 = this.f405229d;
        int i13 = this.f405228c;
        int i14 = this.f405231f;
        if (i12 < i13) {
            return (i14 - i13) + i12;
        }
        if (i12 != i13) {
            return i12 - i13;
        }
        if (this.f405230e) {
            return i14;
        }
        return 0;
    }

    public a(int i12) {
        this.f405228c = 0;
        this.f405229d = 0;
        this.f405230e = false;
        if (i12 <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        this.f405227b = (E[]) new Object[i12];
        this.f405231f = i12;
    }
}
