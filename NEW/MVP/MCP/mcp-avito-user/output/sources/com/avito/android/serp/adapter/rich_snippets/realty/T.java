package com.avito.android.serp.adapter.rich_snippets.realty;

import com.avito.android.C36135w2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.Kundle;
import javax.inject.Provider;

/* compiled from: DevelopmentXlRichItemPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class T implements dagger.internal.h<S> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f270962a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f270963b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f270964c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C36135w2> f270965d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.account.E> f270966e;

    public T(dagger.internal.f fVar, dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f270962a = fVar;
        this.f270963b = provider;
        this.f270964c = lVar;
        this.f270965d = provider2;
        this.f270966e = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new S(dagger.internal.g.b(this.f270962a), this.f270963b.get(), (Kundle) this.f270964c.f393949a, this.f270965d.get(), this.f270966e.get());
    }
}
