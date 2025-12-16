package com.avito.android.motivation_screen.domain;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MotivationInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<WF.a> f206306a;

    /* renamed from: b, reason: collision with root package name */
    public final l f206307b;

    /* renamed from: c, reason: collision with root package name */
    public final d f206308c;

    public b(Provider provider, l lVar, d dVar) {
        this.f206306a = provider;
        this.f206307b = lVar;
        this.f206308c = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        WF.a aVar = this.f206306a.get();
        String str = (String) this.f206307b.f393949a;
        this.f206308c.getClass();
        return new a(aVar, str, new c());
    }
}
