package com.avito.android.auto_loans_composite_broker.v2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsCompositeBrokerV2Presenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class m extends H implements Y41.p<com.avito.android.lib.design.chips.h, Integer, G0> {
    @Override // Y41.p
    public final G0 invoke(com.avito.android.lib.design.chips.h hVar, Integer num) {
        com.avito.android.lib.design.chips.h hVar2 = hVar;
        int iIntValue = num.intValue();
        r rVar = (r) this.receiver;
        A aL02 = rVar.f95639b.L0();
        if (aL02 != null) {
            Iterator it = aL02.f95592h.iterator();
            while (it.hasNext()) {
                Me.s sVar = (Me.s) it.next();
                if (L.f(sVar, hVar2)) {
                    aL02.f95591g = sVar.f10969d;
                    aL02.c(iIntValue, false);
                    r.k(aL02, rVar.f95642e, true);
                    rVar.f95641d.f(aL02.f95604t);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return G0.f406611a;
    }
}
