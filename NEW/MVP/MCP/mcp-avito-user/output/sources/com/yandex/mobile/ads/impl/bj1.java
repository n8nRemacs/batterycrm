package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public abstract class bj1<V extends View, T> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final WeakReference<V> f383970a;

    public bj1(@j.N V v12) {
        this.f383970a = new WeakReference<>(v12);
    }

    public void a() {
    }

    public abstract boolean a(@j.N V v12, @j.N T t12);

    @j.P
    public final V b() {
        return this.f383970a.get();
    }

    public abstract void b(@j.N V v12, @j.N T t12);

    @SuppressLint({"ClickableViewAccessibility"})
    public void a(@j.N V v12) {
        v12.setVisibility(8);
        v12.setOnClickListener(null);
        v12.setOnTouchListener(null);
        v12.setSelected(false);
    }

    public void a(@j.N eb ebVar, @j.N ej1 ej1Var, @j.P T t12) {
        View viewB = b();
        if (viewB != null) {
            ej1Var.a(viewB, ebVar);
            ej1Var.a(ebVar, new dj1(viewB));
        }
    }
}
