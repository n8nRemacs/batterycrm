package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.RectF;
import android.widget.ImageView;
import com.yandex.mobile.ads.base.model.BiddingSettings;
import com.yandex.mobile.ads.common.BidderTokenLoadListener;
import com.yandex.mobile.ads.common.InitializationListener;
import com.yandex.mobile.ads.embedded.guava.collect.p;
import com.yandex.mobile.ads.impl.fi1;
import com.yandex.mobile.ads.impl.jd0;
import com.yandex.mobile.ads.impl.kd0;
import com.yandex.mobile.ads.impl.ni0;
import com.yandex.mobile.ads.impl.pc;
import com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.HashSet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class H0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383222b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f383223c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f383224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f383225e;

    public /* synthetic */ H0(Object obj, Object obj2, Object obj3, int i12) {
        this.f383222b = i12;
        this.f383223c = obj;
        this.f383224d = obj2;
        this.f383225e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f383222b) {
            case 0:
                ((hd0) this.f383223c).a((p.a) this.f383224d, (jd0.b) this.f383225e);
                break;
            case 1:
                ce0.a((ce0) this.f383223c, (oj1) this.f383224d, (jj1) this.f383225e);
                break;
            case 2:
                ((fi1.a) this.f383223c).b((vw) this.f383224d, (xn) this.f383225e);
                break;
            case 3:
                h51.a((h51) this.f383223c, (RectF) this.f383224d, (ImageView) this.f383225e);
                break;
            case 4:
                ((jn1) this.f383223c).a((Context) this.f383224d, (BidderTokenLoadListener) this.f383225e);
                break;
            case 5:
                ((kd0.a) this.f383223c).a((kd0) this.f383224d, (zc0) this.f383225e);
                break;
            case 6:
                ni0.b((Context) this.f383223c, (rb0) this.f383224d, (ni0.a) this.f383225e);
                break;
            case 7:
                ((pc.a) this.f383223c).b((vw) this.f383224d, (xn) this.f383225e);
                break;
            case 8:
                ((re) this.f383223c).a((BiddingSettings) this.f383224d, (ac1) this.f383225e);
                break;
            case 9:
                w40.a((HashSet) this.f383223c, (VideoAd) this.f383224d, (InstreamAdPlayerError) this.f383225e);
                break;
            default:
                ((zg0) this.f383223c).c((Context) this.f383224d, (InitializationListener) this.f383225e);
                break;
        }
    }
}
