package com.avito.android.bundles.di;

/* compiled from: VasBundlesListModule_ProvideHeaderItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class r implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f108313a;

    public r(dagger.internal.u uVar) {
        this.f108313a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.bundles.vas_union.item.header.b bVar = (com.avito.android.bundles.vas_union.item.header.b) this.f108313a.get();
        int i12 = q.f108312a;
        return new com.avito.android.bundles.vas_union.item.header.a(bVar);
    }
}
