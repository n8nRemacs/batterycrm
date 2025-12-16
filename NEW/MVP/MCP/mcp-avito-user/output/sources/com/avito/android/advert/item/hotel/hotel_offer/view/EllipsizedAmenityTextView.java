package com.avito.android.advert.item.hotel.hotel_offer.view;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.text_view.a;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;

/* compiled from: EllipsizedAmenityTextView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/view/EllipsizedAmenityTextView;", "Lcom/avito/android/lib/design/text_view/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EllipsizedAmenityTextView extends a {

    /* renamed from: q, reason: collision with root package name */
    @k
    public final TextPaint f76202q;

    @j
    public EllipsizedAmenityTextView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) throws ExecutionException, InterruptedException {
        int height;
        CharSequence text;
        Object next;
        super.onLayout(z12, i12, i13, i14, i15);
        if (!z12 || (height = (getHeight() - getPaddingTop()) - getPaddingBottom()) <= 0 || getLayout() == null || (text = getText()) == null || text.length() == 0) {
            return;
        }
        CharSequence text2 = getText();
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(text2, 0, text2.length(), this.f76202q, (getWidth() - getPaddingStart()) - getPaddingEnd()).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(getIncludeFontPadding()).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).build();
        kotlin.ranges.k it = s.r(0, staticLayoutBuild.getLineCount()).iterator();
        while (true) {
            if (!it.f406910d) {
                next = null;
                break;
            } else {
                next = it.next();
                if (staticLayoutBuild.getLineBottom(((Number) next).intValue()) > height) {
                    break;
                }
            }
        }
        Integer num = (Integer) next;
        setMaxLines(num != null ? num.intValue() : staticLayoutBuild.getLineCount());
    }

    @Override // com.avito.android.lib.design.text_view.a, android.widget.TextView
    public final void setText(@l CharSequence charSequence, @l TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        requestLayout();
    }

    public EllipsizedAmenityTextView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12, 0, 8, null);
        this.f76202q = new TextPaint(getPaint());
    }
}
