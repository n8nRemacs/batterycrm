package v4;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailsAutoMediaModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.advert.item.auto_media.preview.b f440450a;

    public c(com.avito.android.advert.item.auto_media.preview.b bVar) {
        this.f440450a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.advert.item.auto_media.preview.a aVar = (com.avito.android.advert.item.auto_media.preview.a) this.f440450a.get();
        C49160a.f440448a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
