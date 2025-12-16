package com.google.common.collect;

import aZ0.InterfaceC19845a;
import com.google.common.collect.InterfaceC37338g3;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: EnumMultiset.java */
@InterfaceC37329f0
@XY0.d
@XY0.b
/* renamed from: com.google.common.collect.l0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37365l0<E extends Enum<E>> extends AbstractC37352j<E> implements Serializable {

    @XY0.c
    private static final long serialVersionUID = 0;

    /* renamed from: d, reason: collision with root package name */
    public transient Class<E> f359812d;

    /* renamed from: e, reason: collision with root package name */
    public transient E[] f359813e;

    /* renamed from: f, reason: collision with root package name */
    public transient int[] f359814f;

    /* renamed from: g, reason: collision with root package name */
    public transient int f359815g;

    /* renamed from: h, reason: collision with root package name */
    public transient long f359816h;

    /* compiled from: EnumMultiset.java */
    /* renamed from: com.google.common.collect.l0$a */
    public class a extends C37365l0<E>.c<E> {
        public a() {
            super();
        }

        @Override // com.google.common.collect.C37365l0.c
        public final Object a(int i12) {
            return C37365l0.this.f359813e[i12];
        }
    }

    /* compiled from: EnumMultiset.java */
    /* renamed from: com.google.common.collect.l0$b */
    public class b extends C37365l0<E>.c<InterfaceC37338g3.a<E>> {
        public b() {
            super();
        }

        @Override // com.google.common.collect.C37365l0.c
        public final Object a(int i12) {
            return new C37371m0(this, i12);
        }
    }

    /* compiled from: EnumMultiset.java */
    /* renamed from: com.google.common.collect.l0$c */
    public abstract class c<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        public int f359819b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f359820c = -1;

        public c() {
        }

        public abstract T a(int i12);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            while (true) {
                int i12 = this.f359819b;
                C37365l0 c37365l0 = C37365l0.this;
                if (i12 >= c37365l0.f359813e.length) {
                    return false;
                }
                if (c37365l0.f359814f[i12] > 0) {
                    return true;
                }
                this.f359819b = i12 + 1;
            }
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tA2 = a(this.f359819b);
            int i12 = this.f359819b;
            this.f359820c = i12;
            this.f359819b = i12 + 1;
            return tA2;
        }

        @Override // java.util.Iterator
        public final void remove() {
            F.e(this.f359820c >= 0);
            C37365l0 c37365l0 = C37365l0.this;
            int[] iArr = c37365l0.f359814f;
            int i12 = this.f359820c;
            int i13 = iArr[i12];
            if (i13 > 0) {
                c37365l0.f359815g--;
                c37365l0.f359816h -= i13;
                iArr[i12] = 0;
            }
            this.f359820c = -1;
        }
    }

    @XY0.c
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        Class<E> cls = (Class) object;
        this.f359812d = cls;
        E[] enumConstants = cls.getEnumConstants();
        this.f359813e = enumConstants;
        this.f359814f = new int[enumConstants.length];
        S3.d(this, objectInputStream, objectInputStream.readInt());
    }

    @XY0.c
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f359812d);
        S3.g(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractC37352j, com.google.common.collect.InterfaceC37338g3
    @InterfaceC19845a
    public final int O3(int i12, @I41.a Object obj) {
        if (obj == null || !l(obj)) {
            return 0;
        }
        Enum r12 = (Enum) obj;
        F.b(i12, "occurrences");
        if (i12 == 0) {
            return S5(obj);
        }
        int iOrdinal = r12.ordinal();
        int[] iArr = this.f359814f;
        int i13 = iArr[iOrdinal];
        if (i13 == 0) {
            return 0;
        }
        if (i13 <= i12) {
            iArr[iOrdinal] = 0;
            this.f359815g--;
            this.f359816h -= i13;
        } else {
            iArr[iOrdinal] = i13 - i12;
            this.f359816h -= i12;
        }
        return i13;
    }

    @Override // com.google.common.collect.InterfaceC37338g3
    public final int S5(@I41.a Object obj) {
        if (obj == null || !l(obj)) {
            return 0;
        }
        return this.f359814f[((Enum) obj).ordinal()];
    }

    @Override // com.google.common.collect.AbstractC37352j, com.google.common.collect.InterfaceC37338g3
    @InterfaceC19845a
    public final int add(int i12, Object obj) {
        Enum r92 = (Enum) obj;
        i(r92);
        F.b(i12, "occurrences");
        if (i12 == 0) {
            return S5(r92);
        }
        int iOrdinal = r92.ordinal();
        int i13 = this.f359814f[iOrdinal];
        long j12 = i12;
        long j13 = i13 + j12;
        com.google.common.base.M.e("too many occurrences: %s", j13 <= 2147483647L, j13);
        this.f359814f[iOrdinal] = (int) j13;
        if (i13 == 0) {
            this.f359815g++;
        }
        this.f359816h += j12;
        return i13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        Arrays.fill(this.f359814f, 0);
        this.f359816h = 0L;
        this.f359815g = 0;
    }

    @Override // com.google.common.collect.AbstractC37352j
    public final int e() {
        return this.f359815g;
    }

    @Override // com.google.common.collect.AbstractC37352j
    public final Iterator<E> g() {
        return new a();
    }

    @Override // com.google.common.collect.AbstractC37352j
    public final Iterator<InterfaceC37338g3.a<E>> h() {
        return new b();
    }

    public final void i(Object obj) {
        obj.getClass();
        if (l(obj)) {
            return;
        }
        throw new ClassCastException("Expected an " + this.f359812d + " but got " + obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return C37374m3.c(this);
    }

    public final boolean l(@I41.a Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r52 = (Enum) obj;
        int iOrdinal = r52.ordinal();
        E[] eArr = this.f359813e;
        return iOrdinal < eArr.length && eArr[iOrdinal] == r52;
    }

    @Override // com.google.common.collect.AbstractC37352j, com.google.common.collect.InterfaceC37338g3
    @InterfaceC19845a
    public final int p6(Object obj) {
        Enum r62 = (Enum) obj;
        i(r62);
        F.b(0, "count");
        int iOrdinal = r62.ordinal();
        int[] iArr = this.f359814f;
        int i12 = iArr[iOrdinal];
        iArr[iOrdinal] = 0;
        this.f359816h += 0 - i12;
        if (i12 > 0) {
            this.f359815g--;
        }
        return i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return com.google.common.primitives.l.f(this.f359816h);
    }
}
