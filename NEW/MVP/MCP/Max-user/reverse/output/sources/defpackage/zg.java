package defpackage;

import android.view.View;
import android.view.animation.TranslateAnimation;

/* loaded from: classes2.dex */
public final class zg {
    public final fs4 a;
    public final n4e b;

    public zg(fs4 fs4Var, n4e n4eVar) {
        this.a = fs4Var;
        this.b = n4eVar;
    }

    public final boolean a() {
        return ((Boolean) this.b.get()).booleanValue();
    }

    public final xt4 b(View view) {
        if (!a()) {
            view.setVisibility(8);
            return xt4.d;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, 0.0f, 1, 0.0f, 1, 1.0f);
        translateAnimation.setInterpolator(this.a.d());
        translateAnimation.setDuration(200L);
        translateAnimation.setAnimationListener(new pg(1, view));
        view.startAnimation(translateAnimation);
        return new xt4(translateAnimation);
    }

    public final xt4 c(View view) {
        if (a()) {
            return new xt4(view.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setInterpolator(this.a.g()).setDuration(200L).withStartAction(new qg(view, 1)));
        }
        view.setVisibility(0);
        return xt4.d;
    }

    public final xt4 d(View view) {
        if (a()) {
            return new xt4(view.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setInterpolator(this.a.d()).setDuration(200L).withEndAction(new qg(view, 3)));
        }
        view.setVisibility(8);
        return xt4.d;
    }

    public final xt4 e(View view) {
        if (a()) {
            return new xt4(view.animate().alpha(1.0f).setInterpolator(this.a.c()).setDuration(200L).withStartAction(new qg(view, 0)));
        }
        view.setVisibility(0);
        return xt4.d;
    }

    public final xt4 f(View view) {
        if (a()) {
            return new xt4(view.animate().alpha(0.0f).setInterpolator(this.a.d()).setDuration(200L).withEndAction(new qg(view, 2)));
        }
        view.setVisibility(8);
        return xt4.d;
    }
}
