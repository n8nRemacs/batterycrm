package defpackage;

import android.animation.Animator;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class qe implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qe(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void A(Animator animator) {
    }

    private final void B(Animator animator) {
    }

    private final void C(Animator animator) {
    }

    private final void D(Animator animator) {
    }

    private final void E(Animator animator) {
    }

    private final void F(Animator animator) {
    }

    private final void G(Animator animator) {
    }

    private final void H(Animator animator) {
    }

    private final void I(Animator animator) {
    }

    private final void J(Animator animator) {
    }

    private final void K(Animator animator) {
    }

    private final void L(Animator animator) {
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

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    private final void k(Animator animator) {
    }

    private final void l(Animator animator) {
    }

    private final void m(Animator animator) {
    }

    private final void n(Animator animator) {
    }

    private final void o(Animator animator) {
    }

    private final void p(Animator animator) {
    }

    private final void q(Animator animator) {
    }

    private final void r(Animator animator) {
    }

    private final void s(Animator animator) {
    }

    private final void t(Animator animator) {
    }

    private final void u(Animator animator) {
    }

    private final void v(Animator animator) {
    }

    private final void w(Animator animator) {
    }

    private final void x(Animator animator) {
    }

    private final void y(Animator animator) {
    }

    private final void z(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                int[] iArr = ((re) this.b).b;
                int i = (int) 4289937919L;
                iArr[2] = i;
                iArr[3] = i;
                break;
            case 5:
                fn5 fn5Var = (fn5) this.b;
                fn5Var.z0 = null;
                fn5Var.requestLayout();
                break;
            case 6:
                bi9 bi9Var = (bi9) this.b;
                bi9Var.Q0 = null;
                bi9Var.I0.setForeground(null);
                bi9Var.J().setAlpha(150);
                break;
            case 7:
                s1c s1cVar = (s1c) this.b;
                ukd ukdVar = s1cVar.b;
                View view = s1cVar.a;
                ukdVar.H(view.getX(), view.getY());
                s1cVar.d();
                break;
            case 8:
                cm6 cm6Var = ((hrc) this.b).z0;
                if (cm6Var != null) {
                    cm6Var.invoke();
                    break;
                }
                break;
            case 9:
                c9d c9dVar = (c9d) this.b;
                c9dVar.a = false;
                c9dVar.b = null;
                break;
            case 13:
                ((q8h) this.b).G = null;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                int[] iArr = ((re) obj).b;
                int i2 = (int) 4289937919L;
                iArr[2] = i2;
                iArr[3] = i2;
                break;
            case 2:
                break;
            case 3:
                yy7[] yy7VarArr = CallWaitingRoomEventsWidget.u0;
                ((CallWaitingRoomEventsWidget) obj).C0();
                break;
            case 4:
                break;
            case 5:
                fn5 fn5Var = (fn5) obj;
                fn5Var.z0 = null;
                fn5Var.requestLayout();
                break;
            case 6:
                bi9 bi9Var = (bi9) obj;
                bi9Var.Q0 = null;
                bi9Var.I0.setForeground(null);
                bi9Var.J().setAlpha(150);
                break;
            case 7:
                s1c s1cVar = (s1c) obj;
                ukd ukdVar = s1cVar.b;
                View view = s1cVar.a;
                ukdVar.H(view.getX(), view.getY());
                s1cVar.d();
                break;
            case 8:
                cm6 cm6Var = ((hrc) obj).z0;
                if (cm6Var != null) {
                    cm6Var.invoke();
                    break;
                }
                break;
            case 9:
                c9d c9dVar = (c9d) obj;
                c9dVar.a = false;
                c9dVar.b = null;
                break;
            case 10:
                gri.a("ScreenFlashView", "ScreenFlash#apply: onAnimationEnd");
                ((awa) obj).run();
                break;
            case 11:
                dvf dvfVar = (dvf) obj;
                SwipeWidget swipeWidget = dvfVar.q;
                ViewGroup viewGroup = dvfVar.c;
                View view2 = dvfVar.b;
                if (swipeWidget != null) {
                    swipeWidget.B0();
                }
                ivf ivfVar = view2 instanceof ivf ? (ivf) view2 : null;
                if (ivfVar != null) {
                    ivfVar.setOnTouch(null);
                    ivfVar.setOnRequestInterceptTouchEvent(null);
                }
                viewGroup.removeView(view2);
                viewGroup.removeView(viewGroup.findViewById(mzc.swipe_fade));
                SwipeWidget swipeWidget2 = dvfVar.q;
                if (swipeWidget2 != null) {
                    swipeWidget2.b = false;
                    swipeWidget2.getRouter().C();
                }
                dvfVar.q = null;
                vnd vndVar = dvfVar.o;
                try {
                    ((VelocityTracker) vndVar.getValue()).recycle();
                } catch (Throwable unused) {
                }
                vndVar.b = kk4.B0;
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((da1) obj).invoke();
                break;
            case 13:
                ((q8h) obj).G = null;
                break;
            default:
                VideoMessageWidget videoMessageWidget = (VideoMessageWidget) obj;
                yy7[] yy7VarArr2 = VideoMessageWidget.H0;
                videoMessageWidget.E0().setVisibility(8);
                videoMessageWidget.B0().setVisibility(8);
                videoMessageWidget.D0().setVisibility(8);
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
                ((ddb) this.b).invoke();
                break;
            case 2:
                ((OneMeButton) this.b).setClickable(false);
                break;
            case 4:
                x52.a((x52) this.b, 1);
                break;
        }
    }

    public qe(dvf dvfVar, float f) {
        this.a = 11;
        this.b = dvfVar;
    }
}
