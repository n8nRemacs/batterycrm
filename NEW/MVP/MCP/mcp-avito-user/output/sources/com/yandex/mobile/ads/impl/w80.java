package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;

/* loaded from: classes8.dex */
public final class w80<V extends ViewGroup> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final j11<V> f391336a = new j11<>();

    @I41.h
    public final V a(@j.N ViewGroup viewGroup, @j.N u80<V> u80Var) {
        Context context = viewGroup.getContext();
        int iC2 = u80Var.c();
        Class<V> clsD = u80Var.d();
        this.f391336a.getClass();
        return (V) j11.a(context, clsD, iC2, viewGroup);
    }
}
