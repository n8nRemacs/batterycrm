package com.avito.android.publish.screen.step.request.steps.loader;

import Zd0.InterfaceC19543a;
import Zd0.InterfaceC19545c;
import com.avito.android.publish.C0;
import com.avito.android.publish.PublishParametersInteractor;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.InterfaceC33685d0;
import com.avito.android.publish.di.U;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: StepsRequestLoaderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f242043a;

    /* renamed from: b, reason: collision with root package name */
    public final l f242044b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C0> f242045c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC33535v> f242046d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC33685d0> f242047e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<C50213a> f242048f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC19543a> f242049g;

    /* renamed from: h, reason: collision with root package name */
    public final u f242050h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC19545c> f242051i;

    /* renamed from: j, reason: collision with root package name */
    public final U f242052j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<R0> f242053k;

    public i(l lVar, l lVar2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, u uVar, Provider provider6, U u12, Provider provider7) {
        this.f242043a = lVar;
        this.f242044b = lVar2;
        this.f242045c = provider;
        this.f242046d = provider2;
        this.f242047e = provider3;
        this.f242048f = provider4;
        this.f242049g = provider5;
        this.f242050h = uVar;
        this.f242051i = provider6;
        this.f242052j = u12;
        this.f242053k = provider7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(((Boolean) this.f242043a.f393949a).booleanValue(), ((Boolean) this.f242044b.f393949a).booleanValue(), this.f242045c.get(), this.f242046d.get(), this.f242047e.get(), this.f242048f.get(), this.f242049g.get(), (PublishParametersInteractor) this.f242050h.get(), this.f242051i.get(), (Gson) this.f242052j.get(), this.f242053k.get());
    }
}
