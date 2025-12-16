package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.b;

/* loaded from: classes8.dex */
public final class h4 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private com.google.android.exoplayer2.source.ads.a f385899a = com.google.android.exoplayer2.source.ads.a.f346179h;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private b.a f385900b;

    public final void a(@j.P b.a aVar) {
        this.f385900b = aVar;
    }

    public final void b() {
        this.f385900b = null;
        this.f385899a = com.google.android.exoplayer2.source.ads.a.f346179h;
    }

    @j.N
    public final com.google.android.exoplayer2.source.ads.a a() {
        return this.f385899a;
    }

    public final void a(@j.N com.google.android.exoplayer2.source.ads.a aVar) {
        this.f385899a = aVar;
        b.a aVar2 = this.f385900b;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
    }
}
