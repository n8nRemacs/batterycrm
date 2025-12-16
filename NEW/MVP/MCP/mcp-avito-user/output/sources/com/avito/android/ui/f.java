package com.avito.android.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import hw.InterfaceC41178c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ScaleInOutTouchListener.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/f;", "Landroid/view/View$OnTouchListener;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final long f304585b;

    /* renamed from: c, reason: collision with root package name */
    public final int f304586c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f304587d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public AnimatorSet f304588e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f304589f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f304590g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Rect f304591h;

    /* compiled from: ScaleInOutTouchListener.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/ui/f$a", "Landroid/animation/AnimatorListenerAdapter;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f304593b;

        public a(boolean z12) {
            this.f304593b = z12;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@Y61.k Animator animator) {
            f fVar = f.this;
            fVar.f304588e = null;
            fVar.f304589f = false;
            if (!this.f304593b || fVar.f304590g) {
                return;
            }
            fVar.f304587d.invoke();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@Y61.k Animator animator) {
            f fVar = f.this;
            fVar.f304588e = null;
            fVar.f304589f = false;
            if (!this.f304593b || fVar.f304590g) {
                return;
            }
            fVar.f304587d.invoke();
        }
    }

    public f() {
        throw null;
    }

    public f(long j12, int i12, Y41.a aVar, int i13, C42822w c42822w) {
        j12 = (i13 & 1) != 0 ? 200L : j12;
        i12 = (i13 & 2) != 0 ? 10 : i12;
        this.f304585b = j12;
        this.f304586c = i12;
        this.f304587d = aVar;
        this.f304591h = new Rect();
    }

    public final void a(View view, boolean z12) {
        AnimatorSet animatorSet = this.f304588e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setInterpolator(new DecelerateInterpolator());
        animatorSet2.setDuration(this.f304585b);
        animatorSet2.addListener(new a(z12));
        animatorSet2.play(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f)).with(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        animatorSet2.start();
        this.f304588e = animatorSet2;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(@Y61.k View view, @Y61.k MotionEvent motionEvent) {
        Rect rect = this.f304591h;
        view.getDrawingRect(rect);
        int x12 = (int) motionEvent.getX();
        int y12 = (int) motionEvent.getY();
        int i12 = rect.left;
        int i13 = this.f304586c;
        boolean zContains = new Rect(i12 - i13, rect.top - i13, rect.right + i13, rect.bottom + i13).contains(x12, y12);
        if (!zContains && !this.f304590g) {
            this.f304590g = true;
            AnimatorSet animatorSet = this.f304588e;
            if (animatorSet == null || !animatorSet.isStarted()) {
                a(view, false);
            } else {
                this.f304589f = true;
            }
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            AnimatorSet animatorSet2 = this.f304588e;
            if (animatorSet2 != null && animatorSet2.isStarted()) {
                return true;
            }
            AnimatorSet animatorSet3 = this.f304588e;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.setInterpolator(new DecelerateInterpolator());
            animatorSet4.setDuration(this.f304585b);
            animatorSet4.addListener(new e(this, view));
            animatorSet4.play(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.8f)).with(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.8f));
            animatorSet4.start();
            this.f304588e = animatorSet4;
        } else if (action == 1) {
            if (this.f304590g) {
                this.f304590g = false;
                return true;
            }
            AnimatorSet animatorSet5 = this.f304588e;
            if (animatorSet5 == null || !animatorSet5.isStarted()) {
                a(view, zContains);
            } else {
                this.f304589f = true;
            }
        }
        return true;
    }
}
