package com.avito.android.serp.adapter.sale_advert_item;

import android.view.View;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertGridSaleItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class f extends N implements Y41.a<Integer> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f271556l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View view) {
        super(0);
        this.f271556l = view;
    }

    @Override // Y41.a
    public final Integer invoke() {
        return Integer.valueOf(this.f271556l.getContext().getResources().getDimensionPixelSize(R.dimen.sales_and_promotion_card_corner_radius));
    }
}
