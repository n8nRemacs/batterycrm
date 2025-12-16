package com.avito.android.comfortable_deal.submitting.select.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.comfortable_deal.submitting.recycler.items.selectItem.DescriptionItem;
import com.avito.android.comfortable_deal.submitting.recycler.items.selectItem.SelectorItem;
import com.avito.android.comfortable_deal.submitting.select.mvi.entity.SubmittingSelectInternalAction;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import pq.C47129c;
import rp.C47698a;
import rp.C47699b;

/* compiled from: SubmittingSelectReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/select/mvi/o;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/comfortable_deal/submitting/select/mvi/entity/SubmittingSelectInternalAction;", "Lpq/c;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class o implements u<SubmittingSelectInternalAction, C47129c> {
    @Inject
    public o() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C47129c a(SubmittingSelectInternalAction submittingSelectInternalAction, C47129c c47129c) {
        SubmittingSelectInternalAction submittingSelectInternalAction2 = submittingSelectInternalAction;
        C47129c c47129c2 = c47129c;
        if (!(submittingSelectInternalAction2 instanceof SubmittingSelectInternalAction.SelectItem)) {
            if (!(submittingSelectInternalAction2 instanceof SubmittingSelectInternalAction.ContentLoaded)) {
                return c47129c2;
            }
            rp.h hVar = ((SubmittingSelectInternalAction.ContentLoaded) submittingSelectInternalAction2).f123342b;
            List<C47698a> list = hVar.f430220b;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (C47698a c47698a : list) {
                List<C47699b> list2 = c47698a.f430191d;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
                for (C47699b c47699b : list2) {
                    arrayList2.add(new DescriptionItem(c47699b.f430195b, c47699b.f430194a));
                }
                arrayList.add(new SelectorItem(c47698a.f430188a, c47698a.f430190c, c47698a.f430189b, arrayList2, c47698a.f430192e, false, c47698a.f430193f));
            }
            return new C47129c(hVar.f430219a, arrayList, hVar.f430221c, false, "", null);
        }
        List<SelectorItem> list3 = c47129c2.f428792c;
        int i12 = ((SubmittingSelectInternalAction.SelectItem) submittingSelectInternalAction2).f123346b;
        SelectorItem selectorItem = list3.get(i12);
        List<SelectorItem> list4 = list3;
        ArrayList arrayList3 = new ArrayList(C42745f0.q(list4, 10));
        int i13 = 0;
        for (Object obj : list4) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            SelectorItem selectorItem2 = (SelectorItem) obj;
            arrayList3.add(new SelectorItem(selectorItem2.f123231b, selectorItem2.f123232c, selectorItem2.f123233d, selectorItem2.f123234e, selectorItem2.f123235f, i13 == i12, selectorItem2.f123237h));
            i13 = i14;
        }
        return new C47129c(c47129c2.f428791b, arrayList3, c47129c2.f428793d, true, selectorItem.f123235f, selectorItem.f123237h);
    }
}
