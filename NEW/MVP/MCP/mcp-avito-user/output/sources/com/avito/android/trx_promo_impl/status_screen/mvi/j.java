package com.avito.android.trx_promo_impl.status_screen.mvi;

import RF0.m;
import aG0.C19772c;
import com.avito.android.arch.mvi.u;
import com.avito.android.error.z;
import com.avito.android.trx_promo_impl.status_screen.mvi.entity.TrxPromoStatusInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TrxPromoStatusReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/trx_promo_impl/status_screen/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusInternalAction;", "LaG0/c;", "<init>", "()V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements u<TrxPromoStatusInternalAction, C19772c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C19772c a(TrxPromoStatusInternalAction trxPromoStatusInternalAction, C19772c c19772c) {
        TrxPromoStatusInternalAction trxPromoStatusInternalAction2 = trxPromoStatusInternalAction;
        C19772c c19772c2 = c19772c;
        if (trxPromoStatusInternalAction2 instanceof TrxPromoStatusInternalAction.Loading) {
            return C19772c.a(c19772c2, false, null, null, null, null, null, null, true, 63);
        }
        if (trxPromoStatusInternalAction2 instanceof TrxPromoStatusInternalAction.Content.Success) {
            XF0.c cVar = ((TrxPromoStatusInternalAction.Content.Success) trxPromoStatusInternalAction2).f304463b;
            return C19772c.a(c19772c2, false, null, new m(cVar.getImage().getValue(), cVar.getImage().getValueDark()), cVar.getTitle(), cVar.getSubtitle(), new RF0.h(cVar.getButton().getTitle(), cVar.getButton().getUri(), null, null, 12, null), null, false, 3);
        }
        if (!(trxPromoStatusInternalAction2 instanceof TrxPromoStatusInternalAction.Content.Forbidden)) {
            return trxPromoStatusInternalAction2 instanceof TrxPromoStatusInternalAction.Error ? C19772c.a(c19772c2, false, null, null, null, null, null, z.k(((TrxPromoStatusInternalAction.Error) trxPromoStatusInternalAction2).f304464b), false, 63) : c19772c2;
        }
        WF0.c cVar2 = ((TrxPromoStatusInternalAction.Content.Forbidden) trxPromoStatusInternalAction2).f304462b;
        return C19772c.a(c19772c2, false, null, new m(cVar2.getImage().getValue(), cVar2.getImage().getValueDark()), cVar2.getTitle(), cVar2.getSubtitle(), new RF0.h(cVar2.getButton().getTitle(), cVar2.getButton().getUri(), null, null, 12, null), null, false, 3);
    }
}
