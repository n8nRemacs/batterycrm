package com.avito.android.onboarding.dialog.deeplinks;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OnboardingDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f208772a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f208773b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f208774c;

    /* renamed from: d, reason: collision with root package name */
    public final d f208775d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f208776e;

    public f(dv.b bVar, dv.b bVar2, dagger.internal.f fVar, d dVar, dagger.internal.f fVar2) {
        this.f208772a = bVar;
        this.f208773b = bVar2;
        this.f208774c = fVar;
        this.f208775d = dVar;
        this.f208776e = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.d) this.f208772a.get(), (a.f) this.f208773b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f208774c.get(), (c) this.f208775d.get(), (com.avito.android.deep_linking.x) this.f208776e.get());
    }
}
