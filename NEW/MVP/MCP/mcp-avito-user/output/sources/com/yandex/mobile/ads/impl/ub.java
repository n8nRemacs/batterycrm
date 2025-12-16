package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes8.dex */
public final class ub implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final br0 f390506a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final String f390507b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final String f390508c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final ri1 f390509d;

    public ub(@Y61.k br0 br0Var, @Y61.k String str, @Y61.k String str2, @Y61.k ri1 ri1Var) {
        this.f390506a = br0Var;
        this.f390507b = str;
        this.f390508c = str2;
        this.f390509d = ri1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Y61.k View view) {
        this.f390509d.a(this.f390508c);
        this.f390506a.a(this.f390507b);
    }
}
