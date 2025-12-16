package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;

/* loaded from: classes8.dex */
public final class x40 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final vb1 f391546a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final u40 f391547b = u40.f390445c.a();

    public x40(@Y61.k vb1 vb1Var) {
        this.f391546a = vb1Var;
    }

    public final void a(@Y61.k InstreamAdPlayer instreamAdPlayer) {
        vb1 vb1VarA = this.f391547b.a(instreamAdPlayer);
        if (kotlin.jvm.internal.L.f(this.f391546a, vb1VarA)) {
            return;
        }
        if (vb1VarA != null) {
            vb1VarA.invalidateAdPlayer();
        }
        this.f391547b.a(instreamAdPlayer, this.f391546a);
    }

    public final void b(@Y61.k InstreamAdPlayer instreamAdPlayer) {
        this.f391547b.b(instreamAdPlayer);
    }
}
