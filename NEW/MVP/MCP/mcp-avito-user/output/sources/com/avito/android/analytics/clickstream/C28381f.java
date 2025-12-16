package com.avito.android.analytics.clickstream;

import com.avito.android.InterfaceC32896n;
import com.avito.android.analytics.clickstream.E;
import com.avito.android.di.module.G2;
import com.avito.android.di.module.I2;
import com.avito.android.util.InterfaceC35745a5;
import java.util.Set;
import javax.inject.Provider;
import proto.events.apps.EventOuterClass;

/* compiled from: ClickStreamCommonModule_ProvideClickStreamEventTracker$_common_analytics_clickstream_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.analytics.clickstream.f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28381f implements dagger.internal.h<E> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.inhouse_transport.u<EventOuterClass.Event>> f89790a;

    /* renamed from: b, reason: collision with root package name */
    public final G2 f89791b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.inhouse_transport.o> f89792c;

    /* renamed from: d, reason: collision with root package name */
    public final I2 f89793d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28399y> f89794e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<Set<X>> f89795f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.a> f89796g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC32896n> f89797h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f89798i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f89799j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.A f89800k;

    /* renamed from: l, reason: collision with root package name */
    public final dagger.internal.A f89801l;

    public C28381f(Provider provider, G2 g22, Provider provider2, I2 i22, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, dagger.internal.A a12, dagger.internal.A a13) {
        this.f89790a = provider;
        this.f89791b = g22;
        this.f89792c = provider2;
        this.f89793d = i22;
        this.f89794e = provider3;
        this.f89795f = provider4;
        this.f89796g = provider5;
        this.f89797h = provider6;
        this.f89798i = provider7;
        this.f89799j = provider8;
        this.f89800k = a12;
        this.f89801l = a13;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.analytics.inhouse_transport.u<EventOuterClass.Event> uVar = this.f89790a.get();
        com.avito.android.analytics.inhouse_transport.k kVar = (com.avito.android.analytics.inhouse_transport.k) this.f89791b.get();
        com.avito.android.analytics.inhouse_transport.o oVar = this.f89792c.get();
        int iIntValue = ((Integer) this.f89793d.get()).intValue();
        InterfaceC28399y interfaceC28399y = this.f89794e.get();
        Set<X> set = this.f89795f.get();
        com.avito.android.server_time.a aVar = this.f89796g.get();
        InterfaceC32896n interfaceC32896n = this.f89797h.get();
        com.avito.android.util.C c12 = this.f89798i.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f89799j.get();
        h31.e eVarB = dagger.internal.g.b(this.f89800k);
        h31.e eVarA = dagger.internal.g.a(dagger.internal.w.a(this.f89801l));
        C28379d c28379d = C28379d.f89781a;
        boolean zBooleanValue = interfaceC32896n.o().invoke().booleanValue();
        c12.getF125491k().getClass();
        E.a aVar2 = new E.a(iIntValue, zBooleanValue, false, 60000L, eVarB, eVarA);
        if (!interfaceC32896n.b().invoke().booleanValue()) {
            oVar = null;
        }
        return new E(uVar, kVar, set, interfaceC28399y, aVar, aVar2, oVar, interfaceC35745a5, interfaceC32896n.j().invoke().booleanValue(), null, 512, null);
    }
}
