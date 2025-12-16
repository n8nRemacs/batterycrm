package com.avito.android.select.new_metro.mvi;

import com.avito.android.select.new_metro.SelectMetroParams;
import dagger.internal.x;
import dagger.internal.y;
import gq0.InterfaceC40721a;

/* compiled from: SelectMetroBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f266275a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f266276b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.select.new_metro.p f266277c;

    public h(dagger.internal.l lVar, dagger.internal.u uVar, com.avito.android.select.new_metro.p pVar) {
        this.f266275a = lVar;
        this.f266276b = uVar;
        this.f266277c = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((SelectMetroParams) this.f266275a.f393949a, (InterfaceC40721a) this.f266276b.get(), (com.avito.android.select.new_metro.o) this.f266277c.get());
    }
}
