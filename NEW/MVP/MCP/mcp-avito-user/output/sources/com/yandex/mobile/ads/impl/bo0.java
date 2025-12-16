package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
public final class bo0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final xi1 f384008a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final oh1 f384009b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final n2 f384010c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final AdResponse<?> f384011d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final mh1 f384012e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final xn0 f384013f;

    public bo0(@j.N xi1 xi1Var, @j.N oh1 oh1Var, @j.N n2 n2Var, @j.N AdResponse adResponse, @j.N mh1 mh1Var, @j.N sn0 sn0Var) {
        this.f384008a = xi1Var;
        this.f384009b = oh1Var;
        this.f384010c = n2Var;
        this.f384011d = adResponse;
        this.f384012e = mh1Var;
        this.f384013f = sn0Var;
    }

    @j.N
    public final ao0 a(@j.N Context context, @j.N du duVar, @j.N ff1 ff1Var, @j.N ri1 ri1Var) {
        return new ao0(context, duVar, ff1Var, this.f384009b, this.f384008a, new wf1(this.f384010c, this.f384011d), ri1Var, this.f384012e, this.f384013f);
    }
}
