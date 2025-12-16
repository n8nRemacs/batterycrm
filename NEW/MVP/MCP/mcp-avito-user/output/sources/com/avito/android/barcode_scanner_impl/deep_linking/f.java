package com.avito.android.barcode_scanner_impl.deep_linking;

import com.avito.android.barcode_scanner_public.BarcodeScannerLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: BarcodeScannerLinkHandlerModule_ProvideBarcodeScannerLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f98879a;

    public f(g gVar) {
        this.f98879a = gVar;
    }

    public static C43834a a(g gVar) {
        e.f98878a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(BarcodeScannerLink.class, new h(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(BarcodeScannerLink.class), gVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f98879a);
    }
}
