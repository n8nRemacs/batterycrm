package com.avito.android.user_favorites;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: SubscriptionsSearchLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.user_favorites.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35723h implements dagger.internal.h<C35722g> {

    /* renamed from: a, reason: collision with root package name */
    public final n f316921a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f316922b;

    public C35723h(n nVar, dv.b bVar) {
        this.f316921a = nVar;
        this.f316922b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35722g((InterfaceC35727l) this.f316921a.get(), (a.InterfaceC4053a) this.f316922b.get());
    }
}
