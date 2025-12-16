package com.avito.android.competitor_analytics.domain;

import br.InterfaceC25696a;
import com.avito.android.util.R0;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CompetitorAnalyticsUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final l f124298a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC25696a> f124299b;

    /* renamed from: c, reason: collision with root package name */
    public final c f124300c;

    /* renamed from: d, reason: collision with root package name */
    public final j f124301d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f124302e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<KO.a> f124303f;

    public g(l lVar, Provider provider, c cVar, j jVar, Provider provider2, Provider provider3) {
        this.f124298a = lVar;
        this.f124299b = provider;
        this.f124300c = cVar;
        this.f124301d = jVar;
        this.f124302e = provider2;
        this.f124303f = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(((Long) this.f124298a.f393949a).longValue(), this.f124299b.get(), (a) this.f124300c.get(), (h) this.f124301d.get(), this.f124302e.get(), this.f124303f.get());
    }
}
