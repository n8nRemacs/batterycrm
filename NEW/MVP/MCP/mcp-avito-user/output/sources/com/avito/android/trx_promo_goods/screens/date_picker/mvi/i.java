package com.avito.android.trx_promo_goods.screens.date_picker.mvi;

import com.avito.android.trx_promo_goods.screens.date_picker.deeplink.TrxPromoGoodsConfigureDatePickerLinkContent;
import com.avito.android.trx_promo_goods.screens.date_picker.mvi.entity.TrxPromoGoodsDatePickerInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TrxPromoGoodsDatePickerBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/date_picker/mvi/i;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/trx_promo_goods/screens/date_picker/mvi/entity/TrxPromoGoodsDatePickerInternalAction;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements com.avito.android.arch.mvi.b<TrxPromoGoodsDatePickerInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final TrxPromoGoodsConfigureDatePickerLinkContent f303730a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f303731b;

    @Inject
    public i(@Y61.k TrxPromoGoodsConfigureDatePickerLinkContent trxPromoGoodsConfigureDatePickerLinkContent, @Y61.l String str) {
        this.f303730a = trxPromoGoodsConfigureDatePickerLinkContent;
        this.f303731b = str;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<TrxPromoGoodsDatePickerInternalAction> a() {
        return new C43210w(new TrxPromoGoodsDatePickerInternalAction.Content(this.f303730a, this.f303731b));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
