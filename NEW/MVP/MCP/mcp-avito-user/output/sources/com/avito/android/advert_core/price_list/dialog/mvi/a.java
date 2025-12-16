package com.avito.android.advert_core.price_list.dialog.mvi;

import Y61.k;
import Y61.l;
import com.avito.android.advert_core.price_list.dialog.AdvertPriceListBottomSheetDialogOpenParams;
import com.avito.android.advert_core.price_list.dialog.mvi.entity.AdvertPriceListBottomSheetDialogInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AdvertPriceListBottomSheetDialogBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/price_list/dialog/mvi/a;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/advert_core/price_list/dialog/mvi/entity/AdvertPriceListBottomSheetDialogInternalAction;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements com.avito.android.arch.mvi.b<AdvertPriceListBottomSheetDialogInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AdvertPriceListBottomSheetDialogOpenParams f84079a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.price_list.converter.a f84080b;

    @Inject
    public a(@k AdvertPriceListBottomSheetDialogOpenParams advertPriceListBottomSheetDialogOpenParams, @k com.avito.android.advert_core.price_list.converter.a aVar) {
        this.f84079a = advertPriceListBottomSheetDialogOpenParams;
        this.f84080b = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @k
    public final InterfaceC43160i<AdvertPriceListBottomSheetDialogInternalAction> a() {
        return new C43210w(new AdvertPriceListBottomSheetDialogInternalAction.Content(this.f84080b.b(this.f84079a.f84056b)));
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
