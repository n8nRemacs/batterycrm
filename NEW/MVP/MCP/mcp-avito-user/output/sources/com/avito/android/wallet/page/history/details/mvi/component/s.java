package com.avito.android.wallet.page.history.details.mvi.component;

import android.app.Application;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PaymentHistoryDetailsViewStateBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Application> f327925a;

    public s(Provider<Application> provider) {
        this.f327925a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r(this.f327925a.get());
    }
}
