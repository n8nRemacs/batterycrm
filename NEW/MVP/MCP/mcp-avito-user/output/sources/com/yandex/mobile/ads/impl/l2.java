package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final InterfaceC39377x0 f387363a;

    public l2(@Y61.k C39311c1 c39311c1) {
        this.f387363a = c39311c1;
    }

    @Y61.k
    public final InterfaceC39323f1 a(@Y61.k AdResponse<?> adResponse, @Y61.k o01 o01Var) {
        return adResponse.m() == y6.f391937d ? new zz0(this.f387363a, o01Var) : new p70();
    }
}
