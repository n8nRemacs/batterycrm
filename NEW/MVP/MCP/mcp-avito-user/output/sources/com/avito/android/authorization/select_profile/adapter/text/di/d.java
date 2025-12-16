package com.avito.android.authorization.select_profile.adapter.text.di;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TextItemModule_ProvidePresenter$_avito_authorization_implFactory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<com.avito.android.authorization.select_profile.adapter.text.b> {

    /* renamed from: a, reason: collision with root package name */
    public final b f94287a;

    /* renamed from: b, reason: collision with root package name */
    public final u f94288b;

    public d(b bVar, u uVar) {
        this.f94287a = bVar;
        this.f94288b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f94288b.get();
        this.f94287a.getClass();
        return new com.avito.android.authorization.select_profile.adapter.text.c(new a(aVar));
    }
}
