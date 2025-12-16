package com.avito.android.messenger.conversation.mvi.deeplinks.review;

import Mg0.InterfaceC14487a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RequestReviewInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14487a> f190655a;

    public e(Provider<InterfaceC14487a> provider) {
        this.f190655a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f190655a.get());
    }
}
