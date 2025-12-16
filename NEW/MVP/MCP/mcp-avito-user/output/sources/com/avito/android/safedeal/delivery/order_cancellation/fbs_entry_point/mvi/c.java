package com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.ReasonRds;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FbsEntryPointActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f256341a;

    /* renamed from: b, reason: collision with root package name */
    public final l f256342b;

    /* renamed from: c, reason: collision with root package name */
    public final l f256343c;

    public c(l lVar, l lVar2, Provider provider) {
        this.f256341a = provider;
        this.f256342b = lVar;
        this.f256343c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f256341a.get(), (ReasonRds) this.f256342b.f393949a, (String) this.f256343c.f393949a);
    }
}
