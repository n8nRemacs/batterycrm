package com.avito.android.vas_discount.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PickerModule_ProvideTitleBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final i f319664a;

    /* renamed from: b, reason: collision with root package name */
    public final u f319665b;

    public k(i iVar, u uVar) {
        this.f319664a = iVar;
        this.f319665b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.vas_discount.ui.items.title.e eVar = (com.avito.android.vas_discount.ui.items.title.e) this.f319665b.get();
        this.f319664a.getClass();
        return new com.avito.android.vas_discount.ui.items.title.a(eVar);
    }
}
