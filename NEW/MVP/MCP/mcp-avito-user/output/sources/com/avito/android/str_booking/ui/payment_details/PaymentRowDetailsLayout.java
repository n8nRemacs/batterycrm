package com.avito.android.str_booking.ui.payment_details;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PaymentRowDetailsLayout.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/ui/payment_details/PaymentRowDetailsLayout;", "Landroid/widget/LinearLayout;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentRowDetailsLayout extends LinearLayout {
    @j
    public PaymentRowDetailsLayout(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.view.ViewGroup
    public final void addView(@k View view) {
        view.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        if (getChildCount() != 0) {
            D6.c(view, Integer.valueOf(y6.b(8)), null, null, null, 14);
        }
        super.addView(view);
    }

    public PaymentRowDetailsLayout(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        setOrientation(0);
    }
}
