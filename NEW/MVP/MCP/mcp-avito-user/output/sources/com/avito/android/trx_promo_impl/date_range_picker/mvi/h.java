package com.avito.android.trx_promo_impl.date_range_picker.mvi;

import com.avito.android.trx_promo_impl.date_range_picker.mvi.entity.TrxPromoDateRangePickerInternalAction;
import com.avito.android.trx_promo_public.deeplink.TrxPromoConfigureDateRangePickerLinkContent;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TrxPromoDateRangePickerBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/h;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerInternalAction;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements com.avito.android.arch.mvi.b<TrxPromoDateRangePickerInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final TrxPromoConfigureDateRangePickerLinkContent f304048a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f304049b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f304050c;

    @Inject
    public h(@Y61.k TrxPromoConfigureDateRangePickerLinkContent trxPromoConfigureDateRangePickerLinkContent, @Y61.l @com.avito.android.trx_promo_impl.date_range_picker.di.b String str, @com.avito.android.trx_promo_impl.date_range_picker.di.i @Y61.l String str2) {
        this.f304048a = trxPromoConfigureDateRangePickerLinkContent;
        this.f304049b = str;
        this.f304050c = str2;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<TrxPromoDateRangePickerInternalAction> a() {
        return new C43210w(new TrxPromoDateRangePickerInternalAction.Content(this.f304048a, this.f304049b, this.f304050c));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
