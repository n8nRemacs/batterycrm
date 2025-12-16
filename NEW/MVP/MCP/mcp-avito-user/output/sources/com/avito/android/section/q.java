package com.avito.android.section;

import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: SectionItemPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.section.title.a> f264864a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f264865b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f264866c;

    public q(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f264864a = provider;
        this.f264865b = provider2;
        this.f264866c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new p(this.f264864a.get(), this.f264865b.get(), (Bundle) this.f264866c.f393949a);
    }
}
