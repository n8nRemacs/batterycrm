package L00;

import com.avito.konveyor.adapter.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PreApprovalAdapterModule_ProvideAdapterFactory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f9748a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f9749b;

    /* renamed from: c, reason: collision with root package name */
    public final S00.b f9750c;

    public b(Provider provider, Provider provider2, S00.b bVar) {
        this.f9748a = provider;
        this.f9749b = provider2;
        this.f9750c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = this.f9748a.get();
        com.avito.konveyor.a aVar2 = this.f9749b.get();
        S00.a aVar3 = (S00.a) this.f9750c.get();
        a.f9747a.getClass();
        return new d(aVar, aVar2, aVar3);
    }
}
