package B9;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CommonFeatureTeaserModule_ProvideAdapterFactory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<com.avito.konveyor.adapter.h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f914a;

    public c(u uVar) {
        this.f914a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f914a.get();
        int i12 = b.f913a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
