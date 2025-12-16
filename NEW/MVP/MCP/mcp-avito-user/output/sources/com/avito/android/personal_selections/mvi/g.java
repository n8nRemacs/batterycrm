package com.avito.android.personal_selections.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PersonalSelectionsItemActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.personal_selections.domain.b> f215824a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f215825b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f215826c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f215827d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f215828e;

    public g(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3) {
        this.f215824a = provider;
        this.f215825b = lVar;
        this.f215826c = provider2;
        this.f215827d = provider3;
        this.f215828e = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f215824a.get(), (com.avito.android.personal_selections.domain.a) this.f215825b.f393949a, this.f215826c.get(), this.f215827d.get(), (a) this.f215828e.f393949a);
    }
}
