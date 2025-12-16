package com.avito.android.remote_toggles_fetcher.analytics;

import android.app.Application;
import com.avito.android.I1;
import com.avito.android.K1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TogglesUpdateTimeMonitor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f254445a;

    /* renamed from: b, reason: collision with root package name */
    public final l f254446b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f254447c;

    /* renamed from: d, reason: collision with root package name */
    public final K1 f254448d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f254449e;

    public h(Provider provider, l lVar, dagger.internal.f fVar, K1 k12, Provider provider2) {
        this.f254445a = provider;
        this.f254446b = lVar;
        this.f254447c = fVar;
        this.f254448d = k12;
        this.f254449e = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f254445a.get(), (Application) this.f254446b.f393949a, (InterfaceC28373a) this.f254447c.get(), (I1) this.f254448d.get(), this.f254449e.get());
    }
}
