package com.avito.android.universal_map.map.point_info;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import dj.InterfaceC39737b;
import gj.InterfaceC40691b;
import java.util.Map;
import javax.inject.Provider;
import oG0.InterfaceC44637a;

/* compiled from: UniversalMapPointInfoViewModelFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<a> f305864a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f305865b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC44637a> f305866c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f305867d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f305868e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f305869f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC39737b> f305870g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.universal_map.map.tracker.c> f305871h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.map_core.beduin.action_handler.o> f305872i;

    public p(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f305864a = provider;
        this.f305865b = provider2;
        this.f305866c = provider3;
        this.f305867d = provider4;
        this.f305868e = lVar;
        this.f305869f = lVar2;
        this.f305870g = provider5;
        this.f305871h = provider6;
        this.f305872i = provider7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f305864a.get(), this.f305865b.get(), this.f305866c.get(), this.f305867d.get(), (String) this.f305868e.f393949a, (Map) this.f305869f.f393949a, this.f305870g.get(), this.f305871h.get(), this.f305872i.get());
    }
}
