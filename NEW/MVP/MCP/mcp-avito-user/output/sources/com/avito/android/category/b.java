package com.avito.android.category;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CategoriesLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final p f116492a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f116493b;

    public b(p pVar, dv.b bVar) {
        this.f116492a = pVar;
        this.f116493b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((m) this.f116492a.get(), (a.InterfaceC4053a) this.f116493b.get());
    }
}
