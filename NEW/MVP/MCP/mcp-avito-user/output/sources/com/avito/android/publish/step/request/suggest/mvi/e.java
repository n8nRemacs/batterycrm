package com.avito.android.publish.step.request.suggest.mvi;

import com.avito.android.publish.C0;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SuggestRequestBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C0> f245478a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.publish.params_suggest.h> f245479b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.publish.params_suggest.a> f245480c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f245481d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f245482e;

    public e(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f245478a = provider;
        this.f245479b = provider2;
        this.f245480c = provider3;
        this.f245481d = provider4;
        this.f245482e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f245478a.get(), this.f245479b.get(), this.f245480c.get(), this.f245481d.get(), ((Integer) this.f245482e.f393949a).intValue());
    }
}
