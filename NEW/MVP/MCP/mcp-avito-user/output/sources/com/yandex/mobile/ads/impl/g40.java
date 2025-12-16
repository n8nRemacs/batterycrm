package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import com.yandex.mobile.ads.video.playback.view.VideoAdControlsContainer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class g40 implements qe1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final te1 f385575a = new te1();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ue1 f385576b = new ue1();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final ve1 f385577c = new ve1();

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    private se1 f385578d;

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void a(@Y61.k VideoAd videoAd) {
    }

    public final void a(@Y61.l oe1 oe1Var) {
        if (oe1Var != null) {
            this.f385576b.getClass();
            if (oe1Var.a() == null) {
                return;
            }
        }
        this.f385578d = null;
    }

    public final void a(@Y61.l pe1 pe1Var) {
        if (pe1Var != null) {
            this.f385577c.getClass();
            VideoAdControlsContainer videoAdControlsContainerD = pe1Var.d();
            ArrayList arrayList = new ArrayList();
            arrayList.add(videoAdControlsContainerD);
            arrayList.add(pe1Var.getCallToActionView());
            arrayList.add(pe1Var.b());
            arrayList.add(pe1Var.a());
            arrayList.add(pe1Var.c());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    return;
                }
            }
            if (videoAdControlsContainerD.getParent() != null) {
                return;
            }
        }
        this.f385578d = null;
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void a(@Y61.k n40 n40Var) {
        se1 se1Var = this.f385578d;
        if (se1Var != null) {
            n40Var.a(se1Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void onAdClicked(@Y61.k VideoAd videoAd) {
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void onAdCompleted(@Y61.k VideoAd videoAd) {
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void onAdError(@Y61.k VideoAd videoAd) {
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void onAdPaused(@Y61.k VideoAd videoAd) {
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void onAdResumed(@Y61.k VideoAd videoAd) {
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void onAdSkipped(@Y61.k VideoAd videoAd) {
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void onAdStarted(@Y61.k VideoAd videoAd) {
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void onAdStopped(@Y61.k VideoAd videoAd) {
    }

    @Override // com.yandex.mobile.ads.impl.qe1
    public final void onVolumeChanged(@Y61.k VideoAd videoAd, float f12) {
    }
}
