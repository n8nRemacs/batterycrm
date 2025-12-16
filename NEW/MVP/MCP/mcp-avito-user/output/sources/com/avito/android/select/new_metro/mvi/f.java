package com.avito.android.select.new_metro.mvi;

import com.avito.android.select.new_metro.ItemsHolder;
import com.avito.android.select.new_metro.SelectMetroParams;
import dagger.internal.x;
import dagger.internal.y;
import gq0.InterfaceC40721a;
import javax.inject.Provider;

/* compiled from: SelectMetroActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f266259a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f266260b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<ItemsHolder> f266261c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.select.new_metro.p f266262d;

    public f(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, com.avito.android.select.new_metro.p pVar) {
        this.f266259a = lVar;
        this.f266260b = uVar;
        this.f266261c = provider;
        this.f266262d = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((SelectMetroParams) this.f266259a.f393949a, (InterfaceC40721a) this.f266260b.get(), this.f266261c.get(), (com.avito.android.select.new_metro.o) this.f266262d.get());
    }
}
