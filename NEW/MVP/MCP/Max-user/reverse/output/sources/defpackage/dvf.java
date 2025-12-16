package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;

/* loaded from: classes2.dex */
public final class dvf {
    public final kvf a;
    public final View b;
    public final ViewGroup c;
    public final sue d;
    public final int e;
    public boolean f;
    public float g = -1.0f;
    public float h = -1.0f;
    public float i = -1.0f;
    public float j = -1.0f;
    public final int k;
    public final int l;
    public View m;
    public final w6 n;
    public final vnd o;
    public final Object p;
    public SwipeWidget q;
    public Long r;
    public ValueAnimator s;
    public ValueAnimator t;

    public dvf(Integer num, kvf kvfVar, View view, ViewGroup viewGroup, sue sueVar, int i) {
        this.a = kvfVar;
        this.b = view;
        this.c = viewGroup;
        this.d = sueVar;
        this.e = i;
        this.k = f6j.b(view.getContext());
        this.l = view.getContext().getResources().getDisplayMetrics().heightPixels;
        w6 w6Var = new w6(view.getContext(), 1);
        w6Var.setId(mzc.swipe_fade);
        w6Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        w6Var.setBackgroundColor(num != null ? num.intValue() : v4j.c(-16777216, 0.5f));
        this.n = w6Var;
        this.o = e8j.b(new nte(25));
        this.p = ipi.b(3, new prd(29, this));
    }

    public final View a() {
        View view = this.m;
        if (view != null) {
            return view;
        }
        View view2 = (View) this.d.invoke();
        this.m = view2;
        return view2;
    }

    public final boolean b() {
        return this.e == 2;
    }

    public final void c(float f, boolean z) {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            Long l = this.r;
            ValueAnimator duration = ValueAnimator.ofFloat(f, 0.0f).setDuration(n7j.e(kti.e(Math.abs(f) * r8), 120L, l != null ? l.longValue() : 200L));
            duration.addUpdateListener(new cvf(this, 1));
            duration.addListener(new eg(this, z, f));
            this.s = duration;
            duration.start();
        }
    }

    public final void d(float f) {
        boolean zB = b();
        w6 w6Var = this.n;
        View view = this.b;
        ViewGroup viewGroup = this.c;
        if (!zB) {
            jqi.h(viewGroup, a(), view, w6Var, f);
            return;
        }
        a();
        view.setTranslationX(viewGroup.getMeasuredWidth() * f);
        if (w6Var != null) {
            w6Var.setAlpha(1.0f - f);
        }
    }
}
