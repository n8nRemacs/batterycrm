package com.avito.android.passport.profile_add.create.business_vrf_duplication.deeplink_handling;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PassportCreationBusinessVrfLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final E50.c f211228a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f211229b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f211230c;

    public c(E50.c cVar, dv.b bVar, dv.b bVar2) {
        this.f211228a = cVar;
        this.f211229b = bVar;
        this.f211230c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((E50.a) this.f211228a.get(), (a.InterfaceC4053a) this.f211229b.get(), (a.b) this.f211230c.get());
    }
}
