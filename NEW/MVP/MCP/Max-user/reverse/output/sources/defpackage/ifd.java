package defpackage;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final class ifd implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordControlsWidget b;

    public /* synthetic */ ifd(RecordControlsWidget recordControlsWidget, int i) {
        this.a = i;
        this.b = recordControlsWidget;
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
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        RecordControlsWidget recordControlsWidget = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = RecordControlsWidget.g1;
                recordControlsWidget.P0().setVisibility(8);
                RecordControlsWidget.y0(recordControlsWidget).setVisibility(8);
                rkh rkhVar = recordControlsWidget.D0;
                if (rkhVar != null) {
                    rkhVar.setDurationText(null);
                }
                recordControlsWidget.K0().setAlpha(1.0f);
                recordControlsWidget.D0().setScaleX(1.0f);
                recordControlsWidget.E0().setAlpha(1.0f);
                Object parentController = recordControlsWidget.getParentController();
                ub3 ub3Var = parentController instanceof ub3 ? (ub3) parentController : null;
                if (ub3Var != null) {
                    ((MessageWriteWidget) ub3Var).B0(true);
                }
                RecordControlsWidget.z0(recordControlsWidget);
                recordControlsWidget.A0();
                recordControlsWidget.S0().w0.setValue(null);
                break;
            case 1:
                yy7[] yy7VarArr2 = RecordControlsWidget.g1;
                recordControlsWidget.P0().setVisibility(8);
                RecordControlsWidget.y0(recordControlsWidget).setVisibility(8);
                recordControlsWidget.E0().setVisibility(8);
                recordControlsWidget.H0().setScaleX(1.0f);
                recordControlsWidget.H0().setScaleY(1.0f);
                recordControlsWidget.H0().setAlpha(1.0f);
                recordControlsWidget.H0().setVisibility(0);
                recordControlsWidget.Q0().setVisibility(8);
                recordControlsWidget.Q0().setScaleX(0.0f);
                recordControlsWidget.Q0().setScaleY(0.0f);
                recordControlsWidget.I0().setAlpha(1.0f);
                recordControlsWidget.E0().setScaleX(1.0f);
                recordControlsWidget.E0().setScaleY(1.0f);
                recordControlsWidget.E0().setAlpha(1.0f);
                recordControlsWidget.K0().setScaleX(1.0f);
                recordControlsWidget.K0().setScaleY(1.0f);
                recordControlsWidget.K0().setAlpha(1.0f);
                Object parentController2 = recordControlsWidget.getParentController();
                ub3 ub3Var2 = parentController2 instanceof ub3 ? (ub3) parentController2 : null;
                if (ub3Var2 != null) {
                    ((MessageWriteWidget) ub3Var2).B0(true);
                }
                RecordControlsWidget.z0(recordControlsWidget);
                recordControlsWidget.A0();
                recordControlsWidget.S0().w0.setValue(null);
                break;
            case 2:
                yy7[] yy7VarArr3 = RecordControlsWidget.g1;
                recordControlsWidget.H0().setVisibility(8);
                recordControlsWidget.Q0().setVisibility(0);
                recordControlsWidget.Q0().setAlpha(1.0f);
                break;
            case 3:
                yy7[] yy7VarArr4 = RecordControlsWidget.g1;
                recordControlsWidget.P0().setVisibility(8);
                recordControlsWidget.F0().setAlpha(1.0f);
                recordControlsWidget.O0().setScaleX(1.0f);
                recordControlsWidget.O0().setScaleY(1.0f);
                recordControlsWidget.N0().setScaleX(1.0f);
                recordControlsWidget.N0().setScaleY(1.0f);
                recordControlsWidget.M0().setScaleX(1.0f);
                recordControlsWidget.M0().setScaleY(1.0f);
                rkh rkhVar2 = recordControlsWidget.D0;
                if (rkhVar2 != null) {
                    rkhVar2.setAlpha(1.0f);
                    rkhVar2.setBackgroundColor(false);
                    rkhVar2.setDurationColor(false);
                    rkhVar2.setVisiblePlayPauseButton(false);
                }
                recordControlsWidget.E0().setScaleX(1.0f);
                recordControlsWidget.E0().setScaleY(1.0f);
                recordControlsWidget.E0().setAlpha(1.0f);
                recordControlsWidget.F0().setVisibility(8);
                Object parentController3 = recordControlsWidget.getParentController();
                ub3 ub3Var3 = parentController3 instanceof ub3 ? (ub3) parentController3 : null;
                if (ub3Var3 != null) {
                    ((MessageWriteWidget) ub3Var3).B0(true);
                }
                RecordControlsWidget.z0(recordControlsWidget);
                recordControlsWidget.A0();
                recordControlsWidget.S0().w0.setValue(null);
                break;
            case 4:
                yy7[] yy7VarArr5 = RecordControlsWidget.g1;
                recordControlsWidget.M0().setVisibility(8);
                rkh rkhVar3 = recordControlsWidget.D0;
                if (rkhVar3 != null) {
                    rkhVar3.e();
                    break;
                }
                break;
            case 6:
                yy7[] yy7VarArr6 = RecordControlsWidget.g1;
                recordControlsWidget.M0().setVisibility(8);
                break;
            case 8:
                yy7[] yy7VarArr7 = RecordControlsWidget.g1;
                recordControlsWidget.N0().setVisibility(8);
                rkh rkhVar4 = recordControlsWidget.D0;
                if (rkhVar4 != null) {
                    rkhVar4.e();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, k18] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        RecordControlsWidget recordControlsWidget = this.b;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                yy7[] yy7VarArr = RecordControlsWidget.g1;
                recordControlsWidget.P0().setVisibility(0);
                recordControlsWidget.B0().setImageDrawable((Drawable) recordControlsWidget.G0.getValue());
                rkh rkhVar = recordControlsWidget.D0;
                if (rkhVar != null) {
                    rkhVar.getHandFreeDotView().setVisibility(0);
                }
                recordControlsWidget.N0().setVisibility(8);
                recordControlsWidget.M0().setVisibility(0);
                break;
            case 6:
                break;
            case 7:
                yy7[] yy7VarArr2 = RecordControlsWidget.g1;
                recordControlsWidget.N0().setVisibility(0);
                recordControlsWidget.M0().setVisibility(0);
                rkh rkhVar2 = recordControlsWidget.D0;
                if (rkhVar2 != null) {
                    rkhVar2.setVisiblePlayPauseButton(true);
                    rkhVar2.getHandFreeDotView().setVisibility(8);
                    rkhVar2.c();
                    break;
                }
                break;
            case 8:
                break;
            case 9:
                yy7[] yy7VarArr3 = RecordControlsWidget.g1;
                recordControlsWidget.B0().setImageDrawable((Drawable) recordControlsWidget.G0.getValue());
                rkh rkhVar3 = recordControlsWidget.D0;
                if (rkhVar3 != null) {
                    rkhVar3.getHandFreeDotView().setVisibility(0);
                }
                recordControlsWidget.N0().setVisibility(0);
                recordControlsWidget.M0().setVisibility(0);
                break;
            default:
                yy7[] yy7VarArr4 = RecordControlsWidget.g1;
                recordControlsWidget.H0().setTranslationX(vw4.d().getDisplayMetrics().density * 72.0f);
                recordControlsWidget.H0().setAlpha(0.0f);
                recordControlsWidget.I0().setTranslationX(vw4.d().getDisplayMetrics().density * 72.0f);
                recordControlsWidget.I0().setAlpha(0.0f);
                recordControlsWidget.G0().setTranslationX(vw4.d().getDisplayMetrics().density * 70.0f);
                recordControlsWidget.G0().setAlpha(0.0f);
                recordControlsWidget.D0().setAlpha(0.0f);
                recordControlsWidget.E0().setScaleX(1.0f);
                recordControlsWidget.E0().setScaleY(1.0f);
                recordControlsWidget.B0().setImageDrawable(recordControlsWidget.L0());
                recordControlsWidget.K0().setAlpha(0.0f);
                recordControlsWidget.K0().setVisibility(0);
                RecordControlsWidget.y0(recordControlsWidget).setVisibility(0);
                recordControlsWidget.E0().setVisibility(0);
                recordControlsWidget.P0().setVisibility(0);
                Object parentController = recordControlsWidget.getParentController();
                ub3 ub3Var = parentController instanceof ub3 ? (ub3) parentController : null;
                if (ub3Var != null) {
                    ((MessageWriteWidget) ub3Var).B0(false);
                    break;
                }
                break;
        }
    }
}
