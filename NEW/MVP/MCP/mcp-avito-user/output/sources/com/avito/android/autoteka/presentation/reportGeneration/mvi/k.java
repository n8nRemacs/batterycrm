package com.avito.android.autoteka.presentation.reportGeneration.mvi;

import com.avito.android.autoteka.deeplinks.ReportGenerationDetails;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaReportGenerationOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f97826a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f97827b;

    public k(dagger.internal.l lVar, Provider provider) {
        this.f97826a = provider;
        this.f97827b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f97826a.get(), (ReportGenerationDetails) this.f97827b.f393949a);
    }
}
