package com.avito.android.referral_contacts.storage;

import AK0.l;
import android.content.Context;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReferralContactsStorageImpl_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f252571a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Context> f252572b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f252573c;

    public d(Provider<l> provider, Provider<Context> provider2, Provider<R0> provider3) {
        this.f252571a = provider;
        this.f252572b = provider2;
        this.f252573c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f252571a.get(), this.f252572b.get(), this.f252573c.get());
    }
}
