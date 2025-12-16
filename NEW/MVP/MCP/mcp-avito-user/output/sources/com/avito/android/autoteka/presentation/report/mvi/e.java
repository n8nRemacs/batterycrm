package com.avito.android.autoteka.presentation.report.mvi;

import com.avito.android.autoteka.deeplinks.ReportDetails;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaReportActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.autoteka.data.j f97719a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f97720b;

    public e(com.avito.android.autoteka.data.j jVar, dagger.internal.l lVar) {
        this.f97719a = jVar;
        this.f97720b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.autoteka.data.i) this.f97719a.get(), (ReportDetails) this.f97720b.f393949a);
    }
}
