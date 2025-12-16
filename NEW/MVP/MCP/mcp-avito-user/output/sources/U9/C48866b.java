package u9;

import com.avito.konveyor.adapter.j;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDiscountDetailsModule_ProvideAdapterFactory.java */
@e
@y
@x
/* renamed from: u9.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C48866b implements h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f439817a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f439818b;

    public C48866b(u uVar, Provider provider) {
        this.f439817a = uVar;
        this.f439818b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f439817a.get();
        com.avito.konveyor.a aVar2 = this.f439818b.get();
        int i12 = C48865a.f439816a;
        return new j(aVar, aVar2);
    }
}
