package com.avito.android.di.module;

import java.util.Iterator;
import okhttp3.CertificatePinner;

/* compiled from: CertificatePinningModule_ProvideCertificatePinnerFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* renamed from: com.avito.android.di.module.z2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30254z2 implements dagger.internal.h<CertificatePinner> {

    /* compiled from: CertificatePinningModule_ProvideCertificatePinnerFactory.java */
    /* renamed from: com.avito.android.di.module.z2$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C30254z2 f144736a = new C30254z2();
    }

    public static C30254z2 a() {
        return a.f144736a;
    }

    public static CertificatePinner b() {
        C30243y2 c30243y2 = C30243y2.f144717a;
        CertificatePinner.Builder builder = new CertificatePinner.Builder();
        C30243y2.f144717a.getClass();
        Iterator it = C30243y2.a().iterator();
        while (it.hasNext()) {
            com.avito.android.certificate_pinning.b bVar = (com.avito.android.certificate_pinning.b) it.next();
            builder.add(bVar.f117780a, bVar.f117781b);
        }
        CertificatePinner certificatePinnerBuild = builder.build();
        dagger.internal.t.d(certificatePinnerBuild);
        return certificatePinnerBuild;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return b();
    }
}
