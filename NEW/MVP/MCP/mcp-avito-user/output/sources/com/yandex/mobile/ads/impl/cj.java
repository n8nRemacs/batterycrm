package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes8.dex */
public final class cj {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final eb f384311a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final j2 f384312b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.nativeads.w f384313c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final tx0 f384314d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final tw f384315e;

    public cj(@j.N eb ebVar, @j.N j2 j2Var, @j.N com.yandex.mobile.ads.nativeads.w wVar, @j.N tx0 tx0Var, @j.N tw twVar) {
        this.f384311a = ebVar;
        this.f384312b = j2Var;
        this.f384313c = wVar;
        this.f384314d = tx0Var;
        this.f384315e = twVar;
    }

    @j.N
    public final View.OnClickListener a(@j.N h90 h90Var) {
        com.yandex.mobile.ads.nativeads.c cVarF = this.f384313c.f();
        eb ebVar = this.f384311a;
        j2 j2Var = this.f384312b;
        com.yandex.mobile.ads.nativeads.w wVar = this.f384313c;
        return cVarF.a(this.f384315e, this.f384314d, j2Var, wVar, ebVar, h90Var);
    }
}
