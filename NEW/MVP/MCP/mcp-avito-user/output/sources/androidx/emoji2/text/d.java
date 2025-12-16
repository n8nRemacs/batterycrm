package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.e;
import j.InterfaceC42148d;

/* compiled from: DefaultGlyphChecker.java */
@RestrictTo
@InterfaceC42148d
/* loaded from: classes.dex */
class d implements e.f {

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f46063b = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f46064a;

    public d() {
        TextPaint textPaint = new TextPaint();
        this.f46064a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
