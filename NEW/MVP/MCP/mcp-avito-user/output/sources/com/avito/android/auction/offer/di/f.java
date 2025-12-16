package com.avito.android.auction.offer.di;

import com.avito.android.auction.offer.mvi.p;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;

/* compiled from: AuctionOfferModule_ProvideComponentsFormsFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final u f92472a;

    public f(u uVar) {
        this.f92472a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC40691b interfaceC40691b = (InterfaceC40691b) this.f92472a.get();
        c.f92468a.getClass();
        return new p(interfaceC40691b.j());
    }
}
