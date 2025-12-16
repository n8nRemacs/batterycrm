package com.avito.android.auction;

import com.avito.android.deep_linking.links.AuctionBody;
import javax.inject.Provider;

/* compiled from: AuctionPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f92609a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f92610b;

    public s(dagger.internal.l lVar, Provider provider) {
        this.f92609a = lVar;
        this.f92610b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new r((AuctionBody) this.f92609a.f393949a, this.f92610b.get());
    }
}
