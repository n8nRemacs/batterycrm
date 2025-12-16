package com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi;

import ce.C27181b;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FactorUnavailableReasonFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f93181a;

    /* renamed from: b, reason: collision with root package name */
    public final b f93182b;

    /* renamed from: c, reason: collision with root package name */
    public final m f93183c;

    /* renamed from: d, reason: collision with root package name */
    public final p f93184d;

    public k(h hVar, b bVar, m mVar, p pVar) {
        this.f93181a = hVar;
        this.f93182b = bVar;
        this.f93183c = mVar;
        this.f93184d = pVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f93181a.get();
        this.f93182b.getClass();
        a aVar = new a();
        this.f93183c.getClass();
        l lVar = new l();
        return new j("FactorUnavailableReason", new C27181b(false, false, null, 7, null), new i(gVar, aVar, (n) this.f93184d.get(), lVar));
    }
}
