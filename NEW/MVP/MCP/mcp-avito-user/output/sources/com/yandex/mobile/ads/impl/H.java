package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.common.BidderTokenLoadListener;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.impl.fi1;
import com.yandex.mobile.ads.impl.gp0;
import com.yandex.mobile.ads.impl.pc;
import com.yandex.mobile.ads.impl.rt;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class H implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383219b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f383220c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f383221d;

    public /* synthetic */ H(int i12, Object obj, Object obj2) {
        this.f383219b = i12;
        this.f383220c = obj;
        this.f383221d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f383219b) {
            case 0:
                ((e50) this.f383220c).a((InstreamAd) ((o60) this.f383221d));
                break;
            case 1:
                ((e50) this.f383220c).b((String) this.f383221d);
                break;
            case 2:
                ((BidderTokenLoadListener) this.f383220c).onBidderTokenLoaded((String) this.f383221d);
                break;
            case 3:
                ((lv0) this.f383220c).b((x21) this.f383221d);
                break;
            case 4:
                ((rf) this.f383220c).a((String) this.f383221d);
                break;
            case 5:
                ((pt) this.f383220c).a((rt.d) this.f383221d);
                break;
            case 6:
                ((rt) this.f383220c).a((kt0) this.f383221d);
                break;
            case 7:
                bf.a((bf) this.f383220c, (AdRequestConfiguration) this.f383221d);
                break;
            case 8:
                cj0.a((cj0) this.f383220c, (ViewPager2) this.f383221d);
                break;
            case 9:
                d3.a((d3) this.f383220c, (h3) this.f383221d);
                break;
            case 10:
                ((fi1.a) this.f383220c).b((String) this.f383221d);
                break;
            case 11:
                ((fi1.a) this.f383220c).a((ji1) this.f383221d);
                break;
            case 12:
                ((fi1.a) this.f383220c).a((Exception) this.f383221d);
                break;
            case 13:
                gf.a((gf) this.f383220c, (AdRequestConfiguration) this.f383221d);
                break;
            case 14:
                ((gp0) this.f383220c).a((gp0.b) this.f383221d);
                break;
            case 15:
                ((i61) this.f383220c).a((SurfaceTexture) this.f383221d);
                break;
            case 16:
                l01.a((l01) this.f383220c, (Activity) this.f383221d);
                break;
            case 17:
                ((nk0) this.f383220c).a((AdImpressionData) this.f383221d);
                break;
            case 18:
                oh.a((oh) this.f383220c, (AdRequestConfiguration) this.f383221d);
                break;
            case 19:
                ((pc.a) this.f383220c).b((String) this.f383221d);
                break;
            case 20:
                r40.a((r40) this.f383220c, (InstreamAdRequestConfiguration) this.f383221d);
                break;
            case 21:
                rh.a((rh) this.f383220c, (AdRequestConfiguration) this.f383221d);
                break;
            case 22:
                sh.a((sh) this.f383220c, (AdRequestConfiguration) this.f383221d);
                break;
            case 23:
                ((tk0) this.f383220c).a((View) this.f383221d);
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                ue.a((ue) this.f383220c, (AdRequestConfiguration) this.f383221d);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                uv0.a((uv0) this.f383220c, (ya) this.f383221d);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                uv0.a((w2) this.f383220c, (uv0) this.f383221d);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                vv0.a((vv0) this.f383220c, (ImpressionData) this.f383221d);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                vv0.a((z4) this.f383220c, (vv0) this.f383221d);
                break;
            default:
                w70.a((w70) this.f383220c, (Activity) this.f383221d);
                break;
        }
    }
}
