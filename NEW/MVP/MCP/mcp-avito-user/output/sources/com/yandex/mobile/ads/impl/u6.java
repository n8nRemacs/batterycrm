package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Collection;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class u6 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final HashMap f390452a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private st0 f390453b;

    @j.N
    public final f50 a(@j.N VideoAd videoAd) {
        f50 f50Var = (f50) this.f390452a.get(videoAd);
        return f50Var != null ? f50Var : f50.f385172a;
    }

    @j.P
    public final st0 b() {
        return this.f390453b;
    }

    public final boolean c() {
        Collection collectionValues = this.f390452a.values();
        return collectionValues.contains(f50.f385174c) || collectionValues.contains(f50.f385175d);
    }

    public final void a(@j.N VideoAd videoAd, @j.N f50 f50Var) {
        this.f390452a.put(videoAd, f50Var);
    }

    public final void a() {
        this.f390452a.clear();
    }

    public final void a(@j.P st0 st0Var) {
        this.f390453b = st0Var;
    }
}
