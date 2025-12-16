package com.avito.android.mortgage.sign.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.sign.model.SignArguments;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import o10.C44503a;

/* compiled from: SignFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final b f203786a;

    /* renamed from: b, reason: collision with root package name */
    public final i f203787b;

    /* renamed from: c, reason: collision with root package name */
    public final k f203788c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f203789d;

    /* renamed from: e, reason: collision with root package name */
    public final d f203790e;

    /* renamed from: f, reason: collision with root package name */
    public final l f203791f;

    public g(b bVar, i iVar, k kVar, Provider provider, d dVar, l lVar) {
        this.f203786a = bVar;
        this.f203787b = iVar;
        this.f203788c = kVar;
        this.f203789d = provider;
        this.f203790e = dVar;
        this.f203791f = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f203786a.get();
        this.f203787b.getClass();
        h hVar = new h();
        j jVar = (j) this.f203788c.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f203789d.get();
        this.f203790e.getClass();
        c cVar = new c();
        SignArguments signArguments = (SignArguments) this.f203791f.f393949a;
        o10.d.f419304k.getClass();
        C44503a.f419291b.getClass();
        C44503a c44503a = C44503a.f419292c;
        String str = signArguments.f203735h;
        return new f("Sign", new o10.d(c44503a, signArguments.f203729b, str != null ? com.avito.android.printable_text.b.f(str) : null, false, signArguments.f203730c, signArguments.f203731d, signArguments.f203732e, signArguments.f203733f, signArguments.f203734g), new e(aVar, screenPerformanceTracker, jVar, cVar, hVar));
    }
}
