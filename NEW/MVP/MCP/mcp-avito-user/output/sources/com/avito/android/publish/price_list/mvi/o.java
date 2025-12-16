package com.avito.android.publish.price_list.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.publish.price_list.mvi.entity.SelectPriceListInternalAction;
import com.avito.android.publish.price_list.mvi.entity.e;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SelectPriceListOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/o;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction;", "Lcom/avito/android/publish/price_list/mvi/entity/e;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class o implements t<SelectPriceListInternalAction, com.avito.android.publish.price_list.mvi.entity.e> {
    @Inject
    public o() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final com.avito.android.publish.price_list.mvi.entity.e b(SelectPriceListInternalAction selectPriceListInternalAction) {
        SelectPriceListInternalAction selectPriceListInternalAction2 = selectPriceListInternalAction;
        if (selectPriceListInternalAction2 instanceof SelectPriceListInternalAction.OnBack) {
            return new e.a(((SelectPriceListInternalAction.OnBack) selectPriceListInternalAction2).f238804b);
        }
        if (selectPriceListInternalAction2 instanceof SelectPriceListInternalAction.SaveDraftAndExitPublishing) {
            return e.C7175e.f238841a;
        }
        if (selectPriceListInternalAction2 instanceof SelectPriceListInternalAction.NavigateToNextStep) {
            return e.d.f238840a;
        }
        if (selectPriceListInternalAction2 instanceof SelectPriceListInternalAction.ScrollToFirstItemError) {
            return new e.f(((SelectPriceListInternalAction.ScrollToFirstItemError) selectPriceListInternalAction2).f238806b);
        }
        if (selectPriceListInternalAction2 instanceof SelectPriceListInternalAction.ShowDefaultMessage) {
            return new e.g(((SelectPriceListInternalAction.ShowDefaultMessage) selectPriceListInternalAction2).f238811b);
        }
        if (selectPriceListInternalAction2 instanceof SelectPriceListInternalAction.ShowErrorMessage) {
            return new e.h(((SelectPriceListInternalAction.ShowErrorMessage) selectPriceListInternalAction2).f238812b);
        }
        if (selectPriceListInternalAction2 instanceof SelectPriceListInternalAction.NavigateToAddObjectScreen) {
            SelectPriceListInternalAction.NavigateToAddObjectScreen navigateToAddObjectScreen = (SelectPriceListInternalAction.NavigateToAddObjectScreen) selectPriceListInternalAction2;
            return new e.b(navigateToAddObjectScreen.f238799b, navigateToAddObjectScreen.f238800c);
        }
        if (selectPriceListInternalAction2 instanceof SelectPriceListInternalAction.NavigateToEditObjectScreen) {
            SelectPriceListInternalAction.NavigateToEditObjectScreen navigateToEditObjectScreen = (SelectPriceListInternalAction.NavigateToEditObjectScreen) selectPriceListInternalAction2;
            return new e.c(navigateToEditObjectScreen.f238801b, navigateToEditObjectScreen.f238802c);
        }
        if (!(selectPriceListInternalAction2 instanceof SelectPriceListInternalAction.ShowPriceListClearDialog)) {
            return null;
        }
        SelectPriceListInternalAction.ShowPriceListClearDialog showPriceListClearDialog = (SelectPriceListInternalAction.ShowPriceListClearDialog) selectPriceListInternalAction2;
        return new e.i(showPriceListClearDialog.f238814b, showPriceListClearDialog.f238815c, showPriceListClearDialog.f238816d, showPriceListClearDialog.f238817e);
    }
}
