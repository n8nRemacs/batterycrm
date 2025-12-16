package com.avito.android.passport.profile_add.merge.select_business_vrf.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.entity.SelectBusinessVrfInternalAction;
import com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.PassportNotChosenItem;
import com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.PassportSelectBusinessItem;
import com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.PassportSelectBusinessListItem;
import com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.PassportSelectBusinessSingleReqItem;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;

/* compiled from: SelectBusinessVrfReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/p;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction;", "Lg60/c;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class p implements u<SelectBusinessVrfInternalAction, g60.c> {
    @Inject
    public p() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final g60.c a(SelectBusinessVrfInternalAction selectBusinessVrfInternalAction, g60.c cVar) {
        ArrayList arrayListA;
        SelectBusinessVrfInternalAction selectBusinessVrfInternalAction2 = selectBusinessVrfInternalAction;
        g60.c cVar2 = cVar;
        if (selectBusinessVrfInternalAction2.equals(SelectBusinessVrfInternalAction.Close.f213432b) ? true : selectBusinessVrfInternalAction2 instanceof SelectBusinessVrfInternalAction.CloseFlow) {
            return cVar2;
        }
        if (selectBusinessVrfInternalAction2 instanceof SelectBusinessVrfInternalAction.MergeFinished) {
            return g60.c.a(cVar2, null, null, false, 1535);
        }
        if (selectBusinessVrfInternalAction2 instanceof SelectBusinessVrfInternalAction.OpenDeepLink) {
            return cVar2;
        }
        if (selectBusinessVrfInternalAction2.equals(SelectBusinessVrfInternalAction.NoChoiceError.f213443b)) {
            List<PassportSelectBusinessListItem> list = cVar2.f396305g;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (com.avito.conveyor_item.a aVarA : list) {
                if (aVarA instanceof PassportSelectBusinessItem) {
                    aVarA = PassportSelectBusinessItem.a((PassportSelectBusinessItem) aVarA, false, true, 23);
                }
                arrayList.add(aVarA);
            }
            List listB = v0.b(arrayList);
            if (!cVar2.f396308j) {
                listB.add(new PassportNotChosenItem(null, 1, null));
            }
            return g60.c.a(cVar2, listB, null, true, 1759);
        }
        if (selectBusinessVrfInternalAction2 instanceof SelectBusinessVrfInternalAction.Loading) {
            return new g60.c(null, null, false, null, null, null, null, null, false, true, false, 511, null);
        }
        if (!(selectBusinessVrfInternalAction2 instanceof SelectBusinessVrfInternalAction.BusinessVrfDataLoaded)) {
            if (selectBusinessVrfInternalAction2 instanceof SelectBusinessVrfInternalAction.LoadingError) {
                return new g60.c(null, null, false, null, null, null, null, null, false, false, true, 511, null);
            }
            if (selectBusinessVrfInternalAction2 instanceof SelectBusinessVrfInternalAction.MergeError) {
                return cVar2;
            }
            if (selectBusinessVrfInternalAction2 instanceof SelectBusinessVrfInternalAction.NewSearch) {
                return g60.c.a(cVar2, ((SelectBusinessVrfInternalAction.NewSearch) selectBusinessVrfInternalAction2).f213442b, null, false, 1887);
            }
            if (!(selectBusinessVrfInternalAction2 instanceof SelectBusinessVrfInternalAction.ItemClick)) {
                throw new NoWhenBranchMatchedException();
            }
            SelectBusinessVrfInternalAction.ItemClick itemClick = (SelectBusinessVrfInternalAction.ItemClick) selectBusinessVrfInternalAction2;
            return g60.c.a(cVar2, itemClick.f213434b, itemClick.f213435c, false, 1631);
        }
        K50.c cVar3 = ((SelectBusinessVrfInternalAction.BusinessVrfDataLoaded) selectBusinessVrfInternalAction2).f213431b;
        Integer numValueOf = cVar3.a().size() == 1 ? Integer.valueOf(((K50.a) C42745f0.E(cVar3.a())).getUserIdFrom()) : null;
        String title = cVar3.getTitle();
        AttributedText description = cVar3.getDescription();
        boolean showSearch = cVar3.getShowSearch();
        String cancelActionTitle = cVar3.getCancelActionTitle();
        String confirmActionTitle = cVar3.getConfirmActionTitle();
        List<K50.a> listA = cVar3.a();
        if (cVar3.a().size() == 1) {
            List<String> listA2 = ((K50.a) C42745f0.E(cVar3.a())).a();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(listA2, 10));
            for (String str : listA2) {
                arrayList2.add(new PassportSelectBusinessSingleReqItem(str, str));
            }
            arrayListA = arrayList2;
        } else {
            arrayListA = d.a(cVar3.a(), numValueOf);
        }
        return new g60.c(title, description, showSearch, cancelActionTitle, confirmActionTitle, arrayListA, listA, numValueOf, false, false, false, 1280, null);
    }
}
