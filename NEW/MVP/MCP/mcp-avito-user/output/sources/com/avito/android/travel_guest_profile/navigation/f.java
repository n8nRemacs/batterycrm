package com.avito.android.travel_guest_profile.navigation;

import a61.InterfaceC19688a;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TravelGuestProfileLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final b f302212a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f302213b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f302214c;

    public f(b bVar, dv.b bVar2, C25721c c25721c) {
        this.f302212a = bVar;
        this.f302213b = bVar2;
        this.f302214c = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((InterfaceC19688a) this.f302212a.get(), (a.InterfaceC4053a) this.f302213b.get(), (C25719a) this.f302214c.get());
    }
}
