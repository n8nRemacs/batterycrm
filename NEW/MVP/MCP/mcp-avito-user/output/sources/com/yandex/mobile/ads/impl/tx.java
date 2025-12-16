package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.AdResultReceiver;

/* loaded from: classes8.dex */
public final class tx implements dh0, eh0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f390329a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final AdResponse<String> f390330b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final AdResultReceiver f390331c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final an1 f390332d;

    public tx(@j.N Context context, @j.N n2 n2Var, @j.N AdResponse<String> adResponse, @j.N AdResultReceiver adResultReceiver) {
        this.f390329a = context;
        this.f390330b = adResponse;
        this.f390331c = adResultReceiver;
        this.f390332d = new an1(n2Var);
    }

    @Override // com.yandex.mobile.ads.impl.eh0
    public final void a() {
        this.f390332d.a(this.f390329a, this.f390330b);
        this.f390331c.send(13, null);
    }

    @Override // com.yandex.mobile.ads.impl.dh0
    public final void b() {
        this.f390331c.send(15, null);
    }

    @Override // com.yandex.mobile.ads.impl.dh0
    public final void d() {
        this.f390331c.send(14, null);
    }
}
