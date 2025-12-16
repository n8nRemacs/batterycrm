package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.SkipInfo;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class t41 implements gg1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final s41 f390078a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final SkipInfo f390079b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f390080c;

    public t41(@j.N l50 l50Var, @j.N VideoAd videoAd) {
        this.f390079b = videoAd.getSkipInfo();
        this.f390078a = new s41(l50Var);
    }

    @Override // com.yandex.mobile.ads.impl.gg1
    public final void a(long j12, long j13) {
        SkipInfo skipInfo;
        if (this.f390080c || (skipInfo = this.f390079b) == null) {
            return;
        }
        if (j13 < skipInfo.getSkipOffset()) {
            this.f390078a.a(this.f390079b.getSkipOffset(), j13);
        } else {
            this.f390078a.a();
            this.f390080c = true;
        }
    }
}
