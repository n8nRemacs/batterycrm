package com.avito.android.beduin.common.component.favorite_button;

import com.avito.android.B2;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinFavoriteButtonComponentFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f101195a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<B2> f101196b;

    public e(u uVar, Provider provider) {
        this.f101195a = uVar;
        this.f101196b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((j) this.f101195a.get(), this.f101196b.get());
    }
}
