package BC;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailsRecommendationItemModule_ProvideAdapterPresenterFactory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f1242a;

    public b(u uVar) {
        this.f1242a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f1242a.get();
        int i12 = a.f1241a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
