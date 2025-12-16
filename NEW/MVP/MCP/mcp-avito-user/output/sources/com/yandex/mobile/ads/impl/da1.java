package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.db0;

/* loaded from: classes8.dex */
public final class da1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f384551a;

    /* renamed from: b, reason: collision with root package name */
    public final wx0[] f384552b;

    /* renamed from: c, reason: collision with root package name */
    public final cu[] f384553c;

    /* renamed from: d, reason: collision with root package name */
    public final sa1 f384554d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public final Object f384555e;

    public da1(wx0[] wx0VarArr, cu[] cuVarArr, sa1 sa1Var, @j.P db0.a aVar) {
        this.f384552b = wx0VarArr;
        this.f384553c = (cu[]) cuVarArr.clone();
        this.f384554d = sa1Var;
        this.f384555e = aVar;
        this.f384551a = wx0VarArr.length;
    }

    public final boolean a(int i12) {
        return this.f384552b[i12] != null;
    }
}
