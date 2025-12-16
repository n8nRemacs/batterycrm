package y4;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailsAutotekaTeaserModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.advert.item.autoteka.teaser.uniqueData.b f442883a;

    public b(com.avito.android.advert.item.autoteka.teaser.uniqueData.b bVar) {
        this.f442883a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.advert.item.autoteka.teaser.uniqueData.a aVar = (com.avito.android.advert.item.autoteka.teaser.uniqueData.a) this.f442883a.get();
        C50053a.f442882a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
