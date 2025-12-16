package com.avito.android.universal_transaction.mvi;

import CG0.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.universal_transaction.mvi.entity.TransactionInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TransactionOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/universal_transaction/mvi/p;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/universal_transaction/mvi/entity/TransactionInternalAction;", "LCG0/b;", "<init>", "()V", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class p implements t<TransactionInternalAction, CG0.b> {
    @Inject
    public p() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final CG0.b b(TransactionInternalAction transactionInternalAction) {
        TransactionInternalAction transactionInternalAction2 = transactionInternalAction;
        if (transactionInternalAction2 instanceof TransactionInternalAction.ContentLoaded) {
            return new b.C0099b(((TransactionInternalAction.ContentLoaded) transactionInternalAction2).f306416b);
        }
        if (transactionInternalAction2 instanceof TransactionInternalAction.HandleBeduinEvent) {
            return new b.a(((TransactionInternalAction.HandleBeduinEvent) transactionInternalAction2).f306418b);
        }
        return null;
    }
}
