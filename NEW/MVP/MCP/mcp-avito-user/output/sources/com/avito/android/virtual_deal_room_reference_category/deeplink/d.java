package com.avito.android.virtual_deal_room_reference_category.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ClientAddDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f327212a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f327213b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f327214c;

    public d(dv.b bVar, dv.b bVar2, Provider provider) {
        this.f327212a = bVar;
        this.f327213b = bVar2;
        this.f327214c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.d) this.f327213b.get(), (a.f) this.f327212a.get(), this.f327214c.get());
    }
}
