package com.avito.android.advert.item.autoteka.teaser.v2;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import kotlin.Metadata;

/* compiled from: AdvertDetailsAutotekaTeaserV2View.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser/v2/e;", "Landroid/text/style/ImageSpan;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class e extends ImageSpan {

    /* renamed from: b, reason: collision with root package name */
    public final int f73100b;

    /* renamed from: c, reason: collision with root package name */
    public final int f73101c;

    /* renamed from: d, reason: collision with root package name */
    public final int f73102d;

    public e(int i12, int i13, int i14, @k Drawable drawable) {
        super(drawable);
        this.f73100b = i12;
        this.f73101c = i13;
        this.f73102d = i14;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(@k Canvas canvas, @k CharSequence charSequence, int i12, int i13, float f12, int i14, int i15, int i16, @k Paint paint) {
        int iHeight = (this.f73102d - (this.f73101c / 2)) - (getDrawable().getBounds().height() / 2);
        canvas.save();
        canvas.translate(f12 + this.f73100b, iHeight);
        getDrawable().draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(@k Paint paint, @k CharSequence charSequence, int i12, int i13, @l Paint.FontMetricsInt fontMetricsInt) {
        return getDrawable().getBounds().width() + this.f73100b;
    }
}
