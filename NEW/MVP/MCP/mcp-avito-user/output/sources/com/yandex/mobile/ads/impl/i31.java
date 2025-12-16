package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.model.reward.ServerSideReward;

/* loaded from: classes8.dex */
public final class i31 implements r01 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final x6 f386291a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ServerSideReward f386292b;

    public i31(@j.N Context context, @j.N n2 n2Var, @j.N ServerSideReward serverSideReward) {
        this.f386291a = new x6(context, n2Var);
        this.f386292b = serverSideReward;
    }

    @Override // com.yandex.mobile.ads.impl.r01
    public final void a() {
        this.f386291a.a(this.f386292b.c());
    }
}
