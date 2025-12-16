package L9;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertPriceListSectionModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.advert_core.price_list.v2.b f9812a;

    public d(com.avito.android.advert_core.price_list.v2.b bVar) {
        this.f9812a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.advert_core.price_list.v2.a aVar = (com.avito.android.advert_core.price_list.v2.a) this.f9812a.get();
        b.f9810a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
