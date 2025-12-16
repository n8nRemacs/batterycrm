package com.avito.android.loyalty.ui.criteria_gray;

import bX.InterfaceC25576a;
import com.avito.android.util.R0;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CriteriaGrayInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC25576a> f183595a;

    /* renamed from: b, reason: collision with root package name */
    public final l f183596b;

    /* renamed from: c, reason: collision with root package name */
    public final e f183597c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f183598d;

    public g(Provider provider, l lVar, e eVar, Provider provider2) {
        this.f183595a = provider;
        this.f183596b = lVar;
        this.f183597c = eVar;
        this.f183598d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f183595a.get(), (CriteriaGrayArgs) this.f183596b.f393949a, (d) this.f183597c.get(), this.f183598d.get());
    }
}
