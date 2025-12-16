package com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_button;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PaymentTypeButton.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/payment_button/PaymentTypeButton;", "Landroid/widget/FrameLayout;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PaymentTypeButton extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ImageView f78940b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f78941c;

    /* renamed from: d, reason: collision with root package name */
    public final int f78942d;

    /* renamed from: e, reason: collision with root package name */
    public final int f78943e;

    @j
    public PaymentTypeButton(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public PaymentTypeButton(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) throws Resources.NotFoundException {
        super(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.advert_details_payment_block_type_button_standard_width);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.advert_details_payment_block_type_button_small_width);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.advert_details_payment_block_type_button_standard_horinztal_padding);
        int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.advert_details_payment_block_type_button_small_horinztal_padding);
        int i15 = context.getResources().getDisplayMetrics().widthPixels;
        this.f78942d = i15;
        int iB2 = y6.b(375);
        this.f78943e = iB2;
        View.inflate(context, R.layout.advert_details_safedeal_payment_type_button, this);
        View viewFindViewById = findViewById(R.id.payment_block_type_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.payment_block_type_button_icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f78940b = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.payment_block_type_button_card_number);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f78941c = (TextView) viewFindViewById3;
        int dimensionPixelSize5 = getContext().getResources().getDimensionPixelSize(R.dimen.advert_details_payment_block_type_button_height);
        dimensionPixelSize = i15 <= iB2 ? dimensionPixelSize2 : dimensionPixelSize;
        dimensionPixelSize3 = i15 <= iB2 ? dimensionPixelSize4 : dimensionPixelSize3;
        constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize5));
        constraintLayout.setPadding(dimensionPixelSize3, constraintLayout.getPaddingTop(), dimensionPixelSize3, constraintLayout.getPaddingBottom());
    }
}
