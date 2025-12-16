package com.avito.android.travel_guest_profile.domain.interactors;

import Mg0.InterfaceC14487a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TravelGuestProfileReviewsInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class p implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14487a> f302033a;

    public p(Provider<InterfaceC14487a> provider) {
        this.f302033a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f302033a.get());
    }
}
