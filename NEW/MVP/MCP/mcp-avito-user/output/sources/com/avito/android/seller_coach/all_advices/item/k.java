package com.avito.android.seller_coach.all_advices.item;

import com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvicesUnitPayloadCreator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_coach/all_advices/item/k;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements com.avito.android.recycler.data_aware.a {
    @Inject
    public k() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @Y61.l
    public final Object a(@Y61.l TV0.a aVar, @Y61.l TV0.a aVar2) {
        if (L.f(aVar != null ? Long.valueOf(aVar.getF117182c()) : null, aVar2 != null ? Long.valueOf(aVar2.getF117182c()) : null) && (aVar instanceof UserAdvertsHintItem) && (aVar2 instanceof UserAdvertsHintItem)) {
            return Boolean.valueOf(!L.f(aVar, aVar2));
        }
        return null;
    }
}
