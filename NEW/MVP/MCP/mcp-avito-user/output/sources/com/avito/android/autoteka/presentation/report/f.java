package com.avito.android.autoteka.presentation.report;

import com.avito.android.autoteka.presentation.report.mvi.i;
import com.avito.android.autoteka.presentation.report.mvi.j;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaReportViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final j f97699a;

    public f(j jVar) {
        this.f97699a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((i) this.f97699a.get(), null, 2, null);
    }
}
