package com.avito.android.autoteka.data.landing;

import Mf.C14480a;
import com.avito.android.autoteka.data.i;
import com.avito.android.autoteka.data.j;
import com.avito.android.autoteka.deeplinks.LandingDetails;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaLandingLoadContentInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final j f96138a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C14480a> f96139b;

    /* renamed from: c, reason: collision with root package name */
    public final l f96140c;

    public b(j jVar, Provider provider, l lVar) {
        this.f96138a = jVar;
        this.f96139b = provider;
        this.f96140c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((i) this.f96138a.get(), this.f96139b.get(), (LandingDetails) this.f96140c.f393949a);
    }
}
