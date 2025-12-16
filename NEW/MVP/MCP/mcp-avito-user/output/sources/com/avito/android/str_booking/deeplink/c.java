package com.avito.android.str_booking.deeplink;

import android.app.Application;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OpenBuyerOrderBookingLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f285395a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f285396b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f285397c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f285398d;

    public c(l lVar, dv.b bVar, C25721c c25721c, dv.b bVar2) {
        this.f285395a = lVar;
        this.f285396b = bVar;
        this.f285397c = c25721c;
        this.f285398d = bVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Application) this.f285395a.f393949a, (a.InterfaceC4053a) this.f285396b.get(), (C25719a) this.f285397c.get(), (a.b) this.f285398d.get());
    }
}
