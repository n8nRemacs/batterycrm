package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.BidderTokenLoadListener;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class J0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383234b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BidderTokenLoadListener f383235c;

    public /* synthetic */ J0(BidderTokenLoadListener bidderTokenLoadListener, int i12) {
        this.f383234b = i12;
        this.f383235c = bidderTokenLoadListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f383234b) {
            case 0:
                this.f383235c.onBidderTokenFailedToLoad("Cannot load bidder token. SDK initialization failed.");
                break;
            default:
                this.f383235c.onBidderTokenFailedToLoad("Cannot load bidder token. Token generation failed");
                break;
        }
    }
}
