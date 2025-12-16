package Zr0;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VerticalPublishModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f20528a;

    public e(u uVar) {
        this.f20528a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f20528a.get();
        int i12 = d.f20527a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
