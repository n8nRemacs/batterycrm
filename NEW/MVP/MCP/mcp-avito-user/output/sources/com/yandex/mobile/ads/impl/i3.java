package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes8.dex */
public final class i3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Context f386280a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final p60 f386281b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final EnumC39381y1 f386282c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final w20 f386283d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final v40 f386284e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final l50 f386285f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    private final qf1<VideoAd> f386286g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    private final ui1 f386287h = new ui1();

    public i3(@Y61.k Context context, @Y61.k p60 p60Var, @Y61.k EnumC39381y1 enumC39381y1, @Y61.k w20 w20Var, @Y61.k v40 v40Var, @Y61.k l50 l50Var, @Y61.k qf1<VideoAd> qf1Var) {
        this.f386280a = context;
        this.f386281b = p60Var;
        this.f386282c = enumC39381y1;
        this.f386283d = w20Var;
        this.f386284e = v40Var;
        this.f386285f = l50Var;
        this.f386286g = qf1Var;
    }

    @Y61.k
    public final h3 a(@Y61.k ff1<VideoAd> ff1Var) {
        ui1 ui1Var = this.f386287h;
        Context context = this.f386280a;
        EnumC39381y1 enumC39381y1 = this.f386282c;
        ui1Var.getClass();
        ti1 ti1VarA = ui1.a(context, ff1Var, enumC39381y1);
        qg1 qg1Var = new qg1();
        return new h3(ff1Var, new l60(this.f386280a, this.f386284e, this.f386285f, this.f386281b, ff1Var, qg1Var, ti1VarA, this.f386283d, this.f386286g), this.f386283d, qg1Var, ti1VarA);
    }
}
