package com.avito.android.publish.scanner_v2.vinscanner.mvi;

import De0.d;
import android.net.Uri;
import com.avito.android.remote.model.category_parameters.VinScanner;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VinScannerFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f239512a;

    /* renamed from: b, reason: collision with root package name */
    public final k f239513b;

    /* renamed from: c, reason: collision with root package name */
    public final m f239514c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f239515d;

    public i(f fVar, k kVar, m mVar, dagger.internal.l lVar) {
        this.f239512a = fVar;
        this.f239513b = kVar;
        this.f239514c = mVar;
        this.f239515d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f239512a.get();
        this.f239513b.getClass();
        j jVar = new j();
        l lVar = (l) this.f239514c.get();
        VinScanner vinScanner = (VinScanner) this.f239515d.f393949a;
        return new h("VinScanner", new d.c(new d.f(vinScanner.getNecessaryText(), vinScanner.getTitle(), vinScanner.getPermissionPage().getTitle(), vinScanner.getPermissionPage().getDescription(), vinScanner.getSkipButtonTitle(), Uri.EMPTY, false, true)), new g(eVar, lVar, jVar));
    }
}
