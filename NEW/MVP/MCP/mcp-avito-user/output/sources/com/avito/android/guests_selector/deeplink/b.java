package com.avito.android.guests_selector.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GuestsSelectorDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f161407a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f161408b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f161409c;

    public b(dv.b bVar, dv.b bVar2, Provider provider) {
        this.f161407a = bVar;
        this.f161408b = bVar2;
        this.f161409c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.d) this.f161408b.get(), (a.f) this.f161407a.get(), this.f161409c.get());
    }
}
