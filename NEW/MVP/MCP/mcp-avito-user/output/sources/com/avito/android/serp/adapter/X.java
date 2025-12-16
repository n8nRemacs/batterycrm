package com.avito.android.serp.adapter;

import io.reactivex.rxjava3.internal.operators.observable.C41936b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: FavoriteStatusResolver.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/X;", "Lcom/avito/android/serp/adapter/T;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class X implements T {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.h f268595a;

    @Inject
    public X(@Y61.k com.avito.android.favorite.h hVar) {
        this.f268595a = hVar;
    }

    @Override // com.avito.android.serp.adapter.T
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.B0 a(@Y61.k List list) {
        return new C41936b0(io.reactivex.rxjava3.core.z.W(new U(list, 0)), new V(this)).d0(new W(list));
    }

    @Override // com.avito.android.serp.adapter.T
    public final <T extends com.avito.conveyor_item.a> void b(@Y61.k List<? extends T> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((com.avito.conveyor_item.a) obj) instanceof S) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.avito.conveyor_item.a) it.next()).getF250429b());
        }
        Map<String, Boolean> mapF = this.f268595a.f(arrayList2);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) it2.next();
            Boolean bool = mapF.get(aVar.getF250429b());
            if (bool != null) {
                ((S) aVar).setFavorite(bool.booleanValue());
            }
        }
    }
}
