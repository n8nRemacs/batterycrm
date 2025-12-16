package com.yandex.mobile.ads.instream.exoplayer;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.source.ads.b;
import com.google.android.exoplayer2.ui.InterfaceC36564b;
import com.google.android.exoplayer2.upstream.p;
import com.yandex.mobile.ads.impl.m50;
import com.yandex.mobile.ads.impl.s7;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import j.K;
import j.N;
import j.P;
import java.io.IOException;
import java.util.Collections;

@K
/* loaded from: classes8.dex */
public class YandexAdsLoader implements b {
    public static final String AD_TAG_URI = "yandex://ad_tag";

    /* renamed from: a, reason: collision with root package name */
    @N
    private final m50 f392505a;

    public YandexAdsLoader(@N Context context, @N InstreamAdRequestConfiguration instreamAdRequestConfiguration) {
        this.f392505a = new s7(context, instreamAdRequestConfiguration).a();
    }

    public void handlePrepareComplete(@P AdsMediaSource adsMediaSource, int i12, int i13) {
        this.f392505a.a(i12, i13);
    }

    public void handlePrepareError(@P AdsMediaSource adsMediaSource, int i12, int i13, @P IOException iOException) {
        this.f392505a.a(i12, i13, iOException);
    }

    public void release() {
        this.f392505a.a();
    }

    public void requestAds(@P ViewGroup viewGroup) {
        this.f392505a.a(viewGroup, Collections.emptyList());
    }

    public void setPlayer(@P d0 d0Var) {
        this.f392505a.a(d0Var);
    }

    public void setVideoAdPlaybackListener(@P VideoAdPlaybackListener videoAdPlaybackListener) {
        this.f392505a.a(videoAdPlaybackListener);
    }

    public void start(@P AdsMediaSource adsMediaSource, @P p pVar, @P Object obj, @P InterfaceC36564b interfaceC36564b, @P b.a aVar) {
        if (aVar != null) {
            this.f392505a.a(aVar, interfaceC36564b, obj);
        }
    }

    public void stop(@P AdsMediaSource adsMediaSource, @P b.a aVar) {
        this.f392505a.b();
    }

    public void setSupportedContentTypes(int... iArr) {
    }
}
