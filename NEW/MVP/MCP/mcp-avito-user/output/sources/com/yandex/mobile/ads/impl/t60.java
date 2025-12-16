package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class t60 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final HashMap f390094a = new HashMap();

    public final void a(@j.N ff1<VideoAd> ff1Var, @j.N t50 t50Var) {
        this.f390094a.put(ff1Var, t50Var);
    }

    @j.P
    public final t50 a(@j.N ff1<VideoAd> ff1Var) {
        return (t50) this.f390094a.get(ff1Var);
    }
}
