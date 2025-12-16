package com.avito.android.beduin.common.component.payment_type_selector;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: BeduinPaymentMethodSelectorView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/payment_type_selector/e;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f101813b;

    public e(f fVar) {
        this.f101813b = fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        Integer between;
        Integer right;
        Integer between2;
        Integer left;
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        f fVar = this.f101813b;
        if (iU2 == 0) {
            PaymentMethodSelectorCustomPaddings paymentMethodSelectorCustomPaddings = fVar.f101816H0;
            rect.left = (paymentMethodSelectorCustomPaddings == null || (left = paymentMethodSelectorCustomPaddings.getLeft()) == null) ? y6.b(23) : y6.b(left.intValue());
        } else if (iU2 != zVar.b() - 1) {
            PaymentMethodSelectorCustomPaddings paymentMethodSelectorCustomPaddings2 = fVar.f101816H0;
            rect.left = (paymentMethodSelectorCustomPaddings2 == null || (between = paymentMethodSelectorCustomPaddings2.getBetween()) == null) ? y6.b(10) : y6.b(between.intValue());
        } else {
            PaymentMethodSelectorCustomPaddings paymentMethodSelectorCustomPaddings3 = fVar.f101816H0;
            rect.left = (paymentMethodSelectorCustomPaddings3 == null || (between2 = paymentMethodSelectorCustomPaddings3.getBetween()) == null) ? y6.b(10) : y6.b(between2.intValue());
            PaymentMethodSelectorCustomPaddings paymentMethodSelectorCustomPaddings4 = fVar.f101816H0;
            rect.right = (paymentMethodSelectorCustomPaddings4 == null || (right = paymentMethodSelectorCustomPaddings4.getRight()) == null) ? y6.b(23) : y6.b(right.intValue());
        }
    }
}
