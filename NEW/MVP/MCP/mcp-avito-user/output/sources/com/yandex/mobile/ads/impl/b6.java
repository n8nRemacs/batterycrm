package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes8.dex */
public final class b6 {
    @j.N
    public static FrameLayout a(@j.N Context context) {
        a6 a6Var = new a6(context);
        FrameLayout frameLayout = new FrameLayout(context);
        int i12 = rj1.f389556b;
        int iA2 = l41.a(context, 1, 25.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA2, iA2);
        layoutParams.gravity = 17;
        int iRound = Math.round(TypedValue.applyDimension(1, 19.5f, context.getResources().getDisplayMetrics()));
        layoutParams.setMargins(iRound, iRound, iRound, iRound);
        frameLayout.addView(a6Var, layoutParams);
        a6Var.setTag(qj1.a("close_button"));
        a6Var.f383419h = 1.0f;
        a6Var.invalidate();
        return frameLayout;
    }
}
