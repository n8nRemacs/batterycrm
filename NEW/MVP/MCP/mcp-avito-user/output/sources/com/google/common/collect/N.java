package com.google.common.collect;

import aZ0.InterfaceC19845a;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: CompactLinkedHashMap.java */
@XY0.c
@InterfaceC37329f0
@XY0.d
/* loaded from: classes6.dex */
class N<K, V> extends K<K, V> {

    /* renamed from: l, reason: collision with root package name */
    @I41.a
    @XY0.e
    public transient long[] f359518l;

    /* renamed from: m, reason: collision with root package name */
    public transient int f359519m;

    /* renamed from: n, reason: collision with root package name */
    public transient int f359520n;

    public N() {
        super(3);
    }

    @Override // com.google.common.collect.K
    public final int b(int i12, int i13) {
        return i12 >= size() ? i13 : i12;
    }

    @Override // com.google.common.collect.K
    public final int c() {
        int iC2 = super.c();
        this.f359518l = new long[iC2];
        return iC2;
    }

    @Override // com.google.common.collect.K, java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (q()) {
            return;
        }
        this.f359519m = -2;
        this.f359520n = -2;
        long[] jArr = this.f359518l;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    @Override // com.google.common.collect.K
    @InterfaceC19845a
    public final Map<K, V> d() {
        Map<K, V> mapD = super.d();
        this.f359518l = null;
        return mapD;
    }

    @Override // com.google.common.collect.K
    public final LinkedHashMap e(int i12) {
        return new LinkedHashMap(i12, 1.0f, false);
    }

    @Override // com.google.common.collect.K
    public final int g() {
        return this.f359519m;
    }

    @Override // com.google.common.collect.K
    public final int h(int i12) {
        return ((int) x()[i12]) - 1;
    }

    @Override // com.google.common.collect.K
    public final void n(int i12) {
        super.n(i12);
        this.f359519m = -2;
        this.f359520n = -2;
    }

    @Override // com.google.common.collect.K
    public final void o(int i12, @InterfaceC37434x3 K k12, @InterfaceC37434x3 V v12, int i13, int i14) {
        super.o(i12, k12, v12, i13, i14);
        y(this.f359520n, i12);
        y(i12, -2);
    }

    @Override // com.google.common.collect.K
    public final void p(int i12, int i13) {
        int size = size() - 1;
        super.p(i12, i13);
        y(((int) (x()[i12] >>> 32)) - 1, h(i12));
        if (i12 < size) {
            y(((int) (x()[size] >>> 32)) - 1, i12);
            y(i12, h(size));
        }
        x()[size] = 0;
    }

    @Override // com.google.common.collect.K
    public final void v(int i12) {
        super.v(i12);
        this.f359518l = Arrays.copyOf(x(), i12);
    }

    public final long[] x() {
        long[] jArr = this.f359518l;
        Objects.requireNonNull(jArr);
        return jArr;
    }

    public final void y(int i12, int i13) {
        if (i12 == -2) {
            this.f359519m = i13;
        } else {
            x()[i12] = (x()[i12] & (-4294967296L)) | ((i13 + 1) & 4294967295L);
        }
        if (i13 == -2) {
            this.f359520n = i12;
        } else {
            x()[i13] = (4294967295L & x()[i13]) | ((i12 + 1) << 32);
        }
    }

    @Override // com.google.common.collect.K
    public final void a(int i12) {
    }
}
