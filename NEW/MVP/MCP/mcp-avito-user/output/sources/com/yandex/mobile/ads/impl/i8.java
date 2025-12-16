package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes8.dex */
public final class i8 extends nr0 {

    /* renamed from: k, reason: collision with root package name */
    @j.N
    private final j8 f386363k;

    public i8(@j.N Context context) {
        this(context, new bb0());
    }

    @Override // com.yandex.mobile.ads.impl.nr0, com.yandex.mobile.ads.impl.o00
    public final void a(@j.N Context context, @j.N String str) {
        this.f386363k.a(str);
    }

    public void setAdtuneWebViewListener(@j.N l8 l8Var) {
        this.f386363k.a(l8Var);
    }

    public i8(@j.N Context context, @j.N bb0 bb0Var) {
        super(context);
        j8 j8Var = new j8();
        this.f386363k = j8Var;
        if (bb0Var.a()) {
            setLayerType(2, null);
        }
        setVisibility(0);
        setHtmlWebViewErrorListener(j8Var);
    }

    @Override // com.yandex.mobile.ads.impl.nr0
    public final void h() {
    }
}
