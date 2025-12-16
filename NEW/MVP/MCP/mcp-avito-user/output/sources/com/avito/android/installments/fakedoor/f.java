package com.avito.android.installments.fakedoor;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InstallmentsFakedoorInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<XN.a> f172537a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f172538b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f172539c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f172540d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f172541e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f172542f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f172543g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f172544h;

    public f(Provider provider, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4, dagger.internal.l lVar5, dagger.internal.l lVar6, Provider provider2) {
        this.f172537a = provider;
        this.f172538b = lVar;
        this.f172539c = lVar2;
        this.f172540d = lVar3;
        this.f172541e = lVar4;
        this.f172542f = lVar5;
        this.f172543g = lVar6;
        this.f172544h = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(dagger.internal.g.a(w.a(this.f172537a)), ((Long) this.f172538b.f393949a).longValue(), (String) this.f172539c.f393949a, (DeepLink) this.f172540d.f393949a, (String) this.f172541e.f393949a, ((Long) this.f172542f.f393949a).longValue(), (String) this.f172543g.f393949a, this.f172544h.get());
    }
}
