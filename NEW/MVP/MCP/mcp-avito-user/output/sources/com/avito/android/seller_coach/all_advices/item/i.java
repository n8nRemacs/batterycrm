package com.avito.android.seller_coach.all_advices.item;

import com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvicesUnitComparator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_coach/all_advices/item/i;", "Lcom/avito/android/recycler/data_aware/b;", "<init>", "()V", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements com.avito.android.recycler.data_aware.b {
    @Inject
    public i() {
    }

    @Override // com.avito.android.recycler.data_aware.b
    public final boolean a(@Y61.l TV0.a aVar, @Y61.l TV0.a aVar2) {
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF117182c()) : null, aVar2 != null ? Long.valueOf(aVar2.getF117182c()) : null) || !(aVar instanceof UserAdvertsHintItem) || !(aVar2 instanceof UserAdvertsHintItem)) {
            return false;
        }
        UserAdvertsHintItem userAdvertsHintItem = (UserAdvertsHintItem) aVar;
        UserAdvertsHintItem userAdvertsHintItem2 = (UserAdvertsHintItem) aVar2;
        if (!L.f(userAdvertsHintItem.f267209b, userAdvertsHintItem2.f267209b)) {
            return false;
        }
        List<String> list = userAdvertsHintItem.f267216i;
        Integer numValueOf = list != null ? Integer.valueOf(list.size()) : null;
        List<String> list2 = userAdvertsHintItem2.f267216i;
        return L.f(numValueOf, list2 != null ? Integer.valueOf(list2.size()) : null);
    }
}
