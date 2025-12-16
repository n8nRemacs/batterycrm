package com.avito.android.serp.adapter.reformulations;

import android.content.res.Resources;
import com.avito.android.util.L0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReformulationsItemWidthProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class w implements dagger.internal.h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<L0> f270665a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f270666b;

    public w(dagger.internal.l lVar, Provider provider) {
        this.f270665a = provider;
        this.f270666b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new v((Resources) this.f270666b.f393949a, this.f270665a.get());
    }
}
