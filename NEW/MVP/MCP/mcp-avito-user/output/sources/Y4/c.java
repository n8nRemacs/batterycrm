package y4;

import com.avito.konveyor.adapter.j;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsAutotekaTeaserModule_ProvideSectionsAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f442884a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f442885b;

    public c(Provider<com.avito.konveyor.adapter.a> provider, Provider<com.avito.konveyor.a> provider2) {
        this.f442884a = provider;
        this.f442885b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = this.f442884a.get();
        com.avito.konveyor.a aVar2 = this.f442885b.get();
        C50053a.f442882a.getClass();
        return new j(aVar, aVar2);
    }
}
