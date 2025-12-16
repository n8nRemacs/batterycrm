package com.avito.android.mortgage.consultation.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.consultation.model.ConsultationArguments;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlin.collections.C42784z0;

/* compiled from: MortgageConsultationFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final l f198629a;

    /* renamed from: b, reason: collision with root package name */
    public final d f198630b;

    /* renamed from: c, reason: collision with root package name */
    public final b f198631c;

    /* renamed from: d, reason: collision with root package name */
    public final k f198632d;

    /* renamed from: e, reason: collision with root package name */
    public final i f198633e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f198634f;

    public g(l lVar, d dVar, b bVar, k kVar, i iVar, Provider provider) {
        this.f198629a = lVar;
        this.f198630b = dVar;
        this.f198631c = bVar;
        this.f198632d = kVar;
        this.f198633e = iVar;
        this.f198634f = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ConsultationArguments consultationArguments = (ConsultationArguments) this.f198629a.f393949a;
        c cVar = (c) this.f198630b.get();
        a aVar = (a) this.f198631c.get();
        this.f198632d.getClass();
        j jVar = new j();
        this.f198633e.getClass();
        h hVar = new h();
        ScreenPerformanceTracker screenPerformanceTracker = this.f198634f.get();
        XZ.d.f18912n.getClass();
        String str = consultationArguments.f198591c;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        C42784z0 c42784z0 = C42784z0.f406748b;
        kotlin.random.f.f406882b.getClass();
        int i12 = kotlin.random.f.f406883c.i();
        return new f("MortgageConsultation", new XZ.d(consultationArguments.f198590b, str2, false, "", false, c42784z0, false, true, consultationArguments.f198592d, consultationArguments.f198593e, i12), new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
