package com.avito.android.publish.details.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.publish.details.K1;
import com.avito.android.publish.details.t2;
import com.avito.android.publish.details.u2;

/* compiled from: PublishDetailsModule_ProvideViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class x0 implements dagger.internal.h<K1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f234602a;

    /* renamed from: b, reason: collision with root package name */
    public final u2 f234603b;

    public x0(dagger.internal.l lVar, u2 u2Var) {
        this.f234602a = lVar;
        this.f234603b = u2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f234602a.f393949a;
        t2 t2Var = (t2) this.f234603b.get();
        n0.f234577a.getClass();
        return (K1) new P0(fragment, t2Var).a(K1.class);
    }
}
