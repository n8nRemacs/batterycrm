package com.avito.android.advert.item.select.number_input;

import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import wi0.InterfaceC49632c;

/* compiled from: SelectRecallMeInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC49632c> f79530a;

    public j(Provider<InterfaceC49632c> provider) {
        this.f79530a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(dagger.internal.g.a(w.a(this.f79530a)));
    }
}
