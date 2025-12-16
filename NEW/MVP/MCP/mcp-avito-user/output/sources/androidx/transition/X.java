package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.animation.BaseInterpolator;
import androidx.transition.L;
import com.avito.android.R;

/* compiled from: TranslationAnimationCreator.java */
/* loaded from: classes10.dex */
class X {
    @j.P
    public static ObjectAnimator a(@j.N View view, @j.N V v12, int i12, int i13, float f12, float f13, float f14, float f15, @j.P BaseInterpolator baseInterpolator, @j.N o0 o0Var) {
        float f16;
        float f17;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) v12.f54717b.getTag(R.id.transition_position)) != null) {
            f16 = (r7[0] - i12) + translationX;
            f17 = (r7[1] - i13) + translationY;
        } else {
            f16 = f12;
            f17 = f13;
        }
        int iRound = Math.round(f16 - translationX) + i12;
        int iRound2 = Math.round(f17 - translationY) + i13;
        view.setTranslationX(f16);
        view.setTranslationY(f17);
        if (f16 == f14 && f17 == f15) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f16, f14), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f17, f15));
        a aVar = new a(view, v12.f54717b, iRound, iRound2, translationX, translationY);
        o0Var.a(aVar);
        objectAnimatorOfPropertyValuesHolder.addListener(aVar);
        objectAnimatorOfPropertyValuesHolder.addPauseListener(aVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(baseInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* compiled from: TranslationAnimationCreator.java */
    public static class a extends AnimatorListenerAdapter implements L.f {

        /* renamed from: a, reason: collision with root package name */
        public final View f54723a;

        /* renamed from: b, reason: collision with root package name */
        public final View f54724b;

        /* renamed from: c, reason: collision with root package name */
        public final int f54725c;

        /* renamed from: d, reason: collision with root package name */
        public final int f54726d;

        /* renamed from: e, reason: collision with root package name */
        public int[] f54727e;

        /* renamed from: f, reason: collision with root package name */
        public float f54728f;

        /* renamed from: g, reason: collision with root package name */
        public float f54729g;

        /* renamed from: h, reason: collision with root package name */
        public final float f54730h;

        /* renamed from: i, reason: collision with root package name */
        public final float f54731i;

        public a(View view, View view2, int i12, int i13, float f12, float f13) {
            this.f54724b = view;
            this.f54723a = view2;
            this.f54725c = i12 - Math.round(view.getTranslationX());
            this.f54726d = i13 - Math.round(view.getTranslationY());
            this.f54730h = f12;
            this.f54731i = f13;
            int[] iArr = (int[]) view2.getTag(R.id.transition_position);
            this.f54727e = iArr;
            if (iArr != null) {
                view2.setTag(R.id.transition_position, null);
            }
        }

        @Override // androidx.transition.L.f
        public final void e(@j.N L l12) {
            View view = this.f54724b;
            view.setTranslationX(this.f54730h);
            view.setTranslationY(this.f54731i);
            l12.A(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            if (this.f54727e == null) {
                this.f54727e = new int[2];
            }
            int[] iArr = this.f54727e;
            float f12 = this.f54725c;
            View view = this.f54724b;
            iArr[0] = Math.round(view.getTranslationX() + f12);
            this.f54727e[1] = Math.round(view.getTranslationY() + this.f54726d);
            this.f54723a.setTag(R.id.transition_position, this.f54727e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            View view = this.f54724b;
            this.f54728f = view.getTranslationX();
            this.f54729g = view.getTranslationY();
            view.setTranslationX(this.f54730h);
            view.setTranslationY(this.f54731i);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            float f12 = this.f54728f;
            View view = this.f54724b;
            view.setTranslationX(f12);
            view.setTranslationY(this.f54729g);
        }

        @Override // androidx.transition.L.f
        public final void a() {
        }

        @Override // androidx.transition.L.f
        public final void b() {
        }

        @Override // androidx.transition.L.f
        public final void c() {
        }

        @Override // androidx.transition.L.f
        public final void d(@j.N L l12) {
        }
    }
}
