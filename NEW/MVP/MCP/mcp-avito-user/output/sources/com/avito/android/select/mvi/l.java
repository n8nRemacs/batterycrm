package com.avito.android.select.mvi;

import com.avito.android.select.Arguments;
import com.avito.android.select.SelectSignificantState;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f265627a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.select.g> f265628b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f265629c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f265630d;

    public l(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2) {
        this.f265627a = lVar;
        this.f265628b = provider;
        this.f265629c = provider2;
        this.f265630d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k((Arguments) this.f265627a.f393949a, this.f265628b.get(), this.f265629c.get(), (SelectSignificantState) this.f265630d.f393949a);
    }
}
