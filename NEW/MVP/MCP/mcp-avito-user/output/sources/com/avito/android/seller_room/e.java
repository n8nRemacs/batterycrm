package com.avito.android.seller_room;

import Yq0.InterfaceC18319a;
import com.avito.android.seller_room.ui.SellerRoomOpenParams;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SellerRoomInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f268130a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC18319a> f268131b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Gson> f268132c;

    /* renamed from: d, reason: collision with root package name */
    public final l f268133d;

    public e(l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f268130a = provider;
        this.f268131b = provider2;
        this.f268132c = provider3;
        this.f268133d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f268130a.get(), this.f268131b.get(), g.a(w.a(this.f268132c)), (SellerRoomOpenParams) this.f268133d.f393949a);
    }
}
