package com.yandex.mobile.ads.impl;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: classes8.dex */
final class t11 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final g81 f390060a = new g81();

    public static Point a(t11 t11Var, Display display) {
        t11Var.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    @j.N
    @TargetApi(17)
    public final Point a(Context context) {
        Display defaultDisplay;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f390060a.getClass();
        Point pointA = null;
        if (windowManager != null) {
            try {
                defaultDisplay = windowManager.getDefaultDisplay();
            } catch (Throwable unused) {
            }
        } else {
            defaultDisplay = null;
        }
        g81 g81Var = this.f390060a;
        Point point = new Point(0, 0);
        g81Var.getClass();
        if (defaultDisplay != null) {
            try {
                pointA = a(this, defaultDisplay);
            } catch (Throwable unused2) {
            }
        }
        return pointA == null ? point : pointA;
    }
}
