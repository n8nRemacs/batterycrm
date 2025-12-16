package com.avito.android.autoteka.presentation.report.mvi;

import com.avito.android.autoteka.deeplinks.ReportDetails;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaReportOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.autoteka.data.a> f97753a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f97754b;

    public l(dagger.internal.l lVar, Provider provider) {
        this.f97753a = provider;
        this.f97754b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f97753a.get(), (ReportDetails) this.f97754b.f393949a);
    }
}
