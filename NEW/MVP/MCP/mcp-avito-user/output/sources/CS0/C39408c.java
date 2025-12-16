package cs0;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TopSellersWidgetModule_ProvideItemBinderFactory.java */
@e
@y
@x
/* renamed from: cs0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39408c implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.serp.adapter.vertical_main.top_sellers.top_sellers_list.b f392980a;

    public C39408c(com.avito.android.serp.adapter.vertical_main.top_sellers.top_sellers_list.b bVar) {
        this.f392980a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.serp.adapter.vertical_main.top_sellers.top_sellers_list.a aVar = (com.avito.android.serp.adapter.vertical_main.top_sellers.top_sellers_list.a) this.f392980a.get();
        C39407b.f392979a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
