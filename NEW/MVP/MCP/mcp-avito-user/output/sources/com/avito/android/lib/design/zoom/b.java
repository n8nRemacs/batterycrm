package com.avito.android.lib.design.zoom;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import uW0.C48986a;

/* compiled from: AnimatedZoomableController.java */
/* loaded from: classes14.dex */
class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f181308a;

    public b(d dVar) {
        this.f181308a = dVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        d dVar = this.f181308a;
        Matrix matrix = dVar.f181307q;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i12 = 0;
        while (true) {
            float[] fArr = dVar.f181305o;
            if (i12 >= 9) {
                matrix.setValues(fArr);
                Matrix matrix2 = dVar.f181307q;
                int i13 = d.f181310s;
                C48986a.d(e.class, "setTransform");
                dVar.f181319h.set(matrix2);
                dVar.t();
                return;
            }
            fArr[i12] = (dVar.f181304n[i12] * fFloatValue) + ((1.0f - fFloatValue) * dVar.f181303m[i12]);
            i12++;
        }
    }
}
