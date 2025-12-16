package com.avito.android.advertising.adapter.items.web;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CommercialHtmlRichBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f87685a;

    public i(Provider<c> provider) {
        this.f87685a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f87685a.get());
    }
}
