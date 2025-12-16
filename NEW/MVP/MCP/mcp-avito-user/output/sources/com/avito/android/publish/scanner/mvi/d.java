package com.avito.android.publish.scanner.mvi;

import com.avito.android.publish.R0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.scanner.ScannerParams;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ScannerActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f239249a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.R0> f239250b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC33535v> f239251c;

    /* renamed from: d, reason: collision with root package name */
    public final l f239252d;

    /* renamed from: e, reason: collision with root package name */
    public final u f239253e;

    /* renamed from: f, reason: collision with root package name */
    public final l f239254f;

    public d(l lVar, l lVar2, u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f239249a = provider;
        this.f239250b = provider2;
        this.f239251c = provider3;
        this.f239252d = lVar;
        this.f239253e = uVar;
        this.f239254f = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f239249a.get(), this.f239250b.get(), this.f239251c.get(), (ScannerParams) this.f239252d.f393949a, (com.avito.android.publish.scanner.di.c) this.f239253e.get(), ((Integer) this.f239254f.f393949a).intValue());
    }
}
