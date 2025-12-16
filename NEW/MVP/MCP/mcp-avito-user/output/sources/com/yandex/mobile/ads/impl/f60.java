package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class f60 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f385190a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final p60 f385191b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ff1<VideoAd> f385192c;

    public f60(@j.N Context context, @j.N p60 p60Var, @j.N ff1<VideoAd> ff1Var) {
        this.f385190a = context.getApplicationContext();
        this.f385191b = p60Var;
        this.f385192c = ff1Var;
    }

    @j.N
    public final br0 a() {
        zm zmVarB = this.f385191b.b();
        b60 b60Var = new b60(this.f385190a, this.f385192c.a());
        return zmVarB != null ? new v50(b60Var, this.f385192c.c(), zmVarB) : new w50(this.f385190a, b60Var);
    }
}
