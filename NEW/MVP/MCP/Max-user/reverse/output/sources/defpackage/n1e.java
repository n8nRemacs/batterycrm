package defpackage;

import android.animation.ValueAnimator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n1e implements de7 {
    public float a;
    public ValueAnimator b;
    public final /* synthetic */ o1e c;

    public n1e(o1e o1eVar) {
        this.c = o1eVar;
    }

    @Override // defpackage.de7
    public final void a(long j, wz1 wz1Var) {
        gri.a("ScreenFlashView", "ScreenFlash#apply");
        o1e o1eVar = this.c;
        this.a = o1eVar.getBrightness();
        o1eVar.setBrightness(1.0f);
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Objects.requireNonNull(wz1Var);
        awa awaVar = new awa(26, wz1Var);
        gri.a("ScreenFlashView", "animateToFullOpacity");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(o1eVar.getVisibilityRampUpAnimationDurationMillis());
        valueAnimatorOfFloat.addUpdateListener(new q00(23, o1eVar));
        valueAnimatorOfFloat.addListener(new qe(10, awaVar));
        valueAnimatorOfFloat.start();
        this.b = valueAnimatorOfFloat;
    }

    @Override // defpackage.de7
    public final void clear() {
        gri.a("ScreenFlashView", "ScreenFlash#clearScreenFlashUi");
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.b = null;
        }
        o1e o1eVar = this.c;
        o1eVar.setAlpha(0.0f);
        o1eVar.setBrightness(this.a);
    }
}
