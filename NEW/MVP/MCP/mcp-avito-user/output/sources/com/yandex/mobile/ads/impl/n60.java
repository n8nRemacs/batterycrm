package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.AdPodInfo;
import com.yandex.mobile.ads.video.playback.model.MediaFile;
import com.yandex.mobile.ads.video.playback.model.SkipInfo;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class n60 implements VideoAd {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final MediaFile f388167a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final AdPodInfo f388168b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final SkipInfo f388169c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private final String f388170d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private final JSONObject f388171e;

    /* renamed from: f, reason: collision with root package name */
    private final long f388172f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final String f388173g;

    public n60(@j.N String str, @j.N e60 e60Var, @j.N eg1 eg1Var, @j.P i60 i60Var, @j.P String str2, @j.P JSONObject jSONObject, long j12) {
        this.f388173g = str;
        this.f388169c = i60Var;
        this.f388167a = e60Var;
        this.f388168b = eg1Var;
        this.f388170d = str2;
        this.f388171e = jSONObject;
        this.f388172f = j12;
    }

    @j.P
    public final JSONObject a() {
        return this.f388171e;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    @j.N
    public final AdPodInfo getAdPodInfo() {
        return this.f388168b;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    public final long getDuration() {
        return this.f388172f;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    @j.P
    public final String getInfo() {
        return this.f388170d;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    @j.N
    public final MediaFile getMediaFile() {
        return this.f388167a;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    @j.P
    public final SkipInfo getSkipInfo() {
        return this.f388169c;
    }

    @j.N
    public final String toString() {
        return this.f388173g;
    }
}
