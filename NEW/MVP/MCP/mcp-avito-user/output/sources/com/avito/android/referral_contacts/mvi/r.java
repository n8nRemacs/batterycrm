package com.avito.android.referral_contacts.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReferralContactsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final l f252560a;

    public r(l lVar) {
        this.f252560a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q((k) this.f252560a.get(), null, 2, null);
    }
}
