package Bo0;

import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SavedSearchMainModule_ProvideSavedSearchSettingsRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f1708a;

    /* renamed from: b, reason: collision with root package name */
    public final u f1709b;

    public g(dagger.internal.f fVar, u uVar) {
        this.f1708a = fVar;
        this.f1709b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f1708a.get();
        com.avito.konveyor.a aVar2 = (com.avito.konveyor.a) this.f1709b.get();
        c.f1696a.getClass();
        return new j(aVar, aVar2);
    }
}
