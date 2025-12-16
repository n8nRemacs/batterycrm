package com.avito.android.authorization.select_profile.adapter.text.di;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TextItemModule_ProvideBlueprint$_avito_authorization_implFactory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final b f94285a;

    /* renamed from: b, reason: collision with root package name */
    public final u f94286b;

    public c(b bVar, u uVar) {
        this.f94285a = bVar;
        this.f94286b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.authorization.select_profile.adapter.text.b bVar = (com.avito.android.authorization.select_profile.adapter.text.b) this.f94286b.get();
        this.f94285a.getClass();
        return new com.avito.android.authorization.select_profile.adapter.text.a(bVar);
    }
}
