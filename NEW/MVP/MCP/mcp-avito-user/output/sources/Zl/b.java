package zl;

import com.avito.android.brand_global_rubricator.j;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import dk.InterfaceC39739a;
import javax.inject.Provider;

/* compiled from: BrandGlobalRubricatorModule_ProvideBlueprintFactory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC39739a> f444214a;

    /* renamed from: b, reason: collision with root package name */
    public final c f444215b;

    public b(Provider provider, c cVar) {
        this.f444214a = provider;
        this.f444215b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC39739a interfaceC39739a = this.f444214a.get();
        j jVar = (j) this.f444215b.get();
        C50583a.f444213a.getClass();
        return interfaceC39739a.a(jVar);
    }
}
