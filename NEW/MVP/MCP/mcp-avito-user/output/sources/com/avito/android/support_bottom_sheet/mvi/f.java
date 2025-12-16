package com.avito.android.support_bottom_sheet.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SupportDialogActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f292477a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.support_bottom_sheet.domain.b f292478b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f292479c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f292480d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f292481e;

    public f(Provider provider, com.avito.android.support_bottom_sheet.domain.b bVar, Provider provider2, dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f292477a = provider;
        this.f292478b = bVar;
        this.f292479c = provider2;
        this.f292480d = lVar;
        this.f292481e = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f292477a.get(), (com.avito.android.support_bottom_sheet.domain.a) this.f292478b.get(), this.f292479c.get(), (String) this.f292480d.f393949a, (Long) this.f292481e.f393949a);
    }
}
