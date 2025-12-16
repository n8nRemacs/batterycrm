package com.avito.android.publish.slots.vin_cropped_image.item.vin_cropped_image;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TextLinkFormatter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/vin_cropped_image/item/vin_cropped_image/a;", "Landroid/text/style/ClickableSpan;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends ClickableSpan {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f245171b;

    public a(Y41.a<G0> aVar) {
        this.f245171b = aVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(@Y61.k View view) {
        this.f245171b.invoke();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(@Y61.k TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
