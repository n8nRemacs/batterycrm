package com.avito.android.service_booking.interactors;

import Gt0.InterfaceC13916a;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SbVerifyPhoneLinkInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC13916a> f274296a;

    public c(Provider<InterfaceC13916a> provider) {
        this.f274296a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(g.b(this.f274296a));
    }
}
