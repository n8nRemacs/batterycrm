package com.avito.android.public_profile.disclaimer;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublicProfileDisclaimerItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f231819a;

    /* renamed from: b, reason: collision with root package name */
    public final u f231820b;

    public c(u uVar, Provider provider) {
        this.f231819a = provider;
        this.f231820b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f231819a.get(), ((Integer) this.f231820b.get()).intValue());
    }
}
