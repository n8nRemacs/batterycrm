package com.avito.android.advert.item.safedeal.real_one_click_payment_block.delivery_address;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PaymentDeliveryAddress.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/delivery_address/PaymentDeliveryAddress;", "Landroid/widget/FrameLayout;", "", "addressText", "Lkotlin/G0;", "setText", "(Ljava/lang/String;)V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PaymentDeliveryAddress extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f78923b;

    @j
    public PaymentDeliveryAddress(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final void setText(@k String addressText) {
        this.f78923b.setText(addressText);
    }

    public PaymentDeliveryAddress(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
        this.f78923b = (TextView) View.inflate(context, R.layout.advert_details_safedeal_payment_delivery_address, this).findViewById(R.id.payment_block_delivery_address_description);
    }
}
