package com.google.common.collect;

/* compiled from: RegularImmutableSet.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
final class L3<E> extends H1<E> {

    /* renamed from: j, reason: collision with root package name */
    public static final Object[] f359467j;

    /* renamed from: k, reason: collision with root package name */
    public static final L3<Object> f359468k;

    /* renamed from: e, reason: collision with root package name */
    @XY0.e
    public final transient Object[] f359469e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f359470f;

    /* renamed from: g, reason: collision with root package name */
    @XY0.e
    public final transient Object[] f359471g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f359472h;

    /* renamed from: i, reason: collision with root package name */
    public final transient int f359473i;

    static {
        Object[] objArr = new Object[0];
        f359467j = objArr;
        f359468k = new L3<>(objArr, 0, objArr, 0, 0);
    }

    public L3(Object[] objArr, int i12, Object[] objArr2, int i13, int i14) {
        this.f359469e = objArr;
        this.f359470f = i12;
        this.f359471g = objArr2;
        this.f359472h = i13;
        this.f359473i = i14;
    }

    @Override // com.google.common.collect.H1
    public final boolean C() {
        return true;
    }

    @Override // com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@I41.a Object obj) {
        if (obj != null) {
            Object[] objArr = this.f359471g;
            if (objArr.length != 0) {
                int iC2 = C37348i1.c(obj);
                while (true) {
                    int i12 = iC2 & this.f359472h;
                    Object obj2 = objArr[i12];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iC2 = i12 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final int d(int i12, Object[] objArr) {
        Object[] objArr2 = this.f359469e;
        int i13 = this.f359473i;
        System.arraycopy(objArr2, 0, objArr, i12, i13);
        return i12 + i13;
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final Object[] e() {
        return this.f359469e;
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final int g() {
        return this.f359473i;
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final int h() {
        return 0;
    }

    @Override // com.google.common.collect.H1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f359470f;
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final boolean i() {
        return false;
    }

    @Override // com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public final N4<E> iterator() {
        return b().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f359473i;
    }

    @Override // com.google.common.collect.H1
    public final AbstractC37401r1<E> y() {
        return AbstractC37401r1.r(this.f359473i, this.f359469e);
    }
}
