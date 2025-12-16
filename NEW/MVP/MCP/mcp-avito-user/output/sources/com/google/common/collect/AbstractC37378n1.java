package com.google.common.collect;

import aZ0.InterfaceC19845a;
import com.google.common.collect.AbstractC37401r1;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: ImmutableCollection.java */
@InterfaceC37329f0
@aZ0.f
@XY0.b
/* renamed from: com.google.common.collect.n1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37378n1<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f359865b = new Object[0];

    /* compiled from: ImmutableCollection.java */
    /* renamed from: com.google.common.collect.n1$a */
    public static abstract class a<E> extends b<E> {

        /* renamed from: a, reason: collision with root package name */
        public Object[] f359866a;

        /* renamed from: b, reason: collision with root package name */
        public int f359867b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f359868c;

        public a(int i12) {
            F.b(i12, "initialCapacity");
            this.f359866a = new Object[i12];
            this.f359867b = 0;
        }

        @Override // 
        @InterfaceC19845a
        /* renamed from: b */
        public a<E> c(E e12) {
            e12.getClass();
            f(this.f359867b + 1);
            Object[] objArr = this.f359866a;
            int i12 = this.f359867b;
            this.f359867b = i12 + 1;
            objArr[i12] = e12;
            return this;
        }

        @InterfaceC19845a
        public final void d(Iterable iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                f(collection.size() + this.f359867b);
                if (collection instanceof AbstractC37378n1) {
                    this.f359867b = ((AbstractC37378n1) collection).d(this.f359867b, this.f359866a);
                    return;
                }
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
        }

        @InterfaceC19845a
        public void e(List list) {
            d(list);
        }

        public final void f(int i12) {
            Object[] objArr = this.f359866a;
            if (objArr.length < i12) {
                this.f359866a = Arrays.copyOf(objArr, b.a(objArr.length, i12));
                this.f359868c = false;
            } else if (this.f359868c) {
                this.f359866a = (Object[]) objArr.clone();
                this.f359868c = false;
            }
        }
    }

    /* compiled from: ImmutableCollection.java */
    @aZ0.f
    /* renamed from: com.google.common.collect.n1$b */
    public static abstract class b<E> {
        public static int a(int i12, int i13) {
            if (i13 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i12 + (i12 >> 1) + 1;
            if (iHighestOneBit < i13) {
                iHighestOneBit = Integer.highestOneBit(i13 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }
    }

    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
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

    public AbstractC37401r1<E> b() {
        if (isEmpty()) {
            O4<Object> o42 = AbstractC37401r1.f359977c;
            return (AbstractC37401r1<E>) I3.f359390f;
        }
        Object[] array = toArray(f359865b);
        O4<Object> o43 = AbstractC37401r1.f359977c;
        return AbstractC37401r1.r(array.length, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @aZ0.e
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(@I41.a Object obj);

    @InterfaceC19845a
    public int d(int i12, Object[] objArr) {
        N4<E> it = iterator();
        while (it.hasNext()) {
            objArr[i12] = it.next();
            i12++;
        }
        return i12;
    }

    @I41.a
    public Object[] e() {
        return null;
    }

    public int g() {
        throw new UnsupportedOperationException();
    }

    public int h() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean i();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public abstract N4<E> iterator();

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
    @XY0.d
    public final Object[] toArray() {
        return toArray(f359865b);
    }

    @XY0.d
    public Object writeReplace() {
        return new AbstractC37401r1.d(toArray(f359865b));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC19845a
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        if (tArr.length < size) {
            Object[] objArrE = e();
            if (objArrE != null) {
                return (T[]) Arrays.copyOfRange(objArrE, h(), g(), tArr.getClass());
            }
            if (tArr.length != 0) {
                tArr = (T[]) Arrays.copyOf(tArr, 0);
            }
            tArr = (T[]) Arrays.copyOf(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        d(0, tArr);
        return tArr;
    }
}
