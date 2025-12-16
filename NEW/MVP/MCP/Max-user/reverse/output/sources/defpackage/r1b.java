package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* loaded from: classes2.dex */
public final class r1b extends ConstraintLayout implements u6g {
    public static final int U0 = kti.d(16 * vw4.d().getDisplayMetrics().density);
    public static final int V0 = kti.d(12 * vw4.d().getDisplayMetrics().density);
    public static final int W0 = kti.d(24 * vw4.d().getDisplayMetrics().density);
    public static final int X0 = kti.d(56 * vw4.d().getDisplayMetrics().density);
    public static final int Y0 = 52;
    public final int F0;
    public final int G0;
    public final int H0;
    public final Object I0;
    public final Object J0;
    public final Object K0;
    public final Object L0;
    public final LayerDrawable M0;
    public final Object N0;
    public final View O0;
    public final yb7 P0;
    public final GradientDrawable Q0;
    public final Object R0;
    public final Object S0;
    public q1b T0;

    public r1b(Context context, int i) {
        super(context, null);
        this.F0 = getContext().getResources().getDimensionPixelSize(x9b.c);
        this.G0 = getContext().getResources().getDimensionPixelSize(x9b.d);
        this.H0 = getContext().getResources().getDimensionPixelSize(x9b.b);
        ipi.b(3, new ns2(context, 29));
        int i2 = 0;
        this.I0 = ipi.b(3, new o1b(context, this, i2));
        int i3 = 1;
        this.J0 = ipi.b(3, new o1b(context, this, i3));
        this.K0 = ipi.b(3, new p1b(context, i2));
        this.L0 = ipi.b(3, new o1b(context, this, 2));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
        jqd.a(gradientDrawable, new int[]{452984831, 16777215}, new float[]{0.0f, 1.0f});
        gradientDrawable.setGradientType(0);
        this.M0 = new LayerDrawable(new Drawable[]{gradientDrawable, r34.b(getContext(), yud.H).mutate()});
        this.N0 = ipi.b(3, new o1b(context, this, 3));
        View view = new View(context);
        view.setId(View.generateViewId());
        kt3 kt3Var = new kt3(1, 1);
        kt3Var.i = 0;
        kt3Var.v = 0;
        kt3Var.l = 0;
        kt3Var.t = 0;
        view.setLayoutParams(kt3Var);
        this.O0 = view;
        yb7 yb7Var = new yb7(context, new dga(9));
        yb7Var.setId(View.generateViewId());
        kt3 kt3Var2 = new kt3(0, kti.d(100 * vw4.d().getDisplayMetrics().density));
        kt3Var2.i = 0;
        kt3Var2.l = 0;
        yb7Var.setLayoutParams(kt3Var2);
        yb7Var.setInitialRadius$common_release(vw4.d().getDisplayMetrics().density * 42.0f);
        this.P0 = yb7Var;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setOrientation(GradientDrawable.Orientation.BL_TR);
        this.Q0 = gradientDrawable2;
        this.R0 = ipi.b(3, new p1b(context, i3));
        this.S0 = ipi.b(3, new o1b(this, context));
        this.T0 = q1b.a;
        setClipToOutline(true);
        setOutlineProvider(new u74(getContext().getResources().getDimensionPixelSize(x9b.a)));
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            float f = 82;
            layoutParams.height = kti.d(vw4.d().getDisplayMetrics().density * f);
            setMaxHeight(kti.d(f * vw4.d().getDisplayMetrics().density));
        } else {
            float f2 = 82;
            layoutParams = new ViewGroup.LayoutParams(-1, kti.d(vw4.d().getDisplayMetrics().density * f2));
            setMaxHeight(kti.d(f2 * vw4.d().getDisplayMetrics().density));
        }
        setLayoutParams(layoutParams);
        setBackground(gradientDrawable2);
        fqi.c(this, view, null);
        fqi.c(this, yb7Var, null);
        onThemeChanged(a93.s0.x(context).k());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final Drawable getChevronDrawable() {
        return (Drawable) this.S0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final EnhancedVectorDrawable getCloseBadgeDrawable() {
        return (EnhancedVectorDrawable) this.R0.getValue();
    }

    public static ImageView v(r1b r1bVar, Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setId(zud.x);
        imageView.setImageDrawable(r1bVar.getCloseBadgeDrawable());
        float f = 24;
        kt3 kt3Var = new kt3(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        kt3Var.i = 0;
        kt3Var.v = 0;
        int i = r1bVar.G0;
        kt3Var.setMarginEnd(i);
        ((ViewGroup.MarginLayoutParams) kt3Var).topMargin = i;
        imageView.setLayoutParams(kt3Var);
        return imageView;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, k18] */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iSave;
        Drawable chevronDrawable = getChevronDrawable();
        if (chevronDrawable == null) {
            return;
        }
        int iOrdinal = this.T0.ordinal();
        if (iOrdinal == 0) {
            ?? r1 = this.I0;
            Layout layout = ((TextView) r1.getValue()).getLayout();
            if (layout != null) {
                int i = U0;
                chevronDrawable.setBounds(0, 0, i, i);
                int lineCount = layout.getLineCount() - 1;
                float lineRight = layout.getLineRight(lineCount);
                int lineTop = layout.getLineTop(lineCount);
                int lineBottom = layout.getLineBottom(lineCount) - lineTop;
                float x = ((TextView) r1.getValue()).getX();
                float y = ((TextView) r1.getValue()).getY();
                iSave = canvas.save();
                canvas.translate(Math.min(lineRight + x, x + ((TextView) r1.getValue()).getWidth()), ((lineBottom - i) / 2.0f) + y + lineTop);
                try {
                    chevronDrawable.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        ?? r12 = this.J0;
        Layout layout2 = ((TextView) r12.getValue()).getLayout();
        if (layout2 != null) {
            int i2 = V0;
            chevronDrawable.setBounds(0, 0, i2, i2);
            int lineCount2 = layout2.getLineCount() - 1;
            float lineRight2 = layout2.getLineRight(lineCount2);
            int lineTop2 = layout2.getLineTop(lineCount2);
            int lineBottom2 = layout2.getLineBottom(lineCount2) - lineTop2;
            float x2 = ((TextView) r12.getValue()).getX();
            float y2 = ((TextView) r12.getValue()).getY();
            iSave = canvas.save();
            canvas.translate(Math.min(lineRight2 + x2, x2 + ((TextView) r12.getValue()).getWidth()), ((lineBottom2 - i2) / 2.0f) + y2 + lineTop2);
            try {
                chevronDrawable.draw(canvas);
            } finally {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        ?? r0 = this.I0;
        if (r0.e()) {
            TextView textView = (TextView) r0.getValue();
            yebVar.getText();
            textView.setTextColor(-1);
        }
        ?? r02 = this.J0;
        if (r02.e()) {
            TextView textView2 = (TextView) r02.getValue();
            yebVar.getText();
            textView2.setTextColor(v4j.c(-1, 0.7f));
        }
        EnhancedVectorDrawable closeBadgeDrawable = getCloseBadgeDrawable();
        z18.e(closeBadgeDrawable, "cross", yebVar.getIcon().i);
        z18.e(closeBadgeDrawable, "circle_background", yebVar.b().a.c);
        Drawable chevronDrawable = getChevronDrawable();
        if (chevronDrawable != null) {
            chevronDrawable.setTint(yebVar.getIcon().f);
        }
    }

    public final void setBannerClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public final void setChevronAppearance(q1b q1bVar) {
        this.T0 = q1bVar;
        invalidate();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void setCloseButtonClickListener(View.OnClickListener onClickListener) {
        ((ImageView) this.L0.getValue()).setOnClickListener(onClickListener);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void setCloseButtonVisibility(boolean z) {
        ?? r0 = this.L0;
        if (z || r0.e()) {
            ImageView imageView = (ImageView) r0.getValue();
            imageView.setVisibility(z ? 0 : 8);
            fqi.c(this, imageView, null);
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        z();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    public final void setSubtitle(String str) {
        ?? r1 = this.J0;
        if (str != null && !vmf.F(str)) {
            TextView textView = (TextView) r1.getValue();
            textView.setText(str);
            textView.setVisibility(0);
            fqi.c(this, textView, null);
            x();
            return;
        }
        if (r1.e()) {
            TextView textView2 = (TextView) r1.getValue();
            textView2.setVisibility(8);
            textView2.setText((CharSequence) null);
            x();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    public final void setTitle(String str) {
        ?? r1 = this.I0;
        if (str != null && !vmf.F(str)) {
            TextView textView = (TextView) r1.getValue();
            textView.setText(str);
            textView.setVisibility(0);
            fqi.c(this, textView, null);
            x();
            return;
        }
        if (r1.e()) {
            TextView textView2 = (TextView) r1.getValue();
            textView2.setText((CharSequence) null);
            textView2.setVisibility(8);
            x();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k18] */
    public final void w(Drawable drawable, int i, int i2) {
        yb7 yb7Var = this.P0;
        ?? r1 = this.N0;
        ?? r2 = this.K0;
        if (drawable == null) {
            if (r2.e()) {
                ((FrameLayout) r1.getValue()).setVisibility(8);
                ImageView imageView = (ImageView) r2.getValue();
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
                yb7Var.setIcon$common_release((Drawable) null);
                x();
                return;
            }
            return;
        }
        FrameLayout frameLayout = (FrameLayout) r1.getValue();
        frameLayout.setVisibility(0);
        ImageView imageView2 = (ImageView) r2.getValue();
        int i3 = W0;
        int i4 = X0;
        if (i > i4) {
            i = i4;
        } else if (i < i3) {
            i = i3;
        }
        if (i2 > i4) {
            i2 = i4;
        } else if (i2 < i3) {
            i2 = i3;
        }
        ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        imageView2.setLayoutParams(layoutParams);
        imageView2.setVisibility(0);
        imageView2.setImageDrawable(drawable);
        yb7Var.setIcon$common_release(drawable);
        fqi.c(this, frameLayout, null);
        fqi.c(this, imageView2, null);
        x();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, k18] */
    public final void x() {
        int id;
        int id2;
        int id3;
        ?? r0 = this.I0;
        boolean zE = r0.e();
        int i = this.H0;
        ?? r4 = this.J0;
        int id4 = -1;
        ?? r6 = this.N0;
        if (zE) {
            View view = (View) r0.getValue();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            kt3 kt3Var = (kt3) layoutParams;
            if (dqi.r(r6)) {
                id2 = ((FrameLayout) r6.getValue()).getId();
            } else {
                kt3Var.v = 0;
                id2 = -1;
            }
            kt3Var.u = id2;
            if (dqi.r(r4)) {
                ((ViewGroup.MarginLayoutParams) kt3Var).topMargin = i;
                id3 = ((TextView) r4.getValue()).getId();
            } else {
                ((ViewGroup.MarginLayoutParams) kt3Var).topMargin = 0;
                kt3Var.l = 0;
                id3 = -1;
            }
            kt3Var.k = id3;
            view.setLayoutParams(kt3Var);
        }
        if (r4.e()) {
            View view2 = (View) r4.getValue();
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            kt3 kt3Var2 = (kt3) layoutParams2;
            if (dqi.r(r0)) {
                ((ViewGroup.MarginLayoutParams) kt3Var2).topMargin = this.F0;
                ((ViewGroup.MarginLayoutParams) kt3Var2).bottomMargin = i;
                id = ((TextView) r0.getValue()).getId();
            } else {
                ((ViewGroup.MarginLayoutParams) kt3Var2).topMargin = 0;
                ((ViewGroup.MarginLayoutParams) kt3Var2).bottomMargin = 0;
                kt3Var2.i = 0;
                id = -1;
            }
            kt3Var2.j = id;
            if (dqi.r(r6)) {
                id4 = ((FrameLayout) r6.getValue()).getId();
            } else {
                kt3Var2.v = 0;
            }
            kt3Var2.u = id4;
            view2.setLayoutParams(kt3Var2);
        }
        z();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k18] */
    public final void z() {
        yb7 yb7Var = this.P0;
        ViewGroup.LayoutParams layoutParams = yb7Var.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        kt3 kt3Var = (kt3) layoutParams;
        if (this.N0.e()) {
            kt3Var.t = this.O0.getId();
            kt3Var.setMarginStart(-kti.d(((Y0 / 2) + 24) * vw4.d().getDisplayMetrics().density));
        }
        yb7Var.setLayoutParams(kt3Var);
    }
}
