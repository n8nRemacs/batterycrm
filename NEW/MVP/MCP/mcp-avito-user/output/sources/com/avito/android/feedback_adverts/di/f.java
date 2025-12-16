package com.avito.android.feedback_adverts.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FeedbackAdvertsModule_ProvideAdapterPresenter$_avito_feedback_adverts_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f157806a;

    public f(u uVar) {
        this.f157806a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f157806a.get();
        e.f157805a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
