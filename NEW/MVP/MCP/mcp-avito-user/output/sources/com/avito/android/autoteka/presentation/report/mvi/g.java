package com.avito.android.autoteka.presentation.report.mvi;

import com.avito.android.autoteka.deeplinks.ReportDetails;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaReportBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.autoteka.data.j f97739a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f97740b;

    public g(com.avito.android.autoteka.data.j jVar, dagger.internal.l lVar) {
        this.f97739a = jVar;
        this.f97740b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.avito.android.autoteka.data.i) this.f97739a.get(), (ReportDetails) this.f97740b.f393949a);
    }
}
