package com.yandex.mobile.ads.embedded.guava.collect;

import aZ0.InterfaceC19845a;
import com.yandex.mobile.ads.embedded.guava.collect.p;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@aZ0.f
/* loaded from: classes8.dex */
public abstract class n<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[] f382782a = new Object[0];

    @aZ0.f
    public static abstract class b<E> {
    }

    @InterfaceC19845a
    public int a(int i12, Object[] objArr) {
        p0<E> it = iterator();
        while (it.hasNext()) {
            objArr[i12] = it.next();
            i12++;
        }
        return i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC19845a
    @aZ0.e
    @Deprecated
    public final boolean add(E e12) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC19845a
    @aZ0.e
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public p<E> b() {
        if (isEmpty()) {
            int i12 = p.f382791c;
            return (p<E>) f0.f382745f;
        }
        Object[] array = toArray(f382782a);
        int i13 = p.f382791c;
        return p.b(array.length, array);
    }

    @I41.a
    public Object[] c() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @aZ0.e
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(@I41.a Object obj);

    public int d() {
        throw new UnsupportedOperationException();
    }

    public int e() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean f();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public abstract p0<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC19845a
    @aZ0.e
    @Deprecated
    public final boolean remove(@I41.a Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC19845a
    @aZ0.e
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC19845a
    @aZ0.e
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f382782a);
    }

    public Object writeReplace() {
        return new p.c(toArray(f382782a));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC19845a
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        if (tArr.length < size) {
            Object[] objArrC = c();
            if (objArrC != null) {
                return (T[]) e0.a(objArrC, e(), d(), tArr);
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(0, tArr);
        return tArr;
    }

    public static abstract class a<E> extends b<E> {

        /* renamed from: a, reason: collision with root package name */
        Object[] f382783a;

        /* renamed from: b, reason: collision with root package name */
        int f382784b;

        /* renamed from: c, reason: collision with root package name */
        boolean f382785c;

        public a() {
            h.a(4, "initialCapacity");
            this.f382783a = new Object[4];
            this.f382784b = 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC19845a
        public final b a(List list) {
            if (list instanceof Collection) {
                int size = list.size() + this.f382784b;
                Object[] objArr = this.f382783a;
                if (objArr.length < size) {
                    int length = objArr.length;
                    if (size < 0) {
                        throw new AssertionError("cannot store more than MAX_VALUE elements");
                    }
                    int iHighestOneBit = length + (length >> 1) + 1;
                    if (iHighestOneBit < size) {
                        iHighestOneBit = Integer.highestOneBit(size - 1) << 1;
                    }
                    if (iHighestOneBit < 0) {
                        iHighestOneBit = Integer.MAX_VALUE;
                    }
                    this.f382783a = Arrays.copyOf(objArr, iHighestOneBit);
                    this.f382785c = false;
                } else if (this.f382785c) {
                    this.f382783a = (Object[]) objArr.clone();
                    this.f382785c = false;
                }
                if (list instanceof n) {
                    this.f382784b = ((n) list).a(this.f382784b, this.f382783a);
                    return this;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((p.a) this).a(it.next());
            }
            return this;
        }

        @InterfaceC19845a
        public final void a(Object obj) {
            obj.getClass();
            int i12 = this.f382784b;
            int i13 = i12 + 1;
            Object[] objArr = this.f382783a;
            if (objArr.length < i13) {
                int length = objArr.length;
                if (i13 >= 0) {
                    int iHighestOneBit = length + (length >> 1) + 1;
                    if (iHighestOneBit < i13) {
                        iHighestOneBit = Integer.highestOneBit(i12) << 1;
                    }
                    if (iHighestOneBit < 0) {
                        iHighestOneBit = Integer.MAX_VALUE;
                    }
                    this.f382783a = Arrays.copyOf(objArr, iHighestOneBit);
                    this.f382785c = false;
                } else {
                    throw new AssertionError("cannot store more than MAX_VALUE elements");
                }
            } else if (this.f382785c) {
                this.f382783a = (Object[]) objArr.clone();
                this.f382785c = false;
            }
            Object[] objArr2 = this.f382783a;
            int i14 = this.f382784b;
            this.f382784b = i14 + 1;
            objArr2[i14] = obj;
        }
    }
}
