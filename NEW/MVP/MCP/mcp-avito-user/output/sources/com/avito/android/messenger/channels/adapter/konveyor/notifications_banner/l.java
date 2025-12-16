package com.avito.android.messenger.channels.adapter.konveyor.notifications_banner;

import com.avito.android.C30277e1;
import javax.inject.Provider;
import ur.InterfaceC49101b;

/* compiled from: ChannelsNotificationsBannerBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final p f187003a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC49101b> f187004b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C30277e1> f187005c;

    public l(p pVar, Provider provider, Provider provider2) {
        this.f187003a = pVar;
        this.f187004b = provider;
        this.f187005c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((m) this.f187003a.get(), this.f187004b.get(), this.f187005c.get());
    }
}
