package O4;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BrandingAdvantagesBlockModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f11952a;

    public e(Provider<com.avito.konveyor.a> provider) {
        this.f11952a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = this.f11952a.get();
        d.f11951a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
