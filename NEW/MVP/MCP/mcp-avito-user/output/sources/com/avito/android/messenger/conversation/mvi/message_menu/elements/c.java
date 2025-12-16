package com.avito.android.messenger.conversation.mvi.message_menu.elements;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.mvi.message_menu.elements.a;
import com.avito.android.messenger.q0;
import com.avito.android.util.S;
import com.avito.android.util.T;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CopyToClipboardElementProvider_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final T f191628a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f191629b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a.InterfaceC5662a> f191630c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<q0> f191631d;

    public c(T t12, Provider provider, Provider provider2, Provider provider3) {
        this.f191628a = t12;
        this.f191629b = provider;
        this.f191630c = provider2;
        this.f191631d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f191628a.getClass();
        return new a(new S(), this.f191629b.get(), this.f191630c.get(), this.f191631d.get());
    }
}
