package com.avito.android.util.text.span;

import Y61.k;
import Y61.l;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import com.avito.android.deep_linking.links.x;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UrlSpan.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/text/span/UrlSpan;", "Landroid/text/style/URLSpan;", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UrlSpan extends URLSpan {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final x f319083b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f319084c;

    public /* synthetic */ UrlSpan(String str, x xVar, boolean z12, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : xVar, (i12 & 4) != 0 ? true : z12);
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(@k View view) {
        x xVar = this.f319083b;
        if (xVar != null ? xVar.X(getURL()) : false) {
            return;
        }
        super.onClick(view);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(@k TextPaint textPaint) {
        if (this.f319084c) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }
    }

    public UrlSpan(@k String str, @l x xVar, boolean z12) {
        super(str);
        this.f319083b = xVar;
        this.f319084c = z12;
    }
}
