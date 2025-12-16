package com.avito.android.autoteka.presentation.reportGeneration.mvi;

import com.avito.android.autoteka.deeplinks.ReportGenerationDetails;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaReportGenerationBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.autoteka.data.reportStatus.a> f97811a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f97812b;

    public f(dagger.internal.l lVar, Provider provider) {
        this.f97811a = provider;
        this.f97812b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f97811a.get(), (ReportGenerationDetails) this.f97812b.f393949a);
    }
}
