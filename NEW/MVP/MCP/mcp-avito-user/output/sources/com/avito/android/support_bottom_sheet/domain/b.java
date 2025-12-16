package com.avito.android.support_bottom_sheet.domain;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.t1;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SupportDialogInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<ZG.a> f292430a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<t1> f292431b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f292432c;

    /* renamed from: d, reason: collision with root package name */
    public final l f292433d;

    /* renamed from: e, reason: collision with root package name */
    public final l f292434e;

    public b(l lVar, l lVar2, Provider provider, Provider provider2, Provider provider3) {
        this.f292430a = provider;
        this.f292431b = provider2;
        this.f292432c = provider3;
        this.f292433d = lVar;
        this.f292434e = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f292430a.get(), this.f292431b.get(), this.f292432c.get(), (String) this.f292433d.f393949a, (Long) this.f292434e.f393949a);
    }
}
