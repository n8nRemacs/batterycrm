package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.transition.V;
import java.util.HashMap;

/* compiled from: TextScale.java */
@RestrictTo
/* loaded from: classes6.dex */
public class E extends androidx.transition.L {

    /* compiled from: TextScale.java */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f356728a;

        public a(TextView textView) {
            this.f356728a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@j.N ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            TextView textView = this.f356728a;
            textView.setScaleX(fFloatValue);
            textView.setScaleY(fFloatValue);
        }
    }

    @Override // androidx.transition.L
    public final void f(@j.N V v12) {
        View view = v12.f54717b;
        if (view instanceof TextView) {
            v12.f54716a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.L
    public final void j(@j.N V v12) {
        View view = v12.f54717b;
        if (view instanceof TextView) {
            v12.f54716a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.L
    public final Animator n(@j.N ViewGroup viewGroup, @j.P V v12, @j.P V v13) {
        if (v12 == null || v13 == null || !(v12.f54717b instanceof TextView)) {
            return null;
        }
        View view = v13.f54717b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap map = v12.f54716a;
        HashMap map2 = v13.f54716a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new a(textView));
        return valueAnimatorOfFloat;
    }
}
