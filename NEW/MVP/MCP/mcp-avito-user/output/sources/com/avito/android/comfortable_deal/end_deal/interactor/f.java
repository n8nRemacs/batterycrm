package com.avito.android.comfortable_deal.end_deal.interactor;

import Jp.InterfaceC14233a;
import com.avito.android.comfortable_deal.end_deal.model.EndDealArguments;
import com.avito.android.util.R0;
import cp.InterfaceC39387a;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EndDealInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14233a> f122220a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC39387a> f122221b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a> f122222c;

    /* renamed from: d, reason: collision with root package name */
    public final l f122223d;

    /* renamed from: e, reason: collision with root package name */
    public final u f122224e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f122225f;

    public f(l lVar, u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f122220a = provider;
        this.f122221b = provider2;
        this.f122222c = provider3;
        this.f122223d = lVar;
        this.f122224e = uVar;
        this.f122225f = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(g.a(w.a(this.f122220a)), g.a(w.a(this.f122221b)), this.f122222c.get(), (EndDealArguments) this.f122223d.f393949a, (com.avito.android.comfortable_deal.end_deal.mvi.validator.a) this.f122224e.get(), this.f122225f.get());
    }
}
