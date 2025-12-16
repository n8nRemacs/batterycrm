package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.interpolator.view.animation.c;
import com.facebook.imageutils.JfifUtil;
import com.google.android.material.R;
import j.N;
import j.P;
import java.util.Iterator;
import java.util.LinkedHashSet;
import lY0.C43707b;
import wY0.C49576a;

/* loaded from: classes6.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: i, reason: collision with root package name */
    public static final int f355893i = R.attr.motionDurationLong2;

    /* renamed from: j, reason: collision with root package name */
    public static final int f355894j = R.attr.motionDurationMedium4;

    /* renamed from: k, reason: collision with root package name */
    public static final int f355895k = R.attr.motionEasingEmphasizedInterpolator;

    /* renamed from: a, reason: collision with root package name */
    @N
    public final LinkedHashSet<a> f355896a;

    /* renamed from: b, reason: collision with root package name */
    public int f355897b;

    /* renamed from: c, reason: collision with root package name */
    public int f355898c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f355899d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f355900e;

    /* renamed from: f, reason: collision with root package name */
    public int f355901f;

    /* renamed from: g, reason: collision with root package name */
    @b
    public int f355902g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public ViewPropertyAnimator f355903h;

    public interface a {
        void a();
    }

    @RestrictTo
    public @interface b {
    }

    public HideBottomViewOnScrollBehavior() {
        this.f355896a = new LinkedHashSet<>();
        this.f355901f = 0;
        this.f355902g = 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean j(@N CoordinatorLayout coordinatorLayout, @N V v12, int i12) {
        this.f355901f = v12.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v12.getLayoutParams()).bottomMargin;
        this.f355897b = C49576a.c(v12.getContext(), f355893i, JfifUtil.MARKER_APP1);
        this.f355898c = C49576a.c(v12.getContext(), f355894j, 175);
        Context context = v12.getContext();
        c cVar = C43707b.f413882d;
        int i13 = f355895k;
        this.f355899d = C49576a.d(context, i13, cVar);
        this.f355900e = C49576a.d(v12.getContext(), i13, C43707b.f413881c);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void o(CoordinatorLayout coordinatorLayout, @N V v12, @N View view, int i12, int i13, int i14, int i15, int i16, @N int[] iArr) {
        if (i13 > 0) {
            v(v12);
        } else if (i13 < 0) {
            w(v12);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean s(@N CoordinatorLayout coordinatorLayout, @N V v12, @N View view, @N View view2, int i12, int i13) {
        return i12 == 2;
    }

    public final void v(@N V v12) {
        if (this.f355902g == 1) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f355903h;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v12.clearAnimation();
        }
        this.f355902g = 1;
        Iterator<a> it = this.f355896a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f355903h = v12.animate().translationY(this.f355901f).setInterpolator(this.f355900e).setDuration(this.f355898c).setListener(new com.google.android.material.behavior.a(this));
    }

    public final void w(@N V v12) {
        if (this.f355902g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f355903h;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v12.clearAnimation();
        }
        this.f355902g = 2;
        Iterator<a> it = this.f355896a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f355903h = v12.animate().translationY(0).setInterpolator(this.f355899d).setDuration(this.f355897b).setListener(new com.google.android.material.behavior.a(this));
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f355896a = new LinkedHashSet<>();
        this.f355901f = 0;
        this.f355902g = 2;
    }
}
