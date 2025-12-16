package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class hc1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final gc1 f386101a;

    public hc1(@Y61.k gc1 gc1Var) {
        this.f386101a = gc1Var;
    }

    public final boolean a(@Y61.k Context context, @Y61.k String str) {
        try {
            this.f386101a.getClass();
            context.startActivity(gc1.a(context, str));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public hc1() {
        this(new gc1());
    }
}
