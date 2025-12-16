package com.avito.android.legal_request.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import sR.C48100c;

/* compiled from: LegalRequestFeatureBuilder_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/legal_request/mvi/j;", "Ldagger/internal/h;", "Lcom/avito/android/legal_request/mvi/i;", "a", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f175283f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f175284a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e f175285b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l f175286c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final n f175287d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f175288e;

    /* compiled from: LegalRequestFeatureBuilder_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/legal_request/mvi/j$a;", "", "<init>", "()V", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public j(@Y61.k g gVar, @Y61.k e eVar, @Y61.k l lVar, @Y61.k n nVar, @Y61.k dagger.internal.l lVar2) {
        this.f175284a = gVar;
        this.f175285b = eVar;
        this.f175286c = lVar;
        this.f175287d = nVar;
        this.f175288e = lVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f175284a.get();
        d dVar = (d) this.f175285b.get();
        this.f175286c.getClass();
        k kVar = new k();
        this.f175287d.getClass();
        m mVar = new m();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f175288e.f393949a;
        f175283f.getClass();
        C48100c.f437655d.getClass();
        return new i("LegalRequest", C48100c.f437656e, new h(dVar, fVar, screenPerformanceTracker, mVar, kVar));
    }
}
