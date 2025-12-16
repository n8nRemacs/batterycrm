package com.avito.android.authorization.gorelkin.di;

import Cd.D;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.authorization.gorelkin.m;
import com.avito.android.authorization.gorelkin.n;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ParsingPermissionModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final l f93917a;

    /* renamed from: b, reason: collision with root package name */
    public final u f93918b;

    public f(l lVar, u uVar) {
        this.f93917a = lVar;
        this.f93918b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        S0 s02 = (S0) this.f93917a.f393949a;
        D d12 = (D) this.f93918b.get();
        d.f93915a.getClass();
        return (m) new P0(s02, d12, null, 4, null).a(n.class);
    }
}
