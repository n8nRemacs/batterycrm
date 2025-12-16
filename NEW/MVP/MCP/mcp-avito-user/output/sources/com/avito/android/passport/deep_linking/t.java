package com.avito.android.passport.deep_linking;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: PassportProfilesListAsyncLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final E50.c f211098a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f211099b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f211100c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f211101d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f211102e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f211103f;

    public t(E50.c cVar, dv.b bVar, C25721c c25721c, dv.b bVar2, dv.b bVar3, Provider provider) {
        this.f211098a = cVar;
        this.f211099b = bVar;
        this.f211100c = c25721c;
        this.f211101d = bVar2;
        this.f211102e = bVar3;
        this.f211103f = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s((E50.a) this.f211098a.get(), (a.InterfaceC4053a) this.f211099b.get(), (C25719a) this.f211100c.get(), (a.i) this.f211101d.get(), (a.b) this.f211102e.get(), this.f211103f.get());
    }
}
