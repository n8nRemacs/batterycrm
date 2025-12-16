package com.avito.android.verification.verification_fetch_invoice.mvi;

import OM0.c;
import com.avito.android.arch.mvi.t;
import com.avito.android.verification.verification_fetch_invoice.mvi.entity.FetchInvoiceInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FetchInvoiceOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/verification/verification_fetch_invoice/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction;", "LOM0/c;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k implements t<FetchInvoiceInternalAction, OM0.c> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final OM0.c b(FetchInvoiceInternalAction fetchInvoiceInternalAction) {
        FetchInvoiceInternalAction fetchInvoiceInternalAction2 = fetchInvoiceInternalAction;
        if (fetchInvoiceInternalAction2 instanceof FetchInvoiceInternalAction.ShowErrorToast) {
            return new c.C0788c();
        }
        if (fetchInvoiceInternalAction2 instanceof FetchInvoiceInternalAction.NavigateBack) {
            return c.b.f12215a;
        }
        if (fetchInvoiceInternalAction2 instanceof FetchInvoiceInternalAction.FinishActivity) {
            return c.a.f12214a;
        }
        if (fetchInvoiceInternalAction2 instanceof FetchInvoiceInternalAction.Loading ? true : fetchInvoiceInternalAction2 instanceof FetchInvoiceInternalAction.Loaded ? true : fetchInvoiceInternalAction2 instanceof FetchInvoiceInternalAction.Error ? true : fetchInvoiceInternalAction2 instanceof FetchInvoiceInternalAction.UpdateListState ? true : fetchInvoiceInternalAction2 instanceof FetchInvoiceInternalAction.SetButtonItemLoading ? true : fetchInvoiceInternalAction2 instanceof FetchInvoiceInternalAction.DoNothing) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
