package com.avito.android.short_term_rent.bookingform.mvi.interactor;

import com.avito.android.R;
import com.avito.android.short_term_rent.bookingform.domain.models.items.BookingFormBlockItem;
import com.avito.android.short_term_rent.bookingform.items.refund_toggle.RefundToggleItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BookingFormBlockItemsToConveyorItemsMapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/interactor/k;", "", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k {
    @Inject
    public k() {
    }

    public static RefundToggleItem.RefundToggleButton a(BookingFormBlockItem.RefundToggle.RefundToggleButton refundToggleButton, String str) {
        String str2;
        boolean zF2 = L.f(str, refundToggleButton.f281397b);
        int i12 = zF2 ? R.drawable.bg_item_refund_toggle_selected : R.drawable.bg_item_refund_toggle;
        String str3 = refundToggleButton.f281399d;
        return (str3 == null || (str2 = refundToggleButton.f281400e) == null) ? new RefundToggleItem.RefundToggleButton.Regular(refundToggleButton.f281397b, refundToggleButton.f281398c, refundToggleButton.f281402g, refundToggleButton.f281401f, zF2, i12) : new RefundToggleItem.RefundToggleButton.WithDiscount(refundToggleButton.f281397b, refundToggleButton.f281398c, refundToggleButton.f281402g, str3, zF2, i12, refundToggleButton.f281401f, str2);
    }
}
