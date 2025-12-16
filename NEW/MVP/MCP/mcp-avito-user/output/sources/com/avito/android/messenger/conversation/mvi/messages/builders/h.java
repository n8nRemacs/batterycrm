package com.avito.android.messenger.conversation.mvi.messages.builders;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImageMessageDataBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f192141a;

    public h(Provider<InterfaceC28373a> provider) {
        this.f192141a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f192141a.get());
    }
}
