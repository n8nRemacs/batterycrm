package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes8.dex */
public final class rj1 {

    /* renamed from: a, reason: collision with root package name */
    private static final ck1 f389555a = new ck1();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f389556b = 0;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver.OnPreDrawListener f389557a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f389558b;

        public a(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            this.f389557a = onPreDrawListener;
            this.f389558b = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            this.f389557a.onPreDraw();
            this.f389558b.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    @Deprecated
    public static int a(@j.N Context context, float f12) {
        return l41.a(context, 1, f12);
    }

    public static int b(Context context) {
        return (int) (((context.getResources().getDisplayMetrics().heightPixels + 0.0f) / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int c(Context context) {
        return (int) (((context.getResources().getDisplayMetrics().widthPixels + 0.0f) / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static boolean d(@j.N View view) {
        return !view.isShown() || view.getAlpha() == 0.0f;
    }

    public static boolean e(@j.N View view) {
        Drawable background = view.getBackground();
        return (background == null || ((float) background.getAlpha()) == 0.0f) ? false : true;
    }

    public static int a(Context context) {
        return context.getResources().getDisplayMetrics().densityDpi;
    }

    public static int a(int i12, float f12) {
        return Color.argb(Math.max(0, Math.min(255, (int) (((100.0f - f12) * 255.0f) / 100.0f))), Color.red(i12), Color.green(i12), Color.blue(i12));
    }

    public static int b(@j.N View view) {
        if (view.isShown()) {
            return f389555a.a(view);
        }
        return 0;
    }

    public static boolean c(@j.P View view) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i12 = iArr[0];
        int width = view.getWidth() + i12;
        int i13 = iArr[1];
        Rect rect = new Rect(i12, i13, width, view.getHeight() + i13);
        Rect rect2 = new Rect();
        view.getWindowVisibleDisplayFrame(rect2);
        return !((rect.bottom <= rect2.top || rect.top >= rect2.bottom) || (rect.right <= rect2.left || rect.left >= rect2.right));
    }

    public static void a(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, onPreDrawListener));
    }

    public static boolean a(@j.P View view, int i12) {
        return a(view) >= i12;
    }

    public static int a(@j.P View view) {
        int width;
        int height;
        if (view != null && view.isShown()) {
            int iA2 = view.isShown() ? f389555a.a(view) : 0;
            if (iA2 > 0) {
                if (view.getLayoutParams().width > 0) {
                    width = view.getLayoutParams().width;
                } else {
                    width = view.getWidth();
                }
                if (view.getLayoutParams().height > 0) {
                    height = view.getLayoutParams().height;
                } else {
                    height = view.getHeight();
                }
                if (height > 0 && width > 0) {
                    return (iA2 * 100) / (height * width);
                }
            }
        }
        return 0;
    }
}
