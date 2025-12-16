package com.avito.android.lib.design.zoom;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.animation.DecelerateInterpolator;
import com.facebook.common.internal.o;
import uW0.C48986a;

/* compiled from: AnimatedZoomableController.java */
/* loaded from: classes14.dex */
public class d extends a {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f181310s = 0;

    /* renamed from: r, reason: collision with root package name */
    public final ValueAnimator f181311r;

    @SuppressLint({"NewApi"})
    public d(MV.b bVar) {
        super(bVar);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f181311r = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
    }

    public static d y() {
        return new d(new MV.b(new MV.a()));
    }

    @Override // com.avito.android.lib.design.zoom.a
    @SuppressLint({"NewApi"})
    public final void v(Matrix matrix, long j12) {
        C48986a.g(Long.valueOf(j12), d.class, "setTransformAnimated: duration %d ms");
        w();
        if (!(j12 > 0)) {
            throw new IllegalArgumentException();
        }
        o.d(!this.f181302l);
        this.f181302l = true;
        ValueAnimator valueAnimator = this.f181311r;
        valueAnimator.setDuration(j12);
        this.f181319h.getValues(this.f181303m);
        matrix.getValues(this.f181304n);
        valueAnimator.addUpdateListener(new b(this));
        valueAnimator.addListener(new c(this));
        valueAnimator.start();
    }

    @Override // com.avito.android.lib.design.zoom.a
    @SuppressLint({"NewApi"})
    public final void w() {
        if (this.f181302l) {
            C48986a.d(d.class, "stopAnimation");
            ValueAnimator valueAnimator = this.f181311r;
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
        }
    }
}
