package com.avito.android.push.rustore.token_update;

import com.avito.android.P;
import com.avito.android.S;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lg0.InterfaceC43767a;

/* compiled from: RuStorePushTokenStorageSaverImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC43767a> f246117a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f246118b;

    /* renamed from: c, reason: collision with root package name */
    public final S f246119c;

    public c(Provider provider, Provider provider2, S s5) {
        this.f246117a = provider;
        this.f246118b = provider2;
        this.f246119c = s5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f246117a.get(), this.f246118b.get(), (P) this.f246119c.get());
    }
}
