package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.List;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class vb {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Context f390837a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ff1<VideoAd> f390838b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final p60 f390839c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final ri1 f390840d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final qe1 f390841e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final w20 f390842f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    private final p50 f390843g;

    public vb(@Y61.k Context context, @Y61.k ff1 ff1Var, @Y61.k p60 p60Var, @Y61.k ri1 ri1Var, @Y61.k re1 re1Var, @Y61.k hs0 hs0Var, @Y61.k p50 p50Var) {
        this.f390837a = context;
        this.f390838b = ff1Var;
        this.f390839c = p60Var;
        this.f390840d = ri1Var;
        this.f390841e = re1Var;
        this.f390842f = hs0Var;
        this.f390843g = p50Var;
    }

    @Y61.k
    public final List<n50> a() {
        ib ibVarA = jb.a(this.f390837a, this.f390838b, this.f390839c, this.f390840d);
        eb<?> ebVarA = this.f390843g.a("call_to_action");
        zh zhVar = new zh(ebVarA, xi.a(this.f390838b, this.f390837a, this.f390839c, this.f390840d, this.f390841e, ebVarA));
        ai aiVar = new ai();
        return C42745f0.U(zhVar, new o8(this.f390838b).a(), new dv(this.f390842f, this.f390843g.a("favicon"), ibVarA), new nr(this.f390843g.a("domain"), ibVarA), new n61(this.f390843g.a("sponsored"), ibVarA), new y4(this.f390838b.c().getAdPodInfo().getAdPosition(), this.f390838b.c().getAdPodInfo().getAdsCount()), new ta1(this.f390842f, this.f390843g.a("trademark"), ibVarA), aiVar, new mv(this.f390843g.a("feedback"), ibVarA, this.f390840d, new f60(this.f390837a, this.f390839c, this.f390838b).a(), new p40()), new dl1(this.f390843g.a(ConstraintKt.WARNING), ibVarA));
    }
}
