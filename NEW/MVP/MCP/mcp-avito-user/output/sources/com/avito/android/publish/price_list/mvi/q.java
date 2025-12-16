package com.avito.android.publish.price_list.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.publish.price_list.mvi.entity.SelectPriceListInternalAction;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SelectPriceListReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/q;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction;", "Lcom/avito/android/publish/price_list/mvi/entity/f;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class q implements u<SelectPriceListInternalAction, com.avito.android.publish.price_list.mvi.entity.f> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.price_list.domain.j f238916b;

    @Inject
    public q(@Y61.k com.avito.android.publish.price_list.domain.j jVar) {
        this.f238916b = jVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final com.avito.android.publish.price_list.mvi.entity.f a(SelectPriceListInternalAction selectPriceListInternalAction, com.avito.android.publish.price_list.mvi.entity.f fVar) {
        SelectPriceListInternalAction selectPriceListInternalAction2 = selectPriceListInternalAction;
        com.avito.android.publish.price_list.mvi.entity.f fVar2 = fVar;
        if (selectPriceListInternalAction2 instanceof SelectPriceListInternalAction.InitUiState) {
            SelectPriceListInternalAction.InitUiState initUiState = (SelectPriceListInternalAction.InitUiState) selectPriceListInternalAction2;
            fVar2.f238860k.addAll(initUiState.f238794b);
            return com.avito.android.publish.price_list.mvi.entity.f.a(fVar2, initUiState.f238795c, initUiState.f238796d, initUiState.f238797e, null, false, false, false, null, null, 1016);
        }
        boolean z12 = selectPriceListInternalAction2 instanceof SelectPriceListInternalAction.ShowContent;
        com.avito.android.publish.price_list.domain.j jVar = this.f238916b;
        if (z12) {
            SelectPriceListInternalAction.ShowContent showContent = (SelectPriceListInternalAction.ShowContent) selectPriceListInternalAction2;
            PrintableText printableText = showContent.f238807b;
            List<com.avito.conveyor_item.a> list = showContent.f238810e;
            com.avito.android.publish.price_list.mvi.entity.f fVarA = com.avito.android.publish.price_list.mvi.entity.f.a(fVar2, null, null, null, printableText, showContent.f238808c, showContent.f238809d, false, list, list, 583);
            jVar.B(list);
            return fVarA;
        }
        if (selectPriceListInternalAction2 instanceof SelectPriceListInternalAction.UpdateExpandItems) {
            ArrayList arrayList = ((SelectPriceListInternalAction.UpdateExpandItems) selectPriceListInternalAction2).f238819b;
            com.avito.android.publish.price_list.mvi.entity.f fVarA2 = com.avito.android.publish.price_list.mvi.entity.f.a(fVar2, null, null, null, null, false, false, false, arrayList, arrayList, 639);
            jVar.B(arrayList);
            return fVarA2;
        }
        if (selectPriceListInternalAction2 instanceof SelectPriceListInternalAction.ShowSearchItems) {
            return com.avito.android.publish.price_list.mvi.entity.f.a(fVar2, null, null, null, null, false, false, false, ((SelectPriceListInternalAction.ShowSearchItems) selectPriceListInternalAction2).f238818b, null, 895);
        }
        if (selectPriceListInternalAction2 instanceof SelectPriceListInternalAction.InputSearchQuery) {
            jVar.a(((SelectPriceListInternalAction.InputSearchQuery) selectPriceListInternalAction2).f238798b);
            return fVar2;
        }
        if (selectPriceListInternalAction2 instanceof SelectPriceListInternalAction.ShowLoading) {
            return com.avito.android.publish.price_list.mvi.entity.f.a(fVar2, null, null, null, null, false, false, true, null, null, 959);
        }
        if (selectPriceListInternalAction2 instanceof SelectPriceListInternalAction.HideLoading) {
            return com.avito.android.publish.price_list.mvi.entity.f.a(fVar2, null, null, null, null, false, false, false, null, null, 959);
        }
        if (selectPriceListInternalAction2 instanceof SelectPriceListInternalAction.NavigateToAddObjectScreen ? true : selectPriceListInternalAction2 instanceof SelectPriceListInternalAction.NavigateToEditObjectScreen ? true : selectPriceListInternalAction2 instanceof SelectPriceListInternalAction.NavigateToNextStep ? true : selectPriceListInternalAction2 instanceof SelectPriceListInternalAction.ShowErrorMessage ? true : selectPriceListInternalAction2 instanceof SelectPriceListInternalAction.ScrollToFirstItemError ? true : selectPriceListInternalAction2 instanceof SelectPriceListInternalAction.OnBack ? true : selectPriceListInternalAction2 instanceof SelectPriceListInternalAction.SaveDraftAndExitPublishing ? true : selectPriceListInternalAction2 instanceof SelectPriceListInternalAction.ShowDefaultMessage ? true : selectPriceListInternalAction2 instanceof SelectPriceListInternalAction.ShowPriceListClearDialog) {
            return fVar2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
