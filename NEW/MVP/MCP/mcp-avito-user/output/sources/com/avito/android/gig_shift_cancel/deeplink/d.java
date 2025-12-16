package com.avito.android.gig_shift_cancel.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigShiftCancelDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f160596a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f160597b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f160598c;

    public d(dv.b bVar, dv.b bVar2, Provider provider) {
        this.f160596a = bVar;
        this.f160597b = bVar2;
        this.f160598c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.d) this.f160596a.get(), (a.f) this.f160597b.get(), this.f160598c.get());
    }
}
