package com.avito.android.wallet.page.topup.form.di;

import android.content.res.Resources;
import com.avito.android.validation.g1;
import com.avito.android.validation.h1;
import dagger.internal.y;

/* compiled from: TopUpFormModule_ProvideParametersValidatorResourceProviderFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class r implements dagger.internal.h<g1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f328292a;

    public r(dagger.internal.l lVar) {
        this.f328292a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f328292a.f393949a;
        g.f328273a.getClass();
        return new h1(resources);
    }
}
