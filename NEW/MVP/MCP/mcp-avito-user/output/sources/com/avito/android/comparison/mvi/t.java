package com.avito.android.comparison.mvi;

import com.avito.android.comparison.ComparisonFragmentMvi;
import javax.inject.Provider;

/* compiled from: ComparisonBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.comparison.domain.a> f124168a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f124169b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f124170c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.comparison.e> f124171d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f124172e;

    public t(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f124168a = provider;
        this.f124169b = lVar;
        this.f124170c = uVar;
        this.f124171d = provider2;
        this.f124172e = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new s(this.f124168a.get(), (ComparisonFragmentMvi.a) this.f124169b.f393949a, (Sq.g) this.f124170c.get(), this.f124171d.get(), this.f124172e.get());
    }
}
