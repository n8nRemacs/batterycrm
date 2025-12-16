package com.avito.android.related_products.bottom_sheet.di;

import com.avito.android.related_products.bottom_sheet.RelatedProductsBottomSheetDeepLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: RelatedProductsBottomSheetDeepLinkModule_ProvideRelatedProductsBottomSheetMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.related_products.bottom_sheet.deeplink.e f252903a;

    public e(com.avito.android.related_products.bottom_sheet.deeplink.e eVar) {
        this.f252903a = eVar;
    }

    public static C43834a a(com.avito.android.related_products.bottom_sheet.deeplink.e eVar) {
        c.f252901a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(RelatedProductsBottomSheetDeepLink.class, new com.avito.android.related_products.bottom_sheet.deeplink.f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(RelatedProductsBottomSheetDeepLink.class), eVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f252903a);
    }
}
