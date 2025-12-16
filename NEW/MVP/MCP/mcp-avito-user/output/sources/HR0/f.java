package Hr0;

import com.avito.konveyor.adapter.j;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SaleHeaderItemModule_ProvideRubricatorRecycleAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f7773a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f7774b;

    public f(u uVar, Provider provider) {
        this.f7773a = uVar;
        this.f7774b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.h hVar = (com.avito.konveyor.adapter.h) this.f7773a.get();
        com.avito.konveyor.a aVar = this.f7774b.get();
        c.f7767a.getClass();
        return new j(hVar, aVar);
    }
}
