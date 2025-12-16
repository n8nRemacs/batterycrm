package com.avito.android.profile.user_profile.cards.silent_update;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.profile.user_profile.cards.o;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SilentUpdatePresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f225534a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f225535b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<o> f225536c;

    public j(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f225534a = provider;
        this.f225535b = lVar;
        this.f225536c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f225534a.get(), (Y41.l) this.f225535b.f393949a, this.f225536c.get());
    }
}
