package com.avito.android.cpx_promo.priceinput.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpxPromoPriceInputDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f127301a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f127302b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f127303c;

    public d(dv.b bVar, dv.b bVar2, Provider provider) {
        this.f127301a = bVar;
        this.f127302b = bVar2;
        this.f127303c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.d) this.f127301a.get(), (a.f) this.f127302b.get(), this.f127303c.get());
    }
}
