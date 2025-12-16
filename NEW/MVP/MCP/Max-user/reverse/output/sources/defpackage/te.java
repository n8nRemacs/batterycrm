package defpackage;

import android.content.Context;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import one.me.sdk.richvector.VectorPath;

/* loaded from: classes2.dex */
public final class te extends fg5 {
    public final Object X;
    public final Object d;
    public final Object o;

    public te(Context context) {
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = new EnhancedAnimatedVectorDrawable(context, yud.Z);
        super(enhancedAnimatedVectorDrawable);
        this.d = ipi.b(3, new se(enhancedAnimatedVectorDrawable, 0));
        this.o = ipi.b(3, new se(enhancedAnimatedVectorDrawable, 1));
        this.X = ipi.b(3, new se(enhancedAnimatedVectorDrawable, 2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, k18] */
    public final void c(int i) {
        VectorPath vectorPath = (VectorPath) this.d.getValue();
        if (vectorPath != null) {
            vectorPath.setStrokeColor(i);
        }
        VectorPath vectorPath2 = (VectorPath) this.o.getValue();
        if (vectorPath2 != null) {
            vectorPath2.setStrokeColor(i);
        }
        VectorPath vectorPath3 = (VectorPath) this.X.getValue();
        if (vectorPath3 != null) {
            vectorPath3.setStrokeColor(i);
        }
        this.b.invalidatePath();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, k18] */
    public final void d(int i, int i2) {
        int iC = rf3.c(i2, ((i >> 24) & 255) / 255.0f, v4j.c(i, 1.0f));
        VectorPath vectorPath = (VectorPath) this.d.getValue();
        if (vectorPath != null) {
            vectorPath.setStrokeColor(iC);
        }
        VectorPath vectorPath2 = (VectorPath) this.o.getValue();
        if (vectorPath2 != null) {
            vectorPath2.setStrokeColor(iC);
        }
        VectorPath vectorPath3 = (VectorPath) this.X.getValue();
        if (vectorPath3 != null) {
            vectorPath3.setStrokeColor(iC);
        }
        this.b.invalidatePath();
    }
}
