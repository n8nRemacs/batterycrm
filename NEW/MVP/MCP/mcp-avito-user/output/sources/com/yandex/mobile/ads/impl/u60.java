package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class u60 implements tf1<VideoAd> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final u41 f390454a = new u41();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ef1 f390455b = new ef1();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final InstreamAdBreakPosition f390456c;

    /* renamed from: d, reason: collision with root package name */
    private final long f390457d;

    public u60(@j.N InstreamAdBreakPosition instreamAdBreakPosition, long j12) {
        this.f390456c = instreamAdBreakPosition;
        this.f390457d = j12;
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    @j.N
    public final Object a(@j.N ne1 ne1Var, @j.N im imVar, @j.N rc0 rc0Var, @j.N eg1 eg1Var, @j.P String str, @j.P JSONObject jSONObject) throws NumberFormatException {
        i60 i60VarA = this.f390454a.a(imVar);
        e60 e60Var = new e60(this.f390456c, rc0Var.d(), rc0Var.f(), rc0Var.b());
        long jD2 = imVar.d();
        ef1 ef1Var = this.f390455b;
        long j12 = this.f390457d;
        ef1Var.getClass();
        return new n60(ef1.a(j12, eg1Var, ne1Var), e60Var, eg1Var, i60VarA, str, jSONObject, jD2);
    }
}
