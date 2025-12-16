package com.avito.android.str_booking.deeplink;

import android.app.Application;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OpenSellerOrderBookingLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f285455a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f285456b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f285457c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f285458d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f285459e;

    public f(l lVar, dv.b bVar, C25721c c25721c, dv.b bVar2, Provider provider) {
        this.f285455a = lVar;
        this.f285456b = bVar;
        this.f285457c = c25721c;
        this.f285458d = bVar2;
        this.f285459e = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Application) this.f285455a.f393949a, (a.InterfaceC4053a) this.f285456b.get(), (C25719a) this.f285457c.get(), (a.b) this.f285458d.get(), this.f285459e.get());
    }
}
