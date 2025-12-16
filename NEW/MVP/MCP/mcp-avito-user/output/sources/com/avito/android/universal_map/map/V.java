package com.avito.android.universal_map.map;

import Zi.InterfaceC19564a;
import com.avito.android.util.InterfaceC35745a5;
import gj.InterfaceC40691b;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import oG0.InterfaceC44637a;

/* compiled from: UniversalPointsViewModelFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class V implements dagger.internal.h<U> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<J> f304888a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f304889b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f304890c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f304891d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f304892e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC19564a> f304893f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f304894g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.map_core.beduin.action_handler.g> f304895h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.map_core.beduin.action_handler.i> f304896i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.map_core.beduin.action_handler.c> f304897j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<com.avito.android.map_core.beduin.action_handler.m> f304898k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.map_core.beduin.action_handler.a> f304899l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<com.avito.android.map_core.beduin.action_handler.e> f304900m;

    /* renamed from: n, reason: collision with root package name */
    public final Provider<com.avito.android.map_core.beduin.action_handler.k> f304901n;

    /* renamed from: o, reason: collision with root package name */
    public final dagger.internal.u f304902o;

    /* renamed from: p, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f304903p;

    /* renamed from: q, reason: collision with root package name */
    public final Provider<com.avito.android.universal_map.map.tracker.c> f304904q;

    public V(Provider provider, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, dagger.internal.u uVar, Provider provider11, Provider provider12) {
        this.f304888a = provider;
        this.f304889b = lVar;
        this.f304890c = lVar2;
        this.f304891d = lVar3;
        this.f304892e = lVar4;
        this.f304893f = provider2;
        this.f304894g = provider3;
        this.f304895h = provider4;
        this.f304896i = provider5;
        this.f304897j = provider6;
        this.f304898k = provider7;
        this.f304899l = provider8;
        this.f304900m = provider9;
        this.f304901n = provider10;
        this.f304902o = uVar;
        this.f304903p = provider11;
        this.f304904q = provider12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        J j12 = this.f304888a.get();
        String str = (String) this.f304889b.f393949a;
        Map map = (Map) this.f304890c.f393949a;
        List list = (List) this.f304891d.f393949a;
        String str2 = (String) this.f304892e.f393949a;
        InterfaceC19564a interfaceC19564a = this.f304893f.get();
        InterfaceC40691b interfaceC40691b = this.f304894g.get();
        com.avito.android.map_core.beduin.action_handler.g gVar = this.f304895h.get();
        com.avito.android.map_core.beduin.action_handler.i iVar = this.f304896i.get();
        com.avito.android.map_core.beduin.action_handler.c cVar = this.f304897j.get();
        com.avito.android.map_core.beduin.action_handler.m mVar = this.f304898k.get();
        com.avito.android.map_core.beduin.action_handler.a aVar = this.f304899l.get();
        com.avito.android.map_core.beduin.action_handler.e eVar = this.f304900m.get();
        com.avito.android.map_core.beduin.action_handler.k kVar = this.f304901n.get();
        InterfaceC44637a interfaceC44637a = (InterfaceC44637a) this.f304902o.get();
        return new U(interfaceC19564a, aVar, cVar, eVar, gVar, iVar, kVar, mVar, j12, this.f304904q.get(), this.f304903p.get(), interfaceC40691b, str, str2, list, map, interfaceC44637a);
    }
}
