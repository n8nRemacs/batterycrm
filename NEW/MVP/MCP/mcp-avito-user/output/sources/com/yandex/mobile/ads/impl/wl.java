package com.yandex.mobile.ads.impl;

import android.widget.FrameLayout;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
public final class wl {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final pj f391437a = new pj();

    @j.N
    public final vl a(@j.N FrameLayout frameLayout, @j.N AdResponse adResponse, @j.N pn pnVar, boolean z12, boolean z13) {
        this.f391437a.getClass();
        oj ojVarA = pj.a(frameLayout, adResponse, pnVar, z12);
        return z13 ? new kx(ojVarA) : new ew(ojVarA);
    }
}
