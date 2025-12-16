package one.me.sdk.messagewrite.recordcontrols;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.a93;
import defpackage.afd;
import defpackage.aw0;
import defpackage.b1e;
import defpackage.bbd;
import defpackage.bed;
import defpackage.bfd;
import defpackage.c19;
import defpackage.c7j;
import defpackage.cfd;
import defpackage.cqi;
import defpackage.d53;
import defpackage.efd;
import defpackage.fed;
import defpackage.ffd;
import defpackage.g56;
import defpackage.gk9;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hdc;
import defpackage.ho7;
import defpackage.hs;
import defpackage.ifd;
import defpackage.ik9;
import defpackage.imb;
import defpackage.ipi;
import defpackage.jfd;
import defpackage.jg5;
import defpackage.k18;
import defpackage.kfd;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.lfd;
import defpackage.m8f;
import defpackage.mab;
import defpackage.mcf;
import defpackage.mfd;
import defpackage.n8f;
import defpackage.nd0;
import defpackage.nfd;
import defpackage.o98;
import defpackage.ofd;
import defpackage.qfd;
import defpackage.qq3;
import defpackage.qt7;
import defpackage.rfd;
import defpackage.rkh;
import defpackage.rsb;
import defpackage.t9f;
import defpackage.tdd;
import defpackage.tj9;
import defpackage.tk4;
import defpackage.to7;
import defpackage.toc;
import defpackage.tqi;
import defpackage.v1a;
import defpackage.vdc;
import defpackage.ve3;
import defpackage.vid;
import defpackage.vw4;
import defpackage.x9f;
import defpackage.xfh;
import defpackage.xnb;
import defpackage.yud;
import defpackage.yy7;
import defpackage.z8a;
import defpackage.zed;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.arch.Widget;
import one.me.sdk.messagewrite.MessageWriteWidget;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lone/me/sdk/messagewrite/recordcontrols/RecordControlsWidget;", "Lone/me/sdk/arch/Widget;", "Lqq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "scopeId", "Ltdd;", "type", "(Ljava/lang/String;Ltdd;Ltk4;)V", "ffd", "message-write-widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class RecordControlsWidget extends Widget implements qq3 {
    public static final /* synthetic */ yy7[] g1 = {new z8a(RecordControlsWidget.class, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;"), ho7.d(vid.a, RecordControlsWidget.class, "type", "getType()Lone/me/sdk/messagewrite/recordcontrols/RecordControlType;", 0), new toc(RecordControlsWidget.class, "rootView", "getRootView()Landroid/view/View;", 0), new toc(RecordControlsWidget.class, "recordingPanel", "getRecordingPanel()Landroid/view/View;", 0), new toc(RecordControlsWidget.class, "dotView", "getDotView()Landroid/view/View;", 0), new toc(RecordControlsWidget.class, "durationView", "getDurationView()Landroid/widget/TextView;", 0), new toc(RecordControlsWidget.class, "trashView", "getTrashView()Landroid/widget/ImageView;", 0), new toc(RecordControlsWidget.class, "cancelView", "getCancelView()Landroid/widget/TextView;", 0), new toc(RecordControlsWidget.class, "audioHandFreeRecordView", "getAudioHandFreeRecordView()Landroid/view/View;", 0), new toc(RecordControlsWidget.class, "removeButton", "getRemoveButton()Landroid/widget/ImageView;", 0), new toc(RecordControlsWidget.class, "pauseRecordingButton", "getPauseRecordingButton()Landroid/widget/ImageView;", 0), new toc(RecordControlsWidget.class, "playRecordingButton", "getPlayRecordingButton()Landroid/widget/ImageView;", 0), new toc(RecordControlsWidget.class, "actionViewContainer", "getActionViewContainer()Landroid/view/View;", 0), new toc(RecordControlsWidget.class, "actionViewBgContainer", "getActionViewBgContainer()Landroid/view/View;", 0), new toc(RecordControlsWidget.class, "actionViewBackground", "getActionViewBackground()Landroid/view/View;", 0), new toc(RecordControlsWidget.class, "actionView", "getActionView()Landroid/widget/ImageView;", 0), new toc(RecordControlsWidget.class, "lockView", "getLockView()Landroid/view/View;", 0), new z8a(RecordControlsWidget.class, "animateDotViewJob", "getAnimateDotViewJob()Lkotlinx/coroutines/Job;")};
    public static final to7 h1 = new to7(0, 135, 1);
    public static final to7 i1 = new to7(135, 275, 1);
    public final bbd A0;
    public final bbd B0;
    public final bbd C0;
    public rkh D0;
    public final ffd E0;
    public final Object F0;
    public final Object G0;
    public final Object H0;
    public final Object I0;
    public final Object J0;
    public final Object K0;
    public final Object L0;
    public final Object M0;
    public final Object N0;
    public Float O0;
    public imb P0;
    public imb Q0;
    public float R0;
    public float S0;
    public int T0;
    public float U0;
    public float V0;
    public float W0;
    public final bbd X;
    public boolean X0;
    public final bbd Y;
    public m8f Y0;
    public final bbd Z;
    public x9f Z0;
    public final hs a;
    public final t9f a1;
    public final k18 b;
    public AnimatorSet b1;
    public final k18 c;
    public AnimatorSet c1;
    public final k18 d;
    public AnimatorSet d1;
    public AnimatorSet e1;
    public float f1;
    public final bbd o;
    public final bbd s0;
    public final bbd t0;
    public final bbd u0;
    public final bbd v0;
    public final bbd w0;
    public final bbd x0;
    public final bbd y0;
    public final bbd z0;

    public RecordControlsWidget(String str, tdd tddVar, tk4 tk4Var) {
        this(gwi.b(new imb(Widget.ARG_SCOPE_ID, new b1e(str)), new imb("arg_key_type", tddVar)));
    }

    public static final View y0(RecordControlsWidget recordControlsWidget) {
        return (View) recordControlsWidget.X.D(recordControlsWidget, g1[3]);
    }

    public static final void z0(RecordControlsWidget recordControlsWidget) {
        imb imbVar = recordControlsWidget.Q0;
        if (imbVar != null) {
            recordControlsWidget.K0().setTranslationX(((Number) imbVar.a).floatValue());
            recordControlsWidget.K0().setTranslationY(((Number) imbVar.b).floatValue());
        }
        imb imbVar2 = recordControlsWidget.P0;
        if (imbVar2 != null) {
            recordControlsWidget.E0().setX(((Number) imbVar2.a).floatValue());
            recordControlsWidget.E0().setY(((Number) imbVar2.b).floatValue());
        }
        recordControlsWidget.X0 = false;
        recordControlsWidget.V0 = 0.0f;
        recordControlsWidget.W0 = 0.0f;
        recordControlsWidget.P0 = null;
        recordControlsWidget.Q0 = null;
    }

    public final void A0() {
        AnimatorSet animatorSet = this.d1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.e1;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        rkh rkhVar = this.D0;
        if (rkhVar != null) {
            rkhVar.c();
        }
        AnimatorSet animatorSet3 = this.b1;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        AnimatorSet animatorSet4 = this.c1;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
        W0();
        X0();
    }

    public final ImageView B0() {
        return (ImageView) this.B0.D(this, g1[15]);
    }

    public final View C0() {
        return (View) this.A0.D(this, g1[14]);
    }

    public final View D0() {
        return (View) this.z0.D(this, g1[13]);
    }

    public final View E0() {
        return (View) this.y0.D(this, g1[12]);
    }

    public final View F0() {
        return (View) this.u0.D(this, g1[8]);
    }

    public final TextView G0() {
        return (TextView) this.t0.D(this, g1[7]);
    }

    @Override // defpackage.qq3
    public final void H() {
        S0().K();
    }

    public final View H0() {
        return (View) this.Y.D(this, g1[4]);
    }

    public final TextView I0() {
        return (TextView) this.Z.D(this, g1[5]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final PathInterpolator J0() {
        return (PathInterpolator) this.N0.getValue();
    }

    public final View K0() {
        return (View) this.C0.D(this, g1[16]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final Drawable L0() {
        return (Drawable) this.F0.getValue();
    }

    public final ImageView M0() {
        return (ImageView) this.w0.D(this, g1[10]);
    }

    public final ImageView N0() {
        return (ImageView) this.x0.D(this, g1[11]);
    }

    public final ImageView O0() {
        return (ImageView) this.v0.D(this, g1[9]);
    }

    public final View P0() {
        return (View) this.o.D(this, g1[2]);
    }

    public final ImageView Q0() {
        return (ImageView) this.s0.D(this, g1[6]);
    }

    public final tdd R0() {
        yy7 yy7Var = g1[1];
        return (tdd) this.a.a(this);
    }

    public final zed S0() {
        return (zed) this.c.getValue();
    }

    public final void T0(boolean z) {
        AnimatorSet animatorSet = this.c1;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.c1;
            if (animatorSet2 != null) {
                animatorSet2.end();
            }
            AnimatorSet animatorSet3 = this.c1;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        X0();
        this.c1 = new AnimatorSet();
        o98 o98VarD = ve3.d();
        if (R0() == tdd.b) {
            ValueAnimator duration = ValueAnimator.ofInt(kti.d(48 * vw4.d().getDisplayMetrics().density), kti.d(96 * vw4.d().getDisplayMetrics().density)).setDuration(300L);
            duration.addUpdateListener(new afd(this, 2));
            o98VarD.add(duration);
        }
        View viewF0 = F0();
        Property property = View.ALPHA;
        o98VarD.add(cqi.b(viewF0, property, 0.0f, 1.0f, 300L, 0L, 112));
        ImageView imageViewO0 = O0();
        Property property2 = View.TRANSLATION_Y;
        o98VarD.add(cqi.b(imageViewO0, property2, vw4.d().getDisplayMetrics().density * 48.0f, 0.0f, 300L, 0L, 112));
        o98VarD.add(cqi.b(O0(), property, 0.0f, 1.0f, 150L, 150L, 96));
        if (z) {
            o98VarD.add(cqi.b(M0(), property2, vw4.d().getDisplayMetrics().density * 48.0f, 0.0f, 300L, 0L, 112));
            o98VarD.add(cqi.b(M0(), property, 0.0f, 1.0f, 150L, 150L, 96));
        }
        o98VarD.add(cqi.b(H0(), property, H0().getAlpha(), 0.0f, 150L, 0L, 112));
        o98VarD.add(cqi.b(H0(), property2, 0.0f, vw4.d().getDisplayMetrics().density * 48.0f, 300L, 0L, 112));
        o98VarD.add(cqi.b(I0(), property, 1.0f, 0.0f, 150L, 0L, 112));
        o98VarD.add(cqi.b(I0(), property2, 0.0f, vw4.d().getDisplayMetrics().density * 48.0f, 300L, 0L, 112));
        o98VarD.add(cqi.b(G0(), property, G0().getAlpha(), 0.0f, 150L, 0L, 112));
        o98VarD.add(cqi.b(G0(), property2, G0().getTranslationY(), vw4.d().getDisplayMetrics().density * 48.0f, 300L, 0L, 112));
        imb imbVar = this.Q0;
        o98VarD.add(cqi.b(K0(), property2, K0().getTranslationY(), imbVar != null ? ((Number) imbVar.b).floatValue() : 0.0f, 300L, 0L, 112));
        o98VarD.add(cqi.b(K0(), property, 1.0f, 0.0f, 300L, 0L, 112));
        o98VarD.add(cqi.b(E0(), property2, E0().getTranslationY(), 0.0f, 150L, 0L, 112));
        o98VarD.addAll(cqi.m(D0(), 1.0f, kti.d(36 * vw4.d().getDisplayMetrics().density) / (vw4.d().getDisplayMetrics().density * 124.0f), 300L, 0L));
        o98 o98VarA = ve3.a(o98VarD);
        AnimatorSet animatorSet4 = this.c1;
        if (animatorSet4 != null) {
            animatorSet4.addListener(new jfd(this, z, 1));
        }
        AnimatorSet animatorSet5 = this.c1;
        if (animatorSet5 != null) {
            animatorSet5.addListener(new jfd(this, z, 0));
        }
        AnimatorSet animatorSet6 = this.c1;
        if (animatorSet6 != null) {
            animatorSet6.setInterpolator(J0());
        }
        AnimatorSet animatorSet7 = this.c1;
        if (animatorSet7 != null) {
            animatorSet7.playTogether(o98VarA);
        }
        AnimatorSet animatorSet8 = this.c1;
        if (animatorSet8 != null) {
            animatorSet8.start();
        }
    }

    public final void U0() {
        AnimatorSet animatorSet = this.c1;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.c1;
            if (animatorSet2 != null) {
                animatorSet2.end();
            }
            AnimatorSet animatorSet3 = this.c1;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        this.c1 = new AnimatorSet();
        o98 o98VarD = ve3.d();
        o98VarD.addAll(cqi.m(M0(), 1.0f, 0.5f, 150L, 0L));
        ImageView imageViewM0 = M0();
        Property property = View.ALPHA;
        o98VarD.add(cqi.b(imageViewM0, property, 1.0f, 0.0f, 150L, 0L, 112));
        o98VarD.addAll(cqi.m(N0(), 0.5f, 1.0f, 150L, 50L));
        o98VarD.add(cqi.b(N0(), property, 0.0f, 1.0f, 150L, 50L, 96));
        rkh rkhVar = this.D0;
        if (rkhVar != null) {
            o98VarD.addAll(rkhVar.getPauseAnimations());
        }
        o98 o98VarA = ve3.a(o98VarD);
        AnimatorSet animatorSet4 = this.c1;
        if (animatorSet4 != null) {
            animatorSet4.addListener(new ifd(this, 7));
        }
        AnimatorSet animatorSet5 = this.c1;
        if (animatorSet5 != null) {
            animatorSet5.addListener(new ifd(this, 6));
        }
        AnimatorSet animatorSet6 = this.c1;
        if (animatorSet6 != null) {
            animatorSet6.setInterpolator(J0());
        }
        AnimatorSet animatorSet7 = this.c1;
        if (animatorSet7 != null) {
            animatorSet7.playTogether(o98VarA);
        }
        AnimatorSet animatorSet8 = this.c1;
        if (animatorSet8 != null) {
            animatorSet8.start();
        }
    }

    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object, k18] */
    public final void V0(boolean z) {
        AnimatorSet animatorSet = this.c1;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.c1;
            if (animatorSet2 != null) {
                animatorSet2.end();
            }
            AnimatorSet animatorSet3 = this.c1;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        this.c1 = new AnimatorSet();
        o98 o98VarD = ve3.d();
        View viewH0 = H0();
        Property property = View.ALPHA;
        o98VarD.add(cqi.b(viewH0, property, 0.0f, 1.0f, 300L, 150L, 96));
        View viewH02 = H0();
        Property property2 = View.TRANSLATION_X;
        o98VarD.add(cqi.b(viewH02, property2, vw4.d().getDisplayMetrics().density * 72.0f, 0.0f, 300L, 150L, 96));
        o98VarD.add(cqi.b(I0(), property, 0.0f, 1.0f, 300L, 150L, 96));
        o98VarD.add(cqi.b(I0(), property2, vw4.d().getDisplayMetrics().density * 72.0f, 0.0f, 300L, 150L, 96));
        o98VarD.add(cqi.b(G0(), property, 0.0f, 1.0f, 250L, 250L, 96));
        o98VarD.add(cqi.b(G0(), property2, vw4.d().getDisplayMetrics().density * 70.0f, 0.0f, 300L, 200L, 96));
        o98VarD.add(cqi.b(K0(), property, 0.0f, 1.0f, 150L, 250L, 96));
        imb imbVar = this.Q0;
        o98VarD.add(cqi.b(K0(), View.TRANSLATION_Y, (-48) - (vw4.d().getDisplayMetrics().density * 2.0f), imbVar != null ? ((Number) imbVar.b).floatValue() : 0.0f, 200L, 200L, 96));
        v1a v1aVar = a93.s0;
        int i = v1aVar.y(B0()).a().G().a.b.b;
        v1aVar.y(B0()).a();
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(i, -1);
        valueAnimatorOfArgb.setStartDelay(150L);
        valueAnimatorOfArgb.setDuration(300L);
        valueAnimatorOfArgb.addUpdateListener(new afd(this, 1));
        o98VarD.add(valueAnimatorOfArgb);
        o98VarD.addAll(cqi.m(D0(), 0.0f, 1.0f, 300L, 100L));
        o98VarD.add(cqi.b(D0(), property, 0.0f, 1.0f, 300L, 100L, 96));
        o98 o98VarA = ve3.a(o98VarD);
        AnimatorSet animatorSet4 = this.c1;
        if (animatorSet4 != null) {
            animatorSet4.setInterpolator(J0());
        }
        AnimatorSet animatorSet5 = this.c1;
        if (animatorSet5 != null) {
            animatorSet5.playTogether(o98VarA);
        }
        AnimatorSet animatorSet6 = this.c1;
        if (animatorSet6 != null) {
            animatorSet6.addListener(new ifd(this, 10));
        }
        AnimatorSet animatorSet7 = this.c1;
        if (animatorSet7 != null) {
            animatorSet7.addListener(new jfd(this, z, 2));
        }
        Object parentController = getParentController();
        AnimatorSet animatorSet8 = null;
        tj9 tj9Var = parentController instanceof tj9 ? (tj9) parentController : null;
        if (tj9Var != null) {
            MessageWriteWidget messageWriteWidget = (MessageWriteWidget) tj9Var;
            if (messageWriteWidget.getView() != null) {
                ik9 ik9VarC0 = messageWriteWidget.C0();
                ik9VarC0.getClass();
                AnimatorSet animatorSet9 = new AnimatorSet();
                o98 o98VarD2 = ve3.d();
                o98VarD2.add(cqi.b(ik9VarC0.d, property2, 0.0f, vw4.d().getDisplayMetrics().density * (-74.0f), 300L, 0L, 112));
                o98VarD2.add(cqi.b(ik9VarC0.d, property, 1.0f, 0.0f, 300L, 0L, 112));
                ImageView imageView = ik9VarC0.b;
                o98VarD2.add(cqi.b(imageView, property2, 0.0f, vw4.d().getDisplayMetrics().density * (-74.0f), 300L, 0L, 112));
                o98 o98Var = o98VarD2;
                o98Var.add(cqi.b(imageView, property, 1.0f, 0.0f, 300L, 0L, 112));
                ?? r4 = ik9VarC0.t0;
                if (r4.e()) {
                    o98Var.add(cqi.b((View) r4.getValue(), property2, 0.0f, vw4.d().getDisplayMetrics().density * (-74.0f), 300L, 0L, 112));
                    o98Var = o98Var;
                    o98Var.add(cqi.b((View) r4.getValue(), property, 1.0f, 0.0f, 300L, 0L, 112));
                }
                ?? r13 = ik9VarC0.s0;
                if (r13.e()) {
                    o98Var.add(cqi.b((View) r13.getValue(), property, 1.0f, 0.0f, 200L, 0L, 112));
                    o98Var.addAll(cqi.m((View) r13.getValue(), 1.0f, 0.0f, 300L, 0L));
                }
                ?? r132 = ik9VarC0.w0;
                if (r132.e()) {
                    o98Var.add(cqi.b((View) r132.getValue(), property, 1.0f, 0.0f, 200L, 0L, 112));
                    o98Var.addAll(cqi.m((View) r132.getValue(), 1.0f, 0.0f, 300L, 0L));
                }
                o98 o98VarA2 = ve3.a(o98Var);
                animatorSet9.addListener(new gk9(ik9VarC0, 4));
                animatorSet9.playTogether(o98VarA2);
                animatorSet8 = animatorSet9;
            }
        }
        AnimatorSet animatorSet10 = this.c1;
        if (animatorSet10 != null) {
            animatorSet10.playTogether(animatorSet8);
        }
        AnimatorSet animatorSet11 = this.c1;
        if (animatorSet11 != null) {
            animatorSet11.start();
        }
    }

    public final void W0() {
        x9f x9fVar = this.Z0;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        this.Z0 = null;
        AnimatorSet animatorSet = this.b1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        C0().setScaleX(1.0f);
        C0().setScaleY(1.0f);
    }

    public final void X0() {
        yy7[] yy7VarArr = g1;
        yy7 yy7Var = yy7VarArr[17];
        t9f t9fVar = this.a1;
        qt7 qt7Var = (qt7) t9fVar.D(this, yy7Var);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        t9fVar.O(this, yy7VarArr[17], null);
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        if (i == 1) {
            xfh.r(((fed) this.b.getValue()).c, bed.a);
        } else {
            if (i != 2) {
                return;
            }
            S0().K();
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onActivityPaused(Activity activity) {
        super.onActivityPaused(activity);
        S0().w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(mab.f);
        float f = 48;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, kti.d(vw4.d().getDisplayMetrics().density * f)));
        frameLayout.setClipChildren(false);
        frameLayout.setVisibility(4);
        cfd cfdVar = new cfd(this, 0);
        FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
        frameLayout2.setId(mab.p);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, kti.d(vw4.d().getDisplayMetrics().density * f));
        layoutParams.gravity = 80;
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout2.setVisibility(4);
        frameLayout2.setClickable(true);
        frameLayout2.setFocusable(true);
        frameLayout2.setMinimumHeight(48);
        frameLayout2.setBackgroundColor(0);
        cfdVar.invoke(frameLayout2);
        frameLayout.addView(frameLayout2);
        cfd cfdVar2 = new cfd(this, 1);
        FrameLayout frameLayout3 = new FrameLayout(frameLayout.getContext());
        frameLayout3.setId(mab.e);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, kti.d(R0() == tdd.b ? 96 * vw4.d().getDisplayMetrics().density : vw4.d().getDisplayMetrics().density * f));
        layoutParams2.gravity = 80;
        frameLayout3.setLayoutParams(layoutParams2);
        frameLayout3.setVisibility(4);
        frameLayout3.setClickable(true);
        frameLayout3.setFocusable(true);
        int i = 3;
        tqi.c(new c19(i, 0 == true ? 1 : 0, 2), frameLayout3);
        cfdVar2.invoke(frameLayout3);
        frameLayout.addView(frameLayout3);
        cfd cfdVar3 = new cfd(this, 2);
        FrameLayout frameLayout4 = new FrameLayout(frameLayout.getContext());
        frameLayout4.setId(mab.d);
        float f2 = 124;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (kti.d(vw4.d().getDisplayMetrics().density * f2) * 1.45f), (int) (kti.d(f2 * vw4.d().getDisplayMetrics().density) * 1.45f));
        layoutParams3.gravity = 85;
        float f3 = -66;
        layoutParams3.setMargins(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density));
        frameLayout4.setLayoutParams(layoutParams3);
        frameLayout4.setVisibility(4);
        cfdVar3.invoke(frameLayout4);
        frameLayout.addView(frameLayout4);
        ImageView imageView = new ImageView(frameLayout.getContext());
        imageView.setId(mab.l);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(kti.d(40 * vw4.d().getDisplayMetrics().density), kti.d(52 * vw4.d().getDisplayMetrics().density));
        layoutParams4.gravity = 8388693;
        imageView.setLayoutParams(layoutParams4);
        imageView.setTranslationY((-kti.d(f * vw4.d().getDisplayMetrics().density)) - (vw4.d().getDisplayMetrics().density * 74.0f));
        float f4 = 6;
        float f5 = 12;
        imageView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(f4 * vw4.d().getDisplayMetrics().density), kti.d(f5 * vw4.d().getDisplayMetrics().density));
        imageView.setImageDrawable((jg5) this.L0.getValue());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(vw4.d().getDisplayMetrics().density * 100.0f);
        imageView.setBackground(gradientDrawable);
        imageView.setVisibility(8);
        tqi.c(new nd0(i, 0 == true ? 1 : 0, 9), imageView);
        frameLayout.addView(imageView);
        ViewParent parent = frameLayout.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.setClipChildren(false);
        }
        return frameLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        this.Y0 = null;
        rkh rkhVar = this.D0;
        if (rkhVar != null) {
            rkhVar.setCallback(null);
        }
        this.D0 = null;
    }

    @Override // defpackage.c54
    public final void onDetach(View view) {
        super.onDetach(view);
        AnimatorSet animatorSet = this.c1;
        if (animatorSet != null) {
            animatorSet.end();
        }
        A0();
        S0().w();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        d53 d53Var = new d53(S0().x0, 12);
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(d53Var, l48VarP, l38Var), new kfd(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(new xnb(S0().y0, 7), getViewLifecycleOwner().p(), l38Var), new lfd(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(S0().B0, getViewLifecycleOwner().p(), l38Var), new mfd(null, this, view), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(S0().C0, getViewLifecycleOwner().p(), l38Var), new nfd(null, this), 1), getViewLifecycleScope());
        rkh rkhVar = this.D0;
        if (rkhVar != null) {
            gw0.w(new g56(aw0.a(S0().A0, getViewLifecycleOwner().p(), l38Var), new qfd(null, rkhVar, this), 1), getViewLifecycleScope());
            mcf mcfVar = S0().z0;
            if (mcfVar != null) {
                gw0.w(new g56(aw0.a(mcfVar, getViewLifecycleOwner().p(), l38Var), new rfd(null, rkhVar, this), 1), getViewLifecycleScope());
            }
        }
        gw0.w(new g56(aw0.a(((fed) this.b.getValue()).d, getViewLifecycleOwner().p(), l38Var), new ofd(null, this), 1), getViewLifecycleScope());
        m8f m8fVar = new m8f(K0(), m8f.p);
        n8f n8fVar = new n8f();
        m8fVar.m = n8fVar;
        n8fVar.b(200.0f);
        m8fVar.m.a(0.75f);
        this.Y0 = m8fVar;
    }

    public RecordControlsWidget(Bundle bundle) {
        ffd ffdVar;
        super(bundle, 0, 2, null);
        hs hsVar = new hs(b1e.class, Widget.ARG_SCOPE_ID);
        this.a = new hs(tdd.class, "arg_key_type");
        yy7 yy7Var = g1[0];
        this.b = m39getSharedViewModelcp94BC8(((b1e) hsVar.a(this)).a, fed.class, null);
        this.c = createViewModelLazy(zed.class, new vdc(8, new bfd(this, 4)));
        this.d = rsb.a.a();
        this.o = viewBinding(mab.f);
        this.X = viewBinding(mab.p);
        this.Y = viewBinding(mab.h);
        this.Z = viewBinding(mab.i);
        this.s0 = viewBinding(mab.r);
        this.t0 = viewBinding(mab.g);
        this.u0 = viewBinding(mab.e);
        this.v0 = viewBinding(mab.q);
        this.w0 = viewBinding(mab.m);
        this.x0 = viewBinding(mab.o);
        this.y0 = viewBinding(mab.d);
        this.z0 = viewBinding(mab.c);
        this.A0 = viewBinding(mab.b);
        this.B0 = viewBinding(mab.a);
        this.C0 = viewBinding(mab.l);
        int iOrdinal = R0().ordinal();
        if (iOrdinal == 0) {
            int i = yud.V0;
            ffdVar = new ffd(i, yud.d2, i);
        } else if (iOrdinal == 1) {
            int i2 = yud.S0;
            ffdVar = new ffd(i2, yud.F0, i2);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.E0 = ffdVar;
        this.F0 = ipi.b(3, new bfd(this, 5));
        this.G0 = ipi.b(3, new bfd(this, 6));
        this.H0 = ipi.b(3, new bfd(this, 7));
        this.I0 = ipi.b(3, new hdc(28));
        this.J0 = ipi.b(3, new hdc(29));
        int i3 = 0;
        this.K0 = ipi.b(3, new efd(i3));
        this.L0 = ipi.b(3, new bfd(this, i3));
        this.M0 = ipi.b(3, new hdc(25));
        this.N0 = ipi.b(3, new hdc(26));
        this.U0 = 1.0f;
        this.a1 = c7j.c();
    }
}
