package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class ur1 extends ConstraintLayout {
    public static final /* synthetic */ int R0 = 0;
    public tr1 F0;
    public final Object G0;
    public ncg H0;
    public AnimatorSet I0;
    public jcg J0;
    public final TextView K0;
    public final TextView L0;
    public final jtd M0;
    public final jtd N0;
    public final ViewStub O0;
    public final Object P0;
    public Boolean Q0;

    public ur1(Context context) {
        super(context, null);
        this.G0 = ipi.b(3, new o40(context, 15));
        jtd jtdVar = new jtd(context, 0);
        jtdVar.setId(eyc.call_collapsing);
        jtd.B(jtdVar, kwc.ic_chevron_down_24);
        jtdVar.setAccessibility(Integer.valueOf(d3d.call_collapsing_accessibility));
        etd etdVar = etd.a;
        jtdVar.setMode(etdVar);
        jtdVar.setListener(new qr1(this, 0));
        float f = 40;
        jtdVar.setImageSize(new ftd(ctd.e(f), ctd.e(f)));
        jtdVar.setLayoutParams(new kt3(-2, -2));
        float f2 = 3;
        jtdVar.setButtonPadding(kti.d(vw4.c() * f2));
        TextView textView = new TextView(context);
        textView.setId(eyc.call_name);
        textView.setGravity(8388611);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        dpg.f.b(textView, t75.b);
        v1a v1aVar = a93.s0;
        textView.setTextColor(v1aVar.B(textView).c.getText().e);
        mfh.k(textView, false);
        textView.setVisibility(8);
        this.K0 = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(eyc.call_status);
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(1);
        textView2.setGravity(8388611);
        dpg.l.b(textView2, t75.b);
        textView2.setTextColor(v1aVar.B(textView2).c.getText().h);
        mfh.k(textView2, false);
        textView2.setVisibility(8);
        this.L0 = textView2;
        jtd jtdVar2 = new jtd(context, 0);
        jtdVar2.setId(j0b.m0);
        jtdVar2.setMode(etdVar);
        jtd.B(jtdVar2, i0b.h0);
        jtdVar2.setAccessibility(Integer.valueOf(m0b.z0));
        jtdVar2.setListener(new qr1(this, jtdVar2));
        jtdVar2.setButtonPadding(kti.d(vw4.c() * f2));
        jtdVar2.setImageSize(new ftd(ctd.e(f), ctd.e(f)));
        jtdVar2.setLayoutParams(new kt3(-2, -2));
        jtdVar2.setVisibility(8);
        this.M0 = jtdVar2;
        jtd jtdVar3 = new jtd(context, 0);
        jtdVar3.setId(j0b.B1);
        jtd.B(jtdVar3, i0b.z);
        jtdVar3.setAccessibility(Integer.valueOf(m0b.g2));
        jtdVar3.setMode(etdVar);
        jtdVar3.setButtonPadding(kti.d(vw4.c() * f2));
        jtdVar3.setImageSize(new ftd(ctd.e(f), ctd.e(f)));
        jtdVar3.setLayoutParams(new kt3(-2, -2));
        jtdVar3.setListener(new qr1(this, 2));
        jtdVar3.setVisibility(8);
        this.N0 = jtdVar3;
        this.P0 = ipi.b(3, new m3(context, 19, this));
        setLayoutParams(new kt3(-1, -2));
        int iD = kti.d(vw4.c() * f);
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(j0b.l0);
        this.O0 = viewStub;
        addView(jtdVar);
        addView(textView, 0, -2);
        addView(textView2, 0, -2);
        addView(jtdVar2);
        addView(viewStub, iD, iD);
        addView(jtdVar3);
        ut3 ut3VarG = l5j.g(this);
        int id = jtdVar.getId();
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 4, 0, 4);
        int id2 = textView.getId();
        ut3VarG.d(id2, 6, jtdVar.getId(), 7);
        float f3 = 8;
        new fua(ut3VarG, 6, id2, 5).e(kti.d(vw4.c() * f3));
        ut3VarG.d(id2, 3, jtdVar.getId(), 3);
        ut3VarG.d(id2, 4, textView2.getId(), 3);
        ut3VarG.d(id2, 7, jtdVar3.getId(), 6);
        new fua(ut3VarG, 7, id2, 5).e(kti.d(vw4.c() * f3));
        ut3VarG.g(id2).d.l0 = true;
        ut3VarG.g(id2).d.W = 2;
        int id3 = textView2.getId();
        ut3VarG.d(id3, 6, textView.getId(), 6);
        ut3VarG.d(id3, 3, textView.getId(), 4);
        ut3VarG.d(id3, 7, textView.getId(), 7);
        ut3VarG.d(id3, 4, jtdVar.getId(), 4);
        ut3VarG.g(id3).d.l0 = true;
        int id4 = jtdVar3.getId();
        ut3VarG.d(id4, 7, jtdVar2.getId(), 6);
        ut3VarG.d(id4, 3, 0, 3);
        ut3VarG.d(id4, 4, 0, 4);
        int id5 = jtdVar2.getId();
        ut3VarG.d(id5, 7, viewStub.getId(), 6);
        ut3VarG.d(id5, 3, 0, 3);
        ut3VarG.d(id5, 4, 0, 4);
        int id6 = viewStub.getId();
        ut3VarG.d(id6, 7, 0, 7);
        ut3VarG.d(id6, 3, 0, 3);
        ut3VarG.d(id6, 4, 0, 4);
        ut3VarG.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final View getRecordButton() {
        return (View) this.P0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final mgd getRecordDrawable() {
        return (mgd) this.G0.getValue();
    }

    public static View v(Context context, ur1 ur1Var) {
        View view = new View(context);
        view.setId(j0b.l0);
        view.setVisibility(8);
        float f = 40;
        view.setLayoutParams(new ViewGroup.MarginLayoutParams(ctd.e(f), ctd.e(f)));
        f8j.d(view, 300L, new ub(ur1Var, 9, view));
        view.setBackground(ur1Var.getRecordDrawable());
        return view;
    }

    public static void w(ur1 ur1Var, boolean z) {
        jtd jtdVar = ur1Var.M0;
        ur1Var.I0 = null;
        ur1Var.getRecordButton().setVisibility(z ? 0 : 8);
        if (z) {
            ViewGroup.LayoutParams layoutParams = jtdVar.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.rightMargin = ctd.e(4);
            jtdVar.setLayoutParams(marginLayoutParams);
            ur1Var.getRecordDrawable().start();
            ur1Var.z(ur1Var.J0);
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = jtdVar.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.rightMargin = 0;
        jtdVar.setLayoutParams(marginLayoutParams2);
        ur1Var.getRecordDrawable().stop();
        ncg ncgVar = ur1Var.H0;
        if (ncgVar != null) {
            ncgVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (dqi.q(this.O0) && getRecordButton().getVisibility() == 0) {
            getRecordDrawable().start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (dqi.q(this.O0)) {
            getRecordDrawable().stop();
        }
    }

    public final void setAddUserCount(int i) {
        this.N0.setCounter(i);
    }

    public final void setButtonsVisibility(sr1 sr1Var) {
        int measuredWidth;
        boolean z = sr1Var.a && sr1Var.b;
        jtd jtdVar = this.N0;
        int visibility = jtdVar.getVisibility();
        jtd jtdVar2 = this.M0;
        boolean z2 = visibility == 0 && jtdVar2.getVisibility() == 0;
        boolean z3 = jtdVar.getVisibility() == 0 || jtdVar2.getVisibility() == 0;
        if (!z || z2 || !z3) {
            hqi.g(this.M0, sr1Var.a, 0L, null, 6);
            hqi.g(this.N0, sr1Var.b, 0L, null, 6);
            return;
        }
        if (jtdVar.getVisibility() == 0 && jtdVar2.getVisibility() == 0) {
            return;
        }
        int width = jtdVar2.getWidth();
        Integer numValueOf = Integer.valueOf(width);
        if (width == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            measuredWidth = numValueOf.intValue();
        } else {
            int width2 = jtdVar.getWidth();
            Integer numValueOf2 = width2 != 0 ? Integer.valueOf(width2) : null;
            if (numValueOf2 != null) {
                measuredWidth = numValueOf2.intValue();
            } else {
                jtdVar.measure(0, 0);
                measuredWidth = jtdVar.getMeasuredWidth();
            }
        }
        float f = measuredWidth;
        ObjectAnimator objectAnimatorI = hqi.i(jtdVar, f, 0.0f, new AccelerateDecelerateInterpolator());
        ObjectAnimator objectAnimatorI2 = hqi.i(jtdVar2, f + ctd.e(3), 0.0f, new AccelerateDecelerateInterpolator());
        jtdVar.setVisibility(0);
        jtdVar2.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ys.t(new Animator[]{objectAnimatorI, objectAnimatorI2}));
        animatorSet.start();
    }

    public final void setChatUnreadMessageCount(int i) {
        this.M0.setCounter(i);
    }

    public final void setClickListener(tr1 tr1Var) {
        this.F0 = tr1Var;
    }

    public final void setStatus(CharSequence charSequence) {
        TextView textView = this.L0;
        if (fni.a(textView.getText(), charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = this.K0;
        if (fni.a(textView.getText(), charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    public final void x(boolean z, jcg jcgVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewStub viewStub = this.O0;
        if (z || dqi.q(viewStub)) {
            z(jcgVar);
            if (fni.a(this.Q0, Boolean.valueOf(z))) {
                return;
            }
            this.Q0 = Boolean.valueOf(z);
            View recordButton = getRecordButton();
            if (!dqi.q(viewStub)) {
                ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
                int iIndexOfChild = viewGroup.indexOfChild(viewStub);
                viewGroup.removeViewInLayout(viewStub);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                layoutParams.height = recordButton.getLayoutParams().height;
                layoutParams.width = recordButton.getLayoutParams().width;
                recordButton.setId(viewStub.getId());
                viewGroup.addView(recordButton, iIndexOfChild, layoutParams);
                View recordButton2 = getRecordButton();
                ViewGroup.LayoutParams layoutParams2 = recordButton2.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = ctd.e(4);
                recordButton2.setLayoutParams(marginLayoutParams2);
            }
            this.J0 = jcgVar;
            AnimatorSet animatorSet = this.I0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            View recordButton3 = getRecordButton();
            na1 na1Var = new na1(1, this, z);
            AnimatorSet animatorSet2 = new AnimatorSet();
            int i = j0b.a;
            String str = z ? "fade_in" : "fade_out";
            Property property = View.ALPHA;
            jtd jtdVar = this.M0;
            if (z) {
                ViewGroup.LayoutParams layoutParams3 = jtdVar.getLayoutParams();
                marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(marginLayoutParams != null ? marginLayoutParams.rightMargin : 0, recordButton3.getWidth());
                valueAnimatorOfInt.addUpdateListener(new dg(jtdVar, 1));
                animatorSet2.playSequentially(valueAnimatorOfInt, ObjectAnimator.ofFloat(recordButton3, (Property<View, Float>) property, 0.0f, 1.0f));
            } else {
                ViewGroup.LayoutParams layoutParams4 = jtdVar.getLayoutParams();
                marginLayoutParams = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(marginLayoutParams != null ? marginLayoutParams.rightMargin : 0, -recordButton3.getWidth());
                valueAnimatorOfInt2.addUpdateListener(new dg(jtdVar, 2));
                animatorSet2.playTogether(valueAnimatorOfInt2, ObjectAnimator.ofFloat(recordButton3, (Property<View, Float>) property, 1.0f, 0.0f));
            }
            animatorSet2.setDuration(150L);
            animatorSet2.setInterpolator(new LinearInterpolator());
            animatorSet2.addListener(new xg(recordButton3, str, na1Var));
            animatorSet2.start();
            this.I0 = animatorSet2;
        }
    }

    public final void z(jcg jcgVar) {
        AnimatorSet animatorSet = this.I0;
        boolean z = animatorSet != null && animatorSet.isRunning();
        this.J0 = jcgVar;
        if (!dqi.q(this.O0) || jcgVar == null) {
            ncg ncgVar = this.H0;
            if (ncgVar != null) {
                ncgVar.a();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        if (z || getRecordButton().getVisibility() != 0) {
            ncg ncgVar2 = this.H0;
            if (ncgVar2 != null) {
                ncgVar2.a();
                return;
            }
            return;
        }
        this.J0 = null;
        ncg ncgVar3 = this.H0;
        if (ncgVar3 == null || !ncgVar3.isShowing()) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            Point point = new Point(getLeft(), getHeight() + iArr[1]);
            ncg ncgVar4 = this.H0;
            if (ncgVar4 != null) {
                ncgVar4.dismiss();
            }
            ncg ncgVar5 = new ncg(getContext(), getRecordButton(), new rr1(this, 0), new jl1(11), (cm6) null, 1, 3);
            ncgVar5.c(jcgVar.a);
            n5g n5gVar = jcgVar.b;
            TextView textView = ncgVar5.s0;
            textView.setText(n5gVar.b(textView.getContext()));
            CharSequence text = textView.getText();
            textView.setVisibility((text == null || text.length() == 0) ? 8 : 0);
            rr1 rr1Var = new rr1(this, 1);
            ImageView imageView = ncgVar5.t0;
            imageView.setVisibility(0);
            f8j.d(imageView, 300L, new wfe(rr1Var, 17, ncgVar5));
            TextView textView2 = ncgVar5.Z;
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd(kti.d(12 * vw4.d().getDisplayMetrics().density));
            textView2.setLayoutParams(marginLayoutParams);
            ncgVar5.showAtLocation(ncgVar5.a, 8388661, point.x - (ncgVar5.getWidth() / 2), point.y);
            View contentView = ncgVar5.getContentView();
            if (contentView != null) {
                ncg.b(ncgVar5, contentView, true, null, 6);
            }
            ncgVar5.setOnDismissListener(new h31(1, this));
            this.H0 = ncgVar5;
        }
    }
}
