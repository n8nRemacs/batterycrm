package com.avito.android.iac_dialer_finished.impl_module.messenger_link;

import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ru.avito.messenger.A;

/* compiled from: OpenChannelIfExistLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<A> f166520a;

    /* renamed from: b, reason: collision with root package name */
    public final f f166521b;

    public e(f fVar, Provider provider) {
        this.f166520a = provider;
        this.f166521b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f166520a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f166521b.get());
    }
}
