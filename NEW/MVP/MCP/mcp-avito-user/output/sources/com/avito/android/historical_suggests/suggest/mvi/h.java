package com.avito.android.historical_suggests.suggest.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.historical_suggests.suggest.mvi.entity.HistoricalSuggestsInternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import uI.C48901b;
import uI.C48903d;
import uI.C48904e;
import vI.InterfaceC49217b;

/* compiled from: HistoricalSuggestsOneTimeEventProducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/historical_suggests/suggest/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/historical_suggests/suggest/mvi/entity/HistoricalSuggestsInternalAction;", "LvI/b;", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements t<HistoricalSuggestsInternalAction, InterfaceC49217b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.historical_suggests.features.a f162147b;

    @Inject
    public h(@Y61.k com.avito.android.historical_suggests.features.a aVar) {
        this.f162147b = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC49217b b(HistoricalSuggestsInternalAction historicalSuggestsInternalAction) {
        C48901b c48901b;
        Object next;
        HistoricalSuggestsInternalAction historicalSuggestsInternalAction2 = historicalSuggestsInternalAction;
        if (historicalSuggestsInternalAction2 instanceof HistoricalSuggestsInternalAction.b) {
            C48901b c48901b2 = ((HistoricalSuggestsInternalAction.b) historicalSuggestsInternalAction2).f162141b;
            return new InterfaceC49217b.C12762b(C48903d.b(c48901b2), c48901b2.f439885g);
        }
        if (historicalSuggestsInternalAction2 instanceof HistoricalSuggestsInternalAction.Content) {
            List<C48904e> list = ((HistoricalSuggestsInternalAction.Content) historicalSuggestsInternalAction2).f162138b;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C48904e) it.next()).f439891b);
            }
            ArrayList arrayListH = C42745f0.H(arrayList);
            com.avito.android.historical_suggests.features.a aVar = this.f162147b;
            aVar.getClass();
            n<Object> nVar = com.avito.android.historical_suggests.features.a.f161959c[0];
            if (((Boolean) aVar.f161960b.a().invoke()).booleanValue()) {
                Iterator it2 = arrayListH.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (((C48901b) next).f439884f) {
                        break;
                    }
                }
                c48901b = (C48901b) next;
                if (c48901b == null) {
                    c48901b = (C48901b) C42745f0.G(arrayListH);
                }
            } else {
                c48901b = (C48901b) C42745f0.G(arrayListH);
            }
            if (c48901b != null) {
                return new InterfaceC49217b.a(C48903d.b(c48901b), c48901b.f439885g);
            }
        }
        return null;
    }
}
