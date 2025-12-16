package com.avito.android.authorization.complete_registration.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CompleteRegistrationActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<f> f93454a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f93455b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f93456c;

    public b(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider) {
        this.f93454a = provider;
        this.f93455b = lVar;
        this.f93456c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f93454a.get(), (String) this.f93455b.f393949a, (String) this.f93456c.f393949a);
    }
}
