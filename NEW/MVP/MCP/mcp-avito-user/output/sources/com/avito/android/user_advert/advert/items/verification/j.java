package com.avito.android.user_advert.advert.items.verification;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationBlockStatusItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<b> f310397a;

    public j(Provider<b> provider) {
        this.f310397a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f310397a.get());
    }
}
