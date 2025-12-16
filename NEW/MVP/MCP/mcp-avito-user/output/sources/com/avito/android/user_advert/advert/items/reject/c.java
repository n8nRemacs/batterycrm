package com.avito.android.user_advert.advert.items.reject;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RejectReasonItemBlockBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<h> f309991a;

    public c(Provider<h> provider) {
        this.f309991a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f309991a.get());
    }
}
