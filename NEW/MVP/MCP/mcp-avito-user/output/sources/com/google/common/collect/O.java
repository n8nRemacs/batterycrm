package com.google.common.collect;

import aZ0.InterfaceC19845a;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Objects;

/* compiled from: CompactLinkedHashSet.java */
@XY0.c
@InterfaceC37329f0
/* loaded from: classes6.dex */
class O<E> extends L<E> {

    /* renamed from: g, reason: collision with root package name */
    @I41.a
    public transient int[] f359529g;

    /* renamed from: h, reason: collision with root package name */
    @I41.a
    public transient int[] f359530h;

    /* renamed from: i, reason: collision with root package name */
    public transient int f359531i;

    /* renamed from: j, reason: collision with root package name */
    public transient int f359532j;

    public final void C(int i12, int i13) {
        if (i12 == -2) {
            this.f359531i = i13;
        } else {
            int[] iArr = this.f359530h;
            Objects.requireNonNull(iArr);
            iArr[i12] = i13 + 1;
        }
        if (i13 == -2) {
            this.f359532j = i12;
            return;
        }
        int[] iArr2 = this.f359529g;
        Objects.requireNonNull(iArr2);
        iArr2[i13] = i12 + 1;
    }

    @Override // com.google.common.collect.L
    public final int a(int i12, int i13) {
        return i12 >= size() ? i13 : i12;
    }

    @Override // com.google.common.collect.L
    public final int b() {
        int iB2 = super.b();
        this.f359529g = new int[iB2];
        this.f359530h = new int[iB2];
        return iB2;
    }

    @Override // com.google.common.collect.L, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (s()) {
            return;
        }
        this.f359531i = -2;
        this.f359532j = -2;
        int[] iArr = this.f359529g;
        if (iArr != null && this.f359530h != null) {
            Arrays.fill(iArr, 0, size(), 0);
            Arrays.fill(this.f359530h, 0, size(), 0);
        }
        super.clear();
    }

    @Override // com.google.common.collect.L
    @InterfaceC19845a
    public final LinkedHashSet d() {
        LinkedHashSet linkedHashSetD = super.d();
        this.f359529g = null;
        this.f359530h = null;
        return linkedHashSetD;
    }

    @Override // com.google.common.collect.L
    public final int g() {
        return this.f359531i;
    }

    @Override // com.google.common.collect.L
    public final int h(int i12) {
        Objects.requireNonNull(this.f359530h);
        return r0[i12] - 1;
    }

    @Override // com.google.common.collect.L
    public final void i(int i12) {
        super.i(i12);
        this.f359531i = -2;
        this.f359532j = -2;
    }

    @Override // com.google.common.collect.L
    public final void l(@InterfaceC37434x3 Object obj, int i12, int i13, int i14) {
        super.l(obj, i12, i13, i14);
        C(this.f359532j, i12);
        C(i12, -2);
    }

    @Override // com.google.common.collect.L
    public final void r(int i12, int i13) {
        int size = size() - 1;
        super.r(i12, i13);
        Objects.requireNonNull(this.f359529g);
        C(r4[i12] - 1, h(i12));
        if (i12 < size) {
            Objects.requireNonNull(this.f359529g);
            C(r4[size] - 1, i12);
            C(i12, h(size));
        }
        int[] iArr = this.f359529g;
        Objects.requireNonNull(iArr);
        iArr[size] = 0;
        int[] iArr2 = this.f359530h;
        Objects.requireNonNull(iArr2);
        iArr2[size] = 0;
    }

    @Override // com.google.common.collect.L, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = new Object[size()];
        C37414t3.b(this, objArr);
        return objArr;
    }

    @Override // com.google.common.collect.L
    public final void w(int i12) {
        super.w(i12);
        int[] iArr = this.f359529g;
        Objects.requireNonNull(iArr);
        this.f359529g = Arrays.copyOf(iArr, i12);
        int[] iArr2 = this.f359530h;
        Objects.requireNonNull(iArr2);
        this.f359530h = Arrays.copyOf(iArr2, i12);
    }

    @Override // com.google.common.collect.L, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C37414t3.c(this, tArr);
    }
}
