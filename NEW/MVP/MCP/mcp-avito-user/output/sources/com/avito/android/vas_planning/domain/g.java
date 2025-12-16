package com.avito.android.vas_planning.domain;

import android.content.res.Resources;
import com.avito.android.J0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VasPlannerConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f322329a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<J0> f322330b;

    public g(dagger.internal.l lVar, Provider provider) {
        this.f322329a = lVar;
        this.f322330b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((Resources) this.f322329a.f393949a, this.f322330b.get());
    }
}
