package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import j.N;
import j.X;
import java.util.stream.IntStream;

/* compiled from: UnprecomputeTextOnModificationSpannable.java */
/* loaded from: classes.dex */
class v implements Spannable {

    /* renamed from: b, reason: collision with root package name */
    public boolean f46162b = false;

    /* renamed from: c, reason: collision with root package name */
    @N
    public Spannable f46163c;

    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    @X
    public static class a {
    }

    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    public static class b {
        public boolean a(CharSequence charSequence) {
            return charSequence instanceof androidx.core.text.g;
        }
    }

    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    @X
    public static class c extends b {
        @Override // androidx.emoji2.text.v.b
        public final boolean a(CharSequence charSequence) {
            return androidx.core.view.accessibility.d.v(charSequence) || (charSequence instanceof androidx.core.text.g);
        }
    }

    public v(@N Spannable spannable) {
        this.f46163c = spannable;
    }

    public final void a() {
        Spannable spannable = this.f46163c;
        if (!this.f46162b) {
            if ((Build.VERSION.SDK_INT < 28 ? new b() : new c()).a(spannable)) {
                this.f46163c = new SpannableString(spannable);
            }
        }
        this.f46162b = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i12) {
        return this.f46163c.charAt(i12);
    }

    @Override // java.lang.CharSequence
    @N
    @X
    public final IntStream chars() {
        return this.f46163c.chars();
    }

    @Override // java.lang.CharSequence
    @N
    @X
    public final IntStream codePoints() {
        return this.f46163c.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f46163c.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f46163c.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f46163c.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i12, int i13, Class<T> cls) {
        return (T[]) this.f46163c.getSpans(i12, i13, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f46163c.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i12, int i13, Class cls) {
        return this.f46163c.nextSpanTransition(i12, i13, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f46163c.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i12, int i13, int i14) {
        a();
        this.f46163c.setSpan(obj, i12, i13, i14);
    }

    @Override // java.lang.CharSequence
    @N
    public final CharSequence subSequence(int i12, int i13) {
        return this.f46163c.subSequence(i12, i13);
    }

    @Override // java.lang.CharSequence
    @N
    public final String toString() {
        return this.f46163c.toString();
    }
}
