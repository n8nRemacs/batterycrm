package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.TextureView;

/* loaded from: classes8.dex */
public final class ko0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39361s f387240a = new C39361s();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final sh1 f387241b = new sh1();

    @j.N
    public final ho0 a(@j.N Context context, @j.N oh1 oh1Var, @j.I int i12) {
        TextureView textureView = new TextureView(context);
        textureView.setVisibility(8);
        gn0 gn0VarA = this.f387240a.a(context, oh1Var, i12);
        gn0VarA.setVisibility(8);
        rh1 rh1VarA = this.f387241b.a(context);
        rh1VarA.setVisibility(8);
        ho0 ho0Var = new ho0(context, rh1VarA, textureView, gn0VarA);
        ho0Var.addView(rh1VarA);
        ho0Var.addView(textureView);
        ho0Var.addView(gn0VarA);
        return ho0Var;
    }
}
