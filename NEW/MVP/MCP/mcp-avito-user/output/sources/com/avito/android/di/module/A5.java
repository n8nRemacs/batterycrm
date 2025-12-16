package com.avito.android.di.module;

import com.avito.android.deep_linking.links.AdvertListLink;
import lv.C43834a;

/* compiled from: ItemListLinkHandlerModule_ProvideItemListLinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class A5 implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30257z5 f143832a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.bxcontent.J1 f143833b;

    public A5(C30257z5 c30257z5, com.avito.android.bxcontent.J1 j12) {
        this.f143832a = c30257z5;
        this.f143833b = j12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.bxcontent.J1 j12 = this.f143833b;
        this.f143832a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AdvertListLink.ItemList.class, new com.avito.android.bxcontent.K1(), new C43834a.b.C11809b(j12));
    }
}
