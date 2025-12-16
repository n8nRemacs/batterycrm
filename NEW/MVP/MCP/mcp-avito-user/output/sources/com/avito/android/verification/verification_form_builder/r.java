package com.avito.android.verification.verification_form_builder;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: FormBuilderViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.verification_form_builder.mvi.m f325481a;

    public r(com.avito.android.verification.verification_form_builder.mvi.m mVar) {
        this.f325481a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.verification.verification_form_builder.mvi.l lVar = (com.avito.android.verification.verification_form_builder.mvi.l) this.f325481a.get();
        i2.f411430a.getClass();
        return new q(lVar, i2.a.f411433c);
    }
}
