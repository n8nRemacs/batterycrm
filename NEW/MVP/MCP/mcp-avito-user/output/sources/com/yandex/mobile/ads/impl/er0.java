package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
public final class er0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f385086a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final AdResponse<String> f385087b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final InterfaceC39377x0 f385088c;

    public er0(@j.N Context context, @j.N AdResponse adResponse, @j.N C39311c1 c39311c1) {
        this.f385086a = context.getApplicationContext();
        this.f385087b = adResponse;
        this.f385088c = c39311c1;
    }

    public final void a() {
        if (this.f385087b.K()) {
            return;
        }
        new cw(this.f385086a, this.f385087b.F(), this.f385088c).a();
    }
}
