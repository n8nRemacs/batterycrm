package com.avito.android.recall_me.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RecallMeItemsModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.recall_me.presentation.items.title.b f251819a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.recall_me.presentation.items.single_input.e f251820b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.recall_me.presentation.items.accept_button.b f251821c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.recall_me.presentation.items.user_agreement.b f251822d;

    public h(com.avito.android.recall_me.presentation.items.title.b bVar, com.avito.android.recall_me.presentation.items.single_input.e eVar, com.avito.android.recall_me.presentation.items.accept_button.b bVar2, com.avito.android.recall_me.presentation.items.user_agreement.b bVar3) {
        this.f251819a = bVar;
        this.f251820b = eVar;
        this.f251821c = bVar2;
        this.f251822d = bVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.recall_me.presentation.items.title.a aVar = (com.avito.android.recall_me.presentation.items.title.a) this.f251819a.get();
        com.avito.android.recall_me.presentation.items.single_input.d dVar = (com.avito.android.recall_me.presentation.items.single_input.d) this.f251820b.get();
        com.avito.android.recall_me.presentation.items.accept_button.a aVar2 = (com.avito.android.recall_me.presentation.items.accept_button.a) this.f251821c.get();
        com.avito.android.recall_me.presentation.items.user_agreement.a aVar3 = (com.avito.android.recall_me.presentation.items.user_agreement.a) this.f251822d.get();
        f.f251817a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(dVar);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        return c10493a.a();
    }
}
