package com.avito.android.search_suggest.link;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SearchSuggestInternalShowLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.search_suggest.intent.e f264265a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f264266b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f264267c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.navigation.c f264268d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f264269e;

    public c(com.avito.android.search_suggest.intent.e eVar, dv.b bVar, dv.b bVar2, com.avito.android.navigation.c cVar, Provider provider) {
        this.f264265a = eVar;
        this.f264266b = bVar;
        this.f264267c = bVar2;
        this.f264268d = cVar;
        this.f264269e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.search_suggest.f) this.f264265a.get(), (a.InterfaceC4053a) this.f264266b.get(), (a.b) this.f264267c.get(), (com.avito.android.navigation.a) this.f264268d.get(), this.f264269e.get());
    }
}
