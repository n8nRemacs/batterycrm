package com.avito.android.str_calendar.seller.calandar_parameters.di;

import android.content.res.Resources;
import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.str_calendar.seller.calandar_parameters.di.b;
import com.avito.android.str_calendar.seller.calandar_parameters.s;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.P3;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: StrCalendarParametersModule_ProvideCategoryParametersElementConverterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final l f286858a;

    /* renamed from: b, reason: collision with root package name */
    public final P3 f286859b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f286860c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Locale> f286861d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f286862e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<hJ.e> f286863f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<hJ.g> f286864g;

    /* renamed from: h, reason: collision with root package name */
    public final u f286865h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<Q1> f286866i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f286867j;

    public m(l lVar, P3 p32, Provider provider, Provider provider2, dagger.internal.l lVar2, Provider provider3, Provider provider4, u uVar, Provider provider5, Provider provider6) {
        this.f286858a = lVar;
        this.f286859b = p32;
        this.f286860c = provider;
        this.f286861d = provider2;
        this.f286862e = lVar2;
        this.f286863f = provider3;
        this.f286864g = provider4;
        this.f286865h = uVar;
        this.f286866i = provider5;
        this.f286867j = provider6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35945t1 interfaceC35945t1 = (InterfaceC35945t1) this.f286859b.get();
        com.avito.android.server_time.f fVar = (com.avito.android.server_time.f) ((b.c.m) this.f286860c).get();
        Locale locale = (Locale) ((b.c.h) this.f286861d).get();
        Resources resources = (Resources) this.f286862e.f393949a;
        hJ.e eVar = (hJ.e) ((b.c.e) this.f286863f).get();
        hJ.g gVar = (hJ.g) ((b.c.f) this.f286864g).get();
        com.avito.android.str_calendar.seller.calandar_parameters.domain.children.a aVar = (com.avito.android.str_calendar.seller.calandar_parameters.domain.children.a) this.f286865h.get();
        Q1 q12 = (Q1) ((b.c.j) this.f286866i).get();
        u3.l lVar = (u3.l) ((b.c.l) this.f286867j).get();
        this.f286858a.getClass();
        return new s(interfaceC35945t1, resources, fVar, true, false, locale, eVar, gVar, q12, aVar, lVar, 16, null);
    }
}
