package FB;

import com.avito.konveyor.adapter.j;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JobCompanyCarouselItemModule_ProvideSimpleAdapterFactory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class d implements h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f4593a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f4594b;

    public d(u uVar, Provider provider) {
        this.f4593a = uVar;
        this.f4594b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f4593a.get();
        com.avito.konveyor.a aVar2 = this.f4594b.get();
        a.f4590a.getClass();
        return new j(aVar, aVar2);
    }
}
