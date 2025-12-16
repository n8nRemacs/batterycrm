package Cn0;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReasonDetailsBlueprintsModule_ProvideAdapterPresenter$_avito_safedeal_implFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: Cn0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13331b implements h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C13330a f2670a;

    /* renamed from: b, reason: collision with root package name */
    public final u f2671b;

    public C13331b(C13330a c13330a, u uVar) {
        this.f2670a = c13330a;
        this.f2671b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f2671b.get();
        this.f2670a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
