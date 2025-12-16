package com.avito.android.sbc.autodispatcheslist.mvi;

import com.avito.android.sbc.autodispatcheslist.AutoDispatchListInfo;
import com.avito.android.sbc.di.v;
import com.avito.android.sbc.di.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SbcAutoDispatchesListReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final v f259143a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.sbc.di.x f259144b;

    /* renamed from: c, reason: collision with root package name */
    public final w f259145c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f259146d;

    public k(v vVar, com.avito.android.sbc.di.x xVar, w wVar, dagger.internal.l lVar) {
        this.f259143a = vVar;
        this.f259144b = xVar;
        this.f259145c = wVar;
        this.f259146d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j((com.avito.android.sbc.utils.g) this.f259143a.get(), (com.avito.android.sbc.utils.h) this.f259144b.get(), (com.avito.android.sbc.utils.a) this.f259145c.get(), (AutoDispatchListInfo) this.f259146d.f393949a);
    }
}
