package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class a50 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final o60 f383409a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final z40 f383410b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private y40 f383411c;

    public a50(@j.N o60 o60Var, @j.N com.yandex.mobile.ads.instream.e eVar) {
        this.f383409a = o60Var;
        this.f383410b = new z40(eVar);
    }

    @j.N
    public final y40 a() {
        if (this.f383411c == null) {
            this.f383411c = this.f383410b.a(this.f383409a.getAdBreaks());
        }
        return this.f383411c;
    }
}
