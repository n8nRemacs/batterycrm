package com.avito.android.guests_selector.deep_link;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GuestsSelectorDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f161398a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f161399b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f161400c;

    public b(dv.b bVar, dv.b bVar2, Provider provider) {
        this.f161398a = bVar;
        this.f161399b = bVar2;
        this.f161400c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.d) this.f161399b.get(), (a.f) this.f161398a.get(), this.f161400c.get());
    }
}
