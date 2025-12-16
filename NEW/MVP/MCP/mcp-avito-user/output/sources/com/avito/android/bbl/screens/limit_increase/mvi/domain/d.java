package com.avito.android.bbl.screens.limit_increase.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import oh.InterfaceC44774a;

/* compiled from: PostLimitIncreaseUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC44774a> f99786a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f99787b;

    /* renamed from: c, reason: collision with root package name */
    public final l f99788c;

    /* renamed from: d, reason: collision with root package name */
    public final l f99789d;

    public d(l lVar, l lVar2, Provider provider, Provider provider2) {
        this.f99786a = provider;
        this.f99787b = provider2;
        this.f99788c = lVar;
        this.f99789d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f99786a.get(), this.f99787b.get(), ((Long) this.f99788c.f393949a).longValue(), (String) this.f99789d.f393949a);
    }
}
