package com.avito.android.bundles.vas_union.di;

/* compiled from: VasUnionModule_ProvideHeaderItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class w implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final q f108548a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f108549b;

    public w(q qVar, dagger.internal.u uVar) {
        this.f108548a = qVar;
        this.f108549b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.bundles.vas_union.item.header.b bVar = (com.avito.android.bundles.vas_union.item.header.b) this.f108549b.get();
        this.f108548a.getClass();
        return new com.avito.android.bundles.vas_union.item.header.a(bVar);
    }
}
