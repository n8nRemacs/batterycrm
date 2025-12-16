package com.avito.android.verification.inn.list.checkbox;

import com.avito.android.deep_linking.links.w;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CheckboxItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f323951a;

    /* renamed from: b, reason: collision with root package name */
    public final u f323952b;

    public h(u uVar, Provider provider) {
        this.f323951a = provider;
        this.f323952b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f323951a.get(), (w) this.f323952b.get());
    }
}
