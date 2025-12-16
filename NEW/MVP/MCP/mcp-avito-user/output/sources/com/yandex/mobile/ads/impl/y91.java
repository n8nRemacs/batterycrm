package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
final class y91 {

    /* renamed from: a, reason: collision with root package name */
    public final s91 f391968a;

    /* renamed from: b, reason: collision with root package name */
    public final int f391969b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f391970c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f391971d;

    /* renamed from: e, reason: collision with root package name */
    public final int f391972e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f391973f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f391974g;

    /* renamed from: h, reason: collision with root package name */
    public final long f391975h;

    public y91(s91 s91Var, long[] jArr, int[] iArr, int i12, long[] jArr2, int[] iArr2, long j12) {
        db.a(iArr.length == jArr2.length);
        db.a(jArr.length == jArr2.length);
        db.a(iArr2.length == jArr2.length);
        this.f391968a = s91Var;
        this.f391970c = jArr;
        this.f391971d = iArr;
        this.f391972e = i12;
        this.f391973f = jArr2;
        this.f391974g = iArr2;
        this.f391975h = j12;
        this.f391969b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j12) {
        for (int iA2 = pc1.a(this.f391973f, j12, true); iA2 < this.f391973f.length; iA2++) {
            if ((this.f391974g[iA2] & 1) != 0) {
                return iA2;
            }
        }
        return -1;
    }
}
