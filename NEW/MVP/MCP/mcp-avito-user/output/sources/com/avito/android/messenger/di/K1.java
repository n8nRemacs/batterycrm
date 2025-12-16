package com.avito.android.messenger.di;

import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.remote.notification.InterfaceC34350q;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: MessengerNotificationsModule_ProvideNotificationHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class K1 implements dagger.internal.h<com.avito.android.messenger.notification.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.w0> f195661a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC34350q> f195662b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC32024m> f195663c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f195664d;

    public K1(Provider<com.avito.android.messenger.w0> provider, Provider<InterfaceC34350q> provider2, Provider<InterfaceC32024m> provider3, Provider<InterfaceC35745a5> provider4) {
        this.f195661a = provider;
        this.f195662b = provider2;
        this.f195663c = provider3;
        this.f195664d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.messenger.w0 w0Var = this.f195661a.get();
        InterfaceC34350q interfaceC34350q = this.f195662b.get();
        InterfaceC32024m interfaceC32024m = this.f195663c.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f195664d.get();
        J1.f195652a.getClass();
        return new com.avito.android.messenger.notification.c(w0Var, interfaceC34350q, interfaceC32024m, interfaceC35745a5);
    }
}
