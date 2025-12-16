package com.avito.android.publish.details.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;

/* compiled from: RealtyAddressSubmissionDetailsModule_ProvideRealtyAddressSubmissionViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class I0 implements dagger.internal.h<com.avito.android.publish.realty_address_submission.h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f233637a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.publish.realty_address_submission.k f233638b;

    public I0(dagger.internal.l lVar, com.avito.android.publish.realty_address_submission.k kVar) {
        this.f233637a = lVar;
        this.f233638b = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f233637a.f393949a;
        com.avito.android.publish.realty_address_submission.j jVar = (com.avito.android.publish.realty_address_submission.j) this.f233638b.get();
        H0.f233633a.getClass();
        return (com.avito.android.publish.realty_address_submission.h) new P0(fragment, jVar).a(com.avito.android.publish.realty_address_submission.h.class);
    }
}
