package xB;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CategorizerItemModule_ProvideAdapterPresenterFactory.java */
@e
@y
@x
/* renamed from: xB.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C49808b implements h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f442292a;

    public C49808b(u uVar) {
        this.f442292a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f442292a.get();
        int i12 = C49807a.f442291a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
