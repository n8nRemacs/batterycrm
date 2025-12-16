package com.avito.android.profile_phones.phones_list.actions.di;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhoneActionsModule_ProvideAdapter$_avito_profile_phones_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<RecyclerView.Adapter<com.avito.konveyor.adapter.b>> {

    /* renamed from: a, reason: collision with root package name */
    public final d f227489a;

    /* renamed from: b, reason: collision with root package name */
    public final u f227490b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f227491c;

    public f(d dVar, u uVar, Provider provider) {
        this.f227489a = dVar;
        this.f227490b = uVar;
        this.f227491c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f227490b.get();
        com.avito.konveyor.a aVar2 = this.f227491c.get();
        this.f227489a.getClass();
        return new j(aVar, aVar2);
    }
}
