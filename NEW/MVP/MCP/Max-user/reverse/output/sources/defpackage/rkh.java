package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rkh extends LinearLayout {
    public static final /* synthetic */ yy7[] v0;
    public final Object a;
    public final Object b;
    public qkh c;
    public final t9f d;
    public final View o;
    public final y60 s0;
    public final ImageView t0;
    public final TextView u0;

    static {
        z8a z8aVar = new z8a(rkh.class, "animateDotViewJob", "getAnimateDotViewJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        v0 = new yy7[]{z8aVar};
    }

    public rkh(Context context) {
        super(context);
        final int i = 0;
        cm6 cm6Var = new cm6(this) { // from class: okh
            public final /* synthetic */ rkh b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return r34.b(this.b.getContext(), yud.H0).mutate();
                    default:
                        return r34.b(this.b.getContext(), yud.F0).mutate();
                }
            }
        };
        int i2 = 3;
        this.a = ipi.b(3, cm6Var);
        final int i3 = 1;
        this.b = ipi.b(3, new cm6(this) { // from class: okh
            public final /* synthetic */ rkh b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return r34.b(this.b.getContext(), yud.H0).mutate();
                    default:
                        return r34.b(this.b.getContext(), yud.F0).mutate();
                }
            }
        });
        this.d = c7j.c();
        View view = new View(context);
        view.setId(mab.j);
        float f = 8;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        layoutParams.gravity = 17;
        view.setLayoutParams(layoutParams);
        Continuation continuation = null;
        tqi.c(new c24(i2, continuation, 2), view);
        this.o = view;
        y60 y60Var = new y60(context);
        y60Var.setId(mab.t);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(kti.d(0 * vw4.d().getDisplayMetrics().density), kti.d(24 * vw4.d().getDisplayMetrics().density));
        layoutParams2.setMarginStart(kti.d(2 * vw4.d().getDisplayMetrics().density));
        float f2 = 4;
        layoutParams2.setMarginEnd(kti.d(vw4.d().getDisplayMetrics().density * f2));
        layoutParams2.weight = 1.0f;
        layoutParams2.gravity = 16;
        y60Var.setLayoutParams(layoutParams2);
        y60Var.setListener(new aqc(y60Var, this, false, 15));
        y60Var.setShiftOffset(75L);
        this.s0 = y60Var;
        ImageView imageView = new ImageView(context);
        imageView.setId(mab.n);
        float f3 = 28;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f3)));
        imageView.setImageDrawable(getPlayIcon());
        imageView.setVisibility(8);
        tqi.c(new qlg(this, continuation, 8), imageView);
        f8j.d(imageView, 300L, new pcc(29, this));
        this.t0 = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density)));
        frameLayout.addView(view);
        frameLayout.addView(imageView);
        TextView textView = new TextView(context);
        textView.setId(mab.k);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        layoutParams3.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f2));
        textView.setLayoutParams(layoutParams3);
        dpg.h.b(textView, t75.b);
        tqi.c(new pkh(this, (Continuation) null), textView);
        this.u0 = textView;
        setId(mab.s);
        float f4 = 36;
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, kti.d(vw4.d().getDisplayMetrics().density * f4));
        int iD = kti.d(6 * vw4.d().getDisplayMetrics().density);
        layoutParams4.setMargins(iD, iD, iD, iD);
        layoutParams4.gravity = 49;
        setLayoutParams(layoutParams4);
        setMinimumHeight(kti.d(f4 * vw4.d().getDisplayMetrics().density));
        int iD2 = kti.d(f2 * vw4.d().getDisplayMetrics().density);
        setPadding(iD2, iD2, iD2, iD2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(vw4.d().getDisplayMetrics().density * 12.0f);
        setBackground(gradientDrawable);
        tqi.c(new pkh(i2, continuation), this);
        addView(frameLayout);
        addView(textView);
        addView(y60Var);
    }

    private final qt7 getAnimateDotViewJob() {
        return (qt7) this.d.D(this, v0[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final Drawable getPauseSmallIcon() {
        return (Drawable) this.b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final Drawable getPlayIcon() {
        return (Drawable) this.a.getValue();
    }

    private final GradientDrawable getWaveContainerBackground() {
        Drawable background = getBackground();
        if (background instanceof GradientDrawable) {
            return (GradientDrawable) background;
        }
        return null;
    }

    private final void setAnimateDotViewJob(qt7 qt7Var) {
        this.d.O(this, v0[0], qt7Var);
    }

    public final void c() {
        qt7 animateDotViewJob = getAnimateDotViewJob();
        if (animateDotViewJob != null) {
            animateDotViewJob.cancel(null);
        }
        setAnimateDotViewJob(null);
    }

    public final void d(Long l, fa8 fa8Var) {
        String strB;
        boolean z = fa8Var.b;
        Float f = fa8Var.a;
        ImageView imageView = this.t0;
        if (z) {
            imageView.setImageDrawable(getPauseSmallIcon());
        } else {
            imageView.setImageDrawable(getPlayIcon());
        }
        y60 y60Var = this.s0;
        if (f != null) {
            float fFloatValue = f.floatValue();
            if (!y60Var.D0) {
                y60Var.o = (long) (fFloatValue * y60Var.C0);
                y60Var.u0 = true;
                y60Var.postInvalidate();
            }
        } else if (!y60Var.D0) {
            y60Var.o = (long) (0.0f * y60Var.C0);
            y60Var.u0 = false;
            y60Var.postInvalidate();
        }
        if (y60Var.D0) {
            return;
        }
        if (f == null || l == null) {
            strB = null;
        } else {
            strB = z7i.b((long) (f.floatValue() * l.longValue()));
        }
        if (f == null && l != null) {
            strB = z7i.b(l.longValue());
        }
        this.u0.setText(strB);
    }

    public final void e() {
        View view = this.o;
        setAnimateDotViewJob(svi.e(tfh.b(view), null, null, new fg(view, null), 3));
    }

    public final View getHandFreeDotView() {
        return this.o;
    }

    public final List<ValueAnimator> getPauseAnimations() {
        ArrayList arrayList = new ArrayList();
        View view = this.o;
        arrayList.addAll(cqi.m(view, 1.0f, 0.5f, 150L, 0L));
        Property property = View.ALPHA;
        arrayList.add(cqi.b(view, property, 1.0f, 0.0f, 150L, 0L, 112));
        ImageView imageView = this.t0;
        arrayList.addAll(cqi.m(imageView, 0.5f, 1.0f, 150L, 50L));
        arrayList.add(cqi.b(imageView, property, 0.5f, 1.0f, 150L, 50L, 96));
        v1a v1aVar = a93.s0;
        int i = v1aVar.y(this).getText().e;
        v1aVar.y(this).getText();
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(i, -1);
        valueAnimatorOfArgb.setDuration(150L);
        valueAnimatorOfArgb.setStartDelay(50L);
        valueAnimatorOfArgb.addUpdateListener(new mkh(this, 2));
        arrayList.add(valueAnimatorOfArgb);
        ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(v4j.c(v1aVar.y(this).b().a.n, 0.08f), v1aVar.y(this).getIcon().k);
        valueAnimatorOfArgb2.setDuration(150L);
        valueAnimatorOfArgb2.setStartDelay(50L);
        valueAnimatorOfArgb2.addUpdateListener(new nkh(getWaveContainerBackground(), 1));
        arrayList.add(valueAnimatorOfArgb2);
        int iC = v4j.c(v1aVar.y(this).getIcon().k, 0.5f);
        v1aVar.y(this).getIcon();
        ValueAnimator valueAnimatorOfArgb3 = ValueAnimator.ofArgb(iC, v4j.c(-1, 0.5f));
        valueAnimatorOfArgb3.setDuration(150L);
        valueAnimatorOfArgb3.setStartDelay(50L);
        valueAnimatorOfArgb3.addUpdateListener(new mkh(this, 3));
        arrayList.add(valueAnimatorOfArgb3);
        return arrayList;
    }

    public final List<ValueAnimator> getResumeAnimations() {
        ArrayList arrayList = new ArrayList();
        View view = this.o;
        arrayList.addAll(cqi.m(view, 0.5f, 1.0f, 150L, 50L));
        Property property = View.ALPHA;
        arrayList.add(cqi.b(view, property, 0.5f, 1.0f, 150L, 50L, 96));
        ImageView imageView = this.t0;
        arrayList.addAll(cqi.m(imageView, 1.0f, 0.5f, 150L, 0L));
        arrayList.add(cqi.b(imageView, property, 1.0f, 0.0f, 150L, 0L, 112));
        v1a v1aVar = a93.s0;
        v1aVar.y(this).getText();
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(-1, v1aVar.y(this).getText().e);
        valueAnimatorOfArgb.setDuration(150L);
        valueAnimatorOfArgb.setStartDelay(50L);
        valueAnimatorOfArgb.addUpdateListener(new mkh(this, 0));
        arrayList.add(valueAnimatorOfArgb);
        ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(v1aVar.y(this).getIcon().k, v4j.c(v1aVar.y(this).b().a.n, 0.08f));
        valueAnimatorOfArgb2.setDuration(150L);
        valueAnimatorOfArgb2.setStartDelay(50L);
        valueAnimatorOfArgb2.addUpdateListener(new nkh(getWaveContainerBackground(), 0));
        arrayList.add(valueAnimatorOfArgb2);
        v1aVar.y(this).getIcon();
        ValueAnimator valueAnimatorOfArgb3 = ValueAnimator.ofArgb(v4j.c(-1, 0.5f), v4j.c(v1aVar.y(this).getIcon().k, 0.5f));
        valueAnimatorOfArgb3.setDuration(150L);
        valueAnimatorOfArgb3.setStartDelay(50L);
        valueAnimatorOfArgb3.addUpdateListener(new mkh(this, 1));
        arrayList.add(valueAnimatorOfArgb3);
        return arrayList;
    }

    public final y60 getWaveView() {
        return this.s0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qt7 animateDotViewJob = getAnimateDotViewJob();
        if (animateDotViewJob != null) {
            animateDotViewJob.cancel(null);
        }
    }

    public final void setBackgroundColor(boolean z) {
        v1a v1aVar = a93.s0;
        int iC = z ? v1aVar.y(this).getIcon().k : v4j.c(v1aVar.y(this).b().a.n, 0.08f);
        GradientDrawable waveContainerBackground = getWaveContainerBackground();
        if (waveContainerBackground != null) {
            waveContainerBackground.setColor(iC);
        }
    }

    public final void setCallback(qkh qkhVar) {
        this.c = qkhVar;
    }

    public final void setDotDrawable(Drawable drawable) {
        this.o.setBackground(drawable);
    }

    public final void setDurationColor(boolean z) {
        v1a v1aVar = a93.s0;
        TextView textView = this.u0;
        if (!z) {
            textView.setTextColor(v1aVar.y(this).getText().e);
        } else {
            v1aVar.y(this).getText();
            textView.setTextColor(-1);
        }
    }

    public final void setDurationText(String str) {
        this.u0.setText(str);
    }

    public final void setVisiblePlayPauseButton(boolean z) {
        this.t0.setVisibility(z ? 0 : 8);
    }
}
