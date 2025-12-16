package com.yandex.mobile.ads.impl;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;

/* loaded from: classes8.dex */
public final class y81 extends Spannable.Factory {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private final Drawable f391960a;

    /* renamed from: b, reason: collision with root package name */
    private final int f391961b;

    /* renamed from: c, reason: collision with root package name */
    private final int f391962c;

    public y81(@j.P Drawable drawable, int i12, int i13) {
        this.f391960a = drawable;
        this.f391961b = i12;
        this.f391962c = i13;
    }

    @Override // android.text.Spannable.Factory
    public final Spannable newSpannable(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.f391960a != null && this.f391961b > 0) {
            spannableStringBuilder.append((CharSequence) "  ");
            Drawable drawable = this.f391960a;
            int i12 = this.f391961b;
            drawable.setBounds(0, 0, i12, i12);
            f9 f9Var = new f9(drawable);
            ColorDrawable colorDrawable = new ColorDrawable(0);
            int i13 = this.f391962c;
            colorDrawable.setBounds(0, 0, i13, i13);
            f9 f9Var2 = new f9(colorDrawable);
            spannableStringBuilder.setSpan(f9Var, 0, 1, 33);
            spannableStringBuilder.setSpan(f9Var2, 1, 2, 33);
        }
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }
}
