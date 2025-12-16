package com.avito.android.user_advert.soa_with_price.di;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CloseReasonSheetDialogModule_ProvideRecyclerAdapter$_avito_user_advert_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<RecyclerView.Adapter<com.avito.konveyor.adapter.b>> {

    /* renamed from: a, reason: collision with root package name */
    public final u f311887a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f311888b;

    public f(u uVar, Provider provider) {
        this.f311887a = uVar;
        this.f311888b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f311887a.get();
        com.avito.konveyor.a aVar2 = this.f311888b.get();
        int i12 = c.f311884a;
        return new j(aVar, aVar2);
    }
}
