package com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_remote;

import com.avito.android.messenger.B;
import com.avito.android.messenger.conversation.mvi.data.g0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: DeleteRemoteMessageInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC47842z> f191695a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<B> f191696b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<g0> f191697c;

    public h(Provider<InterfaceC47842z> provider, Provider<B> provider2, Provider<g0> provider3) {
        this.f191695a = provider;
        this.f191696b = provider2;
        this.f191697c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f191695a.get(), this.f191696b.get(), this.f191697c.get());
    }
}
