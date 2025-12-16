package com.avito.android.vas_discount.v2.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.vas_discount.v2.mvi.entity.VasDiscountV2InternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import qL0.InterfaceC47318b;

/* compiled from: VasDiscountV2OneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_discount/v2/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/vas_discount/v2/mvi/entity/VasDiscountV2InternalAction;", "LqL0/b;", "<init>", "()V", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements t<VasDiscountV2InternalAction, InterfaceC47318b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC47318b b(VasDiscountV2InternalAction vasDiscountV2InternalAction) {
        InterfaceC47318b cVar;
        VasDiscountV2InternalAction vasDiscountV2InternalAction2 = vasDiscountV2InternalAction;
        if (vasDiscountV2InternalAction2 instanceof VasDiscountV2InternalAction.CloseDialog) {
            return InterfaceC47318b.a.f429197a;
        }
        if (vasDiscountV2InternalAction2 instanceof VasDiscountV2InternalAction.NavigateToDeepLink) {
            cVar = new InterfaceC47318b.C12322b(((VasDiscountV2InternalAction.NavigateToDeepLink) vasDiscountV2InternalAction2).f319816b);
        } else {
            if (!(vasDiscountV2InternalAction2 instanceof VasDiscountV2InternalAction.LoadDataError)) {
                return null;
            }
            cVar = new InterfaceC47318b.c(((VasDiscountV2InternalAction.LoadDataError) vasDiscountV2InternalAction2).f319813b);
        }
        return cVar;
    }
}
