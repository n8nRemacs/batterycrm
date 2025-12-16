package defpackage;

import android.animation.ValueAnimator;
import android.view.ScaleGestureDetector;
import android.view.animation.AccelerateDecelerateInterpolator;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* loaded from: classes2.dex */
public final class cah implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ VideoMessageWidget a;

    public cah(VideoMessageWidget videoMessageWidget) {
        this.a = videoMessageWidget;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        cb8 cb8VarQ;
        q7i q7iVar;
        cb8 cb8VarQ2;
        q7i q7iVar2;
        ValueAnimator valueAnimator;
        yy7[] yy7VarArr = VideoMessageWidget.H0;
        x9h x9hVarG0 = this.a.G0();
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        q8h q8hVar = (q8h) x9hVarG0.b;
        ValueAnimator valueAnimator2 = q8hVar.G;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = q8hVar.G) != null) {
            valueAnimator.cancel();
        }
        float f = 1;
        float fI = q8hVar.F * utb.i(scaleFactor, f, 2.0f, f);
        q8hVar.F = fI;
        l22 l22VarP = q8hVar.p();
        float fB = (l22VarP == null || (cb8VarQ2 = ((yod) l22VarP).b.q()) == null || (q7iVar2 = (q7i) cb8VarQ2.d()) == null) ? 1.0f : q7iVar2.b();
        l22 l22VarP2 = q8hVar.p();
        float fB2 = n7j.b(fI, fB, (l22VarP2 == null || (cb8VarQ = ((yod) l22VarP2).b.q()) == null || (q7iVar = (q7i) cb8VarQ.d()) == null) ? 10.0f : q7iVar.a());
        n38 n38Var = q8hVar.p;
        xod xodVar = n38Var != null ? n38Var.c.A0 : null;
        if (xodVar != null) {
            xodVar.d(fB2);
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        yy7[] yy7VarArr = VideoMessageWidget.H0;
        q8h q8hVar = (q8h) this.a.G0().b;
        ValueAnimator valueAnimator = q8hVar.G;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(q8hVar.F, 1.0f);
            valueAnimatorOfFloat.setDuration(150L);
            valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new q00(28, q8hVar));
            valueAnimatorOfFloat.addListener(new qe(13, q8hVar));
            q8hVar.G = valueAnimatorOfFloat;
            valueAnimatorOfFloat.start();
        }
    }
}
