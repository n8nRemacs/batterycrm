package com.avito.android.select.sectioned_multiselect.tab.di;

import Zp0.InterfaceC19588c;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SectionedMultiselectTabModule_ProvideSelectedDialogInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<com.avito.android.select.g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f266761a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f266762b;

    public i(dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f266761a = lVar;
        this.f266762b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        boolean zBooleanValue = ((Boolean) this.f266761a.f393949a).booleanValue();
        InterfaceC19588c interfaceC19588c = (InterfaceC19588c) this.f266762b.f393949a;
        e.f266751a.getClass();
        if (!zBooleanValue || interfaceC19588c == null) {
            return null;
        }
        return new com.avito.android.select.m(interfaceC19588c);
    }
}
