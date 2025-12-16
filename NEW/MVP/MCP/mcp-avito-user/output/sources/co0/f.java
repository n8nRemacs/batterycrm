package Co0;

import com.avito.konveyor.adapter.j;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SavedSearchSettingsModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f2683a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f2684b;

    public f(u uVar, Provider provider) {
        this.f2683a = uVar;
        this.f2684b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f2683a.get();
        com.avito.konveyor.a aVar2 = this.f2684b.get();
        c.f2679a.getClass();
        return new j(aVar, aVar2);
    }
}
