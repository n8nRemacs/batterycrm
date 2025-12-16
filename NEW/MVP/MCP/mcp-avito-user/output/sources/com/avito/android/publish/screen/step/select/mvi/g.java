package com.avito.android.publish.screen.step.select.mvi;

import com.avito.android.publish.C0;
import com.avito.android.publish.InterfaceC33878l;
import com.avito.android.publish.analytics.InterfaceC33535v;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.details.a> f242203a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C0> f242204b;

    /* renamed from: c, reason: collision with root package name */
    public final u f242205c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC33878l> f242206d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC33535v> f242207e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f242208f;

    public g(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f242203a = provider;
        this.f242204b = provider2;
        this.f242205c = uVar;
        this.f242206d = provider3;
        this.f242207e = provider4;
        this.f242208f = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f242203a.get(), this.f242204b.get(), (com.avito.android.publish.screen.step.select.loader.a) this.f242205c.get(), this.f242206d.get(), this.f242207e.get(), this.f242208f.get());
    }
}
