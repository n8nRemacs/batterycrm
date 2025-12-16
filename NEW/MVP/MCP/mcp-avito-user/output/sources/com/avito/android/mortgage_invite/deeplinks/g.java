package com.avito.android.mortgage_invite.deeplinks;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;
import l20.InterfaceC43530a;

/* compiled from: MortgageApplicationContactInfoDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f205821a;

    /* renamed from: b, reason: collision with root package name */
    public final l20.c f205822b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f205823c;

    public g(dv.b bVar, l20.c cVar, C25721c c25721c) {
        this.f205821a = bVar;
        this.f205822b = cVar;
        this.f205823c = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((a.InterfaceC4053a) this.f205821a.get(), (InterfaceC43530a) this.f205822b.get(), (C25719a) this.f205823c.get());
    }
}
