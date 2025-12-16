package com.avito.android.serp.adapter.vertical_main.publish;

import com.avito.android.remote.N0;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerticalPublishInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<N0> f273089a;

    /* renamed from: b, reason: collision with root package name */
    public final b f273090b;

    public e(Provider provider, b bVar) {
        this.f273089a = provider;
        this.f273090b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = dagger.internal.g.a(w.a(this.f273089a));
        this.f273090b.getClass();
        return new d(eVarA, new a());
    }
}
