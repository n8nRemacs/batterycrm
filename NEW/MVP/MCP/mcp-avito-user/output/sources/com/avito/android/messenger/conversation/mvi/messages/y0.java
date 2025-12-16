package com.avito.android.messenger.conversation.mvi.messages;

import javax.inject.Provider;

/* compiled from: QuoteViewDataConverter_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class y0 implements dagger.internal.h<x0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f193652a;

    public y0(Provider<com.avito.android.util.text.a> provider) {
        this.f193652a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new x0(this.f193652a.get());
    }
}
