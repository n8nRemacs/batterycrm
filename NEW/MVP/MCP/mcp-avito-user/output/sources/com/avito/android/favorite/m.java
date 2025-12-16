package com.avito.android.favorite;

import com.avito.android.analytics.C28528v;
import com.avito.android.analytics.InterfaceC28467s;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import qC.C47278d;
import qC.InterfaceC47276b;

/* compiled from: FavoriteAdvertsInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f155221a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<r> f155222b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC30570d> f155223c;

    /* renamed from: d, reason: collision with root package name */
    public final C28528v f155224d;

    /* renamed from: e, reason: collision with root package name */
    public final C47278d f155225e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f155226f;

    public m(dagger.internal.u uVar, Provider provider, Provider provider2, C28528v c28528v, C47278d c47278d, Provider provider3) {
        this.f155221a = uVar;
        this.f155222b = provider;
        this.f155223c = provider2;
        this.f155224d = c28528v;
        this.f155225e = c47278d;
        this.f155226f = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((x) this.f155221a.get(), this.f155222b.get(), this.f155223c.get(), (InterfaceC28467s) this.f155224d.get(), (InterfaceC47276b) this.f155225e.get(), this.f155226f.get());
    }
}
