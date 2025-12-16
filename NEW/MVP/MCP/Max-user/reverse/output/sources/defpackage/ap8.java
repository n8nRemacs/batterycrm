package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class ap8 extends LinearLayout implements m7g {
    public final AppCompatTextView a;
    public final View b;
    public boolean c;
    public ObjectAnimator d;

    public ap8(Context context) throws Resources.NotFoundException {
        super(context, null, 0);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(uvc.markdown_dot_size);
        int dimensionPixelSize2 = (getContext().getResources().getDimensionPixelSize(uvc.markdown_button_size) - dimensionPixelSize) / 2;
        setOrientation(0);
        setGravity(17);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null, 0);
        appCompatTextView.setIncludeFontPadding(false);
        appCompatTextView.setTextAlignment(6);
        appCompatTextView.setTextSize(14.0f);
        appCompatTextView.setLineHeight(kti.d(14 * vw4.d().getDisplayMetrics().density));
        appCompatTextView.setGravity(17);
        appCompatTextView.setPaddingRelative(kti.d(16 * vw4.d().getDisplayMetrics().density), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingEnd(), appCompatTextView.getPaddingBottom());
        this.a = appCompatTextView;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 17;
        layoutParams.setMarginEnd(kti.d(26 * vw4.d().getDisplayMetrics().density));
        addView(appCompatTextView, layoutParams);
        View view = new View(context, null, 0);
        Drawable shapeDrawable = new ShapeDrawable(new OvalShape());
        cei.k(shapeDrawable, -1);
        view.setBackground(shapeDrawable);
        this.b = view;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        layoutParams2.gravity = 17;
        layoutParams2.setMarginEnd(dimensionPixelSize2);
        addView(view, layoutParams2);
        if (isInEditMode()) {
            appCompatTextView.setText(dnf.o(20, "s"));
            appCompatTextView.setTextColor(-1);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, c6d.MarkdownItemView);
        if (typedArrayObtainStyledAttributes.hasValue(c6d.MarkdownItemView_miv_title)) {
            setTitle(typedArrayObtainStyledAttributes.getResourceId(c6d.MarkdownItemView_miv_title, 0));
        }
        a(typedArrayObtainStyledAttributes.getBoolean(c6d.MarkdownItemView_miv_highlight_title, false), false);
        typedArrayObtainStyledAttributes.recycle();
        b();
    }

    public final void a(boolean z, boolean z2) {
        this.c = z;
        Float fValueOf = Float.valueOf(0.6f);
        Float fValueOf2 = Float.valueOf(1.0f);
        rf rfVar = new rf(fValueOf, fValueOf2);
        if (!this.c) {
            rfVar = new rf(fValueOf2, fValueOf);
        }
        float alpha = getAlpha();
        Float f = rfVar.b;
        if (alpha == f.floatValue()) {
            return;
        }
        if (isInEditMode() || !z2 || !((t1b) ((qm3) ((zm) ((ah) getContext().getApplicationContext())).c.getValue())).b().a()) {
            setAlpha(f.floatValue());
            invalidate();
            return;
        }
        zg zgVarB = ((t1b) ((qm3) ((zm) ((ah) getContext().getApplicationContext())).c.getValue())).b();
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.d;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            this.d = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<ap8, Float>) LinearLayout.ALPHA, rfVar.a.floatValue(), f.floatValue());
        this.d = objectAnimatorOfFloat;
        fs4 fs4Var = zgVarB.a;
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(this.c ? fs4Var.c() : fs4Var.d());
        objectAnimatorOfFloat.addListener(new pf(this, 3, rfVar));
        objectAnimatorOfFloat.start();
    }

    @Override // defpackage.m7g
    public final void b() {
        q1g q1gVarD;
        if (isInEditMode()) {
            return;
        }
        if (isInEditMode()) {
            q1gVarD = bq4.e0;
        } else {
            Context context = getContext();
            bwf bwfVar = q1g.a0;
            q1gVarD = nca.d(context);
        }
        this.a.setTextColor(q1gVarD.l);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public final void setTitle(int i) {
        this.a.setText(i);
    }
}
