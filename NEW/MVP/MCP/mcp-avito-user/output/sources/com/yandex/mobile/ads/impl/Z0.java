package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.l4;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class Z0 implements l4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f383358a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n4 f383359b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VideoAd f383360c;

    public /* synthetic */ Z0(n4 n4Var, VideoAd videoAd, int i12) {
        this.f383358a = i12;
        this.f383359b = n4Var;
        this.f383360c = videoAd;
    }

    @Override // com.yandex.mobile.ads.impl.l4.a
    public final void a() {
        switch (this.f383358a) {
            case 0:
                this.f383359b.b(this.f383360c);
                break;
            default:
                this.f383359b.a(this.f383360c);
                break;
        }
    }
}
