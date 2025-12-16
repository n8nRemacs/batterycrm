package com.avito.android.autoteka.presentation.reportGeneration.mvi;

import com.avito.android.autoteka.deeplinks.ReportGenerationDetails;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaReportGenerationActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.autoteka.data.reportStatus.a> f97794a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f97795b;

    public d(dagger.internal.l lVar, Provider provider) {
        this.f97794a = provider;
        this.f97795b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f97794a.get(), (ReportGenerationDetails) this.f97795b.f393949a);
    }
}
