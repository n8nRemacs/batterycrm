package com.avito.android.trx_promo_impl.data.local;

import Y61.k;
import com.avito.android.trx_promo_impl.data.local.TrxPromoDateValidator;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: TrxPromoDateValidator.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_trx-promo_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {
    @k
    public static final TrxPromoDateValidator.a a(@k List<? extends TrxPromoDateValidator> list, @k LocalDate localDate) {
        Object next;
        List<? extends TrxPromoDateValidator> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (TrxPromoDateValidator trxPromoDateValidator : list2) {
            arrayList.add(trxPromoDateValidator.a(localDate) ? TrxPromoDateValidator.a.b.f303940a : new TrxPromoDateValidator.a.C9317a(trxPromoDateValidator.getF303938c()));
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof TrxPromoDateValidator.a.C9317a) {
                break;
            }
        }
        TrxPromoDateValidator.a.C9317a c9317a = (TrxPromoDateValidator.a.C9317a) (next instanceof TrxPromoDateValidator.a.C9317a ? next : null);
        return c9317a != null ? c9317a : TrxPromoDateValidator.a.b.f303940a;
    }
}
