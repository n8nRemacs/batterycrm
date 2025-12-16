package com.avito.android.gsm_s2b_call_action.impl_module.link;

import cI.InterfaceC27039a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GsmS2BCallActionLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC27039a> f161302a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f161303b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f161304c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f161305d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f161306e;

    /* renamed from: f, reason: collision with root package name */
    public final dv.b f161307f;

    public f(dagger.internal.f fVar, dv.b bVar, dv.b bVar2, Provider provider, Provider provider2, Provider provider3) {
        this.f161302a = provider;
        this.f161303b = provider2;
        this.f161304c = provider3;
        this.f161305d = fVar;
        this.f161306e = bVar;
        this.f161307f = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f161302a.get(), this.f161303b.get(), this.f161304c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f161305d.get(), (a.i) this.f161306e.get(), (a.g) this.f161307f.get());
    }
}
