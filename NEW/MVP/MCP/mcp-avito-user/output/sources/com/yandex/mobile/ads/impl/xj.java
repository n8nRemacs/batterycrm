package com.yandex.mobile.ads.impl;

import android.app.Dialog;

/* loaded from: classes8.dex */
public final class xj {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Dialog f391732a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final pl f391733b;

    public xj(@j.N Dialog dialog, @j.N pl plVar) {
        this.f391732a = dialog;
        this.f391733b = plVar;
    }

    public final void a() {
        this.f391732a.dismiss();
        this.f391733b.e();
    }

    public final void b() {
        this.f391732a.dismiss();
    }
}
