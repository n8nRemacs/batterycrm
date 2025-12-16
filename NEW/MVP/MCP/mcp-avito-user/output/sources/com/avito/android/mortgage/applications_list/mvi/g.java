package com.avito.android.mortgage.applications_list.mvi;

import com.avito.android.mortgage.applications_list.ApplicationsListArguments;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ApplicationsListBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f198463a;

    /* renamed from: b, reason: collision with root package name */
    public final u f198464b;

    public g(dagger.internal.l lVar, u uVar) {
        this.f198463a = lVar;
        this.f198464b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((ApplicationsListArguments) this.f198463a.f393949a, (QZ.b) this.f198464b.get());
    }
}
