package com.avito.android.user_adverts.tab_actions.info.items.block;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ActionBlockInfoItemViewBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final f f314665a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f314666b;

    public c(f fVar, Provider provider) {
        this.f314665a = fVar;
        this.f314666b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f314665a.getClass();
        return new b(new e(), this.f314666b.get());
    }
}
