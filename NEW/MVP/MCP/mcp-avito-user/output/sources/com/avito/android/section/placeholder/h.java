package com.avito.android.section.placeholder;

import com.avito.android.section.placeholder.e;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SectionPlaceholderPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e.a> f264863a;

    public h(Provider<e.a> provider) {
        this.f264863a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f264863a.get());
    }
}
