package com.avito.android.messenger.conversation.mvi.message_menu.elements;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.mvi.message_menu.elements.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OpenInBrowserElementProvider_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f191706a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f191707b;

    public i(u uVar, Provider provider) {
        this.f191706a = uVar;
        this.f191707b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((h.a) this.f191706a.get(), this.f191707b.get());
    }
}
