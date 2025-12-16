package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class ib {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ff1<VideoAd> f386426a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final br0 f386427b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final ri1 f386428c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final w60 f386429d = new w60(new jm());

    public ib(@Y61.k ff1<VideoAd> ff1Var, @Y61.k br0 br0Var, @Y61.k ri1 ri1Var) {
        this.f386426a = ff1Var;
        this.f386427b = br0Var;
        this.f386428c = ri1Var;
    }

    public final void a(@Y61.k View view, @Y61.l eb<?> ebVar) {
        String strA;
        if (ebVar == null || !ebVar.e() || (strA = this.f386429d.a(this.f386426a.a(), ebVar.b()).a()) == null) {
            return;
        }
        view.setOnClickListener(new ub(this.f386427b, strA, ebVar.b(), this.f386428c));
    }
}
