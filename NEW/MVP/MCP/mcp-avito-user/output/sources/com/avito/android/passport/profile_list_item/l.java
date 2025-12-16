package com.avito.android.passport.profile_list_item;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileListLegalItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<n> f213659a;

    /* renamed from: b, reason: collision with root package name */
    public final u f213660b;

    public l(u uVar, Provider provider) {
        this.f213659a = provider;
        this.f213660b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f213659a.get(), (a) this.f213660b.get());
    }
}
