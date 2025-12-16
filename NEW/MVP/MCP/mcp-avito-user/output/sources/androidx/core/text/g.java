package androidx.core.text;

import Fc1.O2;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.RestrictTo;
import j.N;
import j.P;
import j.X;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: PrecomputedTextCompat.java */
/* loaded from: classes.dex */
public class g implements Spannable {

    /* compiled from: PrecomputedTextCompat.java */
    @X
    public static class a {
    }

    /* compiled from: PrecomputedTextCompat.java */
    public static class c extends FutureTask<g> {

        /* compiled from: PrecomputedTextCompat.java */
        public static class a implements Callable<g> {
            @Override // java.util.concurrent.Callable
            public final g call() {
                throw null;
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i12) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i12, int i13, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return (T[]) null.getSpans(i12, i13, cls);
        }
        throw null;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        throw null;
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i12, int i13, Class cls) {
        throw null;
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        ((PrecomputedText) null).removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i12, int i13, int i14) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        ((PrecomputedText) null).setSpan(obj, i12, i13, i14);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i12, int i13) {
        throw null;
    }

    @Override // java.lang.CharSequence
    @N
    public final String toString() {
        throw null;
    }

    /* compiled from: PrecomputedTextCompat.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final TextPaint f44873a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public final TextDirectionHeuristic f44874b;

        /* renamed from: c, reason: collision with root package name */
        public final int f44875c;

        /* renamed from: d, reason: collision with root package name */
        public final int f44876d;

        /* compiled from: PrecomputedTextCompat.java */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public int f44877a;

            /* renamed from: b, reason: collision with root package name */
            public int f44878b;
        }

        public b(@N TextPaint textPaint, @N TextDirectionHeuristic textDirectionHeuristic, int i12, int i13) {
            if (Build.VERSION.SDK_INT >= 29) {
                O2.k(textPaint).setBreakStrategy(i12).setHyphenationFrequency(i13).setTextDirection(textDirectionHeuristic).build();
            }
            this.f44873a = textPaint;
            this.f44874b = textDirectionHeuristic;
            this.f44875c = i12;
            this.f44876d = i13;
        }

        @RestrictTo
        public final boolean a(@N b bVar) {
            if (this.f44875c != bVar.f44875c || this.f44876d != bVar.f44876d) {
                return false;
            }
            TextPaint textPaint = this.f44873a;
            if (textPaint.getTextSize() != bVar.f44873a.getTextSize()) {
                return false;
            }
            float textScaleX = textPaint.getTextScaleX();
            TextPaint textPaint2 = bVar.f44873a;
            if (textScaleX == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
                return textPaint.getTypeface() == null ? textPaint2.getTypeface() == null : textPaint.getTypeface().equals(textPaint2.getTypeface());
            }
            return false;
        }

        public final boolean equals(@P Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return a(bVar) && this.f44874b == bVar.f44874b;
        }

        public final int hashCode() {
            TextPaint textPaint = this.f44873a;
            return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f44874b, Integer.valueOf(this.f44875c), Integer.valueOf(this.f44876d));
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            StringBuilder sb3 = new StringBuilder("textSize=");
            TextPaint textPaint = this.f44873a;
            sb3.append(textPaint.getTextSize());
            sb2.append(sb3.toString());
            sb2.append(", textScaleX=" + textPaint.getTextScaleX());
            sb2.append(", textSkewX=" + textPaint.getTextSkewX());
            sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
            sb2.append(", textLocale=" + textPaint.getTextLocales());
            sb2.append(", typeface=" + textPaint.getTypeface());
            sb2.append(", variationSettings=" + textPaint.getFontVariationSettings());
            sb2.append(", textDir=" + this.f44874b);
            sb2.append(", breakStrategy=" + this.f44875c);
            sb2.append(", hyphenationFrequency=" + this.f44876d);
            sb2.append("}");
            return sb2.toString();
        }

        @X
        public b(@N PrecomputedText.Params params) {
            this.f44873a = params.getTextPaint();
            this.f44874b = params.getTextDirection();
            this.f44875c = params.getBreakStrategy();
            this.f44876d = params.getHyphenationFrequency();
        }
    }
}
