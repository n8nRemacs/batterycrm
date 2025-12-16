package com.avito.android.marketplace.mvi.components;

import android.net.Uri;
import android.webkit.ValueCallback;
import com.avito.android.arch.mvi.t;
import com.avito.android.marketplace.mvi.entity.FinanceMarketplaceInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import mY.InterfaceC44029b;

/* compiled from: FinanceMarketplaceOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/marketplace/mvi/components/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceInternalAction;", "LmY/b;", "<init>", "()V", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements t<FinanceMarketplaceInternalAction, InterfaceC44029b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC44029b b(FinanceMarketplaceInternalAction financeMarketplaceInternalAction) {
        FinanceMarketplaceInternalAction financeMarketplaceInternalAction2 = financeMarketplaceInternalAction;
        if (financeMarketplaceInternalAction2 instanceof FinanceMarketplaceInternalAction.ShowCancellationDialog) {
            return InterfaceC44029b.d.f414569a;
        }
        if (financeMarketplaceInternalAction2 instanceof FinanceMarketplaceInternalAction.LoadUrl) {
            return InterfaceC44029b.C11832b.f414567a;
        }
        if (financeMarketplaceInternalAction2 instanceof FinanceMarketplaceInternalAction.Finish) {
            return new InterfaceC44029b.a();
        }
        if (financeMarketplaceInternalAction2 instanceof FinanceMarketplaceInternalAction.ShowContent) {
            return InterfaceC44029b.c.f414568a;
        }
        if (financeMarketplaceInternalAction2 instanceof FinanceMarketplaceInternalAction.ShowError) {
            return InterfaceC44029b.c.f414568a;
        }
        if (financeMarketplaceInternalAction2 instanceof FinanceMarketplaceInternalAction.ShowPermissionToast) {
            return InterfaceC44029b.e.f414570a;
        }
        if (financeMarketplaceInternalAction2 instanceof FinanceMarketplaceInternalAction.TryToOpenCamera) {
            ValueCallback<Uri[]> valueCallback = ((FinanceMarketplaceInternalAction.TryToOpenCamera) financeMarketplaceInternalAction2).f185946b;
            if (valueCallback != null) {
                return new InterfaceC44029b.f(valueCallback);
            }
        } else if (!(financeMarketplaceInternalAction2 instanceof FinanceMarketplaceInternalAction.UpdateLoadingProgress)) {
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }
}
