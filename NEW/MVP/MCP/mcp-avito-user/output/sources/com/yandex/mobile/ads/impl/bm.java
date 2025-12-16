package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class bm {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ri1 f383987a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ij0 f383988b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final r41 f383989c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final yu0 f383990d = new yu0();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final r50 f383991e;

    public bm(@Y61.k Context context, @Y61.k p60 p60Var, @Y61.k k60 k60Var, @Y61.k re1 re1Var, @Y61.k ff1 ff1Var, @Y61.k ri1 ri1Var) {
        this.f383987a = ri1Var;
        this.f383988b = new ij0(k60Var);
        this.f383989c = new r41(k60Var, (VideoAd) ff1Var.c());
        this.f383991e = new r50(p60Var, ff1Var);
    }

    public final void a(@Y61.k se1 se1Var, @Y61.k t50 t50Var) {
        this.f383991e.a(se1Var);
        this.f383988b.a(se1Var, t50Var);
        View viewL = se1Var.l();
        if (viewL != null) {
            this.f383989c.a(viewL, t50Var);
        }
        ProgressBar progressBarJ = se1Var.j();
        if (progressBarJ != null) {
            this.f383990d.getClass();
            yu0.a(progressBarJ, t50Var);
        }
    }
}
