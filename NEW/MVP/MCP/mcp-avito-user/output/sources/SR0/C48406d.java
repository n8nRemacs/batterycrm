package sr0;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImagesWithLinksItemModule_ProvideImagesWithLinksAdapterPresenter$_avito_discouraged_avito_libs_serp_core_implFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: sr0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48406d implements h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f438892a;

    public C48406d(u uVar) {
        this.f438892a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f438892a.get();
        int i12 = C48405c.f438891a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
