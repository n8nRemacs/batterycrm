package com.avito.android.installments.form.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InstallmentsFormBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f172783a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f172784b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f172785c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.installments.form.l f172786d;

    public g(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, com.avito.android.installments.form.l lVar4) {
        this.f172783a = lVar;
        this.f172784b = lVar2;
        this.f172785c = lVar3;
        this.f172786d = lVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((String) this.f172783a.f393949a, (String) this.f172784b.f393949a, ((Boolean) this.f172785c.f393949a).booleanValue(), (com.avito.android.installments.form.j) this.f172786d.get());
    }
}
