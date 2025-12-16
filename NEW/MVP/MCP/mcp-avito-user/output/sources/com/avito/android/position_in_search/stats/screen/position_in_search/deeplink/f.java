package com.avito.android.position_in_search.stats.screen.position_in_search.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SearchPositionSortDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f221360a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f221361b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f221362c;

    public f(dv.b bVar, dv.b bVar2, Provider provider) {
        this.f221360a = provider;
        this.f221361b = bVar;
        this.f221362c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = this.f221360a.get();
        return new d((a.d) this.f221362c.get(), (a.f) this.f221361b.get(), r02);
    }
}
