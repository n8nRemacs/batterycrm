package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class u3 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final HashMap f390438a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final HashMap f390439b = new HashMap();

    public final void a(@j.N q3 q3Var, @j.N VideoAd videoAd) {
        this.f390438a.put(videoAd, q3Var);
        this.f390439b.put(q3Var, videoAd);
    }

    @j.P
    public final q3 a(@j.N VideoAd videoAd) {
        return (q3) this.f390438a.get(videoAd);
    }

    @j.P
    public final VideoAd a(@j.N q3 q3Var) {
        return (VideoAd) this.f390439b.get(q3Var);
    }
}
