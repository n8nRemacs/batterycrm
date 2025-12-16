package com.yandex.div.internal.spannable;

import Y61.k;
import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import kotlin.Metadata;

/* compiled from: NoUnderlineSpan.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/internal/spannable/NoUnderlineSpan;", "Landroid/text/style/UnderlineSpan;", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class NoUnderlineSpan extends UnderlineSpan {
    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
    public final void updateDrawState(@k TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
