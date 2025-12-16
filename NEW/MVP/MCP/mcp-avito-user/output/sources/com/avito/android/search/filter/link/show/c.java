package com.avito.android.search.filter.link.show;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.search.filter.C34602w;
import com.avito.android.search.filter.InterfaceC34598u;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FiltersShowLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final C34602w f263423a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.navigation.c f263424b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f263425c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f263426d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f263427e;

    public c(C34602w c34602w, com.avito.android.navigation.c cVar, dv.b bVar, dv.b bVar2, Provider provider) {
        this.f263423a = c34602w;
        this.f263424b = cVar;
        this.f263425c = bVar;
        this.f263426d = bVar2;
        this.f263427e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((InterfaceC34598u) this.f263423a.get(), (com.avito.android.navigation.a) this.f263424b.get(), (a.InterfaceC4053a) this.f263425c.get(), (a.b) this.f263426d.get(), this.f263427e.get());
    }
}
