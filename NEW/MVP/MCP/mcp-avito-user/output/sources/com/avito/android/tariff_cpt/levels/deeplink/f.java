package com.avito.android.tariff_cpt.levels.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCptLevelSaveV3DeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<JC0.a> f298553a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f298554b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f298555c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f298556d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f298557e;

    public f(dagger.internal.f fVar, dv.b bVar, dv.b bVar2, Provider provider, Provider provider2) {
        this.f298553a = provider;
        this.f298554b = provider2;
        this.f298555c = fVar;
        this.f298556d = bVar;
        this.f298557e = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f298553a.get(), this.f298554b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f298555c.get(), (a.g) this.f298556d.get(), (a.i) this.f298557e.get());
    }
}
