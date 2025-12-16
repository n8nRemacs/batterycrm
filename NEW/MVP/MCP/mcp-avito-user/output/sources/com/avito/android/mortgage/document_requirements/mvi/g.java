package com.avito.android.mortgage.document_requirements.mvi;

import b00.C25383b;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.document_requirements.model.Document;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import java.util.List;
import javax.inject.Provider;
import kotlin.collections.C42745f0;

/* compiled from: DocumentRequirementsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final b f198990a;

    /* renamed from: b, reason: collision with root package name */
    public final i f198991b;

    /* renamed from: c, reason: collision with root package name */
    public final d f198992c;

    /* renamed from: d, reason: collision with root package name */
    public final l f198993d;

    /* renamed from: e, reason: collision with root package name */
    public final l f198994e;

    /* renamed from: f, reason: collision with root package name */
    public final l f198995f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f198996g;

    public g(b bVar, i iVar, d dVar, l lVar, l lVar2, l lVar3, Provider provider) {
        this.f198990a = bVar;
        this.f198991b = iVar;
        this.f198992c = dVar;
        this.f198993d = lVar;
        this.f198994e = lVar2;
        this.f198995f = lVar3;
        this.f198996g = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        this.f198990a.getClass();
        a aVar = new a();
        h hVar = (h) this.f198991b.get();
        this.f198992c.getClass();
        c cVar = new c();
        List list = (List) this.f198993d.f393949a;
        Document document = (Document) this.f198994e.f393949a;
        String str = (String) this.f198995f.f393949a;
        ScreenPerformanceTracker screenPerformanceTracker = this.f198996g.get();
        if (document == null) {
            document = (Document) C42745f0.G(list);
        }
        return new f("DocumentRequirements", new C25383b(list, document, str), new e(aVar, screenPerformanceTracker, hVar, cVar));
    }
}
