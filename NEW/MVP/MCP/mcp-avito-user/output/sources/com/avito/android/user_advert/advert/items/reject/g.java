package com.avito.android.user_advert.advert.items.reject;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RejectReasonItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<h> f310000a;

    /* renamed from: b, reason: collision with root package name */
    public final u f310001b;

    public g(u uVar, Provider provider) {
        this.f310000a = provider;
        this.f310001b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f310000a.get(), (com.avito.android.util.text.a) this.f310001b.get());
    }
}
