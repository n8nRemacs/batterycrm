package K4;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BrandingGalleryBlockModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f9249a;

    public e(u uVar) {
        this.f9249a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f9249a.get();
        d.f9248a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
