package com.avito.android.advert_details_items.sellerprofile;

/* compiled from: SellerStatusProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class W implements dagger.internal.h<V> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f85597a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f85598b;

    public W(dagger.internal.l lVar, dagger.internal.u uVar) {
        this.f85597a = uVar;
        this.f85598b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        O o12 = (O) this.f85597a.get();
        return new V(o12);
    }
}
