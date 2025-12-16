package com.avito.android.passport.deep_linking;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: PassportAuthSuggestAsyncDeepLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.passport.deep_linking.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32955b implements dagger.internal.h<C32954a> {

    /* renamed from: a, reason: collision with root package name */
    public final r60.f f211063a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f211064b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f211065c;

    /* renamed from: d, reason: collision with root package name */
    public final E50.c f211066d;

    public C32955b(r60.f fVar, dagger.internal.f fVar2, dv.b bVar, E50.c cVar) {
        this.f211063a = fVar;
        this.f211064b = fVar2;
        this.f211065c = bVar;
        this.f211066d = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32954a((r60.d) this.f211063a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f211064b.get(), (a.InterfaceC4053a) this.f211065c.get(), (E50.a) this.f211066d.get());
    }
}
