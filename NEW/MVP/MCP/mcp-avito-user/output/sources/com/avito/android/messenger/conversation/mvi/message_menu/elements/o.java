package com.avito.android.messenger.conversation.mvi.message_menu.elements;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.message_menu.elements.j;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RetrySendingMessageElementProvider_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class o implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC32024m> f191721a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f191722b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f191723c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f191724d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<j.a> f191725e;

    public o(Provider<InterfaceC32024m> provider, Provider<com.avito.android.server_time.f> provider2, Provider<InterfaceC28373a> provider3, Provider<InterfaceC35745a5> provider4, Provider<j.a> provider5) {
        this.f191721a = provider;
        this.f191722b = provider2;
        this.f191723c = provider3;
        this.f191724d = provider4;
        this.f191725e = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f191721a.get(), this.f191722b.get(), this.f191723c.get(), this.f191724d.get(), this.f191725e.get());
    }
}
