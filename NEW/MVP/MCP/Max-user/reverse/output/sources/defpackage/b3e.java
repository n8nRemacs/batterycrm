package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes2.dex */
public final class b3e implements em6 {
    public final /* synthetic */ View a;
    public final /* synthetic */ d3e b;
    public final /* synthetic */ x2e c;
    public final /* synthetic */ d3e d;
    public final /* synthetic */ t2e o;

    public b3e(t2e t2eVar, d3e d3eVar, x2e x2eVar, d3e d3eVar2, t2e t2eVar2) {
        this.a = t2eVar;
        this.b = d3eVar;
        this.c = x2eVar;
        this.d = d3eVar2;
        this.o = t2eVar2;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        ValueAnimator valueAnimator = (ValueAnimator) obj;
        View view = this.a;
        float translationY = 1 - (view.getTranslationY() / (vw4.d().getDisplayMetrics().density * 4.0f));
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(view.getTranslationY(), vw4.d().getDisplayMetrics().density * 4.0f);
        valueAnimatorOfFloat.setDuration((long) (200 * translationY));
        valueAnimatorOfFloat.setInterpolator(d3e.w0);
        d3e d3eVar = this.d;
        t2e t2eVar = this.o;
        View view2 = this.a;
        valueAnimatorOfFloat.addListener(new z2e(view2, this.b, this.c, d3eVar, t2eVar));
        valueAnimatorOfFloat.addUpdateListener(new a3e(view2, animatedFraction));
        valueAnimatorOfFloat.start();
        return valueAnimatorOfFloat;
    }
}
