package com.avito.android.sbc.autodispatcheslist.adapter;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.avito.android.sbc.autodispatcheslist.adapter.c;
import kotlin.Metadata;

/* compiled from: SbcAutoDispatchFullyLoadedItemBlueprint.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/autodispatcheslist/adapter/d;", "Landroid/text/style/ClickableSpan;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends ClickableSpan {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c.a f259041b;

    public d(c.a aVar) {
        this.f259041b = aVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(@Y61.k View view) {
        this.f259041b.a();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(@Y61.k TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
