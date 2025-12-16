package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.model.reward.ClientSideReward;

/* loaded from: classes8.dex */
public final class fj implements r01 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final jo1 f385381a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final t01 f385382b;

    public fj(@j.N ClientSideReward clientSideReward, @j.N t01 t01Var) {
        this.f385382b = t01Var;
        this.f385381a = new jo1(clientSideReward.c(), clientSideReward.d());
    }

    @Override // com.yandex.mobile.ads.impl.r01
    public final void a() {
        this.f385382b.a(this.f385381a);
    }
}
