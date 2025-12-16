package com.avito.android.select.sectioned_multiselect.core.di;

import Zp0.InterfaceC19588c;
import com.avito.android.select.C;
import dagger.internal.x;
import dagger.internal.y;
import java.util.List;

/* compiled from: SectionedMultiselectModule_ProvideSelectedDialogInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<com.avito.android.select.g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f266634a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f266635b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f266636c;

    public l(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3) {
        this.f266634a = lVar;
        this.f266635b = lVar2;
        this.f266636c = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        List list = (List) this.f266634a.f393949a;
        boolean zBooleanValue = ((Boolean) this.f266635b.f393949a).booleanValue();
        InterfaceC19588c interfaceC19588c = (InterfaceC19588c) this.f266636c.f393949a;
        d.f266618a.getClass();
        return (!zBooleanValue || interfaceC19588c == null) ? new C(list, null, 2, null) : new com.avito.android.select.m(interfaceC19588c);
    }
}
