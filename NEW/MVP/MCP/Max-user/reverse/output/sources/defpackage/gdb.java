package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable;
import android.util.Property;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes2.dex */
public final class gdb extends ConstraintLayout implements u6g {
    public static final /* synthetic */ yy7[] T0 = {new z8a(gdb.class, "leftElement", "getLeftElement()Lone/me/sdk/snackbar/OneMeSnackbarModel$Left;"), u45.h(vid.a, gdb.class, "rightElement", "getRightElement()Lone/me/sdk/snackbar/OneMeSnackbarModel$Right;"), new z8a(gdb.class, "styled", "getStyled()Lone/me/sdk/snackbar/OneMeSnackbarModel$Style;")};
    public final fdb F0;
    public final fdb G0;
    public final fdb H0;
    public final Object I0;
    public final Object J0;
    public final Object K0;
    public final AppCompatTextView L0;
    public final Object M0;
    public final Object N0;
    public final Object O0;
    public final ViewStub P0;
    public final Object Q0;
    public final ViewStub R0;
    public final Object S0;

    public gdb(final Context context) {
        super(context, null);
        this.F0 = new fdb(this, 0);
        this.G0 = new fdb(this, 1);
        this.H0 = new fdb(this, 2);
        this.I0 = ipi.b(3, new p1b(context, 7));
        this.J0 = ipi.b(3, new p1b(context, 8));
        this.K0 = ipi.b(3, new p1b(context, 9));
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(rab.g);
        appCompatTextView.setLayoutParams(new kt3(kti.d(0 * vw4.d().getDisplayMetrics().density), -2));
        dpg.h.b(appCompatTextView, t75.b);
        v1a v1aVar = a93.s0;
        v1aVar.y(appCompatTextView).getText();
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setMaxLines(2);
        this.L0 = appCompatTextView;
        this.M0 = ipi.b(3, new p1b(context, 10));
        this.N0 = ipi.b(3, new ddb(this, 0));
        this.O0 = ipi.b(3, new ddb(this, 1));
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(rab.f);
        this.P0 = viewStub;
        final int i = 0;
        this.Q0 = ipi.b(3, new cm6() { // from class: edb
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        Context context2 = context;
                        View view = new View(context2);
                        float f = 40;
                        view.setLayoutParams(new kt3(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f)));
                        this.setClipToPadding(false);
                        view.setClipToOutline(false);
                        nwe nweVar = new nwe(context2);
                        nweVar.d(false);
                        nweVar.s0.O(nweVar, nwe.A0[1], Integer.valueOf(kti.d(f * vw4.d().getDisplayMetrics().density)));
                        view.setBackground(nweVar);
                        return view;
                    default:
                        re reVar = new re(context);
                        reVar.setLayoutParams(new kt3(-1, 0));
                        reVar.setClipToOutline(false);
                        this.setClipChildren(false);
                        return reVar;
                }
            }
        });
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(rab.e);
        this.R0 = viewStub2;
        final int i2 = 1;
        this.S0 = ipi.b(3, new cm6() { // from class: edb
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        Context context2 = context;
                        View view = new View(context2);
                        float f = 40;
                        view.setLayoutParams(new kt3(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f)));
                        this.setClipToPadding(false);
                        view.setClipToOutline(false);
                        nwe nweVar = new nwe(context2);
                        nweVar.d(false);
                        nweVar.s0.O(nweVar, nwe.A0[1], Integer.valueOf(kti.d(f * vw4.d().getDisplayMetrics().density)));
                        view.setBackground(nweVar);
                        return view;
                    default:
                        re reVar = new re(context);
                        reVar.setLayoutParams(new kt3(-1, 0));
                        reVar.setClipToOutline(false);
                        this.setClipChildren(false);
                        return reVar;
                }
            }
        });
        setId(rab.b);
        setLayoutParams(new kt3(-1, -2));
        setMinimumHeight(kti.d(56 * vw4.d().getDisplayMetrics().density));
        int iD = kti.d(12 * vw4.d().getDisplayMetrics().density);
        setPadding(iD, iD, iD, iD);
        setClipToOutline(false);
        setClipChildren(false);
        setOutlineProvider(new u74(vw4.d().getDisplayMetrics().density * 16.0f));
        setBackgroundColor(v1aVar.y(this).b().e);
        addView(viewStub);
        addView(viewStub2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final ValueAnimator getBgAnimator() {
        return (ValueAnimator) this.O0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, k18] */
    public final void setLeft(ucb ucbVar) {
        if (ucbVar instanceof qcb) {
            setupLeftContrastIcon(((qcb) ucbVar).a);
            return;
        }
        if (ucbVar instanceof scb) {
            setupLeftNegativeIcon(((scb) ucbVar).a);
            return;
        }
        boolean z = ucbVar instanceof pcb;
        ?? r2 = this.I0;
        if (z) {
            pcb pcbVar = (pcb) ucbVar;
            int i = pcbVar.a;
            int i2 = pcbVar.b;
            AppCompatImageView appCompatImageView = (AppCompatImageView) r2.getValue();
            appCompatImageView.setId(rab.c);
            appCompatImageView.setImageDrawable(r34.b(appCompatImageView.getContext(), i).mutate());
            appCompatImageView.setImageTintList(ColorStateList.valueOf(i2));
            fqi.c(this, appCompatImageView, null);
            return;
        }
        if (!(ucbVar instanceof tcb)) {
            if (!(ucbVar instanceof rcb)) {
                throw new NoWhenBranchMatchedException();
            }
            if (r2.e()) {
                ((AppCompatImageView) r2.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        t84 t84Var = (t84) this.J0.getValue();
        t84Var.setId(rab.c);
        float f = 28;
        t84Var.setLayoutParams(new kt3(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        t84Var.setMaxValue(MultiFileUploader.UPLOAD_NEXT_INTERVAL);
        fqi.c(this, t84Var, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k18] */
    public final void setRight(adb adbVar) {
        boolean zA = fni.a(adbVar, vcb.a);
        ?? r2 = this.K0;
        if (zA) {
            OneMeButton oneMeButton = (OneMeButton) r2.getValue();
            oneMeButton.setId(rab.d);
            oneMeButton.setText(sab.a);
            oneMeButton.setMode(iza.d);
            fqi.c(this, oneMeButton, null);
            return;
        }
        if (fni.a(adbVar, xcb.a)) {
            OneMeButton oneMeButton2 = (OneMeButton) r2.getValue();
            oneMeButton2.setId(rab.d);
            oneMeButton2.d(Integer.valueOf(yud.D0));
            oneMeButton2.setMode(iza.c);
            fqi.c(this, oneMeButton2, null);
            return;
        }
        if (fni.a(adbVar, ycb.a)) {
            if (r2.e()) {
                ((OneMeButton) r2.getValue()).setVisibility(8);
            }
        } else {
            if (!(adbVar instanceof zcb)) {
                throw new NoWhenBranchMatchedException();
            }
            setupRightTextButton(((zcb) adbVar).a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, k18] */
    public final void setStyle(bdb bdbVar) {
        int iOrdinal = bdbVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            dqi.p(this.R0, (View) this.S0.getValue(), null);
            dqi.p(this.P0, (View) this.Q0.getValue(), null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final void setupLeftContrastIcon(int i) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.I0.getValue();
        appCompatImageView.setId(rab.c);
        appCompatImageView.setImageDrawable(r34.b(appCompatImageView.getContext(), i).mutate());
        a93.s0.y(appCompatImageView).getIcon();
        appCompatImageView.setImageTintList(ColorStateList.valueOf(-1));
        fqi.c(this, appCompatImageView, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final void setupLeftNegativeIcon(int i) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.I0.getValue();
        appCompatImageView.setId(rab.c);
        appCompatImageView.setImageDrawable(r34.b(appCompatImageView.getContext(), i).mutate());
        appCompatImageView.setImageTintList(ColorStateList.valueOf(a93.s0.y(appCompatImageView).getIcon().c));
        fqi.c(this, appCompatImageView, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final void setupRightTextButton(s5g s5gVar) {
        OneMeButton oneMeButton = (OneMeButton) this.K0.getValue();
        oneMeButton.setId(rab.d);
        oneMeButton.setText(s5gVar.b(oneMeButton.getContext()));
        oneMeButton.setMode(iza.d);
        fqi.c(this, oneMeButton, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, k18] */
    public static AnimatorSet v(gdb gdbVar) {
        final re reVar = (re) gdbVar.S0.getValue();
        final int i = 2;
        ddb ddbVar = new ddb(gdbVar, i);
        reVar.getClass();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(633L);
        valueAnimatorOfFloat.setInterpolator(new pe(new PathInterpolator(0.542f, 0.012f, 0.862f, 0.987f), new PathInterpolator(0.167f, 0.167f, 0.0f, 0.0f)));
        final int i2 = 0;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: oe
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 23.25f;
                        re reVar2 = reVar;
                        reVar2.t0 = fFloatValue;
                        reVar2.invalidate();
                        break;
                    case 1:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        re reVar3 = reVar;
                        reVar3.o = fFloatValue2;
                        reVar3.invalidate();
                        break;
                    case 2:
                        re reVar4 = reVar;
                        int[] iArr = reVar4.b;
                        iArr[2] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        iArr[3] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        reVar4.invalidate();
                        break;
                    default:
                        float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        re reVar5 = reVar;
                        reVar5.o = fFloatValue3;
                        reVar5.invalidate();
                        break;
                }
            }
        });
        valueAnimatorOfFloat.addListener(new qe(i2, ddbVar));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.2f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(y5f.a);
        valueAnimatorOfFloat2.setDuration(100L);
        final int i3 = 1;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: oe
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 23.25f;
                        re reVar2 = reVar;
                        reVar2.t0 = fFloatValue;
                        reVar2.invalidate();
                        break;
                    case 1:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        re reVar3 = reVar;
                        reVar3.o = fFloatValue2;
                        reVar3.invalidate();
                        break;
                    case 2:
                        re reVar4 = reVar;
                        int[] iArr = reVar4.b;
                        iArr[2] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        iArr[3] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        reVar4.invalidate();
                        break;
                    default:
                        float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        re reVar5 = reVar;
                        reVar5.o = fFloatValue3;
                        reVar5.invalidate();
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb((int) 4294897919L, (int) 4289937919L);
        valueAnimatorOfArgb.setDuration(733L);
        valueAnimatorOfArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: oe
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 23.25f;
                        re reVar2 = reVar;
                        reVar2.t0 = fFloatValue;
                        reVar2.invalidate();
                        break;
                    case 1:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        re reVar3 = reVar;
                        reVar3.o = fFloatValue2;
                        reVar3.invalidate();
                        break;
                    case 2:
                        re reVar4 = reVar;
                        int[] iArr = reVar4.b;
                        iArr[2] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        iArr[3] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        reVar4.invalidate();
                        break;
                    default:
                        float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        re reVar5 = reVar;
                        reVar5.o = fFloatValue3;
                        reVar5.invalidate();
                        break;
                }
            }
        });
        valueAnimatorOfArgb.addListener(new qe(i3, reVar));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setDuration(533L);
        valueAnimatorOfFloat3.setStartDelay(50L);
        final int i4 = 3;
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: oe
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i4) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 23.25f;
                        re reVar2 = reVar;
                        reVar2.t0 = fFloatValue;
                        reVar2.invalidate();
                        break;
                    case 1:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        re reVar3 = reVar;
                        reVar3.o = fFloatValue2;
                        reVar3.invalidate();
                        break;
                    case 2:
                        re reVar4 = reVar;
                        int[] iArr = reVar4.b;
                        iArr[2] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        iArr[3] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        reVar4.invalidate();
                        break;
                    default:
                        float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        re reVar5 = reVar;
                        reVar5.o = fFloatValue3;
                        reVar5.invalidate();
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(800L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(valueAnimatorOfFloat2, valueAnimatorOfFloat3);
        animatorSet.playTogether(animatorSet2, valueAnimatorOfArgb, valueAnimatorOfFloat);
        AnimatorSet animatorSet3 = new AnimatorSet();
        View view = (View) gdbVar.Q0.getValue();
        Property property = View.ROTATION;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, 257.0f);
        objectAnimatorOfFloat.setDuration(2500L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 257.0f, 360.0f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setInterpolator(new PathInterpolator(0.0f, 0.0f, 0.58f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 10.34f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 10.34f);
        objectAnimatorOfFloat3.setDuration(500L);
        objectAnimatorOfFloat4.setDuration(500L);
        objectAnimatorOfFloat3.setStartDelay(800L);
        objectAnimatorOfFloat4.setStartDelay(800L);
        objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        AnimatorSet animatorSet6 = new AnimatorSet();
        animatorSet6.playTogether(animatorSet5, animatorSet4);
        animatorSet3.playTogether(animatorSet6, animatorSet, gdbVar.getBgAnimator());
        return animatorSet3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, k18] */
    public final void A() {
        boolean z = dqi.r(this.I0) || dqi.r(this.J0);
        ?? r2 = this.K0;
        boolean zR = dqi.r(r2);
        ?? r4 = this.M0;
        boolean zR2 = dqi.r(r4);
        ut3 ut3VarG = l5j.g(this);
        AppCompatTextView appCompatTextView = this.L0;
        bj bjVar = new bj(ut3VarG, appCompatTextView.getId(), 5);
        if (z) {
            int i = rab.c;
            ut3 ut3Var = (ut3) bjVar.c;
            int i2 = bjVar.b;
            ut3Var.d(i2, 6, i, 7);
            az1.q(12, vw4.d().getDisplayMetrics().density, new fua(ut3Var, 6, i2, 5));
        } else {
            ut3 ut3Var2 = (ut3) bjVar.c;
            int i3 = bjVar.b;
            ut3Var2.d(i3, 6, 0, 6);
            new fua(ut3Var2, 6, i3, 5);
        }
        ut3 ut3Var3 = (ut3) bjVar.c;
        int i4 = bjVar.b;
        ut3Var3.d(i4, 3, 0, 3);
        new fua(ut3Var3, 3, i4, 5);
        if (zR) {
            int id = ((OneMeButton) r2.getValue()).getId();
            ut3 ut3Var4 = (ut3) bjVar.c;
            int i5 = bjVar.b;
            ut3Var4.d(i5, 7, id, 6);
            az1.q(12, vw4.d().getDisplayMetrics().density, new fua(ut3Var4, 7, i5, 5));
        } else {
            ut3 ut3Var5 = (ut3) bjVar.c;
            int i6 = bjVar.b;
            ut3Var5.d(i6, 7, 0, 7);
            new fua(ut3Var5, 7, i6, 5);
        }
        if (zR2) {
            int id2 = ((AppCompatTextView) r4.getValue()).getId();
            ut3 ut3Var6 = (ut3) bjVar.c;
            int i7 = bjVar.b;
            ut3Var6.d(i7, 4, id2, 3);
            new fua(ut3Var6, 4, i7, 5);
        } else {
            ut3 ut3Var7 = (ut3) bjVar.c;
            int i8 = bjVar.b;
            ut3Var7.d(i8, 4, 0, 4);
            new fua(ut3Var7, 4, i8, 5);
        }
        if (z) {
            int id3 = this.P0.getId();
            int i9 = rab.c;
            ut3VarG.d(id3, 6, i9, 6);
            ut3VarG.d(id3, 3, 0, 3);
            ut3VarG.d(id3, 4, 0, 4);
            ut3VarG.d(id3, 7, i9, 7);
            ut3VarG.d(i9, 6, 0, 6);
            ut3VarG.d(i9, 3, 0, 3);
            ut3VarG.d(i9, 4, 0, 4);
            int id4 = this.R0.getId();
            ut3VarG.d(id4, 6, i9, 6);
            ut3VarG.d(id4, 3, 0, 3);
            ut3VarG.d(id4, 4, 0, 4);
            ut3VarG.d(id4, 7, i9, 7);
        }
        if (zR2) {
            int id5 = ((AppCompatTextView) r4.getValue()).getId();
            if (z) {
                ut3VarG.d(id5, 6, rab.c, 7);
                az1.q(12, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id5, 5));
            } else {
                ut3VarG.d(id5, 6, 0, 6);
            }
            if (zR) {
                ut3VarG.d(id5, 7, ((OneMeButton) r2.getValue()).getId(), 6);
                az1.q(12, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 7, id5, 5));
            } else {
                ut3VarG.d(id5, 7, 0, 7);
            }
            ut3VarG.d(id5, 3, appCompatTextView.getId(), 4);
            az1.q(2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id5, 5));
        }
        if (zR) {
            int id6 = ((OneMeButton) r2.getValue()).getId();
            ut3VarG.d(id6, 3, 0, 3);
            ut3VarG.d(id6, 7, 0, 7);
            ut3VarG.d(id6, 4, 0, 4);
        }
        ut3VarG.a(this);
    }

    public final ucb getLeftElement() {
        yy7 yy7Var = T0[0];
        return (ucb) this.F0.b;
    }

    public final adb getRightElement() {
        yy7 yy7Var = T0[1];
        return (adb) this.G0.b;
    }

    public final bdb getStyled() {
        yy7 yy7Var = T0[2];
        return (bdb) this.H0.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ?? r0 = this.I0;
        if (r0.e()) {
            Object drawable = ((AppCompatImageView) r0.getValue()).getDrawable();
            Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
            if (animatable != null && !animatable.isRunning()) {
                animatable.start();
            }
        }
        if (getStyled() == bdb.b) {
            ((AnimatorSet) this.N0.getValue()).start();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ?? r0 = this.I0;
        if (r0.e()) {
            Object drawable = ((AppCompatImageView) r0.getValue()).getDrawable();
            Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
            if (animatable != null && animatable.isRunning()) {
                animatable.stop();
            }
        }
        ?? r02 = this.N0;
        if (r02.e() && ((AnimatorSet) r02.getValue()).isRunning()) {
            ((AnimatorSet) r02.getValue()).end();
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, k18] */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getStyled() == bdb.b) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) this.I0.getValue();
            int iQ = u45.q(12, vw4.d().getDisplayMetrics().density, kti.d(28 * vw4.d().getDisplayMetrics().density) / 2);
            ?? r5 = this.S0;
            re reVar = (re) r5.getValue();
            float f = iQ;
            reVar.getClass();
            reVar.a = m26.a(appCompatImageView.getLeft() + f, appCompatImageView.getTop() + f);
            ((re) r5.getValue()).setBaseRadius(((re) r5.getValue()).getMeasuredHeight());
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, k18] */
    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        setBackgroundColor(yebVar.b().e);
        Integer numValueOf = -1;
        this.L0.setTextColor(-1);
        ?? r0 = this.I0;
        if (r0.e()) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) r0.getValue();
            ucb leftElement = getLeftElement();
            if (!(leftElement instanceof qcb)) {
                if (leftElement instanceof scb) {
                    numValueOf = Integer.valueOf(yebVar.getIcon().c);
                } else if (!(leftElement instanceof tcb)) {
                    if (leftElement instanceof pcb) {
                        numValueOf = Integer.valueOf(((pcb) leftElement).b);
                    } else {
                        if (!fni.a(leftElement, rcb.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        numValueOf = null;
                    }
                }
            }
            if (numValueOf != null) {
                appCompatImageView.setImageTintList(ColorStateList.valueOf(numValueOf.intValue()));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void setCaption(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.M0.getValue();
        appCompatTextView.setId(rab.a);
        appCompatTextView.setText(charSequence);
        appCompatTextView.setVisibility(charSequence == null ? 8 : 0);
        fqi.c(this, appCompatTextView, null);
        A();
    }

    public final void setLeftElement(ucb ucbVar) {
        this.F0.O(this, T0[0], ucbVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void setRightBtnAction$snackbar_release(View.OnClickListener onClickListener) {
        ?? r0 = this.K0;
        if (r0.e()) {
            OneMeButton oneMeButton = (OneMeButton) r0.getValue();
            if (onClickListener == null) {
                oneMeButton.setOnClickListener(null);
            } else {
                f8j.d(oneMeButton, 300L, onClickListener);
            }
        }
    }

    public final void setRightElement(adb adbVar) {
        this.G0.O(this, T0[1], adbVar);
    }

    public final void setStyled(bdb bdbVar) {
        this.H0.O(this, T0[2], bdbVar);
    }

    public final void setTitle(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = this.L0;
        appCompatTextView.setText(charSequence);
        fqi.c(this, appCompatTextView, null);
        A();
    }

    public final void setTitle(int i) {
        setTitle(z7.e(getContext(), i));
    }

    public final void setCaption(int i) {
        setCaption(z7.e(getContext(), i));
    }
}
