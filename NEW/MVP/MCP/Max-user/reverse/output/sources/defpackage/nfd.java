package defpackage;

import android.animation.AnimatorSet;
import android.view.MotionEvent;
import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final class nfd extends dtf implements sm6 {
    public final /* synthetic */ RecordControlsWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nfd(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.X = recordControlsWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        nfd nfdVar = (nfd) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        nfdVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        nfd nfdVar = new nfd(continuation, this.X);
        nfdVar.o = obj;
        return nfdVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        AnimatorSet animatorSet;
        imb imbVar;
        g8j.b(obj);
        MotionEvent motionEvent = (MotionEvent) this.o;
        RecordControlsWidget recordControlsWidget = this.X;
        ?? r3 = recordControlsWidget.L0;
        yy7[] yy7VarArr = RecordControlsWidget.g1;
        red redVar = (red) recordControlsWidget.S0().x0.a.getValue();
        if (recordControlsWidget.E0().getX() != 0.0f && !(redVar instanceof qed) && (((animatorSet = recordControlsWidget.c1) == null || !animatorSet.isRunning()) && (imbVar = recordControlsWidget.P0) != null)) {
            Float f = (Float) imbVar.a;
            Float f2 = (Float) imbVar.b;
            if (motionEvent.getAction() == 2 && f != null && f2 != null) {
                if (!recordControlsWidget.X0) {
                    recordControlsWidget.V0 = motionEvent.getRawX() - recordControlsWidget.E0().getX();
                    recordControlsWidget.W0 = motionEvent.getRawY() - recordControlsWidget.E0().getY();
                    recordControlsWidget.X0 = true;
                }
                float rawX = motionEvent.getRawX() - recordControlsWidget.V0;
                float rawY = motionEvent.getRawY() - recordControlsWidget.W0;
                float fFloatValue = rawX - f.floatValue();
                float fFloatValue2 = rawY - f2.floatValue();
                double degrees = Math.toDegrees((float) Math.atan2(-fFloatValue2, fFloatValue));
                if (degrees < 0.0d) {
                    degrees += 360;
                }
                int iC = kti.c(Math.ceil(degrees));
                to7 to7Var = RecordControlsWidget.h1;
                if (to7Var.a > iC || iC > to7Var.b) {
                    to7 to7Var2 = RecordControlsWidget.i1;
                    if (to7Var2.a <= iC && iC <= to7Var2.b) {
                        recordControlsWidget.R0 = 0.0f;
                        ((jg5) r3.getValue()).a(0.0f);
                        float f3 = 40;
                        float fB = n7j.b((rawX - (f.floatValue() - kti.d(vw4.d().getDisplayMetrics().density * f3))) / ((f.floatValue() - kti.d(90 * vw4.d().getDisplayMetrics().density)) - f.floatValue()), 0.0f, 1.0f) * 100.0f;
                        recordControlsWidget.S0 = fB;
                        if (fB >= 100.0f) {
                            zed zedVarS0 = recordControlsWidget.S0();
                            zedVarS0.y().e();
                            zedVarS0.v();
                            zedVarS0.w0.m(null, new qed(false, 1));
                        } else {
                            if (f.floatValue() - rawX > kti.d(8 * vw4.d().getDisplayMetrics().density)) {
                                AnimatorSet animatorSet2 = recordControlsWidget.d1;
                                if (animatorSet2 != null) {
                                    animatorSet2.cancel();
                                }
                                AnimatorSet animatorSet3 = recordControlsWidget.e1;
                                if (animatorSet3 != null) {
                                    animatorSet3.cancel();
                                }
                            } else {
                                AnimatorSet animatorSet4 = recordControlsWidget.d1;
                                if (animatorSet4 != null) {
                                    animatorSet4.start();
                                }
                                AnimatorSet animatorSet5 = recordControlsWidget.e1;
                                if (animatorSet5 != null) {
                                    animatorSet5.start();
                                }
                            }
                            float f4 = 124;
                            float fQ = (((recordControlsWidget.S0 / 100.0f) * u45.q(f4, vw4.d().getDisplayMetrics().density, kti.d(36 * vw4.d().getDisplayMetrics().density))) + kti.d(vw4.d().getDisplayMetrics().density * f4)) / kti.d(f4 * vw4.d().getDisplayMetrics().density);
                            recordControlsWidget.E0().setScaleX(fQ);
                            recordControlsWidget.E0().setScaleY(fQ);
                            float fFloatValue3 = f.floatValue() - kti.d(20 * vw4.d().getDisplayMetrics().density);
                            float fB2 = n7j.b((rawX - fFloatValue3) / ((f.floatValue() - kti.d(vw4.d().getDisplayMetrics().density * f3)) - fFloatValue3), 0.0f, 1.0f);
                            recordControlsWidget.G0().setAlpha(1.0f - fB2);
                            recordControlsWidget.G0().setTranslationX(kti.d((-20) * vw4.d().getDisplayMetrics().density) * fB2);
                            recordControlsWidget.E0().setX(rawX);
                            recordControlsWidget.E0().setY(f2.floatValue());
                            m8f m8fVar = recordControlsWidget.Y0;
                            if (m8fVar != null) {
                                m8fVar.a(rawX + (recordControlsWidget.E0().getWidth() / 2) + (-recordControlsWidget.P0().getWidth()) + (kti.d(f3 * vw4.d().getDisplayMetrics().density) / 2));
                            }
                            View viewK0 = recordControlsWidget.K0();
                            imb imbVar2 = recordControlsWidget.Q0;
                            viewK0.setTranslationY(imbVar2 != null ? ((Number) imbVar2.b).floatValue() : 0.0f);
                        }
                    }
                } else {
                    recordControlsWidget.S0 = 0.0f;
                    recordControlsWidget.R0 = n7j.b(fFloatValue2 / (-kti.d(40 * vw4.d().getDisplayMetrics().density)), 0.0f, 1.0f) * 100.0f;
                    ((jg5) r3.getValue()).a((recordControlsWidget.R0 / 100.0f) * 0.7f);
                    if (recordControlsWidget.R0 >= 100.0f) {
                        recordControlsWidget.R0 = 100.0f;
                        recordControlsWidget.S0().I();
                        View view = recordControlsWidget.getView();
                        if (view != null) {
                            uog.i(view, p07.CONFIRM);
                        }
                    } else {
                        if (f2.floatValue() - rawY > kti.d(8 * vw4.d().getDisplayMetrics().density)) {
                            AnimatorSet animatorSet6 = recordControlsWidget.e1;
                            if (animatorSet6 != null) {
                                animatorSet6.cancel();
                            }
                        } else {
                            AnimatorSet animatorSet7 = recordControlsWidget.e1;
                            if (animatorSet7 != null) {
                                animatorSet7.start();
                            }
                        }
                        View viewK02 = recordControlsWidget.K0();
                        imb imbVar3 = recordControlsWidget.Q0;
                        viewK02.setTranslationX(imbVar3 != null ? ((Number) imbVar3.a).floatValue() : 0.0f);
                        View viewK03 = recordControlsWidget.K0();
                        imb imbVar4 = recordControlsWidget.Q0;
                        viewK03.setTranslationY(recordControlsWidget.E0().getTranslationY() + (imbVar4 != null ? ((Number) imbVar4.b).floatValue() : 0.0f));
                        recordControlsWidget.E0().setX(f.floatValue());
                        recordControlsWidget.E0().setY(rawY);
                    }
                }
            }
        }
        return qqg.a;
    }
}
