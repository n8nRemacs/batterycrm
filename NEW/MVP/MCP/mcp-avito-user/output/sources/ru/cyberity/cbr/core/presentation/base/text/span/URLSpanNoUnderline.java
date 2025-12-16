package ru.cyberity.cbr.core.presentation.base.text.span;

import Y61.k;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import kotlin.Metadata;

/* compiled from: URLSpanNoUnderline.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/text/span/URLSpanNoUnderline;", "Landroid/text/style/ClickableSpan;", "<init>", "()V", "Landroid/text/TextPaint;", "ds", "Lkotlin/G0;", "updateDrawState", "(Landroid/text/TextPaint;)V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public abstract class URLSpanNoUnderline extends ClickableSpan {
    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@k TextPaint ds2) {
        super.updateDrawState(ds2);
        ds2.setUnderlineText(false);
    }
}
