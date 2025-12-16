package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes2.dex */
public final class wbf extends LinearLayout implements u6g {
    public static final /* synthetic */ yy7[] t0;
    public final xcf a;
    public final Object b;
    public final bwf c;
    public final nk d;
    public ValueAnimator o;
    public int s0;

    static {
        z8a z8aVar = new z8a(wbf.class, "expandableState", "getExpandableState()Lone/me/sdk/uikit/common/chat/StartMiniAppActionView$ExpandableState;");
        vid.a.getClass();
        t0 = new yy7[]{z8aVar};
    }

    public wbf(Context context) {
        super(context, null);
        xcf xcfVar = new xcf(null, null);
        int[] iArr = {R.attr.state_enabled};
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(vw4.d().getDisplayMetrics().density * 20.0f);
        xcfVar.a(iArr, gradientDrawable);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(vw4.d().getDisplayMetrics().density * 20.0f);
        xcfVar.a(new int[]{-16842910}, gradientDrawable2);
        this.a = xcfVar;
        this.b = ipi.b(3, new prd(20, this));
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setId(zud.V);
        appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        appCompatImageView.setImageDrawable(getLeftOuterDrawable());
        this.c = new bwf(new p2f(context, 7));
        this.d = new nk(this);
        setMinimumWidth(kti.d(44 * vw4.d().getDisplayMetrics().density));
        setOrientation(0);
        addView(appCompatImageView);
        onThemeChanged(a93.s0.y(this));
        setBackground(xcfVar);
        float f = 10;
        float f2 = 6;
        setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density));
    }

    public static final void a(wbf wbfVar) {
        bwf bwfVar = wbfVar.c;
        if (bwfVar.e()) {
            TextView textView = (TextView) bwfVar.getValue();
            wbfVar.s0 = textView.getMeasuredWidth();
            ValueAnimator valueAnimator = wbfVar.o;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorB = b(wbfVar, textView, true);
            wbfVar.o = valueAnimatorB;
            valueAnimatorB.start();
        }
    }

    public static final ValueAnimator b(wbf wbfVar, TextView textView, boolean z) {
        ValueAnimator duration = ValueAnimator.ofInt(z ? wbfVar.s0 : 0, z ? 0 : wbfVar.s0).setDuration(150L);
        duration.addUpdateListener(new q00(26, textView));
        duration.addListener(new vbf(z, textView, 1));
        duration.addListener(new vbf(z, textView, 0));
        return duration;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final Drawable getLeftOuterDrawable() {
        return (Drawable) this.b.getValue();
    }

    public final ubf getExpandableState() {
        yy7 yy7Var = t0[0];
        return (ubf) this.d.b;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(kti.d(36 * vw4.d().getDisplayMetrics().density), 1073741824));
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        Drawable leftOuterDrawable = getLeftOuterDrawable();
        yebVar.getIcon();
        cei.k(leftOuterDrawable, -1);
        int[] iArr = {R.attr.state_enabled};
        xcf xcfVar = this.a;
        ((GradientDrawable) pbj.d(xcfVar, iArr)).setColor(yebVar.b().a.n);
        ((GradientDrawable) pbj.d(xcfVar, new int[]{-16842910})).setColor(yebVar.c().a.b.l);
    }

    public final void setExpandableState(ubf ubfVar) {
        this.d.O(this, t0[0], ubfVar);
    }

    public final void setText(CharSequence charSequence) {
        bwf bwfVar = this.c;
        if (charSequence != null && charSequence.length() != 0) {
            dqi.a(this, (View) bwfVar.getValue(), -1);
            ((TextView) bwfVar.getValue()).setText(charSequence);
            ((View) bwfVar.getValue()).setVisibility(0);
        } else if (bwfVar.e()) {
            a(this);
        }
    }
}
