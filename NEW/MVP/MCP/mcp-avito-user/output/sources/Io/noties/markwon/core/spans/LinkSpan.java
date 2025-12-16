package io.noties.markwon.core.spans;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import io.noties.markwon.core.q;
import j.N;

/* loaded from: classes8.dex */
public class LinkSpan extends URLSpan {

    /* renamed from: b, reason: collision with root package name */
    public final q f401679b;

    /* renamed from: c, reason: collision with root package name */
    public final String f401680c;

    /* renamed from: d, reason: collision with root package name */
    public final io.noties.markwon.d f401681d;

    public LinkSpan(@N q qVar, @N String str, @N io.noties.markwon.d dVar) {
        super(str);
        this.f401679b = qVar;
        this.f401680c = str;
        this.f401681d = dVar;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f401681d.resolve(view, this.f401680c);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(@N TextPaint textPaint) {
        this.f401679b.getClass();
        textPaint.setUnderlineText(true);
        textPaint.setColor(textPaint.linkColor);
    }
}
