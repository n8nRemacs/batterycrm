package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.AdResultReceiver;
import java.util.Map;

/* loaded from: classes8.dex */
public final class qx implements q00 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final AdResponse<String> f389323a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final g00 f389324b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C39307b1 f389325c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private ul f389326d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private pa1 f389327e;

    public qx(@j.N Context context, @j.N ko1 ko1Var, @j.N n2 n2Var, @j.N AdResponse<String> adResponse, @j.N AdResultReceiver adResultReceiver) {
        this.f389323a = adResponse;
        this.f389324b = new g00(context, n2Var);
        this.f389325c = new C39307b1(context, ko1Var, n2Var, adResultReceiver);
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(boolean z12) {
    }

    public final void a(@j.P ul ulVar) {
        this.f389326d = ulVar;
    }

    public final void a(@j.P pa1 pa1Var) {
        this.f389327e = pa1Var;
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(@j.N nr0 nr0Var, @j.P Map map) {
        pa1 pa1Var = this.f389327e;
        if (pa1Var != null) {
            pa1Var.a(map);
        }
        ul ulVar = this.f389326d;
        if (ulVar != null) {
            ulVar.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(@j.N w2 w2Var) {
        ul ulVar = this.f389326d;
        if (ulVar != null) {
            ulVar.a(w2Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(@j.N String str) {
        this.f389324b.a(str, this.f389323a, this.f389325c);
    }
}
