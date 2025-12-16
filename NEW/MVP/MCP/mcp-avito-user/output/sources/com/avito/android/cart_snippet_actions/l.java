package com.avito.android.cart_snippet_actions;

import android.view.View;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CartActionsView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_snippet_actions/l;", "", "_avito_cart-snippet-actions_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface l {

    /* compiled from: CartActionsView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void Hf(@Y61.l String str, boolean z12);

    void Qr();

    void setAddToCartButtonVisible(boolean z12);

    void setOnAddToCartClickListener(@Y61.l View.OnClickListener onClickListener);

    void setStepperMaxValue(int i12);

    void setStepperValue(int i12);

    void setStepperValueChangedListener(@Y61.k Y41.l<? super Integer, G0> lVar);

    void setStepperVisible(boolean z12);

    void setVisible(boolean z12);
}
