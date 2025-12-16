package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;

/* loaded from: classes8.dex */
public final class v80<V extends ViewGroup> {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private up<V> f390817a;

    public final void a(@j.N ViewGroup viewGroup) {
        viewGroup.removeAllViews();
        up<V> upVar = this.f390817a;
        if (upVar != null) {
            upVar.c();
        }
    }

    public final void a(@j.N ViewGroup viewGroup, @j.N V v12, @j.N u80<V> u80Var) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        viewGroup.removeAllViews();
        viewGroup.addView(v12, layoutParams);
        up<V> upVarA = u80Var.a();
        this.f390817a = upVarA;
        upVarA.a(v12);
    }
}
