package com.avito.android.photo_gallery.autoteka_teaser.v2;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import kotlin.Metadata;

/* compiled from: AutotekaTeaserV2GalleryInsightListViewFullScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/autoteka_teaser/v2/j;", "Landroid/text/style/ImageSpan;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class j extends ImageSpan {

    /* renamed from: b, reason: collision with root package name */
    public final int f216854b;

    /* renamed from: c, reason: collision with root package name */
    public final int f216855c;

    /* renamed from: d, reason: collision with root package name */
    public final int f216856d;

    public j(int i12, int i13, int i14, @k Drawable drawable) {
        super(drawable);
        this.f216854b = i12;
        this.f216855c = i13;
        this.f216856d = i14;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(@k Canvas canvas, @k CharSequence charSequence, int i12, int i13, float f12, int i14, int i15, int i16, @k Paint paint) {
        int iHeight = (this.f216856d - (this.f216855c / 2)) - (getDrawable().getBounds().height() / 2);
        canvas.save();
        canvas.translate(f12 + this.f216854b, iHeight);
        getDrawable().draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(@k Paint paint, @k CharSequence charSequence, int i12, int i13, @l Paint.FontMetricsInt fontMetricsInt) {
        return getDrawable().getBounds().width() + this.f216854b;
    }
}
