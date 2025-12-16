package com.yandex.mobile.ads.impl;

import android.app.Activity;
import com.yandex.mobile.ads.common.ImpressionData;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class A2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383170b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f383171c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f383172d;

    public /* synthetic */ A2(int i12, Object obj, Object obj2) {
        this.f383170b = i12;
        this.f383172d = obj;
        this.f383171c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f383170b) {
            case 0:
                wv0.a((w2) this.f383172d, (wv0) this.f383171c);
                break;
            case 1:
                wv0.a((wv0) this.f383171c, (w70) this.f383172d);
                break;
            case 2:
                xv0.a((xv0) this.f383172d, (ImpressionData) this.f383171c);
                break;
            case 3:
                xv0.a((z4) this.f383172d, (xv0) this.f383171c);
                break;
            case 4:
                ya.a((ya) this.f383172d, (Activity) this.f383171c);
                break;
            case 5:
                ((ya0) this.f383172d).a((String) this.f383171c);
                break;
            case 6:
                yv0.a((yv0) this.f383172d, (l01) this.f383171c);
                break;
            case 7:
                yv0.a((w2) this.f383172d, (yv0) this.f383171c);
                break;
            case 8:
                zv0.a((zv0) this.f383172d, (ImpressionData) this.f383171c);
                break;
            case 9:
                zv0.a((zv0) this.f383172d, (jo1) this.f383171c);
                break;
            default:
                zv0.a((z4) this.f383172d, (zv0) this.f383171c);
                break;
        }
    }

    public /* synthetic */ A2(wv0 wv0Var, w70 w70Var) {
        this.f383170b = 1;
        this.f383171c = wv0Var;
        this.f383172d = w70Var;
    }
}
