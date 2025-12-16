package com.avito.android.universal_map.map.mvi;

import Hr.InterfaceC14024a;
import Vi.C15684a;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: UniversalMapBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class n implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f305649a;

    /* renamed from: b, reason: collision with root package name */
    public final u f305650b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f305651c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.universal_map.map_mvi.point_info.a> f305652d;

    /* renamed from: e, reason: collision with root package name */
    public final u f305653e;

    /* renamed from: f, reason: collision with root package name */
    public final u f305654f;

    /* renamed from: g, reason: collision with root package name */
    public final u f305655g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.map_core.beduin.action_handler.o> f305656h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<C15684a> f305657i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.map_core.beduin.action_handler.i> f305658j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<com.avito.android.map_core.beduin.action_handler.g> f305659k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.map_core.beduin.action_handler.e> f305660l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<com.avito.android.map_core.beduin.action_handler.m> f305661m;

    /* renamed from: n, reason: collision with root package name */
    public final Provider<com.avito.android.map_core.beduin.action_handler.a> f305662n;

    /* renamed from: o, reason: collision with root package name */
    public final Provider<com.avito.android.map_core.beduin.action_handler.c> f305663o;

    /* renamed from: p, reason: collision with root package name */
    public final Provider<com.avito.android.map_core.beduin.action_handler.k> f305664p;

    public n(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2, u uVar2, u uVar3, u uVar4, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11) {
        this.f305649a = lVar;
        this.f305650b = uVar;
        this.f305651c = provider;
        this.f305652d = provider2;
        this.f305653e = uVar2;
        this.f305654f = uVar3;
        this.f305655g = uVar4;
        this.f305656h = provider3;
        this.f305657i = provider4;
        this.f305658j = provider5;
        this.f305659k = provider6;
        this.f305660l = provider7;
        this.f305661m = provider8;
        this.f305662n = provider9;
        this.f305663o = provider10;
        this.f305664p = provider11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((Long) this.f305649a.f393949a, (InterfaceC14024a) this.f305650b.get(), this.f305651c.get(), this.f305652d.get(), (com.avito.android.universal_map.map_mvi.point_filters.a) this.f305653e.get(), (R0) this.f305654f.get(), (u3.g) this.f305655g.get(), this.f305656h.get(), this.f305657i.get(), this.f305658j.get(), this.f305659k.get(), this.f305660l.get(), this.f305661m.get(), this.f305662n.get(), this.f305663o.get(), this.f305664p.get());
    }
}
