package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ky0;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class q40 implements ky0.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final hf1 f389083a;

    public q40(@Y61.k VideoAd videoAd) {
        this.f389083a = new hf1(videoAd);
    }

    @Override // com.yandex.mobile.ads.impl.ky0.a
    @Y61.k
    public final Map<String, Object> a() {
        ly0 ly0Var = new ly0(new LinkedHashMap());
        ly0Var.b(this.f389083a.a(), "product_type");
        return ly0Var.a();
    }
}
