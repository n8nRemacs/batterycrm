package com.avito.android.universal_transaction.mvi;

import CG0.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.error.z;
import com.avito.android.universal_transaction.mvi.entity.TransactionInternalAction;
import javax.inject.Inject;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;

/* compiled from: TransactionReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/universal_transaction/mvi/r;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/universal_transaction/mvi/entity/TransactionInternalAction;", "LCG0/c;", "<init>", "()V", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class r implements u<TransactionInternalAction, CG0.c> {
    @Inject
    public r() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final CG0.c a(TransactionInternalAction transactionInternalAction, CG0.c cVar) {
        TransactionInternalAction transactionInternalAction2 = transactionInternalAction;
        CG0.c cVar2 = cVar;
        if (transactionInternalAction2 instanceof TransactionInternalAction.LoadingStarted) {
            return CG0.c.a(cVar2, c.b.C0101c.f2070a, null, null, 6);
        }
        if (transactionInternalAction2 instanceof TransactionInternalAction.LoadingFailed) {
            return CG0.c.a(cVar2, new c.b.C0100b(((TransactionInternalAction.LoadingFailed) transactionInternalAction2).f306420b), null, null, 6);
        }
        if (!(transactionInternalAction2 instanceof TransactionInternalAction.HandleBeduinState)) {
            return transactionInternalAction2 instanceof TransactionInternalAction.ContentLoaded ? CG0.c.a(cVar2, null, ((TransactionInternalAction.ContentLoaded) transactionInternalAction2).f306417c, null, 5) : transactionInternalAction2 instanceof TransactionInternalAction.UpdateTransactionParams ? CG0.c.a(cVar2, null, null, ((TransactionInternalAction.UpdateTransactionParams) transactionInternalAction2).f306421b, 3) : cVar2;
        }
        AbstractC40048c.C11084c c11084c = AbstractC40048c.C11084c.f395217b;
        AbstractC40048c abstractC40048c = ((TransactionInternalAction.HandleBeduinState) transactionInternalAction2).f306419b;
        if (L.f(abstractC40048c, c11084c) ? true : L.f(abstractC40048c, AbstractC40048c.d.f395218b)) {
            return CG0.c.a(cVar2, c.b.C0101c.f2070a, null, null, 6);
        }
        if (abstractC40048c instanceof AbstractC40048c.a) {
            return CG0.c.a(cVar2, new c.b.a(((AbstractC40048c.a) abstractC40048c).getF395211c()), null, null, 6);
        }
        if (abstractC40048c instanceof AbstractC40048c.b) {
            return CG0.c.a(cVar2, new c.b.C0100b(z.n(((AbstractC40048c.b) abstractC40048c).f395216b)), null, null, 6);
        }
        throw new NoWhenBranchMatchedException();
    }
}
