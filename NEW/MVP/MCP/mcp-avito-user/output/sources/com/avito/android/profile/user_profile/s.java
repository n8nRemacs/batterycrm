package com.avito.android.profile.user_profile;

import android.content.res.Resources;
import javax.inject.Provider;
import k60.C42524a;

/* compiled from: UserProfileItemConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C42524a> f226584a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_persistence.f> f226585b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f226586c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f226587d;

    public s(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f226584a = provider;
        this.f226585b = provider2;
        this.f226586c = uVar;
        this.f226587d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new r(this.f226584a.get(), this.f226585b.get(), ((Boolean) this.f226586c.get()).booleanValue(), (Resources) this.f226587d.f393949a);
    }
}
