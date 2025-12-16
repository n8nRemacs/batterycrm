package com.avito.android.rating_form.step.recycler;

import Y61.l;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormPayloadCreator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/step/recycler/c;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements com.avito.android.recycler.data_aware.a {
    @Inject
    public c() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @l
    public final Object a(@l TV0.a aVar, @l TV0.a aVar2) {
        e eVar;
        if (!(aVar instanceof f) || !(aVar2 instanceof f)) {
            return null;
        }
        f fVar = (f) aVar;
        f fVar2 = (f) aVar2;
        boolean zF2 = L.f(fVar.getF248584g(), fVar2.getF248584g());
        if (L.f(fVar.getF248585h(), fVar2.getF248585h()) && zF2) {
            eVar = null;
        } else {
            eVar = new e(fVar2.getF248584g(), fVar2.getF248584g() != null ? Boolean.TRUE : fVar2.getF248585h());
        }
        if (!(aVar instanceof com.avito.android.rating_form.item.select.a) || !(aVar2 instanceof com.avito.android.rating_form.item.select.a)) {
            return eVar;
        }
        com.avito.android.rating_form.item.select.a aVar3 = (com.avito.android.rating_form.item.select.a) aVar;
        com.avito.android.rating_form.item.select.a aVar4 = (com.avito.android.rating_form.item.select.a) aVar2;
        if (L.f(aVar3.f248587j, aVar4.f248587j) && L.f(aVar3.f248586i, aVar4.f248586i)) {
            return eVar;
        }
        return null;
    }
}
