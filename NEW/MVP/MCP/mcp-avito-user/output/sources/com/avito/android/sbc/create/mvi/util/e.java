package com.avito.android.sbc.create.mvi.util;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ClickableText.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/util/e;", "Landroid/text/style/ClickableSpan;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends ClickableSpan {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Uo0.e, G0> f259912b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f259913c;

    /* JADX WARN: Multi-variable type inference failed */
    public e(Y41.l<? super Uo0.e, G0> lVar, d dVar) {
        this.f259912b = lVar;
        this.f259913c = dVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(@Y61.k View view) {
        this.f259912b.invoke(this.f259913c.f259911b.f259909e);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(@Y61.k TextPaint textPaint) {
        d dVar = this.f259913c;
        if (dVar.f259911b.f259908d) {
            super.updateDrawState(textPaint);
        }
        textPaint.setUnderlineText(dVar.f259911b.f259907c);
    }
}
