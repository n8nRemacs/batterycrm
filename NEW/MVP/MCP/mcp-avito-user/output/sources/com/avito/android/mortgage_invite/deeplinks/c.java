package com.avito.android.mortgage_invite.deeplinks;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;
import l20.InterfaceC43530a;

/* compiled from: MortgageApplicationClientFormDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f205813a;

    /* renamed from: b, reason: collision with root package name */
    public final l20.c f205814b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f205815c;

    public c(dv.b bVar, l20.c cVar, C25721c c25721c) {
        this.f205813a = bVar;
        this.f205814b = cVar;
        this.f205815c = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.InterfaceC4053a) this.f205813a.get(), (InterfaceC43530a) this.f205814b.get(), (C25719a) this.f205815c.get());
    }
}
