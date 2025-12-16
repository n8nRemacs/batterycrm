package com.avito.android.mortgage_invite.participant.interactor;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ParticipantsAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f206140a;

    public c(Provider<InterfaceC28373a> provider) {
        this.f206140a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f206140a.get());
    }
}
