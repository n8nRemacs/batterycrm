package com.avito.android.verification.di.input_inn;

import Cd.D;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.verification.verification_input_inn.v;
import com.avito.android.verification.verification_input_inn.w;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationInputInnModule_ProvideVerificationInputInnViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final l f323800a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<D> f323801b;

    public e(l lVar, Provider provider) {
        this.f323800a = lVar;
        this.f323801b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        S0 s02 = (S0) this.f323800a.f393949a;
        D d12 = this.f323801b.get();
        d.f323799a.getClass();
        return (v) new P0(s02, d12, null, 4, null).a(w.class);
    }
}
