package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import one.me.sdk.richvector.VectorPath;

/* loaded from: classes2.dex */
public final class v5g extends fg5 implements u6g {
    public final Object X;
    public final Object Y;
    public AnimatorSet d;
    public final Object o;

    public v5g(Context context) {
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = new EnhancedAnimatedVectorDrawable(context, cxc.text_typing);
        super(enhancedAnimatedVectorDrawable);
        this.o = ipi.b(3, new se(enhancedAnimatedVectorDrawable, 3));
        this.X = ipi.b(3, new se(enhancedAnimatedVectorDrawable, 4));
        this.Y = ipi.b(3, new se(enhancedAnimatedVectorDrawable, 5));
    }

    public static ObjectAnimator c(VectorPath vectorPath, int i, int i2, int i3, int i4) {
        if (vectorPath == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ObjectAnimator objectAnimatorOfArgb = ObjectAnimator.ofArgb(vectorPath, "fillColor", i, i2, i3, i4);
        objectAnimatorOfArgb.setDuration(1000L);
        objectAnimatorOfArgb.setRepeatCount(-1);
        objectAnimatorOfArgb.setRepeatMode(1);
        objectAnimatorOfArgb.setInterpolator(new LinearInterpolator());
        return objectAnimatorOfArgb;
    }

    @Override // defpackage.fg5
    public final void a() {
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.end();
        }
    }

    @Override // defpackage.fg5
    public final void b() {
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, k18] */
    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        int i = yebVar.getIcon().j;
        float f = ((i >> 24) & 255) / 255.0f;
        ?? r3 = this.o;
        VectorPath vectorPath = (VectorPath) r3.getValue();
        if (vectorPath != null) {
            vectorPath.setFillColor(i);
        }
        ?? r4 = this.X;
        VectorPath vectorPath2 = (VectorPath) r4.getValue();
        if (vectorPath2 != null) {
            vectorPath2.setFillColor(i);
        }
        ?? r5 = this.Y;
        VectorPath vectorPath3 = (VectorPath) r5.getValue();
        if (vectorPath3 != null) {
            vectorPath3.setFillColor(i);
        }
        AnimatorSet animatorSet = this.d;
        boolean z = animatorSet != null && animatorSet.isRunning();
        AnimatorSet animatorSet2 = this.d;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        ObjectAnimator objectAnimatorC = c((VectorPath) r3.getValue(), v4j.c(i, 1.0f > f ? f : 1.0f), v4j.c(i, 0.25f), v4j.c(i, 0.25f), v4j.c(i, 1.0f > f ? f : 1.0f));
        ObjectAnimator objectAnimatorC2 = c((VectorPath) r4.getValue(), v4j.c(i, 0.25f), v4j.c(i, 1.0f > f ? f : 1.0f), v4j.c(i, 0.25f), v4j.c(i, 0.25f));
        VectorPath vectorPath4 = (VectorPath) r5.getValue();
        int iC = v4j.c(i, 0.25f);
        int iC2 = v4j.c(i, 0.25f);
        if (1.0f <= f) {
            f = 1.0f;
        }
        animatorSet3.playTogether(objectAnimatorC, objectAnimatorC2, c(vectorPath4, iC, iC2, v4j.c(i, f), v4j.c(i, 0.25f)));
        this.d = animatorSet3;
        if (z) {
            animatorSet3.start();
        }
    }
}
