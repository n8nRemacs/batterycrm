package com.avito.android.iac_dialer_watcher.impl_module.watcher;

import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import tL.C48568a;
import tL.C48569b;
import uL.C48916b;
import vL.C49229a;
import wL.C49531a;
import wL.C49532b;
import xL.C49856a;

/* compiled from: IacWatcherObserverImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.iac_dialer_watcher.impl_module.splitter.features.c f168175a;

    /* renamed from: b, reason: collision with root package name */
    public final vL.c f168176b;

    /* renamed from: c, reason: collision with root package name */
    public final xL.c f168177c;

    /* renamed from: d, reason: collision with root package name */
    public final C49532b f168178d;

    /* renamed from: e, reason: collision with root package name */
    public final C48569b f168179e;

    /* renamed from: f, reason: collision with root package name */
    public final C48916b f168180f;

    public j(com.avito.android.iac_dialer_watcher.impl_module.splitter.features.c cVar, vL.c cVar2, xL.c cVar3, C49532b c49532b, C48569b c48569b, C48916b c48916b) {
        this.f168175a = cVar;
        this.f168176b = cVar2;
        this.f168177c = cVar3;
        this.f168178d = c49532b;
        this.f168179e = c48569b;
        this.f168180f = c48916b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.iac_dialer_watcher.impl_module.splitter.features.a) this.f168175a.get(), (C49229a) this.f168176b.get(), (C49856a) this.f168177c.get(), (C49531a) this.f168178d.get(), (C48568a) this.f168179e.get(), dagger.internal.g.a(w.a(this.f168180f)));
    }
}
