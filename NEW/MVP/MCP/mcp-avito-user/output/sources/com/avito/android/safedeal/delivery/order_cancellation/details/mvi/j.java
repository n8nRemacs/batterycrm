package com.avito.android.safedeal.delivery.order_cancellation.details.mvi;

import Dn0.c;
import com.avito.android.arch.mvi.u;
import com.avito.android.safedeal.delivery.order_cancellation.details.mvi.entity.ReasonDetailsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ReasonDetailsReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsInternalAction;", "LDn0/c;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements u<ReasonDetailsInternalAction, Dn0.c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Dn0.c a(ReasonDetailsInternalAction reasonDetailsInternalAction, Dn0.c cVar) {
        ReasonDetailsInternalAction reasonDetailsInternalAction2 = reasonDetailsInternalAction;
        Dn0.c cVar2 = cVar;
        return reasonDetailsInternalAction2 instanceof ReasonDetailsInternalAction.ItemsConverted ? Dn0.c.a(cVar2, null, null, new c.a.C0193a(((ReasonDetailsInternalAction.ItemsConverted) reasonDetailsInternalAction2).f256250b), 3) : reasonDetailsInternalAction2 instanceof ReasonDetailsInternalAction.Loading ? Dn0.c.a(cVar2, null, null, c.a.C0194c.f3450a, 3) : reasonDetailsInternalAction2 instanceof ReasonDetailsInternalAction.CommentTextChanged ? Dn0.c.a(cVar2, null, ((ReasonDetailsInternalAction.CommentTextChanged) reasonDetailsInternalAction2).f256249b, null, 5) : reasonDetailsInternalAction2 instanceof ReasonDetailsInternalAction.SelectedOptionChanged ? Dn0.c.a(cVar2, ((ReasonDetailsInternalAction.SelectedOptionChanged) reasonDetailsInternalAction2).f256253b, null, null, 6) : cVar2;
    }
}
