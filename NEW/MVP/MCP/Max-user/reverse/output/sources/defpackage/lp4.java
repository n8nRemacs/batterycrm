package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.c;

/* loaded from: classes.dex */
public final class lp4 implements Animation.AnimationListener {
    public final /* synthetic */ v7f a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ View c;
    public final /* synthetic */ mp4 d;

    public lp4(v7f v7fVar, ViewGroup viewGroup, View view, mp4 mp4Var) {
        this.a = v7fVar;
        this.b = viewGroup;
        this.c = view;
        this.d = mp4Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ViewGroup viewGroup = this.b;
        viewGroup.post(new cj(viewGroup, this.c, this.d, 19));
        if (c.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (c.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.a + " has reached onAnimationStart.");
        }
    }
}
