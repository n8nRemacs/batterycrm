package com.avito.android.historical_suggests.suggest.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.historical_suggests.suggest.mvi.entity.HistoricalSuggestsInternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import uI.C48901b;
import uI.C48903d;
import uI.C48904e;
import vI.C49218c;

/* compiled from: HistoricalSuggestsReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/historical_suggests/suggest/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/historical_suggests/suggest/mvi/entity/HistoricalSuggestsInternalAction;", "LvI/c;", "<init>", "()V", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements u<HistoricalSuggestsInternalAction, C49218c> {
    @Inject
    public j() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.u
    public final C49218c a(HistoricalSuggestsInternalAction historicalSuggestsInternalAction, C49218c c49218c) {
        ArrayList arrayList;
        HistoricalSuggestsInternalAction historicalSuggestsInternalAction2 = historicalSuggestsInternalAction;
        C49218c c49218c2 = c49218c;
        C48901b c48901b = null;
        if (historicalSuggestsInternalAction2 instanceof HistoricalSuggestsInternalAction.Content) {
            List<C48904e> list = ((HistoricalSuggestsInternalAction.Content) historicalSuggestsInternalAction2).f162138b;
            List<C48904e> list2 = list;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C48904e) it.next()).f439891b);
            }
            Iterator it2 = C42745f0.H(arrayList2).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (C48903d.a((C48901b) next, c49218c2.f440662d)) {
                    c48901b = next;
                    break;
                }
            }
            return C49218c.a(c49218c2, list, c48901b, null, false, false, false, 32);
        }
        if (historicalSuggestsInternalAction2 instanceof HistoricalSuggestsInternalAction.Error) {
            return C49218c.a(c49218c2, null, null, null, false, true, false, 39);
        }
        if (historicalSuggestsInternalAction2 instanceof HistoricalSuggestsInternalAction.Loading) {
            return C49218c.a(c49218c2, null, null, null, true, false, false, 39);
        }
        if (historicalSuggestsInternalAction2 instanceof HistoricalSuggestsInternalAction.b) {
            return C49218c.a(c49218c2, null, ((HistoricalSuggestsInternalAction.b) historicalSuggestsInternalAction2).f162141b, null, false, false, false, 57);
        }
        boolean z12 = historicalSuggestsInternalAction2 instanceof HistoricalSuggestsInternalAction.c;
        List<C48904e> list3 = c49218c2.f440660b;
        if (!z12) {
            if (!(historicalSuggestsInternalAction2 instanceof HistoricalSuggestsInternalAction.a)) {
                if (historicalSuggestsInternalAction2 instanceof HistoricalSuggestsInternalAction.d) {
                    return C49218c.a(c49218c2, null, null, null, false, false, ((HistoricalSuggestsInternalAction.d) historicalSuggestsInternalAction2).f162143b, 31);
                }
                throw new NoWhenBranchMatchedException();
            }
            if (list3 != null) {
                List<C48904e> list4 = list3;
                ArrayList arrayList3 = new ArrayList(C42745f0.q(list4, 10));
                for (C48904e c48904e : list4) {
                    if (L.f(c48904e, ((HistoricalSuggestsInternalAction.a) historicalSuggestsInternalAction2).f162140b)) {
                        c48904e = new C48904e(c48904e.f439890a, c48904e.f439891b, null, c48904e.f439893d);
                    }
                    arrayList3.add(c48904e);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            return C49218c.a(c49218c2, arrayList, null, null, false, false, false, 62);
        }
        C48901b c48901b2 = c49218c2.f440661c;
        if (c48901b2 != null && C48903d.a(c48901b2, ((HistoricalSuggestsInternalAction.c) historicalSuggestsInternalAction2).f162142b)) {
            c48901b = c48901b2;
        } else if (list3 != null) {
            List<C48904e> list5 = list3;
            ArrayList arrayList4 = new ArrayList(C42745f0.q(list5, 10));
            Iterator<T> it3 = list5.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((C48904e) it3.next()).f439891b);
            }
            Iterator it4 = C42745f0.H(arrayList4).iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next2 = it4.next();
                if (C48903d.a((C48901b) next2, ((HistoricalSuggestsInternalAction.c) historicalSuggestsInternalAction2).f162142b)) {
                    c48901b = next2;
                    break;
                }
            }
            c48901b = c48901b;
        }
        return C49218c.a(c49218c2, null, c48901b, ((HistoricalSuggestsInternalAction.c) historicalSuggestsInternalAction2).f162142b, false, false, false, 57);
    }
}
