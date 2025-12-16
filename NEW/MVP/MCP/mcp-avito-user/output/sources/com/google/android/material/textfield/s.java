package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.facebook.imageutils.JfifUtil;
import com.google.android.material.R;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.WeakHashMap;
import lY0.C43707b;
import lY0.C43708c;
import wY0.C49576a;

/* compiled from: IndicatorViewController.java */
/* loaded from: classes6.dex */
final class s {

    /* renamed from: A, reason: collision with root package name */
    @P
    public ColorStateList f357518A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f357519B;

    /* renamed from: a, reason: collision with root package name */
    public final int f357520a;

    /* renamed from: b, reason: collision with root package name */
    public final int f357521b;

    /* renamed from: c, reason: collision with root package name */
    public final int f357522c;

    /* renamed from: d, reason: collision with root package name */
    @N
    public final TimeInterpolator f357523d;

    /* renamed from: e, reason: collision with root package name */
    @N
    public final TimeInterpolator f357524e;

    /* renamed from: f, reason: collision with root package name */
    @N
    public final TimeInterpolator f357525f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f357526g;

    /* renamed from: h, reason: collision with root package name */
    @N
    public final TextInputLayout f357527h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f357528i;

    /* renamed from: j, reason: collision with root package name */
    public int f357529j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f357530k;

    /* renamed from: l, reason: collision with root package name */
    @P
    public AnimatorSet f357531l;

    /* renamed from: m, reason: collision with root package name */
    public final float f357532m;

    /* renamed from: n, reason: collision with root package name */
    public int f357533n;

    /* renamed from: o, reason: collision with root package name */
    public int f357534o;

    /* renamed from: p, reason: collision with root package name */
    @P
    public CharSequence f357535p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f357536q;

    /* renamed from: r, reason: collision with root package name */
    @P
    public AppCompatTextView f357537r;

    /* renamed from: s, reason: collision with root package name */
    @P
    public CharSequence f357538s;

    /* renamed from: t, reason: collision with root package name */
    public int f357539t;

    /* renamed from: u, reason: collision with root package name */
    public int f357540u;

    /* renamed from: v, reason: collision with root package name */
    @P
    public ColorStateList f357541v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f357542w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f357543x;

    /* renamed from: y, reason: collision with root package name */
    @P
    public AppCompatTextView f357544y;

    /* renamed from: z, reason: collision with root package name */
    public int f357545z;

    /* compiled from: IndicatorViewController.java */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f357546a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextView f357547b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f357548c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TextView f357549d;

        public a(int i12, TextView textView, int i13, TextView textView2) {
            this.f357546a = i12;
            this.f357547b = textView;
            this.f357548c = i13;
            this.f357549d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            AppCompatTextView appCompatTextView;
            int i12 = this.f357546a;
            s sVar = s.this;
            sVar.f357533n = i12;
            sVar.f357531l = null;
            TextView textView = this.f357547b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f357548c == 1 && (appCompatTextView = sVar.f357537r) != null) {
                    appCompatTextView.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f357549d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                textView2.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            TextView textView = this.f357549d;
            if (textView != null) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
            }
        }
    }

    public s(@N TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f357526g = context;
        this.f357527h = textInputLayout;
        this.f357532m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f357520a = C49576a.c(context, R.attr.motionDurationShort4, JfifUtil.MARKER_EOI);
        this.f357521b = C49576a.c(context, R.attr.motionDurationMedium4, 167);
        this.f357522c = C49576a.c(context, R.attr.motionDurationShort4, 167);
        this.f357523d = C49576a.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, C43707b.f413882d);
        int i12 = R.attr.motionEasingEmphasizedDecelerateInterpolator;
        LinearInterpolator linearInterpolator = C43707b.f413879a;
        this.f357524e = C49576a.d(context, i12, linearInterpolator);
        this.f357525f = C49576a.d(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(TextView textView, int i12) {
        if (this.f357528i == null && this.f357530k == null) {
            Context context = this.f357526g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f357528i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f357528i;
            TextInputLayout textInputLayout = this.f357527h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f357530k = new FrameLayout(context);
            this.f357528i.addView(this.f357530k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i12 == 0 || i12 == 1) {
            this.f357530k.setVisibility(0);
            this.f357530k.addView(textView);
        } else {
            this.f357528i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f357528i.setVisibility(0);
        this.f357529j++;
    }

    public final void b() {
        if (this.f357528i != null) {
            TextInputLayout textInputLayout = this.f357527h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f357526g;
                boolean zE2 = com.google.android.material.resources.c.e(context);
                LinearLayout linearLayout = this.f357528i;
                int i12 = R.dimen.material_helper_text_font_1_3_padding_horizontal;
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                int paddingStart = editText.getPaddingStart();
                if (zE2) {
                    paddingStart = context.getResources().getDimensionPixelSize(i12);
                }
                int i13 = R.dimen.material_helper_text_font_1_3_padding_top;
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zE2) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(i13);
                }
                int i14 = R.dimen.material_helper_text_font_1_3_padding_horizontal;
                int paddingEnd = editText.getPaddingEnd();
                if (zE2) {
                    paddingEnd = context.getResources().getDimensionPixelSize(i14);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f357531l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(@N ArrayList arrayList, boolean z12, @P AppCompatTextView appCompatTextView, int i12, int i13, int i14) {
        if (appCompatTextView == null || !z12) {
            return;
        }
        if (i12 == i14 || i12 == i13) {
            boolean z13 = i14 == i12;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.ALPHA, z13 ? 1.0f : 0.0f);
            int i15 = this.f357522c;
            objectAnimatorOfFloat.setDuration(z13 ? this.f357521b : i15);
            objectAnimatorOfFloat.setInterpolator(z13 ? this.f357524e : this.f357525f);
            if (i12 == i14 && i13 != 0) {
                objectAnimatorOfFloat.setStartDelay(i15);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i14 != i12 || i13 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_Y, -this.f357532m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f357520a);
            objectAnimatorOfFloat2.setInterpolator(this.f357523d);
            objectAnimatorOfFloat2.setStartDelay(i15);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    @P
    public final TextView e(int i12) {
        if (i12 == 1) {
            return this.f357537r;
        }
        if (i12 != 2) {
            return null;
        }
        return this.f357544y;
    }

    public final void f() {
        this.f357535p = null;
        c();
        if (this.f357533n == 1) {
            if (!this.f357543x || TextUtils.isEmpty(this.f357542w)) {
                this.f357534o = 0;
            } else {
                this.f357534o = 2;
            }
        }
        i(this.f357533n, this.f357534o, h(this.f357537r, ""));
    }

    public final void g(TextView textView, int i12) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f357528i;
        if (linearLayout == null) {
            return;
        }
        if ((i12 == 0 || i12 == 1) && (frameLayout = this.f357530k) != null) {
            frameLayout.removeView(textView);
        } else {
            linearLayout.removeView(textView);
        }
        int i13 = this.f357529j - 1;
        this.f357529j = i13;
        LinearLayout linearLayout2 = this.f357528i;
        if (i13 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(@P AppCompatTextView appCompatTextView, @N CharSequence charSequence) {
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        TextInputLayout textInputLayout = this.f357527h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f357534o == this.f357533n && appCompatTextView != null && TextUtils.equals(appCompatTextView.getText(), charSequence));
    }

    public final void i(int i12, int i13, boolean z12) {
        TextView textViewE;
        TextView textViewE2;
        if (i12 == i13) {
            return;
        }
        if (z12) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f357531l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f357543x, this.f357544y, 2, i12, i13);
            d(arrayList, this.f357536q, this.f357537r, 1, i12, i13);
            C43708c.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i13, e(i12), i12, e(i13)));
            animatorSet.start();
        } else if (i12 != i13) {
            if (i13 != 0 && (textViewE2 = e(i13)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i12 != 0 && (textViewE = e(i12)) != null) {
                textViewE.setVisibility(4);
                if (i12 == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            this.f357533n = i13;
        }
        TextInputLayout textInputLayout = this.f357527h;
        textInputLayout.updateEditTextBackground();
        textInputLayout.updateLabelState(z12);
        textInputLayout.updateTextInputBoxState();
    }
}
