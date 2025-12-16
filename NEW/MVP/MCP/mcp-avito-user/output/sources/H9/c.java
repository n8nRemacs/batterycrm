package H9;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OffersItemModule_Companion_ProvideDealerOffersItemBinderFactory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.advert_core.offers.items.small_card.b f6969a;

    public c(com.avito.android.advert_core.offers.items.small_card.b bVar) {
        this.f6969a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.advert_core.offers.items.small_card.a aVar = (com.avito.android.advert_core.offers.items.small_card.a) this.f6969a.get();
        b.f6967a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
