package Tp0;

/* compiled from: SectionAdvertItemsModule_ProvideComplementaryTypeAdapterPresenter$_avito_discouraged_avito_libs_serp_core_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class s implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f15943a;

    public s(dagger.internal.u uVar) {
        this.f15943a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f15943a.get();
        int i12 = n.f15922a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
