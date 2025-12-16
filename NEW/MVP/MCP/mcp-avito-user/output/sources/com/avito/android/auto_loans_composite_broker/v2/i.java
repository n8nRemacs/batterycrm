package com.avito.android.auto_loans_composite_broker.v2;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: AdvertDetailsCompositeBrokerV2Presenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class i extends H implements Y41.p<Integer, Boolean, G0> {
    @Override // Y41.p
    public final G0 invoke(Integer num, Boolean bool) {
        int iIntValue = num.intValue();
        boolean zBooleanValue = bool.booleanValue();
        r rVar = (r) this.receiver;
        A aL02 = rVar.f95639b.L0();
        if (aL02 != null) {
            if (zBooleanValue) {
                aL02.c(iIntValue, true);
                r.k(aL02, rVar.f95642e, true);
            } else {
                aL02.c(iIntValue, false);
                r.k(aL02, rVar.f95642e, false);
            }
        }
        return G0.f406611a;
    }
}
