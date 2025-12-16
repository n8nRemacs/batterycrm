package com.avito.android.recall_me.di;

import Cd.D;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.recall_me.presentation.I;
import com.avito.android.recall_me.presentation.q;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RecallMeModule_Companion_ProvideRecallMeViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f251828a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<D> f251829b;

    public l(dagger.internal.l lVar, Provider provider) {
        this.f251828a = lVar;
        this.f251829b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        S0 s02 = (S0) this.f251828a.f393949a;
        D d12 = this.f251829b.get();
        j.f251825a.getClass();
        return (q) new P0(s02, d12, null, 4, null).a(I.class);
    }
}
