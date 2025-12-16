package com.avito.android.advert_core.price_list.dialog.mvi;

import com.avito.android.advert_core.price_list.dialog.mvi.entity.AdvertPriceListBottomSheetDialogInternalAction;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AdvertPriceListBottomSheetDialogReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert_core/price_list/dialog/mvi/f;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/advert_core/price_list/dialog/mvi/entity/AdvertPriceListBottomSheetDialogInternalAction;", "LN9/a;", "<init>", "()V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements u<AdvertPriceListBottomSheetDialogInternalAction, N9.a> {
    @Inject
    public f() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final N9.a a(AdvertPriceListBottomSheetDialogInternalAction advertPriceListBottomSheetDialogInternalAction, N9.a aVar) {
        AdvertPriceListBottomSheetDialogInternalAction advertPriceListBottomSheetDialogInternalAction2 = advertPriceListBottomSheetDialogInternalAction;
        if (advertPriceListBottomSheetDialogInternalAction2 instanceof AdvertPriceListBottomSheetDialogInternalAction.Content) {
            return new N9.a(((AdvertPriceListBottomSheetDialogInternalAction.Content) advertPriceListBottomSheetDialogInternalAction2).f84089b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
