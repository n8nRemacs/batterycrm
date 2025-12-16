package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.content.Context;
import android.view.ViewGroup;
import com.yandex.mobile.ads.R;

/* loaded from: classes8.dex */
public final class d8 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final a8 f384539a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final c8 f384540b = new c8();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Context f384541c;

    public d8(@j.N Context context, @j.N i8 i8Var) {
        this.f384541c = context;
        this.f384539a = new a8(context, i8Var);
    }

    @j.N
    public final Dialog a() {
        Dialog dialog = new Dialog(this.f384541c, R.style.MonetizationAdsInternal_BottomAdtuneDialog);
        ViewGroup viewGroupA = this.f384539a.a();
        this.f384540b.a(viewGroupA, dialog);
        dialog.setContentView(viewGroupA);
        dialog.getWindow().setGravity(80);
        return dialog;
    }
}
