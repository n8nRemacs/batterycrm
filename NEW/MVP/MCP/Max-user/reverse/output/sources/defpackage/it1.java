package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class it1 extends ConstraintLayout implements u6g, nq1 {
    public static final /* synthetic */ yy7[] l1 = {new z8a(it1.class, "mode", "getMode()Lone/me/calls/ui/view/CallUserView$Mode;"), u45.h(vid.a, it1.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;")};
    public final Object F0;
    public final Object G0;
    public final Object H0;
    public final Object I0;
    public final Object J0;
    public final GestureDetector K0;
    public final uxa L0;
    public final TextView M0;
    public final jtd N0;
    public cm6 O0;
    public cm6 P0;
    public final Object Q0;
    public final Object R0;
    public final Object S0;
    public final Object T0;
    public final ViewStub U0;
    public final ViewStub V0;
    public final ViewStub W0;
    public final ViewStub X0;
    public final FrameLayout Y0;
    public final bwf Z0;
    public final Object a1;
    public ft1 b1;
    public Boolean c1;
    public Boolean d1;
    public Boolean e1;
    public CharSequence f1;
    public uxg g1;
    public zi1 h1;
    public txg i1;
    public final ht1 j1;
    public final ht1 k1;

    public it1(final Context context, int i) {
        super(context, null);
        this.F0 = ipi.b(3, new jl1(13));
        final int i2 = 0;
        this.G0 = ipi.b(3, new cm6() { // from class: et1
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return it1.x(context, this);
                    case 1:
                        return it1.z(context, this);
                    case 2:
                        return it1.A(context, this);
                    default:
                        qt1 qt1Var = new qt1(context);
                        qt1Var.setLayoutParams(new kt3(-1, -1));
                        mfh.o(qt1Var, false);
                        it1 it1Var = this;
                        qt1Var.setListener(new xtd(18, it1Var));
                        qt1Var.setVideoLayoutUpdatesControllerProvider(new ct1(it1Var, 1));
                        return qt1Var;
                }
            }
        });
        this.H0 = ipi.b(3, new o40(context, 25));
        this.I0 = ipi.b(3, new o40(context, 26));
        this.J0 = ipi.b(3, new o40(context, 27));
        final int i3 = 1;
        this.Q0 = ipi.b(3, new cm6() { // from class: et1
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return it1.x(context, this);
                    case 1:
                        return it1.z(context, this);
                    case 2:
                        return it1.A(context, this);
                    default:
                        qt1 qt1Var = new qt1(context);
                        qt1Var.setLayoutParams(new kt3(-1, -1));
                        mfh.o(qt1Var, false);
                        it1 it1Var = this;
                        qt1Var.setListener(new xtd(18, it1Var));
                        qt1Var.setVideoLayoutUpdatesControllerProvider(new ct1(it1Var, 1));
                        return qt1Var;
                }
            }
        });
        final int i4 = 2;
        this.R0 = ipi.b(3, new cm6() { // from class: et1
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return it1.x(context, this);
                    case 1:
                        return it1.z(context, this);
                    case 2:
                        return it1.A(context, this);
                    default:
                        qt1 qt1Var = new qt1(context);
                        qt1Var.setLayoutParams(new kt3(-1, -1));
                        mfh.o(qt1Var, false);
                        it1 it1Var = this;
                        qt1Var.setListener(new xtd(18, it1Var));
                        qt1Var.setVideoLayoutUpdatesControllerProvider(new ct1(it1Var, 1));
                        return qt1Var;
                }
            }
        });
        final int i5 = 3;
        this.S0 = ipi.b(3, new cm6() { // from class: et1
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return it1.x(context, this);
                    case 1:
                        return it1.z(context, this);
                    case 2:
                        return it1.A(context, this);
                    default:
                        qt1 qt1Var = new qt1(context);
                        qt1Var.setLayoutParams(new kt3(-1, -1));
                        mfh.o(qt1Var, false);
                        it1 it1Var = this;
                        qt1Var.setListener(new xtd(18, it1Var));
                        qt1Var.setVideoLayoutUpdatesControllerProvider(new ct1(it1Var, 1));
                        return qt1Var;
                }
            }
        });
        this.T0 = ipi.b(3, new o40(context, 28));
        this.Z0 = new bwf(new ct1(this, 0));
        this.a1 = ipi.b(3, new ct1(this, 2));
        this.h1 = zi1.c;
        this.j1 = new ht1(this, 0);
        this.k1 = new ht1(this, 1);
        setLayoutParams(new kt3(-1, -1));
        setElevation(vw4.d().getDisplayMetrics().density * 2.0f);
        mfh.j(this, vw4.d().getDisplayMetrics().density * 20.0f);
        setBackgroundColor(getBackgroundColor());
        this.K0 = new GestureDetector(context, new kx0(3, this));
        uxa uxaVar = new uxa(context);
        uxaVar.setId(j0b.K1);
        uxaVar.setAvatarShape(kxa.a);
        this.L0 = uxaVar;
        TextView textView = new TextView(context);
        textView.setId(j0b.I1);
        textView.setMaxLines(1);
        textView.setTextColor(a93.s0.B(textView).c.getText().e);
        dpg.l.b(textView, t75.b);
        int iD = kti.d(6 * vw4.d().getDisplayMetrics().density);
        textView.setPadding(iD, iD, iD, iD);
        jgh.a(textView);
        mfh.k(textView, false);
        this.M0 = textView;
        jtd jtdVar = new jtd(context, 0);
        jtdVar.setId(j0b.m0);
        jtdVar.setMode(etd.a);
        jtdVar.setVisibility(8);
        jtdVar.setImageSize(new ftd(getActionButtonSize(), getActionButtonSize()));
        this.N0 = jtdVar;
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(j0b.w0);
        this.V0 = viewStub;
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(j0b.u0);
        this.W0 = viewStub2;
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(j0b.y0);
        this.U0 = viewStub3;
        ViewStub viewStub4 = new ViewStub(context);
        viewStub4.setId(j0b.k0);
        this.X0 = viewStub4;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(j0b.s0);
        frameLayout.addView(textView, -2, -2);
        this.Y0 = frameLayout;
        addView(uxaVar, getAvatarSize(), getAvatarSize());
        addView(viewStub);
        addView(viewStub2);
        addView(viewStub4);
        addView(frameLayout, 0, -2);
        addView(jtdVar);
        addView(viewStub3);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new es0(3, this));
        } else {
            J(this.f1);
        }
        ut3 ut3VarG = l5j.g(this);
        int id = uxaVar.getId();
        ut3VarG.d(id, 4, 0, 4);
        ut3VarG.g(id).d.I = kti.d(5 * vw4.d().getDisplayMetrics().density);
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 7, 0, 7);
        int id2 = viewStub.getId();
        ut3VarG.d(id2, 4, 0, 4);
        ut3VarG.d(id2, 3, 0, 3);
        ut3VarG.d(id2, 6, 0, 6);
        ut3VarG.d(id2, 7, 0, 7);
        int id3 = viewStub4.getId();
        ut3VarG.d(id3, 4, 0, 4);
        ut3VarG.d(id3, 3, 0, 3);
        ut3VarG.d(id3, 6, 0, 6);
        ut3VarG.d(id3, 7, 0, 7);
        int id4 = viewStub2.getId();
        ut3VarG.d(id4, 4, 0, 4);
        ut3VarG.d(id4, 3, 0, 3);
        ut3VarG.d(id4, 6, 0, 6);
        ut3VarG.d(id4, 7, 0, 7);
        int id5 = frameLayout.getId();
        ut3VarG.d(id5, 6, 0, 6);
        float f = 8;
        ut3VarG.g(id5).d.K = kti.d(vw4.d().getDisplayMetrics().density * f);
        ut3VarG.d(id5, 4, 0, 4);
        ut3VarG.g(id5).d.I = getNameVerticalMargin();
        ut3VarG.d(id5, 7, 0, 7);
        ut3VarG.g(id5).d.J = kti.d(f * vw4.d().getDisplayMetrics().density);
        int id6 = jtdVar.getId();
        ut3VarG.d(id6, 3, 0, 3);
        ut3VarG.g(id6).d.H = getActionButtonPadding();
        ut3VarG.d(id6, 7, 0, 7);
        ut3VarG.g(id6).d.J = getActionButtonPadding();
        int id7 = viewStub3.getId();
        ut3VarG.d(id7, 3, 0, 3);
        ut3VarG.g(id7).d.H = getActionButtonPadding();
        ut3VarG.d(id7, 6, 0, 6);
        ut3VarG.g(id7).d.K = getActionButtonPadding();
        ut3VarG.a(this);
    }

    public static View A(Context context, it1 it1Var) {
        View view = new View(context);
        view.setId(j0b.k0);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setBackground(it1Var.getLoadingDrawable());
        view.setVisibility(8);
        return view;
    }

    public static ShapeDrawable B(it1 it1Var) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(it1Var.getMainRoundRectShape());
        shapeDrawable.getPaint().setColor(a93.s0.B(it1Var).c.b().f);
        shapeDrawable.getPaint().setAntiAlias(true);
        return shapeDrawable;
    }

    public static final void C(it1 it1Var) {
        jtd jtdVar = it1Var.N0;
        uxa uxaVar = it1Var.L0;
        ViewGroup.LayoutParams layoutParams = uxaVar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = it1Var.getAvatarSize();
        layoutParams.width = it1Var.getAvatarSize();
        uxaVar.setLayoutParams(layoutParams);
        FrameLayout frameLayout = it1Var.Y0;
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.bottomMargin = it1Var.getNameVerticalMargin();
        frameLayout.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams3 = jtdVar.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams2.topMargin = it1Var.getActionButtonPadding();
        marginLayoutParams2.setMarginEnd(it1Var.getActionButtonPadding());
        jtdVar.setLayoutParams(marginLayoutParams2);
        jtdVar.setImageSize(new ftd(it1Var.getActionButtonSize(), it1Var.getActionButtonSize()));
        it1Var.getRaiseHandIcon().setBounds(0, 0, it1Var.getActionButtonSize(), it1Var.getActionButtonSize());
        if (dqi.q(it1Var.U0)) {
            ImageView raiseHandView = it1Var.getRaiseHandView();
            ViewGroup.LayoutParams layoutParams4 = raiseHandView.getLayoutParams();
            if (layoutParams4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
            marginLayoutParams3.width = it1Var.getRaiseHandButton();
            marginLayoutParams3.height = it1Var.getRaiseHandButton();
            raiseHandView.setLayoutParams(marginLayoutParams3);
        }
    }

    private final int getActionButtonPadding() {
        int iOrdinal = getMode().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2) {
                return kti.d(4 * vw4.d().getDisplayMetrics().density);
            }
            if (iOrdinal == 3) {
                return kti.d(6 * vw4.d().getDisplayMetrics().density);
            }
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return kti.d(6 * vw4.d().getDisplayMetrics().density);
    }

    private final int getActionButtonSize() {
        int iOrdinal = getMode().ordinal();
        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
            if (iOrdinal == 3) {
                return kti.d(40 * vw4.d().getDisplayMetrics().density);
            }
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return kti.d(26 * vw4.d().getDisplayMetrics().density);
    }

    private final int getAvatarSize() {
        int iOrdinal = getMode().ordinal();
        if (iOrdinal == 0) {
            return kti.d(72 * vw4.d().getDisplayMetrics().density);
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return kti.d(40 * vw4.d().getDisplayMetrics().density);
        }
        if (iOrdinal != 3 && iOrdinal != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return kti.d(216 * vw4.d().getDisplayMetrics().density);
    }

    private final int getBackgroundColor() {
        return getCurrentTheme().b().m;
    }

    private final ShapeDrawable getBackgroundItemView() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(getItemRoundRectShape());
        shapeDrawable.getPaint().setColor(Color.parseColor("#CC393A40"));
        return shapeDrawable;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final i41 getCameraPreviewView() {
        return (i41) this.T0.getValue();
    }

    private final yeb getCurrentTheme() {
        yeb customTheme = getCustomTheme();
        return customTheme == null ? a93.s0.y(this) : customTheme;
    }

    private final RoundRectShape getItemRoundRectShape() {
        return new RoundRectShape(getMAIN_BG_RADIUS(), null, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final ShapeDrawable getLoadingDrawable() {
        return (ShapeDrawable) this.a1.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final View getLoadingView() {
        return (View) this.R0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final float[] getMAIN_BG_RADIUS() {
        return (float[]) this.F0.getValue();
    }

    private final RoundRectShape getMainRoundRectShape() {
        return new RoundRectShape(getMAIN_BG_RADIUS(), null, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final Drawable getMoreIcon() {
        return (Drawable) this.J0.getValue();
    }

    private final int getNameVerticalMargin() {
        int iOrdinal = getMode().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2) {
                return kti.d(4 * vw4.d().getDisplayMetrics().density);
            }
            if (iOrdinal == 3) {
                return kti.d(6 * vw4.d().getDisplayMetrics().density);
            }
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return kti.d(6 * vw4.d().getDisplayMetrics().density);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final Drawable getPinnedIcon() {
        return (Drawable) this.H0.getValue();
    }

    private final int getRaiseHandButton() {
        int iOrdinal = getMode().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2) {
                return kti.d(26 * vw4.d().getDisplayMetrics().density);
            }
            if (iOrdinal != 3 && iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return kti.d(40 * vw4.d().getDisplayMetrics().density);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final h7d getRaiseHandIcon() {
        return (h7d) this.G0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final ImageView getRaiseHandView() {
        return (ImageView) this.Q0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final qt1 getRender() {
        return (qt1) this.S0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final Drawable getRotateIcon() {
        return (Drawable) this.I0.getValue();
    }

    private final ShapeDrawable getTalkingDrawable() {
        return (ShapeDrawable) this.Z0.getValue();
    }

    public static void v(it1 it1Var, boolean z) {
        mfh.o(it1Var.getRender(), z);
        uxa uxaVar = it1Var.L0;
        if ((uxaVar.getVisibility() == 0) != (!z)) {
            uxaVar.setVisibility(z ? 8 : 0);
        }
        TextView textView = it1Var.M0;
        ShapeDrawable backgroundItemView = it1Var.getBackgroundItemView();
        if (!z) {
            backgroundItemView = null;
        }
        textView.setBackground(backgroundItemView);
    }

    public static ShapeDrawable w(it1 it1Var) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(it1Var.getMainRoundRectShape());
        shapeDrawable.getPaint().setColor(a93.s0.B(it1Var).c.b().a.m);
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable.getPaint().setStrokeWidth(vw4.d().getDisplayMetrics().density * 4.0f);
        shapeDrawable.getPaint().setAntiAlias(true);
        return shapeDrawable;
    }

    public static h7d x(Context context, it1 it1Var) {
        h7d h7dVar = new h7d(context);
        vf vfVar = h7dVar.a;
        if (vfVar != null) {
            vfVar.setCallback(h7dVar);
        }
        h7dVar.setBounds(0, 0, it1Var.getActionButtonSize(), it1Var.getActionButtonSize());
        return h7dVar;
    }

    public static ImageView z(Context context, it1 it1Var) {
        ImageView imageView = new ImageView(context);
        imageView.setId(j0b.y0);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(it1Var.getRaiseHandButton(), it1Var.getRaiseHandButton()));
        imageView.setImageDrawable(it1Var.getRaiseHandIcon());
        f8j.d(imageView, 300L, new dt1(it1Var, 2));
        return imageView;
    }

    public final void D(boolean z) {
        ViewStub viewStub = this.X0;
        if ((dqi.q(viewStub) || z) && !fni.a(this.d1, Boolean.valueOf(z))) {
            dqi.p(viewStub, getLoadingView(), null);
            this.d1 = Boolean.valueOf(z);
            getLoadingView().setVisibility(z ? 0 : 8);
        }
    }

    public final void F(boolean z) {
        if (fni.a(this.c1, Boolean.valueOf(z))) {
            return;
        }
        this.c1 = Boolean.valueOf(z);
        ShapeDrawable talkingDrawable = getTalkingDrawable();
        if (!z) {
            talkingDrawable = null;
        }
        setForeground(talkingDrawable);
    }

    public final void G(boolean z, boolean z2) {
        dqi.p(this.W0, getCameraPreviewView(), null);
        getCameraPreviewView().setVisibility(z ? 0 : 8);
        i41 cameraPreviewView = getCameraPreviewView();
        if (cameraPreviewView.b == z && cameraPreviewView.c == z2) {
            return;
        }
        cameraPreviewView.b = z;
        cameraPreviewView.c = z2;
        cameraPreviewView.a(z, z2);
    }

    public final void H(String str, CharSequence charSequence) {
        if (fni.a(this.f1, charSequence)) {
            return;
        }
        this.f1 = charSequence;
        J(charSequence);
        this.M0.setContentDescription(str);
    }

    public final void J(CharSequence charSequence) {
        TextView textView = this.M0;
        View view = (View) textView.getParent();
        int measuredWidth = view.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int marginEnd = measuredWidth - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd() : 0);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        CharSequence charSequenceA = mfh.a(charSequence, textView, ((marginEnd - (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart() : 0)) - textView.getPaddingEnd()) - textView.getPaddingRight());
        textView.setText(charSequenceA);
        textView.setVisibility(charSequenceA == null || vmf.F(charSequenceA) ? 8 : 0);
    }

    public final yeb getCustomTheme() {
        yy7 yy7Var = l1[1];
        return (yeb) this.k1.b;
    }

    public final gt1 getMode() {
        yy7 yy7Var = l1[0];
        return (gt1) this.j1.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        oq1 oq1Var;
        super.onAttachedToWindow();
        cm6 cm6Var = this.O0;
        if (cm6Var != null && (oq1Var = (oq1) cm6Var.invoke()) != null) {
            ((pq1) oq1Var).a.add(this);
        }
        if (dqi.q(this.U0) && fni.a(this.e1, Boolean.TRUE)) {
            getRaiseHandIcon().start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        oq1 oq1Var;
        super.onDetachedFromWindow();
        cm6 cm6Var = this.O0;
        if (cm6Var != null && (oq1Var = (oq1) cm6Var.invoke()) != null) {
            ((pq1) oq1Var).a.remove(this);
        }
        if (dqi.q(this.U0)) {
            getRaiseHandIcon().stop();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        J(this.f1);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        setBackgroundColor(getBackgroundColor());
        ShapeDrawable backgroundItemView = getBackgroundItemView();
        if (getRender().getVisibility() != 0) {
            backgroundItemView = null;
        }
        this.M0.setBackground(backgroundItemView);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.K0.onTouchEvent(motionEvent);
    }

    @Override // defpackage.nq1
    public final void p() {
        setOpponentVideo(this.i1);
    }

    public final void setAvatar(wd0 wd0Var) {
        uxa.m(this.L0, wd0Var != null ? wd0Var.b : null, wd0Var != null ? wd0Var.a : null);
    }

    public final void setBackgroundCorners(float f) {
        mfh.j(this, f);
    }

    public final void setButtonAction(uxg uxgVar) {
        v1a v1aVar = a93.s0;
        if (this.g1 == uxgVar) {
            return;
        }
        this.g1 = uxgVar;
        int iOrdinal = uxgVar.ordinal();
        etd etdVar = etd.Z;
        jtd jtdVar = this.N0;
        if (iOrdinal == 0) {
            jtdVar.setVisibility(0);
            jtdVar.A(getMoreIcon(), v1aVar.B(jtdVar).c.getIcon().f);
            jtdVar.setMode(etdVar);
            jtdVar.setContentDescription(jtdVar.getContext().getString(d3d.call_user_item_more));
            f8j.d(jtdVar, 300L, new ub(this, 10, jtdVar));
            jtdVar.setButtonPadding(kti.d(1 * vw4.d().getDisplayMetrics().density));
            return;
        }
        if (iOrdinal == 1) {
            jtdVar.setVisibility(0);
            jtdVar.A(getRotateIcon(), v1aVar.B(jtdVar).c.getIcon().f);
            jtdVar.setMode(etd.o);
            jtdVar.setContentDescription(jtdVar.getContext().getString(m0b.o2));
            f8j.d(jtdVar, 300L, new dt1(this, 1));
            jtdVar.setButtonPadding(kti.d(2 * vw4.d().getDisplayMetrics().density));
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            jtdVar.setVisibility(8);
            jtdVar.setContentDescription(null);
            jtdVar.setMode(etdVar);
            return;
        }
        jtdVar.setVisibility(0);
        jtdVar.A(getPinnedIcon(), v1aVar.B(jtdVar).c.getIcon().f);
        jtdVar.setMode(etdVar);
        jtdVar.setContentDescription(jtdVar.getContext().getString(d3d.call_user_info_pinned));
        f8j.d(jtdVar, 300L, new dt1(this, 0));
        jtdVar.setButtonPadding(kti.d(1 * vw4.d().getDisplayMetrics().density));
    }

    public final void setCallSpeakerMediator(cm6 cm6Var) {
        this.O0 = cm6Var;
    }

    public final void setCustomTheme(yeb yebVar) {
        this.k1.O(this, l1[1], yebVar);
    }

    public final void setMode(gt1 gt1Var) {
        this.j1.O(this, l1[0], gt1Var);
    }

    public final void setOpponentVideo(txg txgVar) {
        oq1 oq1Var;
        txg txgVar2;
        ViewStub viewStub = this.V0;
        if (txgVar != null || dqi.q(viewStub)) {
            qt1 render = getRender();
            boolean z = false;
            if (!dqi.q(viewStub)) {
                ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
                int iIndexOfChild = viewGroup.indexOfChild(viewStub);
                viewGroup.removeViewInLayout(viewStub);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                layoutParams.height = render.getLayoutParams().height;
                layoutParams.width = render.getLayoutParams().width;
                render.setId(viewStub.getId());
                viewGroup.addView(render, iIndexOfChild, layoutParams);
                mfh.o(getRender(), false);
            }
            cm6 cm6Var = this.O0;
            if (cm6Var != null && (oq1Var = (oq1) cm6Var.invoke()) != null && (txgVar2 = ((pq1) oq1Var).b) != null && txgVar2.g && txgVar != null && txgVar2.a == txgVar.a) {
                z = true;
            }
            qt1 render2 = getRender();
            render2.s0 = txgVar;
            render2.t0 = z;
            getRender().e();
            this.i1 = txgVar;
        }
    }

    public final void setRaiseHand(boolean z) {
        ViewStub viewStub = this.U0;
        if (dqi.q(viewStub) || z) {
            this.e1 = Boolean.valueOf(z);
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
                getRaiseHandIcon().setBounds(0, 0, getRaiseHandButton(), getRaiseHandButton());
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

    public final void setVideoLayoutUpdatesControllerProvider(cm6 cm6Var) {
        this.P0 = cm6Var;
    }
}
