package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* compiled from: StaticLayoutBuilderCompat.java */
@RestrictTo
/* loaded from: classes6.dex */
final class B {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f356701a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f356702b;

    /* renamed from: c, reason: collision with root package name */
    public final int f356703c;

    /* renamed from: d, reason: collision with root package name */
    public int f356704d;

    /* renamed from: k, reason: collision with root package name */
    public boolean f356711k;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    public CollapsingToolbarLayout.c f356713m;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f356705e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f356706f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f356707g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f356708h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f356709i = 1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f356710j = true;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    public TextUtils.TruncateAt f356712l = null;

    /* compiled from: StaticLayoutBuilderCompat.java */
    public static class a extends Exception {
    }

    public B(CharSequence charSequence, TextPaint textPaint, int i12) {
        this.f356701a = charSequence;
        this.f356702b = textPaint;
        this.f356703c = i12;
        this.f356704d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f356701a == null) {
            this.f356701a = "";
        }
        int iMax = Math.max(0, this.f356703c);
        CharSequence charSequenceEllipsize = this.f356701a;
        int i12 = this.f356706f;
        TextPaint textPaint = this.f356702b;
        if (i12 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f356712l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f356704d);
        this.f356704d = iMin;
        if (this.f356711k && this.f356706f == 1) {
            this.f356705e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f356705e);
        builderObtain.setIncludePad(this.f356710j);
        builderObtain.setTextDirection(this.f356711k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f356712l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f356706f);
        float f12 = this.f356707g;
        if (f12 != 0.0f || this.f356708h != 1.0f) {
            builderObtain.setLineSpacing(f12, this.f356708h);
        }
        if (this.f356706f > 1) {
            builderObtain.setHyphenationFrequency(this.f356709i);
        }
        CollapsingToolbarLayout.c cVar = this.f356713m;
        if (cVar != null) {
            cVar.a();
        }
        return builderObtain.build();
    }
}
