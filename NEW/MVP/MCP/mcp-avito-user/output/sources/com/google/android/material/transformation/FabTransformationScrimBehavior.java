package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import j.N;
import java.util.ArrayList;
import lY0.C43708c;
import lY0.j;

@Deprecated
/* loaded from: classes6.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    public final j f357733c;

    /* renamed from: d, reason: collision with root package name */
    public final j f357734d;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f357735a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f357736b;

        public a(View view, boolean z12) {
            this.f357735a = z12;
            this.f357736b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f357735a) {
                return;
            }
            this.f357736b.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.f357735a) {
                this.f357736b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f357733c = new j(75L);
        this.f357734d = new j(0L);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean d(View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean u(@N CoordinatorLayout coordinatorLayout, @N View view, @N MotionEvent motionEvent) {
        return false;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @N
    public final AnimatorSet w(@N View view, @N View view2, boolean z12, boolean z13) {
        ObjectAnimator objectAnimatorOfFloat;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        j jVar = z12 ? this.f357733c : this.f357734d;
        if (z12) {
            if (!z13) {
                view2.setAlpha(0.0f);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        jVar.a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        C43708c.a(animatorSet, arrayList);
        animatorSet.addListener(new a(view2, z12));
        return animatorSet;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f357733c = new j(75L);
        this.f357734d = new j(0L);
    }
}
