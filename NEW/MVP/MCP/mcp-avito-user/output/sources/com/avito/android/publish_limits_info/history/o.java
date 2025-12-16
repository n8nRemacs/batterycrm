package com.avito.android.publish_limits_info.history;

import com.avito.android.publish_limits_info.ItemId;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublishLimitsHistoryViewModelFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f245871a;

    /* renamed from: b, reason: collision with root package name */
    public final k f245872b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f245873c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f245874d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f245875e;

    public o(dagger.internal.l lVar, k kVar, Provider provider, Provider provider2, dagger.internal.l lVar2) {
        this.f245871a = lVar;
        this.f245872b = kVar;
        this.f245873c = provider;
        this.f245874d = provider2;
        this.f245875e = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n((ItemId) this.f245871a.f393949a, (g) this.f245872b.get(), this.f245873c.get(), this.f245874d.get(), (com.avito.android.publish_limits_info.history.tab.a) this.f245875e.f393949a);
    }
}
