package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.t50;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class r60 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final t60 f389393a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final j50 f389394b = new j50();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final m40 f389395c;

    public r60(@j.N t60 t60Var, @j.N k60 k60Var) {
        this.f389393a = t60Var;
        this.f389395c = new m40(k60Var);
    }

    public final void a(@j.N ff1<VideoAd> ff1Var, @j.N lu luVar, @j.N t50 t50Var) {
        this.f389394b.getClass();
        se1 se1VarA = j50.a(luVar);
        if (se1VarA != null) {
            this.f389393a.a(ff1Var, new t50.a().b(this.f389395c.a(se1VarA, t50Var).d()).a(t50Var.a()).a());
        }
    }

    public final void b(@j.N ff1<VideoAd> ff1Var, @j.N lu luVar, @j.N t50 t50Var) {
        this.f389394b.getClass();
        se1 se1VarA = j50.a(luVar);
        if (se1VarA != null) {
            this.f389393a.a(ff1Var, this.f389395c.a(se1VarA, t50Var));
        }
    }
}
