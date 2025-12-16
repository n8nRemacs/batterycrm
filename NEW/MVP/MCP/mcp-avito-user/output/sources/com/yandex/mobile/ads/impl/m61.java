package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes8.dex */
public final class m61 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Context f387871a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ff1<VideoAd> f387872b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final p8 f387873c;

    public m61(@Y61.k Context context, @Y61.k ff1<VideoAd> ff1Var) {
        this.f387871a = context;
        this.f387872b = ff1Var;
        this.f387873c = new p8(ff1Var.e());
    }

    @Y61.k
    public final ho a() {
        int iA2 = n6.a(new o61(this.f387873c).a(this.f387872b));
        if (iA2 == 0) {
            return new kp(this.f387871a);
        }
        if (iA2 == 1) {
            return new jp(this.f387871a);
        }
        if (iA2 == 2) {
            return new so();
        }
        throw new NoWhenBranchMatchedException();
    }
}
