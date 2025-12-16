package com.avito.android.advertising.kebab;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HideableAdItemInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final u f87850a;

    /* renamed from: b, reason: collision with root package name */
    public final u f87851b;

    /* renamed from: c, reason: collision with root package name */
    public final u f87852c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.loaders.avito_targeting.g> f87853d;

    /* renamed from: e, reason: collision with root package name */
    public final u f87854e;

    public p(u uVar, u uVar2, u uVar3, u uVar4, Provider provider) {
        this.f87850a = uVar;
        this.f87851b = uVar2;
        this.f87852c = uVar3;
        this.f87853d = provider;
        this.f87854e = uVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new o((i) this.f87850a.get(), (InterfaceC28373a) this.f87851b.get(), (com.avito.android.server_time.a) this.f87852c.get(), dagger.internal.g.b(this.f87853d), (m) this.f87854e.get());
    }
}
