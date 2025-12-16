package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final class vu2 implements cm6 {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vu2(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v98, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v99, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v45, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v50, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v29, types: [java.lang.Object, k18] */
    private final Object a() {
        RecordControlsWidget recordControlsWidget = (RecordControlsWidget) this.c;
        ?? r2 = recordControlsWidget.L0;
        red redVar = (red) this.b;
        boolean z = redVar instanceof ped;
        int i = 2;
        int i2 = 3;
        p07 p07Var = p07.CONFIRM;
        int i3 = 1;
        AnimatorSet animatorSet = null;
        int i4 = 0;
        if (z) {
            ped pedVar = (ped) redVar;
            boolean z2 = pedVar.b;
            boolean z3 = pedVar.a;
            if (z2) {
                yy7[] yy7VarArr = RecordControlsWidget.g1;
                recordControlsWidget.C0().setVisibility(0);
                recordControlsWidget.W0();
                if (z3) {
                    View view = recordControlsWidget.getView();
                    if (view != null) {
                        uog.i(view, p07Var);
                    }
                    AnimatorSet animatorSet2 = recordControlsWidget.c1;
                    if (animatorSet2 != null && animatorSet2.isRunning()) {
                        AnimatorSet animatorSet3 = recordControlsWidget.c1;
                        if (animatorSet3 != null) {
                            animatorSet3.end();
                        }
                        AnimatorSet animatorSet4 = recordControlsWidget.c1;
                        if (animatorSet4 != null) {
                            animatorSet4.cancel();
                        }
                    }
                    recordControlsWidget.c1 = new AnimatorSet();
                    o98 o98VarD = ve3.d();
                    o98VarD.addAll(cqi.m(recordControlsWidget.N0(), 1.0f, 0.5f, 150L, 0L));
                    ImageView imageViewN0 = recordControlsWidget.N0();
                    Property property = View.ALPHA;
                    o98VarD.add(cqi.b(imageViewN0, property, 1.0f, 0.0f, 150L, 0L, 112));
                    o98VarD.addAll(cqi.m(recordControlsWidget.M0(), 0.5f, 1.0f, 150L, 50L));
                    o98VarD.add(cqi.b(recordControlsWidget.M0(), property, 0.0f, 1.0f, 150L, 50L, 96));
                    rkh rkhVar = recordControlsWidget.D0;
                    if (rkhVar != null) {
                        o98VarD.addAll(rkhVar.getResumeAnimations());
                    }
                    o98 o98VarA = ve3.a(o98VarD);
                    AnimatorSet animatorSet5 = recordControlsWidget.c1;
                    if (animatorSet5 != null) {
                        animatorSet5.addListener(new ifd(recordControlsWidget, 9));
                    }
                    AnimatorSet animatorSet6 = recordControlsWidget.c1;
                    if (animatorSet6 != null) {
                        animatorSet6.addListener(new ifd(recordControlsWidget, 8));
                    }
                    AnimatorSet animatorSet7 = recordControlsWidget.c1;
                    if (animatorSet7 != null) {
                        animatorSet7.setInterpolator(recordControlsWidget.J0());
                    }
                    AnimatorSet animatorSet8 = recordControlsWidget.c1;
                    if (animatorSet8 != null) {
                        animatorSet8.playTogether(o98VarA);
                    }
                    AnimatorSet animatorSet9 = recordControlsWidget.c1;
                    if (animatorSet9 != null) {
                        animatorSet9.start();
                    }
                } else {
                    View view2 = recordControlsWidget.getView();
                    if (view2 != null) {
                        uog.i(view2, p07Var);
                    }
                    recordControlsWidget.T0(true);
                }
                recordControlsWidget.R0 = 100.0f;
            } else {
                if (recordControlsWidget.O0 == null) {
                    recordControlsWidget.O0 = Float.valueOf(recordControlsWidget.E0().getX());
                }
                recordControlsWidget.E0().setX(recordControlsWidget.f1 - ((recordControlsWidget.E0().getMeasuredWidth() / 2) - (recordControlsWidget.B0().getMeasuredWidth() / 2)));
                recordControlsWidget.K0().setTranslationX(recordControlsWidget.E0().getTranslationX() - (vw4.d().getDisplayMetrics().density * 4.0f));
                recordControlsWidget.P0 = new imb(Float.valueOf(recordControlsWidget.E0().getX()), Float.valueOf(recordControlsWidget.E0().getY()));
                recordControlsWidget.Q0 = new imb(Float.valueOf(recordControlsWidget.K0().getTranslationX()), Float.valueOf(recordControlsWidget.K0().getTranslationY()));
                recordControlsWidget.T0 = u45.q(10, vw4.d().getDisplayMetrics().density, u45.q(124, vw4.d().getDisplayMetrics().density, recordControlsWidget.getContext().getResources().getDisplayMetrics().heightPixels));
                recordControlsWidget.V0(true);
                recordControlsWidget.Z0 = svi.e(recordControlsWidget.getViewLifecycleScope(), null, null, new sfd(null, recordControlsWidget), 3);
                recordControlsWidget.requireActivity().getWindow().addFlags(128);
                View view3 = recordControlsWidget.getView();
                if (view3 != null) {
                    uog.i(view3, p07Var);
                }
                ((jg5) r2.getValue()).a(0.0f);
            }
        } else if (redVar instanceof qed) {
            qed qedVar = (qed) redVar;
            boolean z4 = qedVar.a;
            boolean z5 = qedVar.b;
            rkh rkhVar2 = recordControlsWidget.D0;
            if (rkhVar2 != null) {
                y60 waveView = rkhVar2.getWaveView();
                waveView.z0.reset();
                waveView.u0 = false;
                waveView.C0 = 0L;
                waveView.o = 0L;
                waveView.invalidate();
            }
            recordControlsWidget.R0 = 0.0f;
            recordControlsWidget.S0 = 0.0f;
            ((jg5) r2.getValue()).a(0.0f);
            recordControlsWidget.W0();
            recordControlsWidget.requireActivity().getWindow().clearFlags(128);
            q07 q07Var = q07.REJECT;
            if (z4) {
                View view4 = recordControlsWidget.getView();
                if (view4 != null) {
                    uog.i(view4, q07Var);
                }
                AnimatorSet animatorSet10 = recordControlsWidget.c1;
                if (animatorSet10 != null && animatorSet10.isRunning()) {
                    AnimatorSet animatorSet11 = recordControlsWidget.c1;
                    if (animatorSet11 != null) {
                        animatorSet11.end();
                    }
                    AnimatorSet animatorSet12 = recordControlsWidget.c1;
                    if (animatorSet12 != null) {
                        animatorSet12.cancel();
                    }
                }
                recordControlsWidget.c1 = new AnimatorSet();
                o98 o98VarD2 = ve3.d();
                rkh rkhVar3 = recordControlsWidget.D0;
                if (rkhVar3 != null) {
                    o98VarD2.add(cqi.b(rkhVar3, View.ALPHA, 1.0f, 0.0f, 150L, 0L, 112));
                }
                if (recordControlsWidget.M0().getVisibility() == 0) {
                    o98VarD2.addAll(cqi.m(recordControlsWidget.M0(), 1.0f, 0.0f, 250L, 0L));
                    o98VarD2.add(cqi.b(recordControlsWidget.M0(), View.ALPHA, 1.0f, 0.0f, 150L, 0L, 112));
                } else {
                    o98VarD2.addAll(cqi.m(recordControlsWidget.N0(), 1.0f, 0.0f, 250L, 0L));
                    o98VarD2.add(cqi.b(recordControlsWidget.N0(), View.ALPHA, 1.0f, 0.0f, 250L, 0L, 112));
                }
                o98VarD2.addAll(cqi.m(recordControlsWidget.O0(), 1.0f, 0.0f, 250L, 0L));
                ImageView imageViewO0 = recordControlsWidget.O0();
                Property property2 = View.ALPHA;
                o98VarD2.add(cqi.b(imageViewO0, property2, 1.0f, 0.0f, 150L, 0L, 112));
                o98VarD2.add(cqi.b(recordControlsWidget.F0(), property2, 1.0f, 0.0f, 250L, 0L, 112));
                if (recordControlsWidget.R0() == tdd.b) {
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(kti.d(96 * vw4.d().getDisplayMetrics().density), kti.d(48 * vw4.d().getDisplayMetrics().density));
                    valueAnimatorOfInt.setDuration(300L);
                    valueAnimatorOfInt.addUpdateListener(new afd(recordControlsWidget, 3));
                    o98VarD2.add(valueAnimatorOfInt);
                }
                o98VarD2.addAll(cqi.m(recordControlsWidget.E0(), 1.0f, 0.0f, 250L, 0L));
                o98VarD2.add(cqi.b(recordControlsWidget.E0(), property2, 1.0f, 0.0f, 150L, 0L, 112));
                o98 o98VarA2 = ve3.a(o98VarD2);
                AnimatorSet animatorSet13 = recordControlsWidget.c1;
                if (animatorSet13 != null) {
                    animatorSet13.addListener(new ifd(recordControlsWidget, i2));
                }
                AnimatorSet animatorSet14 = recordControlsWidget.c1;
                if (animatorSet14 != null) {
                    animatorSet14.playTogether(o98VarA2);
                }
                Object parentController = recordControlsWidget.getParentController();
                tj9 tj9Var = parentController instanceof tj9 ? (tj9) parentController : null;
                if (tj9Var != null) {
                    MessageWriteWidget messageWriteWidget = (MessageWriteWidget) tj9Var;
                    if (messageWriteWidget.getView() != null) {
                        ik9 ik9VarC0 = messageWriteWidget.C0();
                        ImageView imageView = ik9VarC0.v0;
                        ?? r4 = ik9VarC0.t0;
                        animatorSet = new AnimatorSet();
                        o98 o98VarD3 = ve3.d();
                        o98VarD3.add(cqi.b(ik9VarC0.d, property2, 0.0f, 1.0f, 200L, 0L, 112));
                        ImageView imageView2 = ik9VarC0.b;
                        o98VarD3.addAll(cqi.m(imageView2, 0.0f, 1.0f, 250L, 0L));
                        o98VarD3.add(cqi.b(imageView2, property2, 0.0f, 1.0f, 200L, 0L, 112));
                        if (r4.e()) {
                            o98VarD3.addAll(cqi.m((View) r4.getValue(), 0.0f, 1.0f, 250L, 0L));
                            o98VarD3.add(cqi.b((View) r4.getValue(), property2, 0.0f, 1.0f, 200L, 0L, 112));
                        }
                        ?? r7 = ik9VarC0.s0;
                        if (r7.e()) {
                            o98VarD3.addAll(cqi.m((View) r7.getValue(), 0.0f, 1.0f, 250L, 0L));
                            o98VarD3.add(cqi.b((View) r7.getValue(), property2, 0.0f, 1.0f, 200L, 50L, 96));
                        }
                        ?? r72 = ik9VarC0.w0;
                        if (r72.e()) {
                            o98VarD3.addAll(cqi.m((View) r72.getValue(), 0.0f, 1.0f, 250L, 0L));
                            o98VarD3.add(cqi.b((View) r72.getValue(), property2, 0.0f, 1.0f, 200L, 50L, 96));
                        }
                        o98VarD3.addAll(cqi.m(imageView, 0.0f, 1.0f, 250L, 0L));
                        o98VarD3.add(cqi.b(imageView, property2, 0.0f, 1.0f, 250L, 0L, 112));
                        o98 o98VarA3 = ve3.a(o98VarD3);
                        animatorSet.addListener(new hk9(ik9VarC0, r4, i3));
                        animatorSet.addListener(new gk9(ik9VarC0, i2));
                        animatorSet.playTogether(o98VarA3);
                    }
                }
                AnimatorSet animatorSet15 = recordControlsWidget.c1;
                if (animatorSet15 != null) {
                    animatorSet15.playTogether(animatorSet);
                }
                AnimatorSet animatorSet16 = recordControlsWidget.c1;
                if (animatorSet16 != null) {
                    animatorSet16.setInterpolator(recordControlsWidget.J0());
                }
                AnimatorSet animatorSet17 = recordControlsWidget.c1;
                if (animatorSet17 != null) {
                    animatorSet17.start();
                }
            } else if (z5) {
                View view5 = recordControlsWidget.getView();
                if (view5 != null) {
                    uog.i(view5, q07Var);
                }
                AnimatorSet animatorSet18 = recordControlsWidget.c1;
                if (animatorSet18 != null && animatorSet18.isRunning()) {
                    AnimatorSet animatorSet19 = recordControlsWidget.c1;
                    if (animatorSet19 != null) {
                        animatorSet19.end();
                    }
                    AnimatorSet animatorSet20 = recordControlsWidget.c1;
                    if (animatorSet20 != null) {
                        animatorSet20.cancel();
                    }
                }
                recordControlsWidget.X0();
                recordControlsWidget.c1 = new AnimatorSet();
                o98 o98VarD4 = ve3.d();
                View viewH0 = recordControlsWidget.H0();
                Property property3 = View.ALPHA;
                ObjectAnimator objectAnimatorB = cqi.b(viewH0, property3, recordControlsWidget.H0().getAlpha(), 0.0f, 150L, 100L, 96);
                objectAnimatorB.addListener(new ifd(recordControlsWidget, i));
                o98VarD4.add(objectAnimatorB);
                o98VarD4.addAll(cqi.m(recordControlsWidget.Q0(), 0.0f, 1.4f, 200L, 250L));
                o98VarD4.addAll(cqi.m(recordControlsWidget.Q0(), 1.4f, 0.7f, 100L, 450L));
                o98VarD4.addAll(cqi.m(recordControlsWidget.Q0(), 0.7f, 1.0f, 100L, 550L));
                o98VarD4.addAll(cqi.m(recordControlsWidget.Q0(), 1.0f, 0.0f, 300L, 700L));
                o98VarD4.add(cqi.b(recordControlsWidget.Q0(), property3, 1.0f, 0.0f, 150L, 700L, 96));
                o98VarD4.add(cqi.b(recordControlsWidget.G0(), property3, recordControlsWidget.G0().getAlpha(), 0.0f, 200L, 0L, 112));
                if (recordControlsWidget.G0().getTranslationX() == 0.0f) {
                    o98VarD4.add(cqi.b(recordControlsWidget.G0(), View.TRANSLATION_X, 0.0f, vw4.d().getDisplayMetrics().density * (-20.0f), 200L, 0L, 112));
                }
                o98VarD4.add(cqi.b(recordControlsWidget.I0(), property3, 1.0f, 0.0f, 200L, 100L, 96));
                o98VarD4.addAll(cqi.m(recordControlsWidget.E0(), recordControlsWidget.E0().getScaleX(), 0.4f, 150L, 0L));
                o98VarD4.add(cqi.b(recordControlsWidget.E0(), property3, 1.0f, 0.0f, 150L, 0L, 112));
                o98VarD4.addAll(cqi.m(recordControlsWidget.K0(), 1.0f, 0.0f, 200L, 100L));
                o98VarD4.add(cqi.b(recordControlsWidget.K0(), property3, 1.0f, 0.0f, 200L, 100L, 96));
                o98 o98VarA4 = ve3.a(o98VarD4);
                AnimatorSet animatorSet21 = recordControlsWidget.c1;
                if (animatorSet21 != null) {
                    animatorSet21.addListener(new ifd(recordControlsWidget, i3));
                }
                AnimatorSet animatorSet22 = recordControlsWidget.c1;
                if (animatorSet22 != null) {
                    animatorSet22.playTogether(o98VarA4);
                }
                Object parentController2 = recordControlsWidget.getParentController();
                tj9 tj9Var2 = parentController2 instanceof tj9 ? (tj9) parentController2 : null;
                if (tj9Var2 != null) {
                    MessageWriteWidget messageWriteWidget2 = (MessageWriteWidget) tj9Var2;
                    if (messageWriteWidget2.getView() != null) {
                        ik9 ik9VarC02 = messageWriteWidget2.C0();
                        ImageView imageView3 = ik9VarC02.v0;
                        ?? r42 = ik9VarC02.t0;
                        animatorSet = new AnimatorSet();
                        o98 o98VarD5 = ve3.d();
                        o98VarD5.add(cqi.b(ik9VarC02.d, View.TRANSLATION_X, vw4.d().getDisplayMetrics().density * 44.0f, 0.0f, 300L, 250L, 96));
                        o98VarD5.add(cqi.b(ik9VarC02.d, property3, 0.0f, 1.0f, 300L, 250L, 96));
                        ImageView imageView4 = ik9VarC02.b;
                        o98VarD5.add(cqi.b(imageView4, property3, 0.0f, 1.0f, 150L, 850L, 96));
                        o98VarD5.addAll(cqi.m(imageView4, 0.0f, 1.0f, 300L, 700L));
                        if (r42.e()) {
                            o98VarD5.add(cqi.b((View) r42.getValue(), property3, 0.0f, 1.0f, 150L, 850L, 96));
                            o98VarD5.addAll(cqi.m((View) r42.getValue(), 0.0f, 1.0f, 300L, 700L));
                        }
                        o98VarD5.add(cqi.b(imageView3, property3, 0.0f, 1.0f, 200L, 350L, 96));
                        o98VarD5.addAll(cqi.m(imageView3, 0.0f, 1.0f, 300L, 250L));
                        ?? r3 = ik9VarC02.s0;
                        if (r3.e()) {
                            o98VarD5.add(cqi.b((View) r3.getValue(), property3, 0.0f, 1.0f, 200L, 350L, 96));
                            o98VarD5.addAll(cqi.m((View) r3.getValue(), 0.0f, 1.0f, 300L, 250L));
                        }
                        ?? r32 = ik9VarC02.w0;
                        if (r32.e()) {
                            o98VarD5.add(cqi.b((View) r32.getValue(), property3, 0.0f, 1.0f, 200L, 350L, 96));
                            o98VarD5.addAll(cqi.m((View) r32.getValue(), 0.0f, 1.0f, 300L, 250L));
                        }
                        o98 o98VarA5 = ve3.a(o98VarD5);
                        animatorSet.addListener(new hk9(ik9VarC02, r42, i4));
                        animatorSet.addListener(new gk9(ik9VarC02, i));
                        animatorSet.playTogether(o98VarA5);
                    }
                }
                AnimatorSet animatorSet23 = recordControlsWidget.c1;
                if (animatorSet23 != null) {
                    animatorSet23.playTogether(animatorSet);
                }
                AnimatorSet animatorSet24 = recordControlsWidget.c1;
                if (animatorSet24 != null) {
                    animatorSet24.setInterpolator(recordControlsWidget.J0());
                }
                AnimatorSet animatorSet25 = recordControlsWidget.c1;
                if (animatorSet25 != null) {
                    animatorSet25.start();
                }
            } else {
                AnimatorSet animatorSet26 = recordControlsWidget.c1;
                if (animatorSet26 != null && animatorSet26.isRunning()) {
                    AnimatorSet animatorSet27 = recordControlsWidget.c1;
                    if (animatorSet27 != null) {
                        animatorSet27.end();
                    }
                    AnimatorSet animatorSet28 = recordControlsWidget.c1;
                    if (animatorSet28 != null) {
                        animatorSet28.cancel();
                    }
                }
                recordControlsWidget.X0();
                recordControlsWidget.c1 = new AnimatorSet();
                o98 o98VarD6 = ve3.d();
                View viewH02 = recordControlsWidget.H0();
                Property property4 = View.ALPHA;
                o98VarD6.add(cqi.b(viewH02, property4, recordControlsWidget.H0().getAlpha(), 0.0f, 300L, 100L, 96));
                View viewH03 = recordControlsWidget.H0();
                Property property5 = View.TRANSLATION_X;
                o98VarD6.add(cqi.b(viewH03, property5, 0.0f, vw4.d().getDisplayMetrics().density * 72.0f, 300L, 100L, 96));
                o98VarD6.add(cqi.b(recordControlsWidget.I0(), property4, 1.0f, 0.0f, 300L, 100L, 96));
                o98VarD6.add(cqi.b(recordControlsWidget.I0(), property5, 0.0f, vw4.d().getDisplayMetrics().density * 72.0f, 300L, 100L, 96));
                o98VarD6.add(cqi.b(recordControlsWidget.G0(), property4, recordControlsWidget.G0().getAlpha(), 0.0f, 250L, 0L, 112));
                if (recordControlsWidget.G0().getTranslationX() == 0.0f) {
                    o98VarD6.add(cqi.b(recordControlsWidget.G0(), property5, 0.0f, vw4.d().getDisplayMetrics().density * 70.0f, 300L, 50L, 96));
                }
                o98VarD6.addAll(cqi.m(recordControlsWidget.D0(), recordControlsWidget.D0().getScaleX(), 0.0f, 300L, 150L));
                o98VarD6.add(cqi.b(recordControlsWidget.E0(), property4, 1.0f, 0.0f, 300L, 150L, 96));
                v1a v1aVar = a93.s0;
                v1aVar.y(recordControlsWidget.B0()).a();
                ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(-1, v1aVar.y(recordControlsWidget.B0()).a().G().a.b.b);
                valueAnimatorOfArgb.setStartDelay(100L);
                valueAnimatorOfArgb.setDuration(300L);
                valueAnimatorOfArgb.addUpdateListener(new afd(recordControlsWidget, 0));
                o98VarD6.add(valueAnimatorOfArgb);
                o98VarD6.add(cqi.b(recordControlsWidget.K0(), View.TRANSLATION_Y, recordControlsWidget.K0().getTranslationY(), (-48) - (vw4.d().getDisplayMetrics().density * 2.0f), 200L, 50L, 96));
                o98VarD6.add(cqi.b(recordControlsWidget.K0(), property4, 1.0f, 0.0f, 200L, 0L, 112));
                o98 o98VarA6 = ve3.a(o98VarD6);
                AnimatorSet animatorSet29 = recordControlsWidget.c1;
                if (animatorSet29 != null) {
                    animatorSet29.addListener(new ifd(recordControlsWidget, i4));
                }
                AnimatorSet animatorSet30 = recordControlsWidget.c1;
                if (animatorSet30 != null) {
                    animatorSet30.playTogether(o98VarA6);
                }
                Object parentController3 = recordControlsWidget.getParentController();
                tj9 tj9Var3 = parentController3 instanceof tj9 ? (tj9) parentController3 : null;
                if (tj9Var3 != null) {
                    MessageWriteWidget messageWriteWidget3 = (MessageWriteWidget) tj9Var3;
                    if (messageWriteWidget3.getView() != null) {
                        ik9 ik9VarC03 = messageWriteWidget3.C0();
                        ik9VarC03.getClass();
                        animatorSet = new AnimatorSet();
                        o98 o98VarD7 = ve3.d();
                        o98VarD7.add(cqi.b(ik9VarC03.d, property5, vw4.d().getDisplayMetrics().density * (-74.0f), 0.0f, 300L, 250L, 96));
                        o98VarD7.add(cqi.b(ik9VarC03.d, property4, 0.0f, 1.0f, 300L, 250L, 96));
                        ImageView imageView5 = ik9VarC03.b;
                        o98VarD7.add(cqi.b(imageView5, property5, vw4.d().getDisplayMetrics().density * (-74.0f), 0.0f, 300L, 250L, 96));
                        o98VarD7.add(cqi.b(imageView5, property4, 0.0f, 1.0f, 300L, 250L, 96));
                        ImageView imageView6 = ik9VarC03.v0;
                        o98VarD7.add(cqi.b(imageView6, property4, 0.0f, 1.0f, 200L, 250L, 96));
                        o98VarD7.addAll(cqi.m(imageView6, 0.0f, 1.0f, 300L, 250L));
                        ?? r43 = ik9VarC03.t0;
                        if (r43.e()) {
                            o98VarD7.add(cqi.b((View) r43.getValue(), property5, vw4.d().getDisplayMetrics().density * (-74.0f), 0.0f, 300L, 250L, 96));
                            o98VarD7.add(cqi.b((View) r43.getValue(), property4, 0.0f, 1.0f, 300L, 250L, 96));
                        }
                        ?? r44 = ik9VarC03.s0;
                        if (r44.e()) {
                            o98VarD7.add(cqi.b((View) r44.getValue(), property4, 0.0f, 1.0f, 200L, 250L, 96));
                            o98VarD7.addAll(cqi.m((View) r44.getValue(), 0.0f, 1.0f, 300L, 250L));
                        }
                        ?? r45 = ik9VarC03.w0;
                        if (r45.e()) {
                            o98VarD7.add(cqi.b((View) r45.getValue(), property4, 0.0f, 1.0f, 200L, 250L, 96));
                            o98VarD7.addAll(cqi.m((View) r45.getValue(), 0.0f, 1.0f, 300L, 250L));
                        }
                        o98 o98VarA7 = ve3.a(o98VarD7);
                        animatorSet.addListener(new gk9(ik9VarC03, i3));
                        animatorSet.addListener(new gk9(ik9VarC03, i4));
                        animatorSet.playTogether(o98VarA7);
                    }
                }
                AnimatorSet animatorSet31 = recordControlsWidget.c1;
                if (animatorSet31 != null) {
                    animatorSet31.playTogether(animatorSet);
                }
                AnimatorSet animatorSet32 = recordControlsWidget.c1;
                if (animatorSet32 != null) {
                    animatorSet32.setInterpolator(recordControlsWidget.J0());
                }
                AnimatorSet animatorSet33 = recordControlsWidget.c1;
                if (animatorSet33 != null) {
                    animatorSet33.start();
                }
            }
        } else if (redVar instanceof ned) {
            boolean z6 = ((ned) redVar).a;
            yy7[] yy7VarArr2 = RecordControlsWidget.g1;
            View view6 = recordControlsWidget.getView();
            if (view6 != null) {
                uog.i(view6, p07Var);
            }
            if (z6) {
                recordControlsWidget.V0(false);
                AnimatorSet animatorSet34 = recordControlsWidget.c1;
                if (animatorSet34 != null) {
                    animatorSet34.end();
                }
                recordControlsWidget.T0(true);
                AnimatorSet animatorSet35 = recordControlsWidget.c1;
                if (animatorSet35 != null) {
                    animatorSet35.end();
                }
                recordControlsWidget.U0();
                AnimatorSet animatorSet36 = recordControlsWidget.c1;
                if (animatorSet36 != null) {
                    animatorSet36.end();
                }
                recordControlsWidget.W0();
            } else {
                recordControlsWidget.U0();
            }
        } else {
            if (!(redVar instanceof oed)) {
                throw new NoWhenBranchMatchedException();
            }
            oed oedVar = (oed) redVar;
            boolean z7 = oedVar.a;
            boolean z8 = oedVar.b;
            View view7 = recordControlsWidget.getView();
            if (view7 != null) {
                uog.i(view7, p07Var);
            }
            if (z7) {
                if (z8) {
                    recordControlsWidget.V0(false);
                    AnimatorSet animatorSet37 = recordControlsWidget.c1;
                    if (animatorSet37 != null) {
                        animatorSet37.end();
                    }
                    recordControlsWidget.T0(true);
                    AnimatorSet animatorSet38 = recordControlsWidget.c1;
                    if (animatorSet38 != null) {
                        animatorSet38.end();
                    }
                    recordControlsWidget.U0();
                    AnimatorSet animatorSet39 = recordControlsWidget.c1;
                    if (animatorSet39 != null) {
                        animatorSet39.end();
                    }
                }
                AnimatorSet animatorSet40 = recordControlsWidget.c1;
                if (animatorSet40 != null && animatorSet40.isRunning()) {
                    AnimatorSet animatorSet41 = recordControlsWidget.c1;
                    if (animatorSet41 != null) {
                        animatorSet41.end();
                    }
                    AnimatorSet animatorSet42 = recordControlsWidget.c1;
                    if (animatorSet42 != null) {
                        animatorSet42.cancel();
                    }
                }
                recordControlsWidget.c1 = new AnimatorSet();
                o98 o98VarD8 = ve3.d();
                if (recordControlsWidget.M0().getVisibility() == 0) {
                    o98VarD8.addAll(cqi.m(recordControlsWidget.M0(), 1.0f, 0.5f, 150L, 0L));
                    o98VarD8.add(cqi.b(recordControlsWidget.M0(), View.ALPHA, 1.0f, 0.0f, 150L, 0L, 112));
                } else if (recordControlsWidget.N0().getVisibility() == 0) {
                    o98VarD8.addAll(cqi.m(recordControlsWidget.N0(), 1.0f, 0.5f, 150L, 0L));
                    o98VarD8.add(cqi.b(recordControlsWidget.N0(), View.ALPHA, 1.0f, 0.0f, 150L, 0L, 112));
                }
                rkh rkhVar4 = recordControlsWidget.D0;
                if (rkhVar4 != null) {
                    o98VarD8.addAll(rkhVar4.getResumeAnimations());
                }
                o98 o98VarA8 = ve3.a(o98VarD8);
                AnimatorSet animatorSet43 = recordControlsWidget.c1;
                if (animatorSet43 != null) {
                    animatorSet43.addListener(new ifd(recordControlsWidget, 5));
                }
                AnimatorSet animatorSet44 = recordControlsWidget.c1;
                if (animatorSet44 != null) {
                    animatorSet44.addListener(new ifd(recordControlsWidget, 4));
                }
                AnimatorSet animatorSet45 = recordControlsWidget.c1;
                if (animatorSet45 != null) {
                    animatorSet45.setInterpolator(recordControlsWidget.J0());
                }
                AnimatorSet animatorSet46 = recordControlsWidget.c1;
                if (animatorSet46 != null) {
                    animatorSet46.playTogether(o98VarA8);
                }
                AnimatorSet animatorSet47 = recordControlsWidget.c1;
                if (animatorSet47 != null) {
                    animatorSet47.start();
                }
            } else {
                recordControlsWidget.T0(false);
            }
        }
        return qqg.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:53|(1:55)(7:57|(1:59)|60|100|61|64|(2:66|(1:68)(3:69|(1:71)|(2:107|73)(1:74))))|56|60|100|61|64|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0141, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0147 A[Catch: all -> 0x0101, TryCatch #1 {all -> 0x0101, blocks: (B:39:0x00ca, B:41:0x00ce, B:43:0x00dc, B:46:0x00e3, B:48:0x00eb, B:53:0x010c, B:61:0x013c, B:64:0x0142, B:66:0x0147, B:69:0x014e, B:71:0x0156, B:57:0x0117, B:59:0x0121), top: B:102:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018b A[LOOP:1: B:40:0x00cc->B:74:0x018b, LOOP_END] */
    @Override // defpackage.cm6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke() {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vu2.invoke():java.lang.Object");
    }

    public vu2(m87 m87Var, p87 p87Var) {
        this.a = 4;
        this.c = m87Var;
        this.b = p87Var;
    }
}
