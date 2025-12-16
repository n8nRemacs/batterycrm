package com.avito.android.profile.remove.screen.items.text_area_item;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import kotlin.Metadata;

/* compiled from: TextAreaItemSpan.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/remove/screen/items/text_area_item/g;", "Landroid/text/style/LeadingMarginSpan;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements LeadingMarginSpan {

    /* renamed from: b, reason: collision with root package name */
    public final int f224150b;

    /* renamed from: c, reason: collision with root package name */
    public final int f224151c;

    public g(int i12, int i13) {
        this.f224150b = i12;
        this.f224151c = i13;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(@k Canvas canvas, @k Paint paint, int i12, int i13, int i14, int i15, int i16, @l CharSequence charSequence, int i17, int i18, boolean z12, @k Layout layout) {
        Spanned spanned = (Spanned) charSequence;
        int lineBaseline = layout.getLineBaseline(layout.getLineForOffset(spanned.getSpanStart(this)));
        if (spanned.getSpanStart(this) == i17) {
            canvas.drawText("—", 0.0f, lineBaseline, paint);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z12) {
        return this.f224150b + this.f224151c;
    }
}
