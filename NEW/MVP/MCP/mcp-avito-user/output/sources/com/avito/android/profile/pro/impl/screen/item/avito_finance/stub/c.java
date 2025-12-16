package com.avito.android.profile.pro.impl.screen.item.avito_finance.stub;

import com.avito.android.profile.pro.impl.screen.item.avito_finance.stub.g;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileProAvitoFinanceStubBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final e f223039a;

    /* renamed from: b, reason: collision with root package name */
    public final l f223040b;

    public c(e eVar, l lVar) {
        this.f223039a = eVar;
        this.f223040b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f223039a.get(), (g.b) this.f223040b.f393949a);
    }
}
