package com.avito.android.di.module;

import com.avito.android.deep_linking.links.AddCarToGarageLink;
import lv.C43834a;

/* compiled from: AddCarToGarageDeepLinkHandlerModule_ProvideAddCarToGarageDeepLinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30087k implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.bxcontent.garage.e f144356a;

    public C30087k(com.avito.android.bxcontent.garage.e eVar) {
        this.f144356a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.bxcontent.garage.e eVar = this.f144356a;
        C30076j.f144349a.getClass();
        return new C43834a(AddCarToGarageLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AddCarToGarageLink.class), eVar));
    }
}
