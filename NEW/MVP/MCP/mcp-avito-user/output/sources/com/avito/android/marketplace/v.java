package com.avito.android.marketplace;

import com.yatatsu.powerwebview.PowerWebView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f185959b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PowerWebView f185960c;

    public /* synthetic */ v(PowerWebView powerWebView, int i12) {
        this.f185959b = i12;
        this.f185960c = powerWebView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f185959b) {
            case 0:
                this.f185960c.destroy();
                break;
            case 1:
                this.f185960c.destroy();
                break;
            default:
                this.f185960c.destroy();
                break;
        }
    }
}
