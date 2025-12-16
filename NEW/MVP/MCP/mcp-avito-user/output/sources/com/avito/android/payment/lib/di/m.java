package com.avito.android.payment.lib.di;

import android.app.Activity;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.R0;
import com.avito.android.payment.lib.A;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PaymentMethodsModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<com.avito.android.payment.lib.t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<A> f214640a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f214641b;

    public m(dagger.internal.l lVar, Provider provider) {
        this.f214640a = provider;
        this.f214641b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        A a12 = this.f214640a.get();
        Activity activity = (Activity) this.f214641b.f393949a;
        int i12 = d.f214619a;
        return (com.avito.android.payment.lib.t) R0.b((ActivityC22955m) activity, a12).a(com.avito.android.payment.lib.t.class);
    }
}
