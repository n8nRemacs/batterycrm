package com.avito.android.seller_coach.hints_dialog.provider;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HintDialogModule_ProvideDataAwareAdapterPresenterImpl$_avito_seller_coach_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f267535a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f267536b;

    /* renamed from: c, reason: collision with root package name */
    public final u f267537c;

    public e(u uVar, Provider provider, Provider provider2) {
        this.f267535a = provider;
        this.f267536b = provider2;
        this.f267537c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f267535a);
        com.avito.konveyor.adapter.h hVar = this.f267536b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f267537c.get();
        c.f267533a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
