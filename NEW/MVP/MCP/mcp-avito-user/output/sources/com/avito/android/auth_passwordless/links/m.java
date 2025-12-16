package com.avito.android.auth_passwordless.links;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AuthPasswordlessEntryDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f92648a;

    /* renamed from: b, reason: collision with root package name */
    public final k f92649b;

    public m(dagger.internal.f fVar, k kVar) {
        this.f92648a = fVar;
        this.f92649b = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((com.avito.android.deeplink_handler.handler.composite.a) this.f92648a.get(), (h) this.f92649b.get());
    }
}
