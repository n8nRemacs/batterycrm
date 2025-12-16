package com.yandex.div.core.view2.divs;

import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import com.yandex.div2.AbstractC38582v7;
import com.yandex.div2.C38600x7;
import kotlin.Metadata;

/* compiled from: DivTextBinder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundSpan;", "Landroid/text/style/UnderlineSpan;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class DivBackgroundSpan extends UnderlineSpan {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final C38600x7 f368039b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AbstractC38582v7 f368040c;

    public DivBackgroundSpan(@Y61.l C38600x7 c38600x7, @Y61.l AbstractC38582v7 abstractC38582v7) {
        this.f368039b = c38600x7;
        this.f368040c = abstractC38582v7;
    }

    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
    public final void updateDrawState(@Y61.k TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
