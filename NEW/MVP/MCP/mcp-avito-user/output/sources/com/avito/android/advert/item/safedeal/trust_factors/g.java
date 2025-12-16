package com.avito.android.advert.item.safedeal.trust_factors;

import com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TrustFactorsComponentsMapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advert-details_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g {
    @Y61.k
    public static final ArrayList a(@Y61.k f fVar, @Y61.k List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TrustFactorsItem trustFactorsItemB = fVar.b((TrustFactorsComponent) it.next());
            if (trustFactorsItemB != null) {
                arrayList.add(trustFactorsItemB);
            }
        }
        return arrayList;
    }
}
