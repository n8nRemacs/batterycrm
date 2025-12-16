package QM;

import com.avito.konveyor.adapter.j;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImportantAddressesSelectionModule_ProvideRecyclerAdapterFactory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f13692a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f13693b;

    public c(u uVar, Provider provider) {
        this.f13692a = uVar;
        this.f13693b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f13692a.get();
        com.avito.konveyor.a aVar2 = this.f13693b.get();
        int i12 = b.f13691a;
        return new j(aVar, aVar2);
    }
}
