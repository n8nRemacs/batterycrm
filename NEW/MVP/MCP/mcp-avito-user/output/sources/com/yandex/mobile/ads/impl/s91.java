package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class s91 {

    /* renamed from: a, reason: collision with root package name */
    public final int f389833a;

    /* renamed from: b, reason: collision with root package name */
    public final int f389834b;

    /* renamed from: c, reason: collision with root package name */
    public final long f389835c;

    /* renamed from: d, reason: collision with root package name */
    public final long f389836d;

    /* renamed from: e, reason: collision with root package name */
    public final long f389837e;

    /* renamed from: f, reason: collision with root package name */
    public final vw f389838f;

    /* renamed from: g, reason: collision with root package name */
    public final int f389839g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public final long[] f389840h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public final long[] f389841i;

    /* renamed from: j, reason: collision with root package name */
    public final int f389842j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    private final t91[] f389843k;

    public s91(int i12, int i13, long j12, long j13, long j14, vw vwVar, int i14, @j.P t91[] t91VarArr, int i15, @j.P long[] jArr, @j.P long[] jArr2) {
        this.f389833a = i12;
        this.f389834b = i13;
        this.f389835c = j12;
        this.f389836d = j13;
        this.f389837e = j14;
        this.f389838f = vwVar;
        this.f389839g = i14;
        this.f389843k = t91VarArr;
        this.f389842j = i15;
        this.f389840h = jArr;
        this.f389841i = jArr2;
    }

    @j.P
    public final t91 a(int i12) {
        t91[] t91VarArr = this.f389843k;
        if (t91VarArr == null) {
            return null;
        }
        return t91VarArr[i12];
    }
}
