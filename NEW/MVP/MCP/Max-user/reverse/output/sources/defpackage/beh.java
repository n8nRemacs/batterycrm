package defpackage;

import android.animation.Animator;
import one.me.chatmedia.viewer.VideoWebViewScreen;

/* loaded from: classes.dex */
public final class beh implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoWebViewScreen b;

    public /* synthetic */ beh(VideoWebViewScreen videoWebViewScreen, int i) {
        this.a = i;
        this.b = videoWebViewScreen;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                VideoWebViewScreen videoWebViewScreen = this.b;
                if (VideoWebViewScreen.I0(videoWebViewScreen)) {
                    videoWebViewScreen.N0().setVisibility(8);
                    videoWebViewScreen.M0().setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            default:
                VideoWebViewScreen videoWebViewScreen = this.b;
                if (VideoWebViewScreen.I0(videoWebViewScreen)) {
                    videoWebViewScreen.N0().setVisibility(0);
                    videoWebViewScreen.M0().setVisibility(videoWebViewScreen.getContext().getResources().getConfiguration().orientation == 2 ? 8 : 0);
                    break;
                }
                break;
        }
    }
}
