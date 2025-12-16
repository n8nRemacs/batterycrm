package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import java.util.WeakHashMap;

/* compiled from: Fade.java */
/* renamed from: androidx.transition.n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C23503n extends o0 {

    /* compiled from: Fade.java */
    /* renamed from: androidx.transition.n$a */
    public static class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final View f54809a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f54810b = false;

        public a(View view) {
            this.f54809a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            View view = this.f54809a;
            h0.b(view, 1.0f);
            if (this.f54810b) {
                view.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            View view = this.f54809a;
            if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                this.f54810b = true;
                view.setLayerType(2, null);
            }
        }
    }

    public C23503n(int i12) {
        S(i12);
    }

    @Override // androidx.transition.o0
    @j.P
    public final Animator O(ViewGroup viewGroup, View view, V v12, V v13) {
        Float f12;
        float fFloatValue = (v12 == null || (f12 = (Float) v12.f54716a.get("android:fade:transitionAlpha")) == null) ? 0.0f : f12.floatValue();
        return T(view, fFloatValue != 1.0f ? fFloatValue : 0.0f, 1.0f);
    }

    @Override // androidx.transition.o0
    @j.P
    public final Animator Q(ViewGroup viewGroup, View view, V v12, V v13) {
        Float f12;
        h0.f54765a.getClass();
        return T(view, (v12 == null || (f12 = (Float) v12.f54716a.get("android:fade:transitionAlpha")) == null) ? 1.0f : f12.floatValue(), 0.0f);
    }

    public final ObjectAnimator T(View view, float f12, float f13) {
        if (f12 == f13) {
            return null;
        }
        h0.b(view, f12);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, h0.f54766b, f13);
        objectAnimatorOfFloat.addListener(new a(view));
        a(new C23502m(view));
        return objectAnimatorOfFloat;
    }

    @Override // androidx.transition.o0, androidx.transition.L
    public final void j(@j.N V v12) {
        o0.M(v12);
        v12.f54716a.put("android:fade:transitionAlpha", Float.valueOf(h0.f54765a.b(v12.f54717b)));
    }

    public C23503n() {
    }
}
