package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class jtd extends ConstraintLayout {
    public static final /* synthetic */ yy7[] U0 = {new z8a(jtd.class, "mode", "getMode()Lone/me/calls/ui/view/RoundButtonView$Companion$ButtonStyle;"), u45.h(vid.a, jtd.class, "shape", "getShape()Lone/me/calls/ui/view/RoundButtonView$Companion$ButtonShape;"), new z8a(jtd.class, "imageSize", "getImageSize()Lone/me/calls/ui/view/RoundButtonView$Companion$IconSize;")};
    public final Object F0;
    public final Object G0;
    public final Object H0;
    public final Object I0;
    public final Object J0;
    public gtd K0;
    public boolean L0;
    public final Handler M0;
    public final r98 N0;
    public final Object O0;
    public final Object P0;
    public final Object Q0;
    public final itd R0;
    public final itd S0;
    public final itd T0;

    public jtd(Context context, int i) {
        super(context, null);
        this.F0 = ipi.b(3, new p1b(context, 23));
        this.G0 = ipi.b(3, new p1b(context, 24));
        this.H0 = ipi.b(3, new p1b(context, 25));
        this.I0 = ipi.b(3, new l3b(context, 22, this));
        this.J0 = ipi.b(3, new p1b(context, 26));
        this.M0 = new Handler(Looper.getMainLooper());
        this.N0 = new r98(18, this);
        this.O0 = ipi.b(3, new efd(3));
        this.P0 = ipi.b(3, new prd(5, this));
        this.Q0 = ipi.b(3, new efd(4));
        this.R0 = new itd(this, 0);
        this.S0 = new itd(this, 1);
        float f = 52;
        this.T0 = new itd(new ftd(ctd.e(f), ctd.e(f)), this);
        addView(getIconView(), ctd.e(f), kti.d(vw4.c() * f));
        addView(getStubCounterView());
        addView(getStubTitleView());
        f8j.d(this, 300L, new pcc(6, this));
        F();
        ut3 ut3VarG = l5j.g(this);
        int id = getIconView().getId();
        ut3VarG.d(id, 3, 0, 3);
        float f2 = 4;
        ut3VarG.g(id).d.H = ctd.e(f2);
        ut3VarG.d(id, 7, 0, 7);
        ut3VarG.g(id).d.J = kti.d(vw4.c() * f2);
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.g(id).d.K = kti.d(vw4.c() * f2);
        ut3VarG.d(id, 4, getStubTitleView().getId(), 3);
        ut3VarG.g(id).d.I = kti.d(vw4.c() * f2);
        int id2 = getStubCounterView().getId();
        ut3VarG.d(id2, 3, 0, 3);
        ut3VarG.d(id2, 7, 0, 7);
        int id3 = getStubTitleView().getId();
        ut3VarG.d(id3, 3, getIconView().getId(), 4);
        ut3VarG.g(id3).d.H = ctd.e(8);
        ut3VarG.d(id3, 6, 0, 6);
        ut3VarG.d(id3, 7, 0, 7);
        ut3VarG.a(this);
    }

    public static void B(jtd jtdVar, int i) {
        jtdVar.z(i, a93.s0.B(jtdVar).c.getIcon().f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Animatable getAnimationDrawable() {
        Object drawable = getIconView().getDrawable();
        if (drawable instanceof Animatable) {
            return (Animatable) drawable;
        }
        return null;
    }

    private final int getContrastColor() {
        return -868664768;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final w2b getCounterView() {
        return (w2b) this.I0.getValue();
    }

    private final ShapeDrawable getCurrentShape() {
        int i = htd.$EnumSwitchMapping$0[getShape().ordinal()];
        if (i == 1) {
            return getShapeOvalDrawable();
        }
        if (i == 2) {
            return getShapeRectDrawable();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final float[] getIconBgRadius() {
        return (float[]) this.O0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final ImageView getIconView() {
        return (ImageView) this.H0.getValue();
    }

    private final int getInactiveColor() {
        return a93.s0.B(this).c.c().b.a.g;
    }

    private final int getNegativeColor() {
        return a93.s0.B(this).c.b().a.f;
    }

    private final int getNeutralColor() {
        return a93.s0.B(this).c.b().a.h;
    }

    private final int getPositiveColor() {
        return a93.s0.B(this).c.b().a.m;
    }

    private final int getSelectedColor() {
        return a93.s0.B(this).c.c().a.a.d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final ShapeDrawable getShapeOvalDrawable() {
        return (ShapeDrawable) this.Q0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final ShapeDrawable getShapeRectDrawable() {
        return (ShapeDrawable) this.P0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final ViewStub getStubCounterView() {
        return (ViewStub) this.F0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final ViewStub getStubTitleView() {
        return (ViewStub) this.G0.getValue();
    }

    private final int getThemedColor() {
        return a93.s0.B(this).c.b().a.n;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final TextView getTitleView() {
        return (TextView) this.J0.getValue();
    }

    public static ShapeDrawable v(jtd jtdVar) {
        return new ShapeDrawable(new RoundRectShape(jtdVar.getIconBgRadius(), null, null));
    }

    public final void A(Drawable drawable, int i) {
        getIconView().setImageDrawable(drawable);
        getIconView().setImageTintList(ColorStateList.valueOf(i));
        C();
    }

    public final void C() {
        if (this.L0 || getAnimationDrawable() == null) {
            return;
        }
        this.L0 = true;
        this.M0.post(this.N0);
    }

    public final void D() {
        if (!this.L0 || getAnimationDrawable() == null) {
            return;
        }
        this.L0 = false;
        this.M0.removeCallbacks(this.N0);
        Animatable animationDrawable = getAnimationDrawable();
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
    }

    public final void F() {
        Integer numValueOf;
        RippleDrawable rippleDrawable;
        v1a v1aVar = a93.s0;
        switch (getMode().ordinal()) {
            case 0:
                numValueOf = Integer.valueOf(getNeutralColor());
                break;
            case 1:
                numValueOf = Integer.valueOf(getPositiveColor());
                break;
            case 2:
                numValueOf = Integer.valueOf(getNegativeColor());
                break;
            case 3:
                numValueOf = Integer.valueOf(getSelectedColor());
                break;
            case 4:
                numValueOf = Integer.valueOf(getContrastColor());
                break;
            case 5:
                numValueOf = Integer.valueOf(getInactiveColor());
                break;
            case 6:
                numValueOf = Integer.valueOf(getThemedColor());
                break;
            case 7:
                numValueOf = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        ImageView iconView = getIconView();
        if (numValueOf != null) {
            int i = v1aVar.B(this).c.c().a.a.d;
            ShapeDrawable currentShape = getCurrentShape();
            currentShape.getPaint().setColor(numValueOf.intValue());
            rippleDrawable = new RippleDrawable(ColorStateList.valueOf(i), currentShape, null);
        } else {
            int i2 = v1aVar.y(this).c().a.a.i;
            ShapeDrawable currentShape2 = getCurrentShape();
            currentShape2.getPaint().setColor(-1);
            rippleDrawable = new RippleDrawable(ColorStateList.valueOf(i2), null, currentShape2);
        }
        iconView.setBackground(rippleDrawable);
    }

    public final Drawable getIconDrawable() {
        return getIconView().getDrawable();
    }

    public final ftd getImageSize() {
        yy7 yy7Var = U0[2];
        return (ftd) this.T0.b;
    }

    public final etd getMode() {
        yy7 yy7Var = U0[0];
        return (etd) this.R0.b;
    }

    public final dtd getShape() {
        yy7 yy7Var = U0[1];
        return (dtd) this.S0.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        D();
    }

    public final void setAccessibility(s5g s5gVar) {
        getIconView().setContentDescription(s5gVar != null ? s5gVar.b(getContext()) : null);
    }

    public final void setButtonPadding(int i) {
        ImageView iconView = getIconView();
        int iD = kti.d(vw4.c() * i);
        iconView.setPadding(iD, iD, iD, iD);
    }

    public final void setCounter(int i) {
        if (dqi.q(getStubCounterView()) || i != 0) {
            dqi.p(getStubCounterView(), getCounterView(), null);
            getCounterView().g(i, false);
            getCounterView().setVisibility(i == 0 ? 8 : 0);
        }
    }

    public final void setIcon(Drawable drawable) {
        getIconView().setImageDrawable(drawable);
        C();
    }

    public final void setIconTint(int i) {
        getIconView().setImageTintList(ColorStateList.valueOf(i));
    }

    public final void setImageSize(ftd ftdVar) {
        this.T0.O(this, U0[2], ftdVar);
    }

    public final void setListener(gtd gtdVar) {
        this.K0 = gtdVar;
    }

    public final void setMode(etd etdVar) {
        this.R0.O(this, U0[0], etdVar);
    }

    public final void setShape(dtd dtdVar) {
        this.S0.O(this, U0[1], dtdVar);
    }

    public final void setTextColor(int i) {
        getCounterView().setTextColor(i);
    }

    public final void setTitle(s5g s5gVar) {
        if (dqi.q(getStubTitleView()) || s5gVar != null) {
            dqi.p(getStubTitleView(), getTitleView(), null);
            getTitleView().setText(s5gVar != null ? s5gVar.b(getContext()) : null);
            getTitleView().setVisibility(s5gVar != null ? 0 : 8);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            C();
        } else {
            D();
        }
    }

    public final void z(int i, int i2) {
        getIconView().setImageResource(i);
        getIconView().setImageTintList(ColorStateList.valueOf(i2));
    }

    public final void setAccessibility(Integer num) {
        String string;
        ImageView iconView = getIconView();
        if (num != null) {
            string = getContext().getString(num.intValue());
        } else {
            string = null;
        }
        iconView.setContentDescription(string);
    }

    public final void setAccessibility(String str) {
        getIconView().setContentDescription(str);
    }
}
