package com.avito.android.profile.user_profile.cards.referral;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReferralCardPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f225309a;

    /* renamed from: b, reason: collision with root package name */
    public final l f225310b;

    public f(l lVar, Provider provider) {
        this.f225309a = provider;
        this.f225310b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Y41.l) this.f225310b.f393949a, this.f225309a.get());
    }
}
