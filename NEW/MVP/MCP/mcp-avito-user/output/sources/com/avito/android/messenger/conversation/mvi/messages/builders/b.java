package com.avito.android.messenger.conversation.mvi.messages.builders;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import vN.C49237a;

/* compiled from: CallMessageDataBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C49237a> f192136a;

    public b(Provider<C49237a> provider) {
        this.f192136a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f192136a.get());
    }
}
