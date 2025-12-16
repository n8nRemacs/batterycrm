package com.avito.android.important_addresses_selection.presentation.mvi;

import com.avito.android.important_addresses_selection.domain.model.ImportantAddressesSelectionData;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImportantAddressesSelectionActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<PM.a> f169874a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f169875b;

    /* renamed from: c, reason: collision with root package name */
    public final RM.e f169876c;

    public d(Provider provider, dagger.internal.l lVar, RM.e eVar) {
        this.f169874a = provider;
        this.f169875b = lVar;
        this.f169876c = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f169874a.get(), (ImportantAddressesSelectionData) this.f169875b.f393949a, (RM.d) this.f169876c.get());
    }
}
