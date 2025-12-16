package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes.dex */
public final class vs1 extends ConstraintLayout implements jn1, hn1, z54 {
    public static final /* synthetic */ yy7[] z1 = {new z8a(vs1.class, "mode", "getMode()Lone/me/calls/ui/view/CallUserLargeView$Companion$ActionsMode;"), u45.h(vid.a, vs1.class, "backgroundState", "getBackgroundState()Lone/me/calls/ui/view/CallUserLargeView$Companion$BackgroundState;")};
    public final uxa F0;
    public final Object G0;
    public final Object H0;
    public final Object I0;
    public final Object J0;
    public final Object K0;
    public final Object L0;
    public final Object M0;
    public final Object N0;
    public final Object O0;
    public final Object P0;
    public final ViewStub Q0;
    public final ViewStub R0;
    public final ViewStub S0;
    public final ViewStub T0;
    public final ViewStub U0;
    public final ViewStub V0;
    public final ViewStub W0;
    public final ViewStub X0;
    public final ViewStub Y0;
    public final GestureDetector Z0;
    public Boolean a1;
    public Boolean b1;
    public Boolean c1;
    public CharSequence d1;
    public CharSequence e1;
    public CharSequence f1;
    public ts1 g1;
    public cm6 h1;
    public a64 i1;
    public zi1 j1;
    public AnimatorSet k1;
    public final Object l1;
    public final Object m1;
    public final Object n1;
    public final Object o1;
    public final Object p1;
    public final Object q1;
    public final Object r1;
    public final ViewStub s1;
    public final Object t1;
    public final ViewStub u1;
    public final Object v1;
    public final ViewStub w1;
    public final us1 x1;
    public final us1 y1;

    public vs1(final Context context, int i) {
        super(context, null);
        this.G0 = ipi.b(3, new o40(context, 22));
        this.H0 = ipi.b(3, new o40(context, 16));
        final int i2 = 1;
        this.I0 = ipi.b(3, new cm6() { // from class: ms1
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return vs1.H(context, this);
                    case 1:
                        return vs1.w(context, this);
                    case 2:
                        return vs1.D(context, this);
                    case 3:
                        return vs1.B(context, this);
                    case 4:
                        owe oweVar = new owe(context);
                        nwe nweVar = oweVar.b;
                        nweVar.d(false);
                        oweVar.onThemeChanged(a93.s0.B(this).c);
                        oweVar.d = kti.d(30 * vw4.d().getDisplayMetrics().density);
                        mwe mweVar = nweVar.u0;
                        yy7[] yy7VarArr = nwe.A0;
                        mweVar.O(nweVar, yy7VarArr[3], lwe.b);
                        nweVar.v0.O(nweVar, yy7VarArr[4], Long.valueOf(MultiFileUploader.UPLOAD_NEXT_INTERVAL));
                        oweVar.setAlpha(255);
                        return oweVar;
                    case 5:
                        return vs1.A(context, this);
                    default:
                        OneMeButton oneMeButton = new OneMeButton(context, null);
                        oneMeButton.setSize(jza.c);
                        oneMeButton.setAppearance(gza.c);
                        oneMeButton.setMode(iza.a);
                        oneMeButton.setCustomTheme(a93.s0.B(oneMeButton).c);
                        oneMeButton.setLayoutParams(new kt3(-2, -2));
                        f8j.d(oneMeButton, 300L, new ps1(this, 0));
                        return oneMeButton;
                }
            }
        });
        this.J0 = ipi.b(3, new o40(context, 17));
        this.K0 = ipi.b(3, new o40(context, 18));
        this.L0 = ipi.b(3, new o40(context, 19));
        this.M0 = ipi.b(3, new o40(context, 20));
        final int i3 = 2;
        this.N0 = ipi.b(3, new cm6() { // from class: ms1
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return vs1.H(context, this);
                    case 1:
                        return vs1.w(context, this);
                    case 2:
                        return vs1.D(context, this);
                    case 3:
                        return vs1.B(context, this);
                    case 4:
                        owe oweVar = new owe(context);
                        nwe nweVar = oweVar.b;
                        nweVar.d(false);
                        oweVar.onThemeChanged(a93.s0.B(this).c);
                        oweVar.d = kti.d(30 * vw4.d().getDisplayMetrics().density);
                        mwe mweVar = nweVar.u0;
                        yy7[] yy7VarArr = nwe.A0;
                        mweVar.O(nweVar, yy7VarArr[3], lwe.b);
                        nweVar.v0.O(nweVar, yy7VarArr[4], Long.valueOf(MultiFileUploader.UPLOAD_NEXT_INTERVAL));
                        oweVar.setAlpha(255);
                        return oweVar;
                    case 5:
                        return vs1.A(context, this);
                    default:
                        OneMeButton oneMeButton = new OneMeButton(context, null);
                        oneMeButton.setSize(jza.c);
                        oneMeButton.setAppearance(gza.c);
                        oneMeButton.setMode(iza.a);
                        oneMeButton.setCustomTheme(a93.s0.B(oneMeButton).c);
                        oneMeButton.setLayoutParams(new kt3(-2, -2));
                        f8j.d(oneMeButton, 300L, new ps1(this, 0));
                        return oneMeButton;
                }
            }
        });
        final int i4 = 3;
        this.O0 = ipi.b(3, new cm6() { // from class: ms1
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return vs1.H(context, this);
                    case 1:
                        return vs1.w(context, this);
                    case 2:
                        return vs1.D(context, this);
                    case 3:
                        return vs1.B(context, this);
                    case 4:
                        owe oweVar = new owe(context);
                        nwe nweVar = oweVar.b;
                        nweVar.d(false);
                        oweVar.onThemeChanged(a93.s0.B(this).c);
                        oweVar.d = kti.d(30 * vw4.d().getDisplayMetrics().density);
                        mwe mweVar = nweVar.u0;
                        yy7[] yy7VarArr = nwe.A0;
                        mweVar.O(nweVar, yy7VarArr[3], lwe.b);
                        nweVar.v0.O(nweVar, yy7VarArr[4], Long.valueOf(MultiFileUploader.UPLOAD_NEXT_INTERVAL));
                        oweVar.setAlpha(255);
                        return oweVar;
                    case 5:
                        return vs1.A(context, this);
                    default:
                        OneMeButton oneMeButton = new OneMeButton(context, null);
                        oneMeButton.setSize(jza.c);
                        oneMeButton.setAppearance(gza.c);
                        oneMeButton.setMode(iza.a);
                        oneMeButton.setCustomTheme(a93.s0.B(oneMeButton).c);
                        oneMeButton.setLayoutParams(new kt3(-2, -2));
                        f8j.d(oneMeButton, 300L, new ps1(this, 0));
                        return oneMeButton;
                }
            }
        });
        this.P0 = ipi.b(3, new o40(context, 21));
        this.j1 = zi1.c;
        this.l1 = ipi.b(3, new o40(context, 23));
        this.m1 = ipi.b(3, new qs1(this, 1));
        this.n1 = ipi.b(3, new o40(context, 24));
        this.o1 = ipi.b(3, new jl1(12));
        this.p1 = ipi.b(3, new qs1(this, 2));
        final int i5 = 4;
        this.q1 = ipi.b(3, new cm6() { // from class: ms1
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return vs1.H(context, this);
                    case 1:
                        return vs1.w(context, this);
                    case 2:
                        return vs1.D(context, this);
                    case 3:
                        return vs1.B(context, this);
                    case 4:
                        owe oweVar = new owe(context);
                        nwe nweVar = oweVar.b;
                        nweVar.d(false);
                        oweVar.onThemeChanged(a93.s0.B(this).c);
                        oweVar.d = kti.d(30 * vw4.d().getDisplayMetrics().density);
                        mwe mweVar = nweVar.u0;
                        yy7[] yy7VarArr = nwe.A0;
                        mweVar.O(nweVar, yy7VarArr[3], lwe.b);
                        nweVar.v0.O(nweVar, yy7VarArr[4], Long.valueOf(MultiFileUploader.UPLOAD_NEXT_INTERVAL));
                        oweVar.setAlpha(255);
                        return oweVar;
                    case 5:
                        return vs1.A(context, this);
                    default:
                        OneMeButton oneMeButton = new OneMeButton(context, null);
                        oneMeButton.setSize(jza.c);
                        oneMeButton.setAppearance(gza.c);
                        oneMeButton.setMode(iza.a);
                        oneMeButton.setCustomTheme(a93.s0.B(oneMeButton).c);
                        oneMeButton.setLayoutParams(new kt3(-2, -2));
                        f8j.d(oneMeButton, 300L, new ps1(this, 0));
                        return oneMeButton;
                }
            }
        });
        final int i6 = 5;
        this.r1 = ipi.b(3, new cm6() { // from class: ms1
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return vs1.H(context, this);
                    case 1:
                        return vs1.w(context, this);
                    case 2:
                        return vs1.D(context, this);
                    case 3:
                        return vs1.B(context, this);
                    case 4:
                        owe oweVar = new owe(context);
                        nwe nweVar = oweVar.b;
                        nweVar.d(false);
                        oweVar.onThemeChanged(a93.s0.B(this).c);
                        oweVar.d = kti.d(30 * vw4.d().getDisplayMetrics().density);
                        mwe mweVar = nweVar.u0;
                        yy7[] yy7VarArr = nwe.A0;
                        mweVar.O(nweVar, yy7VarArr[3], lwe.b);
                        nweVar.v0.O(nweVar, yy7VarArr[4], Long.valueOf(MultiFileUploader.UPLOAD_NEXT_INTERVAL));
                        oweVar.setAlpha(255);
                        return oweVar;
                    case 5:
                        return vs1.A(context, this);
                    default:
                        OneMeButton oneMeButton = new OneMeButton(context, null);
                        oneMeButton.setSize(jza.c);
                        oneMeButton.setAppearance(gza.c);
                        oneMeButton.setMode(iza.a);
                        oneMeButton.setCustomTheme(a93.s0.B(oneMeButton).c);
                        oneMeButton.setLayoutParams(new kt3(-2, -2));
                        f8j.d(oneMeButton, 300L, new ps1(this, 0));
                        return oneMeButton;
                }
            }
        });
        final int i7 = 6;
        this.t1 = ipi.b(3, new cm6() { // from class: ms1
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return vs1.H(context, this);
                    case 1:
                        return vs1.w(context, this);
                    case 2:
                        return vs1.D(context, this);
                    case 3:
                        return vs1.B(context, this);
                    case 4:
                        owe oweVar = new owe(context);
                        nwe nweVar = oweVar.b;
                        nweVar.d(false);
                        oweVar.onThemeChanged(a93.s0.B(this).c);
                        oweVar.d = kti.d(30 * vw4.d().getDisplayMetrics().density);
                        mwe mweVar = nweVar.u0;
                        yy7[] yy7VarArr = nwe.A0;
                        mweVar.O(nweVar, yy7VarArr[3], lwe.b);
                        nweVar.v0.O(nweVar, yy7VarArr[4], Long.valueOf(MultiFileUploader.UPLOAD_NEXT_INTERVAL));
                        oweVar.setAlpha(255);
                        return oweVar;
                    case 5:
                        return vs1.A(context, this);
                    default:
                        OneMeButton oneMeButton = new OneMeButton(context, null);
                        oneMeButton.setSize(jza.c);
                        oneMeButton.setAppearance(gza.c);
                        oneMeButton.setMode(iza.a);
                        oneMeButton.setCustomTheme(a93.s0.B(oneMeButton).c);
                        oneMeButton.setLayoutParams(new kt3(-2, -2));
                        f8j.d(oneMeButton, 300L, new ps1(this, 0));
                        return oneMeButton;
                }
            }
        });
        final int i8 = 0;
        this.v1 = ipi.b(3, new cm6() { // from class: ms1
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        return vs1.H(context, this);
                    case 1:
                        return vs1.w(context, this);
                    case 2:
                        return vs1.D(context, this);
                    case 3:
                        return vs1.B(context, this);
                    case 4:
                        owe oweVar = new owe(context);
                        nwe nweVar = oweVar.b;
                        nweVar.d(false);
                        oweVar.onThemeChanged(a93.s0.B(this).c);
                        oweVar.d = kti.d(30 * vw4.d().getDisplayMetrics().density);
                        mwe mweVar = nweVar.u0;
                        yy7[] yy7VarArr = nwe.A0;
                        mweVar.O(nweVar, yy7VarArr[3], lwe.b);
                        nweVar.v0.O(nweVar, yy7VarArr[4], Long.valueOf(MultiFileUploader.UPLOAD_NEXT_INTERVAL));
                        oweVar.setAlpha(255);
                        return oweVar;
                    case 5:
                        return vs1.A(context, this);
                    default:
                        OneMeButton oneMeButton = new OneMeButton(context, null);
                        oneMeButton.setSize(jza.c);
                        oneMeButton.setAppearance(gza.c);
                        oneMeButton.setMode(iza.a);
                        oneMeButton.setCustomTheme(a93.s0.B(oneMeButton).c);
                        oneMeButton.setLayoutParams(new kt3(-2, -2));
                        f8j.d(oneMeButton, 300L, new ps1(this, 0));
                        return oneMeButton;
                }
            }
        });
        this.x1 = new us1(this, 0);
        this.y1 = new us1(this, 1);
        setLayoutParams(new kt3(-1, -1));
        View view = new View(context);
        view.setId(j0b.L1);
        view.setLayoutParams(new kt3(0, kti.d(104 * vw4.d().getDisplayMetrics().density) + getScreenInfo().c));
        uxa uxaVar = new uxa(context);
        uxaVar.setId(j0b.H1);
        uxaVar.setAvatarShape(kxa.a);
        this.F0 = uxaVar;
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(j0b.I1);
        this.S0 = viewStub;
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(j0b.J1);
        this.R0 = viewStub2;
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(j0b.R1);
        this.T0 = viewStub3;
        ViewStub viewStub4 = new ViewStub(context);
        viewStub4.setId(j0b.M1);
        this.U0 = viewStub4;
        ViewStub viewStub5 = new ViewStub(context);
        viewStub5.setId(j0b.N1);
        this.V0 = viewStub5;
        ViewStub viewStub6 = new ViewStub(context);
        viewStub6.setId(j0b.O1);
        this.W0 = viewStub6;
        ViewStub viewStub7 = new ViewStub(context);
        viewStub7.setId(j0b.Q1);
        this.X0 = viewStub7;
        ViewStub viewStub8 = new ViewStub(context);
        viewStub8.setId(j0b.P1);
        this.Y0 = viewStub8;
        ViewStub viewStub9 = new ViewStub(context);
        viewStub9.setId(j0b.y0);
        this.Q0 = viewStub9;
        ViewStub viewStub10 = new ViewStub(context);
        viewStub10.setId(j0b.u0);
        this.s1 = viewStub10;
        ViewStub viewStub11 = new ViewStub(context);
        viewStub11.setId(j0b.Q);
        this.u1 = viewStub11;
        ViewStub viewStub12 = new ViewStub(context);
        viewStub12.setId(j0b.P);
        this.w1 = viewStub12;
        this.Z0 = new GestureDetector(context, new kx0(2, this));
        addView(viewStub10);
        addView(view);
        float f = 200;
        addView(uxaVar, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        addView(viewStub3, -1, -1);
        addView(viewStub);
        addView(viewStub2);
        addView(viewStub12);
        addView(viewStub11);
        addView(viewStub4);
        addView(viewStub5);
        addView(viewStub6);
        addView(viewStub7);
        addView(viewStub8);
        addView(viewStub9);
        ut3 ut3VarG = l5j.g(this);
        int id = view.getId();
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 7, 0, 7);
        int id2 = viewStub10.getId();
        ut3VarG.d(id2, 3, 0, 3);
        ut3VarG.d(id2, 4, 0, 4);
        ut3VarG.d(id2, 6, 0, 6);
        ut3VarG.d(id2, 7, 0, 7);
        int id3 = viewStub12.getId();
        ut3VarG.d(id3, 4, view.getId(), 4);
        float f2 = 24;
        ut3VarG.g(id3).d.I = kti.d(vw4.d().getDisplayMetrics().density * f2);
        ut3VarG.d(id3, 6, 0, 6);
        ut3VarG.d(id3, 7, 0, 7);
        int id4 = viewStub.getId();
        ut3VarG.d(id4, 3, view.getId(), 4);
        ut3VarG.d(id4, 6, 0, 6);
        ut3VarG.g(id4).d.K = kti.d(vw4.d().getDisplayMetrics().density * f2);
        ut3VarG.d(id4, 7, 0, 7);
        ut3VarG.g(id4).d.J = kti.d(vw4.d().getDisplayMetrics().density * f2);
        int id5 = viewStub2.getId();
        ut3VarG.d(id5, 3, viewStub.getId(), 4);
        float f3 = 12;
        ut3VarG.g(id5).d.H = kti.d(vw4.d().getDisplayMetrics().density * f3);
        ut3VarG.d(id5, 6, 0, 6);
        ut3VarG.g(id5).d.K = kti.d(vw4.d().getDisplayMetrics().density * f2);
        ut3VarG.d(id5, 7, 0, 7);
        ut3VarG.g(id5).d.J = kti.d(vw4.d().getDisplayMetrics().density * f2);
        int id6 = uxaVar.getId();
        ut3VarG.d(id6, 3, 0, 3);
        ut3VarG.d(id6, 4, 0, 4);
        ut3VarG.d(id6, 6, 0, 6);
        ut3VarG.d(id6, 7, 0, 7);
        ut3VarG.g(id6).d.x = 0.45f;
        int id7 = viewStub7.getId();
        ut3VarG.d(id7, 3, uxaVar.getId(), 4);
        float f4 = 32;
        ut3VarG.g(id7).d.H = kti.d(vw4.d().getDisplayMetrics().density * f4);
        ut3VarG.d(id7, 6, 0, 6);
        ut3VarG.d(id7, 7, 0, 7);
        int id8 = viewStub3.getId();
        ut3VarG.d(id8, 4, 0, 4);
        ut3VarG.d(id8, 3, 0, 3);
        ut3VarG.d(id8, 6, 0, 6);
        ut3VarG.d(id8, 7, 0, 7);
        int id9 = viewStub11.getId();
        ut3VarG.d(id9, 6, 0, 6);
        float f5 = 16;
        ut3VarG.g(id9).d.K = kti.d(vw4.d().getDisplayMetrics().density * f5);
        ut3VarG.d(id9, 7, 0, 7);
        ut3VarG.g(id9).d.J = kti.d(f5 * vw4.d().getDisplayMetrics().density);
        ut3VarG.d(id9, 4, viewStub4.getId(), 3);
        ut3VarG.g(id9).d.I = kti.d(f4 * vw4.d().getDisplayMetrics().density);
        int id10 = viewStub4.getId();
        ut3VarG.d(id10, 6, 0, 6);
        ut3VarG.d(id10, 7, viewStub5.getId(), 6);
        ut3VarG.g(id10).d.J = kti.d(vw4.d().getDisplayMetrics().density * f2);
        ut3VarG.d(id10, 4, 0, 4);
        ut3VarG.g(id10).d.I = kti.d(86 * vw4.d().getDisplayMetrics().density);
        ut3VarG.g(id10).d.V = 2;
        int id11 = viewStub5.getId();
        ut3VarG.d(id11, 6, viewStub4.getId(), 7);
        ut3VarG.g(id11).d.K = kti.d(vw4.d().getDisplayMetrics().density * f2);
        ut3VarG.d(id11, 7, viewStub6.getId(), 6);
        ut3VarG.g(id11).d.J = kti.d(vw4.d().getDisplayMetrics().density * f2);
        ut3VarG.d(id11, 3, viewStub4.getId(), 3);
        int id12 = viewStub6.getId();
        ut3VarG.d(id12, 7, 0, 7);
        ut3VarG.d(id12, 6, viewStub5.getId(), 7);
        ut3VarG.g(id12).d.K = kti.d(vw4.d().getDisplayMetrics().density * f2);
        ut3VarG.d(id12, 3, viewStub4.getId(), 3);
        int id13 = viewStub8.getId();
        ut3VarG.d(id13, 4, uxaVar.getId(), 4);
        ut3VarG.g(id13).d.I = kti.d((-8) * vw4.d().getDisplayMetrics().density);
        ut3VarG.d(id13, 7, uxaVar.getId(), 7);
        ut3VarG.g(id13).d.J = kti.d(8 * vw4.d().getDisplayMetrics().density);
        int id14 = viewStub9.getId();
        ut3VarG.d(id14, 3, 0, 3);
        ut3VarG.g(id14).d.H = kti.d(vw4.d().getDisplayMetrics().density * f3);
        ut3VarG.d(id14, 6, 0, 6);
        ut3VarG.g(id14).d.K = kti.d(f3 * vw4.d().getDisplayMetrics().density);
        ut3VarG.a(this);
    }

    public static i41 A(Context context, vs1 vs1Var) {
        i41 i41Var = new i41(context);
        i41Var.setForeground(vs1Var.getForegroundDrawable());
        i41Var.setLayoutParams(new kt3(-1, -1));
        return i41Var;
    }

    public static ImageView B(Context context, vs1 vs1Var) {
        ImageView imageView = new ImageView(context);
        imageView.setId(j0b.y0);
        float f = 40;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        imageView.setImageDrawable(vs1Var.getRaiseHandIcon());
        f8j.d(imageView, 300L, new ps1(vs1Var, 1));
        return imageView;
    }

    public static void C(gg ggVar, vs1 vs1Var) {
        float f = ggVar.a;
        int iMax = Math.max((int) (vs1Var.getHeight() * f), kti.d(100 * vw4.d().getDisplayMetrics().density));
        int i = dqi.q(vs1Var.T0) ? vs1Var.getRenderVideoView().x0 : false ? 0 : (int) (255 * f);
        int backgroundCenterY = (int) (vs1Var.getBackgroundCenterY() * f);
        owe background = vs1Var.getBackground();
        if (background != null) {
            background.a(backgroundCenterY);
            background.setBounds(0, 0, vs1Var.getWidth(), iMax);
            vs1Var.Y(i, true);
        }
    }

    public static ImageView D(Context context, vs1 vs1Var) {
        ImageView imageView = new ImageView(context);
        imageView.setId(j0b.P1);
        int iD = kti.d(12 * vw4.d().getDisplayMetrics().density);
        imageView.setPadding(iD, iD, iD, iD);
        float f = 64;
        imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        imageView.setVisibility(8);
        imageView.setBackground(vs1Var.getLockedDrawable());
        imageView.setImageResource(i0b.z0);
        imageView.setImageTintList(ColorStateList.valueOf(a93.s0.B(imageView).c.getIcon().f));
        return imageView;
    }

    public static uxa H(Context context, vs1 vs1Var) {
        uxa uxaVar = new uxa(context);
        uxaVar.setAvatarShape(kxa.a);
        float f = 64;
        uxaVar.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        uxaVar.setForeground(vs1Var.getAvatarOvalDrawable());
        return uxaVar;
    }

    public static void J(vs1 vs1Var, CharSequence charSequence) {
        vs1Var.getSpeakerLabelView().setLabel(charSequence);
    }

    public static void K(vs1 vs1Var, boolean z) {
        mfh.o(vs1Var.getRenderVideoView(), z);
        boolean z2 = !z;
        if (hqi.j(vs1Var.F0) != z2) {
            hqi.g(vs1Var.F0, z2, 0L, new hd1(1, vs1Var, z2), 2);
        }
        vs1Var.Y(!z ? 255 : 0, false);
    }

    public static void L(vs1 vs1Var, CharSequence charSequence) {
        vs1Var.getStatusTextView().setText(charSequence);
    }

    private final int getActionButtonPaddings() {
        ViewStub viewStub = this.V0;
        boolean zQ = dqi.q(viewStub);
        ViewStub viewStub2 = this.W0;
        return (zQ && getPositiveButtonSecondaryView().getVisibility() == 0 && dqi.q(viewStub2) && getPositiveButtonNeutralView().getVisibility() == 0) ? kti.d(28 * vw4.d().getDisplayMetrics().density) : ((dqi.q(viewStub) && getPositiveButtonSecondaryView().getVisibility() == 0) || (dqi.q(viewStub2) && getPositiveButtonNeutralView().getVisibility() == 0)) ? kti.d(40 * vw4.d().getDisplayMetrics().density) : kti.d(0 * vw4.d().getDisplayMetrics().density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final owe getAnimatedBackground() {
        return (owe) this.q1.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final InsetDrawable getAvatarOvalDrawable() {
        return (InsetDrawable) this.n1.getValue();
    }

    private static /* synthetic */ void getAvatarOvalDrawable$annotations() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final uxa getAvatarViewSmall() {
        return (uxa) this.v1.getValue();
    }

    private final int getBackgroundCenterY() {
        uxa uxaVar = this.F0;
        return (uxaVar.getMeasuredHeight() / 2) + uxaVar.getTop();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final ImageView getBlockedLabelView() {
        return (ImageView) this.N0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final i41 getCameraPreviewView() {
        return (i41) this.r1.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final OneMeButton getEnableCameraPreviewButton() {
        return (OneMeButton) this.t1.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final GradientDrawable getForegroundDrawable() {
        return (GradientDrawable) this.p1.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final ShapeDrawable getLockedDrawable() {
        return (ShapeDrawable) this.m1.getValue();
    }

    private final y54 getMarginTop() {
        y54 y54Var;
        a64 a64Var = this.i1;
        return (a64Var == null || (y54Var = ((e64) a64Var).j) == null) ? y54.d : y54Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final TextView getNameTextView() {
        return (TextView) this.G0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final jtd getNegativeButtonView() {
        return (jtd) this.M0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final jtd getPositiveButtonNeutralView() {
        return (jtd) this.L0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final jtd getPositiveButtonSecondaryView() {
        return (jtd) this.K0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final h7d getRaiseHandIcon() {
        return (h7d) this.l1.getValue();
    }

    private final int getRaiseHandTopPadding() {
        return kti.d(12 * vw4.d().getDisplayMetrics().density);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final ImageView getRaiseHandView() {
        return (ImageView) this.O0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final qt1 getRenderVideoView() {
        return (qt1) this.I0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final r1e getScreenInfo() {
        return (r1e) this.P0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final mq1 getSpeakerLabelView() {
        return (mq1) this.J0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final TextView getStatusTextView() {
        return (TextView) this.H0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final InsetDrawable getTalkingDrawable() {
        return (InsetDrawable) this.o1.getValue();
    }

    public static void v(vs1 vs1Var, wd0 wd0Var, boolean z) {
        if (z) {
            return;
        }
        uxa.m(vs1Var.getAvatarViewSmall(), wd0Var != null ? wd0Var.b : null, wd0Var != null ? wd0Var.a : null);
    }

    public static qt1 w(Context context, vs1 vs1Var) {
        qt1 qt1Var = new qt1(context);
        qt1Var.setId(j0b.R1);
        qt1Var.setForeground(vs1Var.getForegroundDrawable());
        qt1Var.setLayoutParams(new kt3(-1, -1));
        qt1Var.setFullScreen(true);
        mfh.o(qt1Var, false);
        qt1Var.setListener(new xtd(17, vs1Var));
        qt1Var.setVideoLayoutUpdatesControllerProvider(new qs1(vs1Var, 0));
        return qt1Var;
    }

    public static void x(vs1 vs1Var, CharSequence charSequence) {
        vs1Var.getNameTextView().setText(charSequence);
    }

    @Override // defpackage.z54
    public final void E(y54 y54Var) {
        if (dqi.q(this.Q0)) {
            mfh.n(getRaiseHandView(), y54Var.b() + getRaiseHandTopPadding());
        }
    }

    @Override // defpackage.z54
    public final List I(x54 x54Var, x54 x54Var2) {
        o98 o98VarD = ve3.d();
        if (dqi.q(this.Q0)) {
            o98VarD.add(dqi.o(getRaiseHandView(), (Math.abs(x54Var.d) - x54Var.f) * x54Var.c));
        }
        return ve3.a(o98VarD);
    }

    public final void R(boolean z) {
        if (fni.a(this.b1, Boolean.valueOf(z))) {
            return;
        }
        dqi.p(this.Y0, getBlockedLabelView(), null);
        this.b1 = Boolean.valueOf(z);
        getBlockedLabelView().setVisibility(z ? 0 : 8);
    }

    public final void S(boolean z) {
        if (fni.a(this.a1, Boolean.valueOf(z))) {
            return;
        }
        this.a1 = Boolean.valueOf(z);
        InsetDrawable talkingDrawable = getTalkingDrawable();
        if (!z) {
            talkingDrawable = null;
        }
        this.F0.setForeground(talkingDrawable);
    }

    public final void T(boolean z, boolean z2) {
        ViewStub viewStub = this.s1;
        if (z || dqi.q(viewStub)) {
            dqi.p(viewStub, getCameraPreviewView(), null);
            i41 cameraPreviewView = getCameraPreviewView();
            if (cameraPreviewView.b != z || !cameraPreviewView.c) {
                cameraPreviewView.b = z;
                cameraPreviewView.c = true;
                cameraPreviewView.a(z, true);
            }
            hqi.h(getCameraPreviewView(), z, null, 6);
            hqi.h(this.F0, !z, null, 6);
        }
    }

    public final void U(String str, CharSequence charSequence) {
        ViewStub viewStub = this.X0;
        if (((charSequence == null || vmf.F(charSequence)) && !dqi.q(viewStub)) || fni.a(this.f1, charSequence)) {
            return;
        }
        dqi.p(viewStub, getSpeakerLabelView(), null);
        this.f1 = charSequence;
        if (charSequence != null && !vmf.F(charSequence)) {
            getSpeakerLabelView().setLabel(charSequence);
        }
        hqi.g(getSpeakerLabelView(), !(charSequence == null || vmf.F(charSequence)), 0L, new ls1(this, charSequence, 2), 2);
        getSpeakerLabelView().setContentDescription(str);
    }

    public final void V(int i, int i2, s5g s5gVar, cm6 cm6Var) {
        ViewStub viewStub = this.U0;
        dqi.q(viewStub);
        dqi.p(viewStub, getNegativeButtonView(), null);
        jtd negativeButtonView = getNegativeButtonView();
        negativeButtonView.setVisibility(0);
        if (negativeButtonView.getVisibility() == 0) {
            negativeButtonView.setTitle(s5gVar);
            jtd.B(negativeButtonView, i);
            negativeButtonView.setAccessibility(Integer.valueOf(i2));
            negativeButtonView.setListener(new ns1(0, cm6Var));
        }
        Z();
    }

    public final void W(boolean z, int i, int i2, s5g s5gVar, cm6 cm6Var) {
        ViewStub viewStub = this.W0;
        if (dqi.q(viewStub) || z) {
            dqi.p(viewStub, getPositiveButtonNeutralView(), null);
            jtd positiveButtonNeutralView = getPositiveButtonNeutralView();
            positiveButtonNeutralView.setVisibility(z ? 0 : 8);
            if (positiveButtonNeutralView.getVisibility() == 0) {
                positiveButtonNeutralView.setTitle(s5gVar);
                jtd.B(positiveButtonNeutralView, i);
                positiveButtonNeutralView.setAccessibility(Integer.valueOf(i2));
                positiveButtonNeutralView.setListener(new ns1(1, cm6Var));
            }
            Z();
        }
    }

    public final void X(boolean z, int i, s5g s5gVar, cm6 cm6Var, em6 em6Var) {
        ViewStub viewStub = this.V0;
        if (dqi.q(viewStub) || z) {
            dqi.p(viewStub, getPositiveButtonSecondaryView(), null);
            jtd positiveButtonSecondaryView = getPositiveButtonSecondaryView();
            positiveButtonSecondaryView.setVisibility(z ? 0 : 8);
            if (positiveButtonSecondaryView.getVisibility() == 0) {
                positiveButtonSecondaryView.setTitle(s5gVar);
                em6Var.invoke(positiveButtonSecondaryView);
                positiveButtonSecondaryView.setAccessibility(Integer.valueOf(i));
                positiveButtonSecondaryView.setListener(new ns1(2, cm6Var));
            }
            Z();
        }
    }

    public final void Y(int i, boolean z) {
        Drawable background;
        int i2 = j0b.l;
        Object tag = getTag(i2);
        if ((tag != null || ((background = getBackground()) != null && background.getAlpha() == i)) && fni.a(tag, Integer.valueOf(i))) {
            return;
        }
        AnimatorSet animatorSet = this.k1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        long j = z ? 0L : 200L;
        Drawable background2 = getBackground();
        int alpha = background2 != null ? background2.getAlpha() : 0;
        lg lgVar = new lg("alpha", alpha);
        setTag(i2, Integer.valueOf(i));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setDuration(j);
        animatorSet2.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt((Object) null, lgVar, alpha, i);
        int i3 = 0;
        objectAnimatorOfInt.addUpdateListener(new sg(this, i3, lgVar));
        animatorSet2.addListener(new ug(this, i, i3));
        animatorSet2.play(objectAnimatorOfInt);
        animatorSet2.start();
        this.k1 = animatorSet2;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z() {
        /*
            r8 = this;
            android.view.ViewStub r0 = r8.W0
            boolean r1 = defpackage.dqi.q(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            jtd r1 = r8.getPositiveButtonNeutralView()
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L16
            r1 = r2
            goto L17
        L16:
            r1 = r3
        L17:
            int r4 = r8.getActionButtonPaddings()
            android.view.ViewStub r5 = r8.U0
            boolean r5 = defpackage.dqi.q(r5)
            java.lang.String r6 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            if (r5 == 0) goto L54
            jtd r5 = r8.getNegativeButtonView()
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            boolean r7 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L38
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            int r5 = r5.getMarginEnd()
            goto L39
        L38:
            r5 = r3
        L39:
            if (r5 == r4) goto L54
            jtd r5 = r8.getNegativeButtonView()
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            if (r7 == 0) goto L4e
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            r7.setMarginEnd(r4)
            r5.setLayoutParams(r7)
            goto L54
        L4e:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r6)
            throw r0
        L54:
            if (r1 == 0) goto L58
            r1 = r4
            goto L59
        L58:
            r1 = r3
        L59:
            jtd r5 = r8.getPositiveButtonSecondaryView()
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            boolean r7 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L6c
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            int r5 = r5.getMarginStart()
            goto L6d
        L6c:
            r5 = r3
        L6d:
            if (r5 != r4) goto L86
            jtd r5 = r8.getPositiveButtonSecondaryView()
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            boolean r7 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L82
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            int r5 = r5.getMarginEnd()
            goto L83
        L82:
            r5 = r3
        L83:
            if (r5 != r1) goto L86
            goto L87
        L86:
            r2 = r3
        L87:
            android.view.ViewStub r5 = r8.V0
            boolean r5 = defpackage.dqi.q(r5)
            if (r5 == 0) goto Lad
            if (r2 != 0) goto Lad
            jtd r2 = r8.getPositiveButtonSecondaryView()
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            if (r5 == 0) goto La7
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            r5.setMarginStart(r4)
            r5.setMarginEnd(r1)
            r2.setLayoutParams(r5)
            goto Lad
        La7:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r6)
            throw r0
        Lad:
            boolean r0 = defpackage.dqi.q(r0)
            if (r0 == 0) goto Le0
            jtd r0 = r8.getPositiveButtonNeutralView()
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto Lc5
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r3 = r0.getMarginStart()
        Lc5:
            if (r3 == r4) goto Le0
            jtd r0 = r8.getPositiveButtonNeutralView()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto Lda
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r1.setMarginStart(r4)
            r0.setLayoutParams(r1)
            return
        Lda:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r6)
            throw r0
        Le0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs1.Z():void");
    }

    @Override // defpackage.jn1
    public final void a(boolean z) {
        if (z) {
            if (dqi.q(this.R0)) {
                TextView statusTextView = getStatusTextView();
                statusTextView.setTranslationY(0.0f);
                statusTextView.setAlpha(1.0f);
            }
            if (dqi.q(this.S0)) {
                TextView nameTextView = getNameTextView();
                nameTextView.setTranslationY(0.0f);
                nameTextView.setAlpha(1.0f);
            }
            if (dqi.q(this.w1)) {
                uxa avatarViewSmall = getAvatarViewSmall();
                avatarViewSmall.setTranslationY(0.0f);
                avatarViewSmall.setAlpha(1.0f);
            }
            uxa uxaVar = this.F0;
            uxaVar.setTranslationY(0.0f);
            uxaVar.setAlpha(1.0f);
            int i = dqi.q(this.T0) ? getRenderVideoView().x0 : false ? 0 : 255;
            int measuredHeight = getMeasuredHeight();
            int backgroundCenterY = getBackgroundCenterY();
            owe background = getBackground();
            if (background != null) {
                background.a(backgroundCenterY);
                background.setBounds(0, 0, getWidth(), measuredHeight);
                Y(i, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a0(defpackage.txg r8) {
        /*
            r7 = this;
            android.view.ViewStub r0 = r7.T0
            r1 = 0
            if (r8 == 0) goto L22
            boolean r2 = r8.g
            boolean r3 = r8.b
            r4 = 0
            if (r3 == 0) goto Lf
            if (r2 == 0) goto Lf
            goto L1a
        Lf:
            if (r2 == 0) goto L14
            vch r4 = r8.h
            goto L1a
        L14:
            boolean r2 = r8.c
            if (r2 == 0) goto L1a
            vch r4 = r8.d
        L1a:
            if (r4 == 0) goto L1f
            boolean r2 = r4.a
            goto L20
        L1f:
            r2 = r1
        L20:
            if (r2 != 0) goto L29
        L22:
            boolean r2 = defpackage.dqi.q(r0)
            if (r2 != 0) goto L29
            return
        L29:
            qt1 r2 = r7.getRenderVideoView()
            boolean r3 = defpackage.dqi.q(r0)
            if (r3 != 0) goto L65
            android.view.ViewParent r3 = r0.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r4 = r3.indexOfChild(r0)
            r3.removeViewInLayout(r0)
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.view.ViewGroup$LayoutParams r6 = r2.getLayoutParams()
            int r6 = r6.height
            r5.height = r6
            android.view.ViewGroup$LayoutParams r6 = r2.getLayoutParams()
            int r6 = r6.width
            r5.width = r6
            int r0 = r0.getId()
            r2.setId(r0)
            r3.addView(r2, r4, r5)
            qt1 r0 = r7.getRenderVideoView()
            defpackage.mfh.o(r0, r1)
        L65:
            qt1 r0 = r7.getRenderVideoView()
            int r2 = defpackage.qt1.y0
            r0.s0 = r8
            r0.t0 = r1
            qt1 r8 = r7.getRenderVideoView()
            r8.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs1.a0(txg):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    @Override // defpackage.hn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.o98 r9, boolean r10, long r11) {
        /*
            r8 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            if (r10 == 0) goto L7
            r4 = r1
            goto L8
        L7:
            r4 = r0
        L8:
            if (r10 == 0) goto Lc
            r5 = r0
            goto Ld
        Lc:
            r5 = r1
        Ld:
            android.view.ViewStub r0 = r8.X0
            boolean r0 = defpackage.dqi.q(r0)
            if (r0 == 0) goto L29
            mq1 r2 = r8.getSpeakerLabelView()
            boolean r0 = defpackage.hqi.k(r2, r10)
            if (r0 == 0) goto L29
            r3 = r10
            r6 = r11
            android.animation.ObjectAnimator r10 = defpackage.hqi.b(r2, r3, r4, r5, r6)
            r9.add(r10)
            goto L2b
        L29:
            r3 = r10
            r6 = r11
        L2b:
            android.view.ViewStub r10 = r8.S0
            boolean r10 = defpackage.dqi.q(r10)
            if (r10 == 0) goto L44
            android.widget.TextView r2 = r8.getNameTextView()
            boolean r10 = defpackage.hqi.k(r2, r3)
            if (r10 == 0) goto L44
            android.animation.ObjectAnimator r10 = defpackage.hqi.b(r2, r3, r4, r5, r6)
            r9.add(r10)
        L44:
            android.view.ViewStub r10 = r8.R0
            boolean r10 = defpackage.dqi.q(r10)
            if (r10 == 0) goto L5d
            android.widget.TextView r2 = r8.getStatusTextView()
            boolean r10 = defpackage.hqi.k(r2, r3)
            if (r10 == 0) goto L5d
            android.animation.ObjectAnimator r10 = defpackage.hqi.b(r2, r3, r4, r5, r6)
            r9.add(r10)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs1.f(o98, boolean, long):void");
    }

    @Override // defpackage.jn1
    public final void g(o98 o98Var, boolean z, long j) {
        if (dqi.q(this.R0)) {
            hqi.a(o98Var, getStatusTextView(), z);
        }
        if (dqi.q(this.S0)) {
            hqi.a(o98Var, getNameTextView(), z);
        }
        if (dqi.q(this.w1)) {
            hqi.a(o98Var, getAvatarViewSmall(), z);
        }
        float f = z ? 0.0f : 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        gg ggVar = new gg("background", f);
        if (dqi.q(this.T0) ? getRenderVideoView().x0 : false) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, ggVar, f, f2);
        objectAnimatorOfFloat.addUpdateListener(new sg(ggVar, this));
        o98Var.add(objectAnimatorOfFloat);
        hqi.a(o98Var, this.F0, z);
    }

    public final ss1 getBackgroundState() {
        yy7 yy7Var = z1[1];
        return (ss1) this.y1.b;
    }

    public final rs1 getMode() {
        yy7 yy7Var = z1[0];
        return (rs1) this.x1.b;
    }

    public final jtd getPositiveButton() {
        return getPositiveButtonSecondaryView();
    }

    @Override // defpackage.hn1
    public /* bridge */ /* synthetic */ boolean getShouldScaleMainOpponent() {
        return false;
    }

    @Override // defpackage.hn1
    public final void o(boolean z) {
        if (z) {
            if (dqi.q(this.X0)) {
                getSpeakerLabelView().setAlpha(1.0f);
            }
            if (dqi.q(this.S0)) {
                getNameTextView().setAlpha(1.0f);
            }
            if (dqi.q(this.R0)) {
                getStatusTextView().setAlpha(1.0f);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        owe background = getBackground();
        if (background != null) {
            background.onThemeChanged(a93.s0.B(this).c);
        }
        owe background2 = getBackground();
        if (background2 != null) {
            background2.start();
        }
        if (dqi.q(this.Q0) && fni.a(this.c1, Boolean.TRUE)) {
            getRaiseHandIcon().start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        owe background = getBackground();
        if (background != null) {
            background.stop();
        }
        if (dqi.q(this.Q0)) {
            getRaiseHandIcon().stop();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        owe background;
        super.onLayout(z, i, i2, i3, i4);
        if (z && (background = getBackground()) != null) {
            background.a(getBackgroundCenterY());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (getScreenInfo().g) {
            getAnimatedBackground().d = Math.min(i, i2) / 4;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.Z0.onTouchEvent(motionEvent);
    }

    public final void setBackgroundState(ss1 ss1Var) {
        this.y1.O(this, z1[1], ss1Var);
    }

    public final void setCameraPreviewButtonEnable(CharSequence charSequence) {
        boolean z = charSequence == null || charSequence.length() == 0;
        boolean z2 = !z;
        ViewStub viewStub = this.u1;
        if (!z || dqi.q(viewStub)) {
            dqi.p(viewStub, getEnableCameraPreviewButton(), null);
            hqi.g(getEnableCameraPreviewButton(), z2, 0L, null, 6);
            getEnableCameraPreviewButton().setText(charSequence);
        }
    }

    public final void setControlsMediator(a64 a64Var) {
        this.i1 = a64Var;
    }

    public final void setListener(ts1 ts1Var) {
        this.g1 = ts1Var;
    }

    public final void setMode(rs1 rs1Var) {
        this.x1.O(this, z1[0], rs1Var);
    }

    public final void setName(CharSequence charSequence) {
        ViewStub viewStub = this.S0;
        if ((dqi.q(viewStub) || charSequence != null) && !fni.a(this.d1, charSequence)) {
            dqi.p(viewStub, getNameTextView(), null);
            this.d1 = charSequence;
            if (charSequence != null && !vmf.F(charSequence)) {
                getNameTextView().setText(charSequence);
            }
            hqi.g(getNameTextView(), !(charSequence == null || vmf.F(charSequence)), 0L, new ls1(this, charSequence, 1), 2);
        }
    }

    public final void setParticipantId(zi1 zi1Var) {
        this.j1 = zi1Var;
    }

    public final void setRaiseHand(boolean z) {
        ViewStub viewStub = this.Q0;
        if (dqi.q(viewStub) || z) {
            this.c1 = Boolean.valueOf(z);
            ImageView raiseHandView = getRaiseHandView();
            if (!dqi.q(viewStub)) {
                ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
                int iIndexOfChild = viewGroup.indexOfChild(viewStub);
                viewGroup.removeViewInLayout(viewStub);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                layoutParams.height = raiseHandView.getLayoutParams().height;
                layoutParams.width = raiseHandView.getLayoutParams().width;
                raiseHandView.setId(viewStub.getId());
                viewGroup.addView(raiseHandView, iIndexOfChild, layoutParams);
                mfh.n(getRaiseHandView(), getMarginTop().b() + getRaiseHandTopPadding());
            }
            hqi.g(getRaiseHandView(), z, 50L, null, 4);
            h7d raiseHandIcon = getRaiseHandIcon();
            if (z) {
                raiseHandIcon.start();
            } else {
                raiseHandIcon.stop();
            }
        }
    }

    public final void setSmallAvatar(wd0 wd0Var) {
        boolean z = wd0Var != null;
        ViewStub viewStub = this.w1;
        if (z || dqi.q(viewStub)) {
            dqi.p(viewStub, getAvatarViewSmall(), null);
            if (z) {
                uxa.m(getAvatarViewSmall(), wd0Var != null ? wd0Var.b : null, wd0Var != null ? wd0Var.a : null);
            }
            hqi.h(getAvatarViewSmall(), z, new ia(this, 2, wd0Var), 2);
        }
    }

    public final void setStatus(CharSequence charSequence) {
        ViewStub viewStub = this.R0;
        if ((dqi.q(viewStub) || charSequence != null) && !fni.a(this.e1, charSequence)) {
            dqi.p(viewStub, getStatusTextView(), null);
            this.e1 = charSequence;
            if (charSequence != null && !vmf.F(charSequence)) {
                getStatusTextView().setText(charSequence);
            }
            hqi.g(getStatusTextView(), !(charSequence == null || vmf.F(charSequence)), 0L, new ls1(this, charSequence, 0), 2);
        }
    }

    public final void setVideoLayoutUpdatesControllerProvider(cm6 cm6Var) {
        this.h1 = cm6Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        owe background;
        return super.verifyDrawable(drawable) || ((background = getBackground()) != null && background.c(drawable));
    }

    @Override // android.view.View
    public owe getBackground() {
        Drawable background = super.getBackground();
        if (background instanceof owe) {
            return (owe) background;
        }
        return null;
    }
}
