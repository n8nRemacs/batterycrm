package com.avito.android.publish.screen.step.suggest.category.data;

import com.avito.android.Q1;
import com.avito.android.publish.C0;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SuggestCategoryInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C0> f242276a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<e> f242277b;

    /* renamed from: c, reason: collision with root package name */
    public final u f242278c;

    /* renamed from: d, reason: collision with root package name */
    public final l f242279d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f242280e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<Q1> f242281f;

    public c(l lVar, u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f242276a = provider;
        this.f242277b = provider2;
        this.f242278c = uVar;
        this.f242279d = lVar;
        this.f242280e = provider3;
        this.f242281f = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f242276a.get(), this.f242277b.get(), (com.avito.android.publish.items.e) this.f242278c.get(), ((Integer) this.f242279d.f393949a).intValue(), this.f242280e.get(), this.f242281f.get());
    }
}
