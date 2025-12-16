package com.avito.android.vas_discount.v2.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.vas_discount.v2.mvi.entity.VasDiscountV2InternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VasDiscountV2Reducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_discount/v2/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/vas_discount/v2/mvi/entity/VasDiscountV2InternalAction;", "LqL0/c;", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j implements u<VasDiscountV2InternalAction, qL0.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_discount.business.d f319823b;

    @Inject
    public j(@Y61.k com.avito.android.vas_discount.business.d dVar) {
        this.f319823b = dVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final qL0.c a(VasDiscountV2InternalAction vasDiscountV2InternalAction, qL0.c cVar) {
        VasDiscountV2InternalAction vasDiscountV2InternalAction2 = vasDiscountV2InternalAction;
        qL0.c cVar2 = cVar;
        return vasDiscountV2InternalAction2 instanceof VasDiscountV2InternalAction.Loading ? qL0.c.a(cVar2, null, true) : vasDiscountV2InternalAction2 instanceof VasDiscountV2InternalAction.LoadDataSuccess ? new qL0.c(this.f319823b.a(((VasDiscountV2InternalAction.LoadDataSuccess) vasDiscountV2InternalAction2).f319815b), null, false) : vasDiscountV2InternalAction2 instanceof VasDiscountV2InternalAction.LoadDataError ? qL0.c.a(cVar2, ((VasDiscountV2InternalAction.LoadDataError) vasDiscountV2InternalAction2).f319813b, false) : cVar2;
    }
}
