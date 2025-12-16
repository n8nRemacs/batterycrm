package defpackage;

import android.animation.Animator;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* loaded from: classes2.dex */
public final class sah implements Animator.AnimatorListener {
    public final /* synthetic */ VideoMessageWidget a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    public sah(VideoMessageWidget videoMessageWidget, boolean z, boolean z2) {
        this.a = videoMessageWidget;
        this.b = z;
        this.c = z2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        yy7[] yy7VarArr = VideoMessageWidget.H0;
        VideoMessageWidget videoMessageWidget = this.a;
        videoMessageWidget.E0().setVisibility(this.b ? 0 : 8);
        videoMessageWidget.B0().setVisibility(0);
        videoMessageWidget.D0().setVisibility(this.c ? 0 : 8);
    }
}
