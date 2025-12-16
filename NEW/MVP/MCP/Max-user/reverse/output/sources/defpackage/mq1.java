package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;

/* loaded from: classes.dex */
public final class mq1 extends ConstraintLayout implements z54, hn1, nq1 {
    public final Object F0;
    public final Object G0;
    public final AppCompatTextView H0;
    public final AppCompatImageView I0;
    public final AppCompatImageView J0;
    public lq1 K0;
    public Boolean L0;
    public Boolean M0;
    public Boolean N0;
    public CharSequence O0;
    public zi1 P0;
    public uxg Q0;
    public a64 R0;
    public oq1 S0;
    public i1c T0;

    public mq1(Context context, int i) {
        super(context, null);
        this.F0 = ipi.b(3, new jl1(9));
        this.G0 = ipi.b(3, new o40(context, 12));
        this.P0 = zi1.c;
        setLayoutParams(new kt3(-1, -2));
        float f = 32;
        setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), 0, kti.d(f * vw4.d().getDisplayMetrics().density), 0);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setId(eyc.call_video_rotation);
        appCompatImageView.setBackground(getBackgroundView());
        appCompatImageView.setImageResource(kwc.ic_rotation_view_16);
        float f2 = 5;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f2);
        appCompatImageView.setPadding(iD, iD, iD, iD);
        appCompatImageView.setVisibility(8);
        v1a v1aVar = a93.s0;
        appCompatImageView.setImageTintList(ColorStateList.valueOf(v1aVar.B(appCompatImageView).c.getIcon().f));
        this.I0 = appCompatImageView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, null);
        appCompatImageView2.setId(eyc.call_pin);
        appCompatImageView2.setImageResource(kwc.ic_pin_13);
        appCompatImageView2.setBackground(getBackgroundView());
        appCompatImageView2.setImageTintList(ColorStateList.valueOf(v1aVar.B(appCompatImageView2).c.getIcon().f));
        int iD2 = kti.d(f2 * vw4.d().getDisplayMetrics().density);
        appCompatImageView2.setPadding(iD2, iD2, iD2, iD2);
        appCompatImageView2.setVisibility(8);
        f8j.d(appCompatImageView2, 300L, new kq1(this, 0));
        this.J0 = appCompatImageView2;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(eyc.call_user_full_name);
        appCompatTextView.setMaxLines(1);
        dpg.l.b(appCompatTextView, t75.b);
        appCompatTextView.setTextColor(v1aVar.B(appCompatTextView).c.getText().e);
        appCompatTextView.setBackground(getBackgroundView());
        appCompatTextView.setGravity(17);
        float f3 = 8;
        float f4 = 7;
        appCompatTextView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f3 * vw4.d().getDisplayMetrics().density), kti.d(f4 * vw4.d().getDisplayMetrics().density));
        appCompatTextView.setVisibility(8);
        mfh.k(appCompatTextView, false);
        jgh.a(appCompatTextView);
        this.H0 = appCompatTextView;
        float f5 = 26;
        addView(appCompatImageView2, kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(vw4.d().getDisplayMetrics().density * f5));
        addView(appCompatImageView, kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(f5 * vw4.d().getDisplayMetrics().density));
        addView(appCompatTextView, -2, -2);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new es0(2, this));
        } else {
            x(this.O0);
        }
        ut3 ut3VarG = l5j.g(this);
        int id = appCompatImageView2.getId();
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 4, 0, 4);
        ut3VarG.d(id, 7, appCompatTextView.getId(), 6);
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.g(id).d.V = 2;
        int id2 = appCompatTextView.getId();
        ut3VarG.d(id2, 3, 0, 3);
        ut3VarG.d(id2, 4, 0, 4);
        ut3VarG.d(id2, 6, appCompatImageView2.getId(), 7);
        float f6 = 4;
        ut3VarG.g(id2).d.K = kti.d(vw4.d().getDisplayMetrics().density * f6);
        ut3VarG.d(id2, 7, appCompatImageView.getId(), 6);
        ut3VarG.g(id2).d.J = kti.d(f6 * vw4.d().getDisplayMetrics().density);
        ut3VarG.g(id2).d.l0 = true;
        int id3 = appCompatImageView.getId();
        ut3VarG.d(id3, 3, 0, 3);
        ut3VarG.d(id3, 4, 0, 4);
        ut3VarG.d(id3, 6, appCompatTextView.getId(), 7);
        ut3VarG.d(id3, 7, 0, 7);
        ut3VarG.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final float[] getBG_RADIUS() {
        return (float[]) this.F0.getValue();
    }

    private final Drawable getBackgroundView() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(getBG_RADIUS(), null, null));
        shapeDrawable.getPaint().setColor(Color.parseColor("#CC393A40"));
        return shapeDrawable;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final r1e getCallScreen() {
        return (r1e) this.G0.getValue();
    }

    @Override // defpackage.z54
    public final void E(y54 y54Var) {
        boolean z = y54Var.c;
        setTranslationY(z ? y54Var.b() * (z ? 1 : -1) : y54Var.b);
    }

    @Override // defpackage.z54
    public final List I(x54 x54Var, x54 x54Var2) {
        o98 o98VarD = ve3.d();
        o98VarD.add(dqi.o(this, (Math.abs(x54Var.d) - x54Var.f) * x54Var.c));
        if (fni.a(this.N0, Boolean.TRUE)) {
            o98VarD.add(dqi.i(this, x54Var2.a));
        }
        return ve3.a(o98VarD);
    }

    @Override // defpackage.hn1
    public final void f(o98 o98Var, boolean z, long j) {
        float f = z ? 0.0f : 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        if (hqi.k(this, z)) {
            o98Var.add(hqi.b(this, z, f, f2, j));
        }
    }

    @Override // defpackage.hn1
    public /* bridge */ /* synthetic */ boolean getShouldScaleMainOpponent() {
        return false;
    }

    @Override // defpackage.hn1
    public final void o(boolean z) {
        if (z) {
            setAlpha(1.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        oq1 oq1Var = this.S0;
        if (oq1Var != null) {
            ((pq1) oq1Var).a.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oq1 oq1Var = this.S0;
        if (oq1Var != null) {
            ((pq1) oq1Var).a.remove(this);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        x(this.O0);
    }

    @Override // defpackage.nq1
    public final void p() {
        w();
    }

    public final void setActive(boolean z) {
        if (fni.a(this.N0, Boolean.valueOf(z))) {
            return;
        }
        this.N0 = Boolean.valueOf(z);
        w();
    }

    public final void setCallSpeakerMediator(oq1 oq1Var) {
        this.S0 = oq1Var;
    }

    public final void setControlsMediator(a64 a64Var) {
        y54 y54Var;
        this.R0 = a64Var;
        if (a64Var == null || (y54Var = ((e64) a64Var).j) == null) {
            return;
        }
        E(y54Var);
    }

    public final void setLabel(CharSequence charSequence) {
        if (fni.a(this.O0, charSequence)) {
            return;
        }
        this.O0 = charSequence;
        x(charSequence);
    }

    public final void setListener(lq1 lq1Var) {
        this.K0 = lq1Var;
    }

    public final void setParticipantId(zi1 zi1Var) {
        this.P0 = zi1Var;
    }

    public final void setPipBoundariesController(i1c i1cVar) {
        this.T0 = i1cVar;
    }

    public final void v() {
        Boolean bool = this.M0;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        CharSequence string = this.O0;
        if (string == null) {
            string = "";
        }
        if (zBooleanValue) {
            string = getContext().getString(d3d.call_user_talking_accessibility);
        }
        this.H0.setContentDescription(string);
    }

    public final void w() {
        y54 y54Var;
        a64 a64Var = this.R0;
        hqi.g(this, (a64Var == null || (y54Var = ((e64) a64Var).j) == null || y54Var.c) ? fni.a(this.N0, Boolean.TRUE) : false, 0L, new k(26, this), 2);
    }

    public final void x(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = this.H0;
        ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
        int marginStart = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0;
        ViewGroup.LayoutParams layoutParams2 = appCompatTextView.getLayoutParams();
        CharSequence charSequenceA = mfh.a(charSequence, appCompatTextView, (getCallScreen().b - (kti.d(32 * vw4.d().getDisplayMetrics().density) * 2)) - ((kti.d(4 * vw4.d().getDisplayMetrics().density) * 2) + ((kti.d(26 * vw4.d().getDisplayMetrics().density) * 2) + (appCompatTextView.getPaddingStart() + (appCompatTextView.getPaddingEnd() + (marginStart + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0)))))));
        appCompatTextView.setText(charSequenceA);
        appCompatTextView.setVisibility(charSequenceA == null || vmf.F(charSequenceA) ? 8 : 0);
        v();
    }
}
