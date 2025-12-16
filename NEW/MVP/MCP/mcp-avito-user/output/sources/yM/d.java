package YM;

import com.avito.konveyor.adapter.j;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImvCarsDetailsNeighborsModule_ProvideRecyclerAdapterFactory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f19450a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f19451b;

    public d(u uVar, Provider provider) {
        this.f19450a = uVar;
        this.f19451b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f19450a.get();
        com.avito.konveyor.a aVar2 = this.f19451b.get();
        a.f19447a.getClass();
        return new j(aVar, aVar2);
    }
}
