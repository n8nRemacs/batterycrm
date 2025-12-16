package com.avito.android.autoteka.presentation.reportGeneration;

import com.avito.android.autoteka.presentation.reportGeneration.mvi.i;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaReportGenerationViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final i f97781a;

    public e(i iVar) {
        this.f97781a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.autoteka.presentation.reportGeneration.mvi.h) this.f97781a.get(), null, 2, null);
    }
}
