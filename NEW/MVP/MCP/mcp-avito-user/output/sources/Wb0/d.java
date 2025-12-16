package Wb0;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertItemModule_ProvideItemBinderFactory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class d implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.profile_settings_extended.adapter.carousel.adapter.b f17978a;

    public d(com.avito.android.profile_settings_extended.adapter.carousel.adapter.b bVar) {
        this.f17978a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.profile_settings_extended.adapter.carousel.adapter.a aVar = (com.avito.android.profile_settings_extended.adapter.carousel.adapter.a) this.f17978a.get();
        C15740b.f17976a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
