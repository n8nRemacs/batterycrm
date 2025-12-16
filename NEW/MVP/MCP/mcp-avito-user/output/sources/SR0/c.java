package Sr0;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CollectionsRecommendationWidgetModule_ProvideItemBinderFactory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.serp.adapter.vertical_main.collectionsRecommendations.item.e f15171a;

    public c(com.avito.android.serp.adapter.vertical_main.collectionsRecommendations.item.e eVar) {
        this.f15171a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.serp.adapter.vertical_main.collectionsRecommendations.item.d dVar = (com.avito.android.serp.adapter.vertical_main.collectionsRecommendations.item.d) this.f15171a.get();
        b.f15170a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(dVar);
        return c10493a.a();
    }
}
