package com.avito.android.delivery_tarifikator.domain;

import Ov.C14738a;
import Ov.C14739b;
import Pv.C14842a;
import com.squareup.anvil.annotations.ContributesBinding;
import cw.C39421b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: TariffsMapper.kt */
@kotlin.jvm.internal.s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/e0;", "Lcom/avito/android/delivery_tarifikator/domain/d0;", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes12.dex */
public final class e0 implements d0 {
    @Inject
    public e0() {
    }

    @Override // com.avito.android.delivery_tarifikator.domain.d0
    @Y61.k
    public final C14739b a(@Y61.k C39421b c39421b, @Y61.k Y41.l<? super String, C14738a> lVar) throws C14842a {
        C14738a c14738aInvoke = lVar.invoke(c39421b.getTermsType());
        if (c14738aInvoke != null) {
            if (!c14738aInvoke.f12665f) {
                c14738aInvoke = null;
            }
            C14738a c14738a = c14738aInvoke;
            if (c14738a != null) {
                return new C14739b(c39421b.getId(), com.avito.android.printable_text.b.f(c39421b.getName()), c39421b.getDescription(), c39421b.getPrice(), c14738a, null);
            }
        }
        throw new C14842a(Long.valueOf(c39421b.getId()), c39421b.getTermsType());
    }

    @Override // com.avito.android.delivery_tarifikator.domain.d0
    @Y61.k
    public final List<C14738a> b(@Y61.l List<cw.e> list) {
        ArrayList arrayList;
        if (list != null) {
            List<cw.e> list2 = list;
            arrayList = new ArrayList(C42745f0.q(list2, 10));
            for (cw.e eVar : list2) {
                arrayList.add(new C14738a(com.avito.android.printable_text.b.f(eVar.getName()), eVar.getTermsType(), eVar.getIsTariffSelectable(), eVar.getIsPriceEditable(), eVar.getAreDaysEditable(), eVar.getIsCustom(), eVar.getDescription(), null));
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? C42784z0.f406748b : arrayList;
    }

    @Override // com.avito.android.delivery_tarifikator.domain.d0
    @Y61.k
    public final List c(@Y61.k Y41.l lVar, @Y61.l List list) {
        ArrayList arrayList;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(a((C39421b) it.next(), lVar));
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? C42784z0.f406748b : arrayList;
    }
}
