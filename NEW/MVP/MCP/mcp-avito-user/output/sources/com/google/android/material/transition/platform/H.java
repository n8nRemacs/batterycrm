package com.google.android.material.transition.platform;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import j.InterfaceC42167x;
import j.X;
import mY0.C44030a;

/* compiled from: TransitionUtils.java */
@X
/* loaded from: classes6.dex */
class H {

    /* renamed from: a, reason: collision with root package name */
    public static final RectF f357855a = new RectF();

    /* compiled from: TransitionUtils.java */
    public interface a {
    }

    public static View a(View view, @j.D int i12) throws Resources.NotFoundException {
        String resourceName = view.getResources().getResourceName(i12);
        while (view != null) {
            if (view.getId() != i12) {
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(androidx.appcompat.app.r.q(resourceName, " is not a valid ancestor"));
    }

    public static RectF b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], view.getWidth() + r1, view.getHeight() + r0);
    }

    public static float c(float f12, float f13, float f14) {
        return androidx.appcompat.app.r.c(f13, f12, f14, f12);
    }

    public static float d(float f12, float f13, @InterfaceC42167x float f14, @InterfaceC42167x float f15, @InterfaceC42167x float f16, boolean z12) {
        return (!z12 || (f16 >= 0.0f && f16 <= 1.0f)) ? f16 < f14 ? f12 : f16 > f15 ? f13 : c(f12, f13, (f16 - f14) / (f15 - f14)) : c(f12, f13, f16);
    }

    public static int e(@InterfaceC42167x float f12, @InterfaceC42167x float f13, @InterfaceC42167x float f14, int i12, int i13) {
        return f14 < f12 ? i12 : f14 > f13 ? i13 : (int) c(i12, i13, (f14 - f12) / (f13 - f12));
    }

    public static void f(Canvas canvas, Rect rect, float f12, float f13, float f14, int i12, C44030a.InterfaceC11833a interfaceC11833a) {
        if (i12 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(f12, f13);
        canvas.scale(f14, f14);
        if (i12 < 255) {
            RectF rectF = f357855a;
            rectF.set(rect);
            canvas.saveLayerAlpha(rectF, i12);
        }
        interfaceC11833a.a(canvas);
        canvas.restoreToCount(iSave);
    }
}
