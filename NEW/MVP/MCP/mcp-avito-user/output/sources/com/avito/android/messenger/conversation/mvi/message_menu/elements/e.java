package com.avito.android.messenger.conversation.mvi.message_menu.elements;

import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.mvi.message_menu.elements.d;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DownloadImageElementProvider_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d.a> f191698a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f191699b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C30277e1> f191700c;

    public e(Provider<d.a> provider, Provider<InterfaceC28373a> provider2, Provider<C30277e1> provider3) {
        this.f191698a = provider;
        this.f191699b = provider2;
        this.f191700c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f191698a.get(), this.f191699b.get(), this.f191700c.get());
    }
}
