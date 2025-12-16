package com.avito.android.messenger.di;

import Oq.InterfaceC14725a;
import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.analytics.C31667x;
import javax.inject.Provider;

/* compiled from: ChannelFragmentModule_ProvideErrorTracker$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.u, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32503u implements dagger.internal.h<InterfaceC14725a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f196294a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f196295b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C30277e1> f196296c;

    public C32503u(C32431e c32431e, Provider<InterfaceC28373a> provider, Provider<C30277e1> provider2) {
        this.f196294a = c32431e;
        this.f196295b = provider;
        this.f196296c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = this.f196295b.get();
        C30277e1 c30277e1 = this.f196296c.get();
        this.f196294a.getClass();
        return new C31667x(interfaceC28373a, c30277e1);
    }
}
