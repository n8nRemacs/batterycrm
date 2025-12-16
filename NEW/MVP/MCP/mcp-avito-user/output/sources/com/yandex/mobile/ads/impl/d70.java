package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class d70 implements gg1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ag1<VideoAd> f384535a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final aj1 f384536b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final qg1 f384537c;

    public d70(@j.N k60 k60Var, @j.N b70 b70Var, @j.N qg1 qg1Var) {
        this.f384535a = k60Var;
        this.f384536b = qi0.a(b70Var);
        this.f384537c = qg1Var;
    }

    @Override // com.yandex.mobile.ads.impl.gg1
    public final void a(long j12, long j13) {
        boolean zA2 = this.f384536b.a();
        if (this.f384537c.a() != pg1.f388828h) {
            if (zA2) {
                if (this.f384535a.isPlayingAd()) {
                    return;
                }
                this.f384535a.c();
            } else if (this.f384535a.isPlayingAd()) {
                this.f384535a.a();
            }
        }
    }
}
