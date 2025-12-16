package com.avito.android.messenger.conversation.mvi;

import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MessageSpamActionsInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.blacklist_reasons.y> f189686a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC31987a> f189687b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f189688c;

    public c(Provider<com.avito.android.messenger.blacklist_reasons.y> provider, Provider<InterfaceC31987a> provider2, Provider<InterfaceC35745a5> provider3) {
        this.f189686a = provider;
        this.f189687b = provider2;
        this.f189688c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f189686a.get(), this.f189687b.get(), this.f189688c.get());
    }
}
