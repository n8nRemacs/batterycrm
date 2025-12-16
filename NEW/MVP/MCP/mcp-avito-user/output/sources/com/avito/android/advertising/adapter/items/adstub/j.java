package com.avito.android.advertising.adapter.items.adstub;

import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NotLoadAdRichStubNewBlueprint_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<s> f86953a;

    public j(Provider<s> provider) {
        this.f86953a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f86953a.get());
    }
}
