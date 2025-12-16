package com.avito.android.virtual_deal_room_invite.deeplink;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kO0.C42612c;
import kO0.InterfaceC42610a;

/* compiled from: InviteDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f326919a;

    /* renamed from: b, reason: collision with root package name */
    public final C42612c f326920b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f326921c;

    public d(dv.b bVar, C42612c c42612c, C25721c c25721c) {
        this.f326919a = bVar;
        this.f326920b = c42612c;
        this.f326921c = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.InterfaceC4053a) this.f326919a.get(), (InterfaceC42610a) this.f326920b.get(), (C25719a) this.f326921c.get());
    }
}
