package com.avito.android.mortgage.document_upload.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.document_upload.model.DocumentUploadArguments;
import dagger.internal.x;
import dagger.internal.y;
import f00.C40196c;
import f00.d;
import javax.inject.Provider;
import kotlin.collections.B0;
import kotlin.collections.C42784z0;

/* compiled from: DocumentUploadFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f199431a;

    /* renamed from: b, reason: collision with root package name */
    public final c f199432b;

    /* renamed from: c, reason: collision with root package name */
    public final j f199433c;

    /* renamed from: d, reason: collision with root package name */
    public final l f199434d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f199435e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f199436f;

    public h(e eVar, c cVar, j jVar, l lVar, Provider provider, dagger.internal.l lVar2) {
        this.f199431a = eVar;
        this.f199432b = cVar;
        this.f199433c = jVar;
        this.f199434d = lVar;
        this.f199435e = provider;
        this.f199436f = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        this.f199431a.getClass();
        d dVar = new d();
        b bVar = (b) this.f199432b.get();
        this.f199433c.getClass();
        i iVar = new i();
        k kVar = (k) this.f199434d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f199435e.get();
        DocumentUploadArguments documentUploadArguments = (DocumentUploadArguments) this.f199436f.f393949a;
        C40196c.f395541w.getClass();
        C42784z0 c42784z0 = C42784z0.f406748b;
        B0 b02 = B0.f406639b;
        String str = documentUploadArguments.f199378b;
        int i12 = documentUploadArguments.f199379c;
        int i13 = documentUploadArguments.f199380d;
        d.c cVar = new d.c(str, i12, i13);
        return new g("DocumentUpload", new C40196c(c42784z0, documentUploadArguments.f199391o, false, false, str, i12, i13, documentUploadArguments.f199381e, documentUploadArguments.f199382f, documentUploadArguments.f199383g, documentUploadArguments.f199384h, documentUploadArguments.f199385i, documentUploadArguments.f199386j, documentUploadArguments.f199387k, documentUploadArguments.f199388l, documentUploadArguments.f199389m, b02, documentUploadArguments.f199390n, documentUploadArguments.f199392p, null, cVar), new f(dVar, bVar, screenPerformanceTracker, kVar, iVar));
    }
}
