package LF0;

import JF0.e;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TrxPromoGoodsConfigureMapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_trx-promo-goods_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d {
    public static final JF0.d a(e.b bVar, boolean z12) {
        if (z12) {
            JF0.c changedState = bVar.getChangedState();
            if ((changedState != null ? changedState.getCommission() : null) != null) {
                return bVar.getChangedState().getCommission();
            }
        }
        return bVar.getCommission();
    }

    public static final int b(JF0.d dVar) {
        int divisor = dVar.getDivisor();
        Integer numValueOf = Integer.valueOf(divisor);
        if (divisor <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 1;
    }
}
