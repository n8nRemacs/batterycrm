package com.avito.android.seller_coach.hints_dialog.item;

import Y61.l;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HintUnitPayloadCreator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_coach/hints_dialog/item/c;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements com.avito.android.recycler.data_aware.a {
    @Inject
    public c() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @l
    public final Object a(@l TV0.a aVar, @l TV0.a aVar2) {
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF207385b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF207385b()) : null)) {
            return null;
        }
        if ((aVar instanceof com.avito.android.seller_coach.hints_dialog.item.hint.a) && (aVar2 instanceof com.avito.android.seller_coach.hints_dialog.item.hint.a)) {
            return Boolean.valueOf(!L.f(aVar, aVar2));
        }
        if ((aVar instanceof com.avito.android.seller_coach.hints_dialog.item.header.a) && (aVar2 instanceof com.avito.android.seller_coach.hints_dialog.item.header.a)) {
            return Boolean.valueOf(!L.f(aVar, aVar2));
        }
        if ((aVar instanceof com.avito.android.seller_coach.hints_dialog.item.empty_hints.a) && (aVar2 instanceof com.avito.android.seller_coach.hints_dialog.item.empty_hints.a)) {
            return Boolean.valueOf(!L.f(aVar, aVar2));
        }
        return null;
    }
}
