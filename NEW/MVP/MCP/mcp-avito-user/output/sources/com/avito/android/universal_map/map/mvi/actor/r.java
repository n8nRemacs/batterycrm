package com.avito.android.universal_map.map.mvi.actor;

import com.avito.android.universal_map.map.InterfaceC35318f;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import java.util.List;
import javax.inject.Provider;

/* compiled from: UniversalMapActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class r implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f305417a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f305418b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35318f> f305419c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f305420d;

    /* renamed from: e, reason: collision with root package name */
    public final f f305421e;

    /* renamed from: f, reason: collision with root package name */
    public final b f305422f;

    /* renamed from: g, reason: collision with root package name */
    public final h f305423g;

    /* renamed from: h, reason: collision with root package name */
    public final l f305424h;

    public r(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, f fVar, b bVar, h hVar, l lVar3) {
        this.f305417a = lVar;
        this.f305418b = lVar2;
        this.f305419c = provider;
        this.f305420d = provider2;
        this.f305421e = fVar;
        this.f305422f = bVar;
        this.f305423g = hVar;
        this.f305424h = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m((List) this.f305417a.f393949a, (String) this.f305418b.f393949a, this.f305419c.get(), this.f305420d.get(), (d) this.f305421e.get(), (a) this.f305422f.get(), (g) this.f305423g.get(), (j) this.f305424h.get());
    }
}
