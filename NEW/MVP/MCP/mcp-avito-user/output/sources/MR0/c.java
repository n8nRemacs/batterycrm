package Mr0;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TopSellersSerpWidgetModule_ProvideItemBinderFactory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.serp.adapter.top_sellers_serp.top_sellers_serp_list.b f11039a;

    public c(com.avito.android.serp.adapter.top_sellers_serp.top_sellers_serp_list.b bVar) {
        this.f11039a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.serp.adapter.top_sellers_serp.top_sellers_serp_list.a aVar = (com.avito.android.serp.adapter.top_sellers_serp.top_sellers_serp_list.a) this.f11039a.get();
        b.f11038a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
