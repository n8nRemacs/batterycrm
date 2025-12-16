package v4;

import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsAutoMediaModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f440452a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f440453b;

    public e(u uVar, Provider provider) {
        this.f440452a = uVar;
        this.f440453b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f440452a.get();
        com.avito.konveyor.a aVar2 = this.f440453b.get();
        C49160a.f440448a.getClass();
        return new j(aVar, aVar2);
    }
}
