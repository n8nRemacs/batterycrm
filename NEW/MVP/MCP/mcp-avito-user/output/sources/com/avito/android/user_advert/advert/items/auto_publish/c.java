package com.avito.android.user_advert.advert.items.auto_publish;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoPublishItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f309247a;

    /* renamed from: b, reason: collision with root package name */
    public final u f309248b;

    public c(u uVar, Provider provider) {
        this.f309247a = provider;
        this.f309248b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f309247a.get(), (com.avito.android.util.text.a) this.f309248b.get());
    }
}
