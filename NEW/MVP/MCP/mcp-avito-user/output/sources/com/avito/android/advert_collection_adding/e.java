package com.avito.android.advert_collection_adding;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;

/* compiled from: AddToCollectionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<C28260c> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f81827a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.advert_collection_adding.di.c f81828b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f81829c;

    /* renamed from: d, reason: collision with root package name */
    public final C25721c f81830d;

    public e(dv.b bVar, com.avito.android.advert_collection_adding.di.c cVar, dv.b bVar2, C25721c c25721c) {
        this.f81827a = bVar;
        this.f81828b = cVar;
        this.f81829c = bVar2;
        this.f81830d = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28260c((a.f) this.f81827a.get(), (h) this.f81828b.get(), (a.d) this.f81829c.get(), (C25719a) this.f81830d.get());
    }
}
