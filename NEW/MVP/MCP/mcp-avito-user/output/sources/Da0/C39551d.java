package dA0;

import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SuccessBlueprintsModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: dA0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39551d implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f393720a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f393721b;

    public C39551d(u uVar, Provider provider) {
        this.f393720a = uVar;
        this.f393721b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f393720a.get();
        com.avito.konveyor.a aVar2 = this.f393721b.get();
        C39548a.f393714a.getClass();
        return new j(aVar, aVar2);
    }
}
