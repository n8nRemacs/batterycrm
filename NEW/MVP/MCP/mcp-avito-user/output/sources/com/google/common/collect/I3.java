package com.google.common.collect;

import java.util.Objects;

/* compiled from: RegularImmutableList.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
class I3<E> extends AbstractC37401r1<E> {

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC37401r1<Object> f359390f = new I3(new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    @XY0.e
    public final transient Object[] f359391d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f359392e;

    public I3(Object[] objArr, int i12) {
        this.f359391d = objArr;
        this.f359392e = i12;
    }

    @Override // com.google.common.collect.AbstractC37401r1, com.google.common.collect.AbstractC37378n1
    public final int d(int i12, Object[] objArr) {
        Object[] objArr2 = this.f359391d;
        int i13 = this.f359392e;
        System.arraycopy(objArr2, 0, objArr, i12, i13);
        return i12 + i13;
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final Object[] e() {
        return this.f359391d;
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final int g() {
        return this.f359392e;
    }

    @Override // java.util.List
    public final E get(int i12) {
        com.google.common.base.M.i(i12, this.f359392e);
        E e12 = (E) this.f359391d[i12];
        Objects.requireNonNull(e12);
        return e12;
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final int h() {
        return 0;
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f359392e;
    }
}
