package com.avito.android.advert_collection_adding.di;

import com.avito.android.deep_linking.links.AddToCollectionLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: AddToCollectionHandlerModule_ProvideAddToCollectionHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final a f81789a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.advert_collection_adding.e f81790b;

    public b(a aVar, com.avito.android.advert_collection_adding.e eVar) {
        this.f81789a = aVar;
        this.f81790b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.advert_collection_adding.e eVar = this.f81790b;
        this.f81789a.getClass();
        return new C43834a(AddToCollectionLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AddToCollectionLink.class), eVar));
    }
}
