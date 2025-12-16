package com.google.android.exoplayer2;

import java.util.Collection;
import java.util.HashMap;

/* compiled from: PlaylistTimeline.java */
/* loaded from: classes6.dex */
final class f0 extends AbstractC36502a {

    /* renamed from: f, reason: collision with root package name */
    public final int f345408f;

    /* renamed from: g, reason: collision with root package name */
    public final int f345409g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f345410h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f345411i;

    /* renamed from: j, reason: collision with root package name */
    public final s0[] f345412j;

    /* renamed from: k, reason: collision with root package name */
    public final Object[] f345413k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap<Object, Integer> f345414l;

    public f0(Collection<? extends V> collection, com.google.android.exoplayer2.source.O o12) {
        super(o12);
        int size = collection.size();
        this.f345410h = new int[size];
        this.f345411i = new int[size];
        this.f345412j = new s0[size];
        this.f345413k = new Object[size];
        this.f345414l = new HashMap<>();
        int iO2 = 0;
        int iH2 = 0;
        int i12 = 0;
        for (V v12 : collection) {
            this.f345412j[i12] = v12.d();
            this.f345411i[i12] = iO2;
            this.f345410h[i12] = iH2;
            iO2 += this.f345412j[i12].o();
            iH2 += this.f345412j[i12].h();
            this.f345413k[i12] = v12.c();
            this.f345414l.put(this.f345413k[i12], Integer.valueOf(i12));
            i12++;
        }
        this.f345408f = iO2;
        this.f345409g = iH2;
    }

    @Override // com.google.android.exoplayer2.s0
    public final int h() {
        return this.f345409g;
    }

    @Override // com.google.android.exoplayer2.s0
    public final int o() {
        return this.f345408f;
    }

    @Override // com.google.android.exoplayer2.AbstractC36502a
    public final int q(Object obj) {
        Integer num = this.f345414l.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.exoplayer2.AbstractC36502a
    public final int r(int i12) {
        return com.google.android.exoplayer2.util.U.e(this.f345410h, i12 + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.AbstractC36502a
    public final int s(int i12) {
        return com.google.android.exoplayer2.util.U.e(this.f345411i, i12 + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.AbstractC36502a
    public final Object t(int i12) {
        return this.f345413k[i12];
    }

    @Override // com.google.android.exoplayer2.AbstractC36502a
    public final int u(int i12) {
        return this.f345410h[i12];
    }

    @Override // com.google.android.exoplayer2.AbstractC36502a
    public final int v(int i12) {
        return this.f345411i[i12];
    }

    @Override // com.google.android.exoplayer2.AbstractC36502a
    public final s0 y(int i12) {
        return this.f345412j[i12];
    }
}
