package com.avito.android.messenger.conversation.mvi.quick_replies;

import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: QuickRepliesInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<C32189b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC47842z> f194091a;

    public c(Provider<InterfaceC47842z> provider) {
        this.f194091a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32189b(this.f194091a.get());
    }
}
