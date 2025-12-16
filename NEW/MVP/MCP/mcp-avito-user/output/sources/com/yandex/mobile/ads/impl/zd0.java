package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.nativeads.CustomizableMediaView;

/* loaded from: classes8.dex */
public final class zd0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final od0 f392230a = new od0();

    /* renamed from: b, reason: collision with root package name */
    private final mi0 f392231b = new mi0();

    @j.N
    public final yn1 a(@j.N CustomizableMediaView customizableMediaView, @j.N rb0 rb0Var, @j.N n30 n30Var, @j.N ro0 ro0Var, @j.N n2 n2Var) {
        Context context = customizableMediaView.getContext();
        this.f392231b.getClass();
        hi0 hi0VarA = mi0.a(context, rb0Var, n30Var, ro0Var);
        this.f392230a.getClass();
        customizableMediaView.removeAllViews();
        customizableMediaView.addView(hi0VarA, new FrameLayout.LayoutParams(-1, -1));
        return new yn1(customizableMediaView, new ji0(hi0VarA), n2Var);
    }
}
