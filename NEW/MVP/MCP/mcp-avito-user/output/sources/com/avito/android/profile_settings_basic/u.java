package com.avito.android.profile_settings_basic;

import com.avito.android.remote.A1;
import com.avito.android.remote.D0;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: BasicProfileSettingsInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<D0> f228932a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<A1> f228933b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<H> f228934c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f228935d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f228936e;

    public u(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f228932a = provider;
        this.f228933b = provider2;
        this.f228934c = provider3;
        this.f228935d = provider4;
        this.f228936e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new t(dagger.internal.g.b(this.f228932a), this.f228933b.get(), this.f228934c.get(), this.f228935d.get(), (String) this.f228936e.f393949a);
    }
}
