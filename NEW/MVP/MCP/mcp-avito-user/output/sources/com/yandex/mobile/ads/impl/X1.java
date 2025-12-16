package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.HashSet;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class X1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383344b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HashSet f383345c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ VideoAd f383346d;

    public /* synthetic */ X1(HashSet hashSet, VideoAd videoAd, int i12) {
        this.f383344b = i12;
        this.f383345c = hashSet;
        this.f383346d = videoAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f383344b) {
            case 0:
                w40.h(this.f383345c, this.f383346d);
                break;
            case 1:
                w40.a((Set) this.f383345c, this.f383346d);
                break;
            case 2:
                w40.f((Set) this.f383345c, this.f383346d);
                break;
            case 3:
                w40.i(this.f383345c, this.f383346d);
                break;
            case 4:
                w40.g((Set) this.f383345c, this.f383346d);
                break;
            case 5:
                w40.c((Set) this.f383345c, this.f383346d);
                break;
            case 6:
                w40.b((Set) this.f383345c, this.f383346d);
                break;
            case 7:
                w40.d((Set) this.f383345c, this.f383346d);
                break;
            default:
                w40.e((Set) this.f383345c, this.f383346d);
                break;
        }
    }
}
