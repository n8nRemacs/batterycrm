package defpackage;

import android.view.View;
import android.view.animation.Animation;

/* loaded from: classes2.dex */
public final class pg implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.a) {
            case 0:
                ((fqi) this.b).f();
                break;
            default:
                View view = (View) this.b;
                view.setAnimation(null);
                view.setVisibility(8);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        switch (this.a) {
            case 0:
                ((fqi) this.b).g();
                break;
        }
    }
}
