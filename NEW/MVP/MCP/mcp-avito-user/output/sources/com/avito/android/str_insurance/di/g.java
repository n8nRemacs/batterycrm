package com.avito.android.str_insurance.di;

import androidx.appcompat.app.m;
import androidx.fragment.app.FragmentManager;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrInsuranceModule_ProvideFragmentManagerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements h<FragmentManager> {

    /* renamed from: a, reason: collision with root package name */
    public final f f288558a;

    /* renamed from: b, reason: collision with root package name */
    public final l f288559b;

    public g(f fVar, l lVar) {
        this.f288558a = fVar;
        this.f288559b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        m mVar = (m) this.f288559b.f393949a;
        this.f288558a.getClass();
        return mVar.getSupportFragmentManager();
    }
}
