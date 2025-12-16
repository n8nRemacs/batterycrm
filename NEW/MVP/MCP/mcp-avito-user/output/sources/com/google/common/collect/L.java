package com.google.common.collect;

import aZ0.InterfaceC19845a;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* compiled from: CompactHashSet.java */
@XY0.c
@InterfaceC37329f0
/* loaded from: classes6.dex */
class L<E> extends AbstractSet<E> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    @I41.a
    public transient Object f359447b;

    /* renamed from: c, reason: collision with root package name */
    @I41.a
    public transient int[] f359448c;

    /* renamed from: d, reason: collision with root package name */
    @I41.a
    @XY0.e
    public transient Object[] f359449d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f359450e;

    /* renamed from: f, reason: collision with root package name */
    public transient int f359451f;

    /* compiled from: CompactHashSet.java */
    public class a implements Iterator<E> {

        /* renamed from: b, reason: collision with root package name */
        public int f359452b;

        /* renamed from: c, reason: collision with root package name */
        public int f359453c;

        /* renamed from: d, reason: collision with root package name */
        public int f359454d = -1;

        public a() {
            this.f359452b = L.this.f359450e;
            this.f359453c = L.this.g();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f359453c >= 0;
        }

        @Override // java.util.Iterator
        @InterfaceC37434x3
        public final E next() {
            L l12 = L.this;
            if (l12.f359450e != this.f359452b) {
                throw new ConcurrentModificationException();
            }
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i12 = this.f359453c;
            this.f359454d = i12;
            E e12 = (E) l12.t()[i12];
            this.f359453c = l12.h(this.f359453c);
            return e12;
        }

        @Override // java.util.Iterator
        public final void remove() {
            L l12 = L.this;
            if (l12.f359450e != this.f359452b) {
                throw new ConcurrentModificationException();
            }
            F.e(this.f359454d >= 0);
            this.f359452b += 32;
            l12.remove(l12.t()[this.f359454d]);
            this.f359453c = l12.a(this.f359453c, this.f359454d);
            this.f359454d = -1;
        }
    }

    public L() {
        i(3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i12 = objectInputStream.readInt();
        if (i12 < 0) {
            throw new InvalidObjectException(AK.c.g(i12, "Invalid size: "));
        }
        i(i12);
        for (int i13 = 0; i13 < i12; i13++) {
            add(objectInputStream.readObject());
        }
    }

    @XY0.d
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    public int a(int i12, int i13) {
        return i12 - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @InterfaceC19845a
    public final boolean add(@InterfaceC37434x3 E e12) {
        int iMin;
        if (s()) {
            b();
        }
        Set<E> setE = e();
        if (setE != null) {
            return setE.add(e12);
        }
        int[] iArrV = v();
        Object[] objArrT = t();
        int i12 = this.f359451f;
        int i13 = i12 + 1;
        int iC2 = C37348i1.c(e12);
        int iY2 = (1 << (this.f359450e & 31)) - 1;
        int i14 = iC2 & iY2;
        Object obj = this.f359447b;
        Objects.requireNonNull(obj);
        int iE2 = M.e(i14, obj);
        if (iE2 != 0) {
            int i15 = ~iY2;
            int i16 = iC2 & i15;
            int i17 = 0;
            while (true) {
                int i18 = iE2 - 1;
                int i19 = iArrV[i18];
                if ((i19 & i15) == i16 && com.google.common.base.F.a(e12, objArrT[i18])) {
                    return false;
                }
                int i22 = i19 & iY2;
                i17++;
                if (i22 != 0) {
                    iE2 = i22;
                } else {
                    if (i17 >= 9) {
                        return d().add(e12);
                    }
                    if (i13 > iY2) {
                        iY2 = y(iY2, M.c(iY2), iC2, i12);
                    } else {
                        iArrV[i18] = M.b(i19, i13, iY2);
                    }
                }
            }
        } else if (i13 > iY2) {
            iY2 = y(iY2, M.c(iY2), iC2, i12);
        } else {
            Object obj2 = this.f359447b;
            Objects.requireNonNull(obj2);
            M.f(i14, i13, obj2);
        }
        int length = v().length;
        if (i13 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            w(iMin);
        }
        l(e12, i12, iC2, iY2);
        this.f359451f = i13;
        this.f359450e += 32;
        return true;
    }

    @InterfaceC19845a
    public int b() {
        com.google.common.base.M.n("Arrays already allocated", s());
        int i12 = this.f359450e;
        int iMax = Math.max(4, C37348i1.a(1.0d, i12 + 1));
        this.f359447b = M.a(iMax);
        this.f359450e = M.b(this.f359450e, 32 - Integer.numberOfLeadingZeros(iMax - 1), 31);
        this.f359448c = new int[i12];
        this.f359449d = new Object[i12];
        return i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (s()) {
            return;
        }
        this.f359450e += 32;
        Set<E> setE = e();
        if (setE != null) {
            this.f359450e = com.google.common.primitives.l.c(size(), 3);
            setE.clear();
            this.f359447b = null;
            this.f359451f = 0;
            return;
        }
        Arrays.fill(t(), 0, this.f359451f, (Object) null);
        Object obj = this.f359447b;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(v(), 0, this.f359451f, 0);
        this.f359451f = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@I41.a Object obj) {
        if (s()) {
            return false;
        }
        Set<E> setE = e();
        if (setE != null) {
            return setE.contains(obj);
        }
        int iC2 = C37348i1.c(obj);
        int i12 = (1 << (this.f359450e & 31)) - 1;
        Object obj2 = this.f359447b;
        Objects.requireNonNull(obj2);
        int iE2 = M.e(iC2 & i12, obj2);
        if (iE2 == 0) {
            return false;
        }
        int i13 = ~i12;
        int i14 = iC2 & i13;
        do {
            int i15 = iE2 - 1;
            int i16 = v()[i15];
            if ((i16 & i13) == i14 && com.google.common.base.F.a(obj, t()[i15])) {
                return true;
            }
            iE2 = i16 & i12;
        } while (iE2 != 0);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC19845a
    @XY0.e
    public LinkedHashSet d() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(1 << (this.f359450e & 31), 1.0f);
        int iG2 = g();
        while (iG2 >= 0) {
            linkedHashSet.add(t()[iG2]);
            iG2 = h(iG2);
        }
        this.f359447b = linkedHashSet;
        this.f359448c = null;
        this.f359449d = null;
        this.f359450e += 32;
        return linkedHashSet;
    }

    @I41.a
    @XY0.e
    public final Set<E> e() {
        Object obj = this.f359447b;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public int g() {
        return isEmpty() ? -1 : 0;
    }

    public int h(int i12) {
        int i13 = i12 + 1;
        if (i13 < this.f359451f) {
            return i13;
        }
        return -1;
    }

    public void i(int i12) {
        com.google.common.base.M.d("Expected size must be >= 0", i12 >= 0);
        this.f359450e = com.google.common.primitives.l.c(i12, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        Set<E> setE = e();
        return setE != null ? setE.iterator() : new a();
    }

    public void l(@InterfaceC37434x3 Object obj, int i12, int i13, int i14) {
        v()[i12] = M.b(i13, 0, i14);
        t()[i12] = obj;
    }

    public void r(int i12, int i13) {
        Object obj = this.f359447b;
        Objects.requireNonNull(obj);
        int[] iArrV = v();
        Object[] objArrT = t();
        int size = size();
        int i14 = size - 1;
        if (i12 >= i14) {
            objArrT[i12] = null;
            iArrV[i12] = 0;
            return;
        }
        Object obj2 = objArrT[i14];
        objArrT[i12] = obj2;
        objArrT[i14] = null;
        iArrV[i12] = iArrV[i14];
        iArrV[i14] = 0;
        int iC2 = C37348i1.c(obj2) & i13;
        int iE2 = M.e(iC2, obj);
        if (iE2 == size) {
            M.f(iC2, i12 + 1, obj);
            return;
        }
        while (true) {
            int i15 = iE2 - 1;
            int i16 = iArrV[i15];
            int i17 = i16 & i13;
            if (i17 == size) {
                iArrV[i15] = M.b(i16, i12 + 1, i13);
                return;
            }
            iE2 = i17;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @InterfaceC19845a
    public final boolean remove(@I41.a Object obj) {
        if (s()) {
            return false;
        }
        Set<E> setE = e();
        if (setE != null) {
            return setE.remove(obj);
        }
        int i12 = (1 << (this.f359450e & 31)) - 1;
        Object obj2 = this.f359447b;
        Objects.requireNonNull(obj2);
        int iD2 = M.d(obj, null, i12, obj2, v(), t(), null);
        if (iD2 == -1) {
            return false;
        }
        r(iD2, i12);
        this.f359451f--;
        this.f359450e += 32;
        return true;
    }

    @XY0.e
    public final boolean s() {
        return this.f359447b == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set<E> setE = e();
        return setE != null ? setE.size() : this.f359451f;
    }

    public final Object[] t() {
        Object[] objArr = this.f359449d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (s()) {
            return new Object[0];
        }
        Set<E> setE = e();
        return setE != null ? setE.toArray() : Arrays.copyOf(t(), this.f359451f);
    }

    public final int[] v() {
        int[] iArr = this.f359448c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public void w(int i12) {
        this.f359448c = Arrays.copyOf(v(), i12);
        this.f359449d = Arrays.copyOf(t(), i12);
    }

    @InterfaceC19845a
    public final int y(int i12, int i13, int i14, int i15) {
        Object objA = M.a(i13);
        int i16 = i13 - 1;
        if (i15 != 0) {
            M.f(i14 & i16, i15 + 1, objA);
        }
        Object obj = this.f359447b;
        Objects.requireNonNull(obj);
        int[] iArrV = v();
        for (int i17 = 0; i17 <= i12; i17++) {
            int iE2 = M.e(i17, obj);
            while (iE2 != 0) {
                int i18 = iE2 - 1;
                int i19 = iArrV[i18];
                int i22 = ((~i12) & i19) | i17;
                int i23 = i22 & i16;
                int iE3 = M.e(i23, objA);
                M.f(i23, iE2, objA);
                iArrV[i18] = M.b(i22, iE3, i16);
                iE2 = i19 & i12;
            }
        }
        this.f359447b = objA;
        this.f359450e = M.b(this.f359450e, 32 - Integer.numberOfLeadingZeros(i16), 31);
        return i16;
    }

    public L(int i12) {
        i(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @InterfaceC19845a
    public <T> T[] toArray(T[] tArr) {
        if (s()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set<E> setE = e();
        if (setE != null) {
            return (T[]) setE.toArray(tArr);
        }
        Object[] objArrT = t();
        int i12 = this.f359451f;
        com.google.common.base.M.l(0, i12, objArrT.length);
        if (tArr.length < i12) {
            if (tArr.length != 0) {
                tArr = (T[]) Arrays.copyOf(tArr, 0);
            }
            tArr = (T[]) Arrays.copyOf(tArr, i12);
        } else if (tArr.length > i12) {
            tArr[i12] = null;
        }
        System.arraycopy(objArrT, 0, tArr, 0, i12);
        return tArr;
    }
}
