package KB;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PremiumBannerListItemModule_ProvideAdapterPresenterFactory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f9356a;

    public b(u uVar) {
        this.f9356a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f9356a.get();
        int i12 = a.f9355a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
