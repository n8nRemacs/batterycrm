package com.avito.android.esia_redirect_screen.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.esia_redirect_screen.ui.f;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EsiaRedirectScreenDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f148006a;

    /* renamed from: b, reason: collision with root package name */
    public final f f148007b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f148008c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f148009d;

    public d(Provider provider, f fVar, dv.b bVar, dv.b bVar2) {
        this.f148006a = provider;
        this.f148007b = fVar;
        this.f148008c = bVar;
        this.f148009d = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f148006a.get(), (com.avito.android.esia_redirect_screen.ui.c) this.f148007b.get(), (a.InterfaceC4053a) this.f148008c.get(), (a.b) this.f148009d.get());
    }
}
