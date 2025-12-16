package com.avito.android.publish.screen.objects.domain.repository;

import com.avito.android.Q1;
import com.avito.android.remote.u1;
import com.avito.android.validation.d1;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: ObjectValidateRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<u1> f240068a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<a> f240069b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C50213a> f240070c;

    /* renamed from: d, reason: collision with root package name */
    public final u f240071d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<Q1> f240072e;

    public m(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f240068a = provider;
        this.f240069b = provider2;
        this.f240070c = provider3;
        this.f240071d = uVar;
        this.f240072e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f240068a.get(), this.f240069b.get(), this.f240070c.get(), (d1) this.f240071d.get(), this.f240072e.get());
    }
}
