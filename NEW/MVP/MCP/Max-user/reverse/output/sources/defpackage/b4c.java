package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class b4c extends ViewGroup {
    public final int a;
    public final int b;
    public final TextView c;
    public final TextView d;
    public final x4c o;
    public final k41 s0;
    public sj6 t0;
    public boolean u0;
    public a4c v0;

    public b4c(Context context) {
        super(context);
        float f = 12;
        this.a = kti.d(vw4.d().getDisplayMetrics().density * f);
        float f2 = 4;
        this.b = kti.d(vw4.d().getDisplayMetrics().density * f2);
        TextView textView = new TextView(context);
        v1a v1aVar = a93.s0;
        textView.setTextColor(v1aVar.B(textView).c.getText().e);
        t5g t5gVar = dpg.B;
        t5gVar.b(textView, t75.b);
        this.c = textView;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(v1aVar.B(textView2).c.getText().e);
        t5gVar.b(textView2, t75.b);
        this.d = textView2;
        x4c x4cVar = new x4c(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(zob.b(v1aVar.B(x4cVar).c.getIcon().f, 0.8f));
        gradientDrawable.setSize(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f * vw4.d().getDisplayMetrics().density));
        gradientDrawable.setCornerRadius(vw4.d().getDisplayMetrics().density * 100.0f);
        x4cVar.setThumb(gradientDrawable);
        float f3 = 2;
        x4cVar.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f3), x4cVar.getPaddingTop(), kti.d(vw4.d().getDisplayMetrics().density * f3), x4cVar.getPaddingBottom());
        x4cVar.setProgressBackgroundTintList(ColorStateList.valueOf(v1aVar.B(x4cVar).c.getIcon().j));
        x4cVar.setProgressTintList(ColorStateList.valueOf(v1aVar.B(x4cVar).c.b().a.g));
        x4cVar.setSecondaryProgressTintList(ColorStateList.valueOf(v1aVar.B(x4cVar).c.getIcon().i));
        this.o = x4cVar;
        k41 k41Var = new k41(context, 1);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        k41Var.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        k41Var.b = imageView;
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminate(true);
        float f4 = 20;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f4 * vw4.d().getDisplayMetrics().density));
        layoutParams.gravity = 17;
        k41Var.addView(progressBar, layoutParams);
        k41Var.d = progressBar;
        TextView textView3 = new TextView(context);
        textView3.setTextColor(v1aVar.B(textView3).c.getText().e);
        dpg.s.b(textView3, t75.b);
        textView3.setGravity(17);
        float f5 = 6;
        textView3.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f5 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = kti.d(f2 * vw4.d().getDisplayMetrics().density);
        k41Var.addView(textView3, layoutParams2);
        k41Var.c = textView3;
        k41Var.setElevation(vw4.d().getDisplayMetrics().density * 4.0f);
        float f6 = vw4.d().getDisplayMetrics().density * 14.0f;
        View view = new View(k41Var.getContext());
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setStroke(kti.d(1 * vw4.d().getDisplayMetrics().density), v1aVar.B(view).c.i().c);
        gradientDrawable2.setCornerRadius(f6);
        view.setBackground(gradientDrawable2);
        k41Var.addView(view, new FrameLayout.LayoutParams(-1, -1));
        k41Var.setOutlineProvider(new u74(f6));
        this.s0 = k41Var;
        setClipChildren(false);
        setClipToPadding(false);
        addView(textView);
        addView(textView2);
        addView(x4cVar);
        addView(k41Var);
        x4cVar.setOnSeekBarChangeListener(new w59(this, 1));
    }

    public final void a(fp2 fp2Var) {
        Bitmap bitmap;
        fp2Var.getClass();
        boolean z = fp2Var.b;
        sj6 sj6Var = fp2Var.a;
        sj6 sj6Var2 = (sj6Var == null || ((bitmap = sj6Var.a) != null && bitmap.isRecycled())) ? null : sj6Var;
        this.t0 = sj6Var2;
        Bitmap bitmap2 = sj6Var2 != null ? sj6Var2.a : null;
        k41 k41Var = this.s0;
        ((ImageView) k41Var.b).setImageBitmap(bitmap2);
        if (sj6Var == null && !z) {
            k41Var.setVisibility(8);
            this.u0 = true;
        } else {
            k41Var.setVisibility(0);
            this.u0 = true;
            ((ProgressBar) k41Var.d).setVisibility(z ? 0 : 8);
        }
    }

    public final a4c getListener() {
        return this.v0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        k41 k41Var = this.s0;
        int visibility = k41Var.getVisibility();
        int i5 = this.b;
        int i6 = this.a;
        if (visibility == 0) {
            cri.c(k41Var, i6, i5 - k41Var.getMeasuredHeight(), i5, 4);
        }
        TextView textView = this.c;
        cri.c(textView, i6, i5, 0, 12);
        int measuredWidth = getMeasuredWidth() - i6;
        TextView textView2 = this.d;
        cri.c(textView2, measuredWidth - textView2.getMeasuredWidth(), i5, 0, 12);
        cri.c(this.o, i6, textView.getMeasuredHeight() + i5 + i5, 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        TextView textView = this.c;
        textView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.d.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size - (this.a * 2), 1073741824);
        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        x4c x4cVar = this.o;
        x4cVar.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
        int measuredHeight = x4cVar.getMeasuredHeight() + textView.getMeasuredHeight() + (this.b * 2);
        sj6 sj6Var = this.t0;
        int i3 = sj6Var != null ? sj6Var.b : 0;
        int i4 = sj6Var != null ? sj6Var.c : 0;
        if (i3 != 0 && i4 != 0) {
            k41 k41Var = this.s0;
            if (k41Var.getVisibility() == 0) {
                k41Var.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
            }
        }
        setMeasuredDimension(size, measuredHeight);
    }

    public final void setListener(a4c a4cVar) {
        this.v0 = a4cVar;
    }
}
