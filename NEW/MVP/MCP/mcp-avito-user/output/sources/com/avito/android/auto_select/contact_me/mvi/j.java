package com.avito.android.auto_select.contact_me.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoSelectContactMeOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f96022a;

    public j(Provider<InterfaceC28373a> provider) {
        this.f96022a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f96022a.get());
    }
}
