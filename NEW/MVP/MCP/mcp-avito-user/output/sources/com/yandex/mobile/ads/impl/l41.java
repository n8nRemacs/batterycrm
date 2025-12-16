package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.TypedValue;

/* loaded from: classes8.dex */
public final /* synthetic */ class l41 {
    public static int a(Context context, int i12, float f12) {
        return Math.round(TypedValue.applyDimension(i12, f12, context.getResources().getDisplayMetrics()));
    }
}
