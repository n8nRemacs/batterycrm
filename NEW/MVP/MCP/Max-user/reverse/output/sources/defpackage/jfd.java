package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final class jfd implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordControlsWidget b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ jfd(RecordControlsWidget recordControlsWidget, boolean z, int i) {
        this.a = i;
        this.b = recordControlsWidget;
        this.c = z;
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

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        boolean z = this.c;
        RecordControlsWidget recordControlsWidget = this.b;
        switch (i) {
            case 0:
                RecordControlsWidget.y0(recordControlsWidget).setVisibility(8);
                recordControlsWidget.H0().setTranslationY(0.0f);
                recordControlsWidget.H0().setAlpha(1.0f);
                recordControlsWidget.I0().setTranslationY(0.0f);
                recordControlsWidget.I0().setAlpha(1.0f);
                recordControlsWidget.G0().setTranslationY(0.0f);
                recordControlsWidget.G0().setAlpha(1.0f);
                recordControlsWidget.F0().setAlpha(1.0f);
                recordControlsWidget.O0().setTranslationY(0.0f);
                recordControlsWidget.O0().setAlpha(1.0f);
                if (z) {
                    recordControlsWidget.M0().setTranslationY(0.0f);
                    recordControlsWidget.M0().setAlpha(1.0f);
                }
                rkh rkhVar = recordControlsWidget.D0;
                if (rkhVar != null) {
                    rkhVar.e();
                    break;
                }
                break;
            case 1:
                break;
            default:
                yy7[] yy7VarArr = RecordControlsWidget.g1;
                recordControlsWidget.H0().setAlpha(1.0f);
                recordControlsWidget.H0().setTranslationX(0.0f);
                recordControlsWidget.I0().setAlpha(1.0f);
                recordControlsWidget.I0().setTranslationX(0.0f);
                recordControlsWidget.G0().setAlpha(1.0f);
                recordControlsWidget.G0().setTranslationX(0.0f);
                recordControlsWidget.K0().setAlpha(1.0f);
                Drawable drawableL0 = recordControlsWidget.L0();
                a93.s0.y(recordControlsWidget.B0()).a();
                cei.k(drawableL0, -1);
                recordControlsWidget.D0().setScaleX(1.0f);
                recordControlsWidget.D0().setScaleY(1.0f);
                recordControlsWidget.D0().setAlpha(1.0f);
                if (z) {
                    View viewH0 = recordControlsWidget.H0();
                    recordControlsWidget.a1.O(recordControlsWidget, RecordControlsWidget.g1[17], svi.e(tfh.b(viewH0), null, null, new fg(viewH0, null), 3));
                    AnimatorSet animatorSet = new AnimatorSet();
                    recordControlsWidget.d1 = animatorSet;
                    animatorSet.play(cqi.a(recordControlsWidget.G0(), View.TRANSLATION_X, 0.0f, vw4.d().getDisplayMetrics().density * (-4.0f), 1000L, 1000L, 2, -1));
                    AnimatorSet animatorSet2 = recordControlsWidget.d1;
                    if (animatorSet2 != null) {
                        animatorSet2.start();
                    }
                    recordControlsWidget.e1 = new AnimatorSet();
                    imb imbVar = recordControlsWidget.Q0;
                    float fFloatValue = imbVar != null ? ((Number) imbVar.b).floatValue() : 0.0f;
                    AnimatorSet animatorSet3 = recordControlsWidget.e1;
                    if (animatorSet3 != null) {
                        animatorSet3.play(cqi.a(recordControlsWidget.K0(), View.TRANSLATION_Y, fFloatValue, fFloatValue + kti.d(8 * vw4.d().getDisplayMetrics().density), 1000L, 1000L, 2, -1));
                    }
                    AnimatorSet animatorSet4 = recordControlsWidget.e1;
                    if (animatorSet4 != null) {
                        animatorSet4.addListener(new a9d(recordControlsWidget, fFloatValue, 1));
                    }
                    AnimatorSet animatorSet5 = recordControlsWidget.e1;
                    if (animatorSet5 != null) {
                        animatorSet5.start();
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, k18] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                yy7[] yy7VarArr = RecordControlsWidget.g1;
                RecordControlsWidget recordControlsWidget = this.b;
                recordControlsWidget.O0().setTranslationY(vw4.d().getDisplayMetrics().density * 48.0f);
                recordControlsWidget.O0().setAlpha(0.0f);
                boolean z = this.c;
                if (z) {
                    recordControlsWidget.M0().setTranslationY(vw4.d().getDisplayMetrics().density * 48.0f);
                    recordControlsWidget.M0().setAlpha(0.0f);
                }
                recordControlsWidget.M0().setVisibility(z ? 0 : 8);
                recordControlsWidget.N0().setVisibility(8);
                recordControlsWidget.E0().setScaleX(1.0f);
                recordControlsWidget.E0().setScaleY(1.0f);
                Float f = recordControlsWidget.O0;
                if (f != null) {
                    recordControlsWidget.E0().setX(f.floatValue());
                }
                recordControlsWidget.B0().setImageDrawable((Drawable) recordControlsWidget.G0.getValue());
                rkh rkhVar = recordControlsWidget.D0;
                if (rkhVar != null) {
                    rkhVar.getHandFreeDotView().setVisibility(0);
                    rkhVar.getHandFreeDotView().setAlpha(1.0f);
                    rkhVar.getHandFreeDotView().setScaleX(1.0f);
                    rkhVar.getHandFreeDotView().setScaleY(1.0f);
                }
                recordControlsWidget.F0().setAlpha(0.0f);
                recordControlsWidget.F0().setVisibility(0);
                break;
        }
    }
}
