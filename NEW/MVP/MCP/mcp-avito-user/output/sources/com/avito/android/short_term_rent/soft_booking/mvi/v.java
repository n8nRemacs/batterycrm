package com.avito.android.short_term_rent.soft_booking.mvi;

import com.google.gson.Gson;
import gj.InterfaceC40691b;
import java.util.Date;
import javax.inject.Provider;

/* compiled from: StrSoftBookingBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.short_term_rent.soft_booking.domain.k> f282853a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.short_term_rent.di.module.c f282854b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Gson> f282855c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f282856d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f282857e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f282858f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f282859g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.l f282860h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f282861i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.l f282862j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.l f282863k;

    /* renamed from: l, reason: collision with root package name */
    public final dagger.internal.l f282864l;

    public v(Provider provider, com.avito.android.short_term_rent.di.module.c cVar, Provider provider2, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4, dagger.internal.l lVar5, dagger.internal.l lVar6, dagger.internal.l lVar7, dagger.internal.l lVar8, dagger.internal.l lVar9) {
        this.f282853a = provider;
        this.f282854b = cVar;
        this.f282855c = provider2;
        this.f282856d = lVar;
        this.f282857e = lVar2;
        this.f282858f = lVar3;
        this.f282859g = lVar4;
        this.f282860h = lVar5;
        this.f282861i = lVar6;
        this.f282862j = lVar7;
        this.f282863k = lVar8;
        this.f282864l = lVar9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new u(this.f282853a.get(), (InterfaceC40691b) this.f282854b.get(), this.f282855c.get(), (Date) this.f282856d.f393949a, (Date) this.f282857e.f393949a, ((Integer) this.f282858f.f393949a).intValue(), (String) this.f282859g.f393949a, (String) this.f282860h.f393949a, ((Boolean) this.f282861i.f393949a).booleanValue(), (String) this.f282862j.f393949a, (Boolean) this.f282863k.f393949a, (String) this.f282864l.f393949a);
    }
}
