package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.parser.vmap.configurator.AdBreakParameters;

/* loaded from: classes8.dex */
public final class m5 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39366t1 f387844a;

    public m5(@j.N C39366t1 c39366t1) {
        this.f387844a = c39366t1;
    }

    @j.N
    public final v6 a() {
        return this.f387844a.b().a();
    }

    @j.P
    public final String b() {
        AdBreakParameters adBreakParametersE = this.f387844a.e();
        if (adBreakParametersE != null) {
            return adBreakParametersE.c();
        }
        return null;
    }

    @j.P
    public final String c() {
        return this.f387844a.b().b();
    }

    @j.P
    public final String d() {
        AdBreakParameters adBreakParametersE = this.f387844a.e();
        if (adBreakParametersE != null) {
            return adBreakParametersE.d();
        }
        return null;
    }

    @j.P
    public final String e() {
        AdBreakParameters adBreakParametersE = this.f387844a.e();
        if (adBreakParametersE != null) {
            return adBreakParametersE.e();
        }
        return null;
    }
}
