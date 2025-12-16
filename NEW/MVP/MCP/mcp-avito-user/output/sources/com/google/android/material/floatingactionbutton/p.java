package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.Property;
import android.view.View;
import com.google.android.material.R;
import j.N;
import j.P;
import j.X;
import java.util.ArrayList;

/* compiled from: FloatingActionButtonImplLollipop.java */
@X
/* loaded from: classes6.dex */
class p extends m {

    /* renamed from: O, reason: collision with root package name */
    @P
    public StateListAnimator f356691O;

    /* compiled from: FloatingActionButtonImplLollipop.java */
    public static class a extends com.google.android.material.shape.k {
        @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
        public final boolean isStateful() {
            return true;
        }
    }

    @Override // com.google.android.material.floatingactionbutton.m
    @N
    public final com.google.android.material.shape.k e() {
        com.google.android.material.shape.q qVar = this.f356647a;
        qVar.getClass();
        return new a(qVar);
    }

    @Override // com.google.android.material.floatingactionbutton.m
    public final float f() {
        return this.f356669w.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.m
    public final void g(@N Rect rect) {
        if (FloatingActionButton.this.f356598l) {
            super.g(rect);
            return;
        }
        if (this.f356652f) {
            FloatingActionButton floatingActionButton = this.f356669w;
            int sizeDimension = floatingActionButton.getSizeDimension();
            int i12 = this.f356657k;
            if (sizeDimension < i12) {
                int sizeDimension2 = (i12 - floatingActionButton.getSizeDimension()) / 2;
                rect.set(sizeDimension2, sizeDimension2, sizeDimension2, sizeDimension2);
                return;
            }
        }
        rect.set(0, 0, 0, 0);
    }

    @Override // com.google.android.material.floatingactionbutton.m
    public final void h(ColorStateList colorStateList, @P PorterDuff.Mode mode, ColorStateList colorStateList2, int i12) {
        Drawable layerDrawable;
        com.google.android.material.shape.k kVarE = e();
        this.f356648b = kVarE;
        kVarE.setTintList(colorStateList);
        if (mode != null) {
            this.f356648b.setTintMode(mode);
        }
        com.google.android.material.shape.k kVar = this.f356648b;
        FloatingActionButton floatingActionButton = this.f356669w;
        kVar.j(floatingActionButton.getContext());
        if (i12 > 0) {
            Context context = floatingActionButton.getContext();
            com.google.android.material.shape.q qVar = this.f356647a;
            qVar.getClass();
            d dVar = new d(qVar);
            int color = androidx.core.content.d.getColor(context, R.color.design_fab_stroke_top_outer_color);
            int color2 = androidx.core.content.d.getColor(context, R.color.design_fab_stroke_top_inner_color);
            int color3 = androidx.core.content.d.getColor(context, R.color.design_fab_stroke_end_inner_color);
            int color4 = androidx.core.content.d.getColor(context, R.color.design_fab_stroke_end_outer_color);
            dVar.f356615i = color;
            dVar.f356616j = color2;
            dVar.f356617k = color3;
            dVar.f356618l = color4;
            float f12 = i12;
            if (dVar.f356614h != f12) {
                dVar.f356614h = f12;
                dVar.f356608b.setStrokeWidth(f12 * 1.3333f);
                dVar.f356620n = true;
                dVar.invalidateSelf();
            }
            if (colorStateList != null) {
                dVar.f356619m = colorStateList.getColorForState(dVar.getState(), dVar.f356619m);
            }
            dVar.f356622p = colorStateList;
            dVar.f356620n = true;
            dVar.invalidateSelf();
            this.f356650d = dVar;
            d dVar2 = this.f356650d;
            dVar2.getClass();
            com.google.android.material.shape.k kVar2 = this.f356648b;
            kVar2.getClass();
            layerDrawable = new LayerDrawable(new Drawable[]{dVar2, kVar2});
        } else {
            this.f356650d = null;
            layerDrawable = this.f356648b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(com.google.android.material.ripple.b.c(colorStateList2), layerDrawable, null);
        this.f356649c = rippleDrawable;
        this.f356651e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.m
    public final void j() {
        r();
    }

    @Override // com.google.android.material.floatingactionbutton.m
    public final void l(float f12, float f13, float f14) {
        FloatingActionButton floatingActionButton = this.f356669w;
        if (floatingActionButton.getStateListAnimator() == this.f356691O) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(m.f356638I, s(f12, f14));
            stateListAnimator.addState(m.f356639J, s(f12, f13));
            stateListAnimator.addState(m.f356640K, s(f12, f13));
            stateListAnimator.addState(m.f356641L, s(f12, f13));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f12).setDuration(0L));
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(m.f356633D);
            stateListAnimator.addState(m.f356642M, animatorSet);
            stateListAnimator.addState(m.f356643N, s(0.0f, 0.0f));
            this.f356691O = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (p()) {
            r();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.m
    public final void n(@P ColorStateList colorStateList) {
        Drawable drawable = this.f356649c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(com.google.android.material.ripple.b.c(colorStateList));
        } else {
            super.n(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.m
    public final boolean p() {
        return FloatingActionButton.this.f356598l || (this.f356652f && this.f356669w.getSizeDimension() < this.f356657k);
    }

    @N
    public final AnimatorSet s(float f12, float f13) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f12};
        FloatingActionButton floatingActionButton = this.f356669w;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f13).setDuration(100L));
        animatorSet.setInterpolator(m.f356633D);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.m
    public final void i() {
    }

    @Override // com.google.android.material.floatingactionbutton.m
    public final void q() {
    }

    @Override // com.google.android.material.floatingactionbutton.m
    public final void k(int[] iArr) {
    }
}
