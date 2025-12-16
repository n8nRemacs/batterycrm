package com.avito.android.publish.screen.step.suggest.category.mvi;

import com.avito.android.publish.C0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SuggestCategoryActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C0> f242373a;

    /* renamed from: b, reason: collision with root package name */
    public final u f242374b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC33535v> f242375c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f242376d;

    public i(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2) {
        this.f242373a = provider;
        this.f242374b = uVar;
        this.f242375c = provider2;
        this.f242376d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f242373a.get(), (com.avito.android.publish.screen.step.suggest.category.data.a) this.f242374b.get(), this.f242375c.get(), ((Integer) this.f242376d.f393949a).intValue());
    }
}
