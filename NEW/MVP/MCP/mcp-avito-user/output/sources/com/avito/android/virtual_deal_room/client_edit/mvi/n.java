package com.avito.android.virtual_deal_room.client_edit.mvi;

import com.avito.android.virtual_deal_room.client_edit.model.ClientEditArguments;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ClientEditReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class n implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final u f326245a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f326246b;

    public n(dagger.internal.l lVar, u uVar) {
        this.f326245a = uVar;
        this.f326246b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l((BN0.a) this.f326245a.get(), (ClientEditArguments) this.f326246b.f393949a);
    }
}
