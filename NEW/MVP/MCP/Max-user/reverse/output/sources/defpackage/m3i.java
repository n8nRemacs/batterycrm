package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class m3i implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ s3i a;
    public final /* synthetic */ g4i b;
    public final /* synthetic */ g4i c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View o;

    public m3i(s3i s3iVar, g4i g4iVar, g4i g4iVar2, int i, View view) {
        this.a = s3iVar;
        this.b = g4iVar;
        this.c = g4iVar2;
        this.d = i;
        this.o = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        s3i s3iVar = this.a;
        s3iVar.a.d(animatedFraction);
        g4i g4iVar = this.b;
        e4i e4iVar = g4iVar.a;
        float fB = s3iVar.a.b();
        PathInterpolator pathInterpolator = o3i.e;
        int i = Build.VERSION.SDK_INT;
        y3i x3iVar = i >= 30 ? new x3i(g4iVar) : i >= 29 ? new v3i(g4iVar) : new u3i(g4iVar);
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((this.d & i2) == 0) {
                x3iVar.c(i2, e4iVar.f(i2));
            } else {
                co7 co7VarF = e4iVar.f(i2);
                co7 co7VarF2 = this.c.a.f(i2);
                float f = 1.0f - fB;
                x3iVar.c(i2, g4i.e(co7VarF, (int) (((co7VarF.a - co7VarF2.a) * f) + 0.5d), (int) (((co7VarF.b - co7VarF2.b) * f) + 0.5d), (int) (((co7VarF.c - co7VarF2.c) * f) + 0.5d), (int) (((co7VarF.d - co7VarF2.d) * f) + 0.5d)));
            }
        }
        o3i.g(this.o, x3iVar.b(), Collections.singletonList(s3iVar));
    }
}
