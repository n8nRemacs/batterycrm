package com.avito.android.di.module;

import com.avito.android.deep_linking.links.ItemsSearchLink;
import lv.C43834a;

/* compiled from: ItemsSearchLinkHandlerModule_ProvideItemsSearchLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class C5 implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final B5 f143872a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.bxcontent.M1 f143873b;

    public C5(B5 b52, com.avito.android.bxcontent.M1 m12) {
        this.f143872a = b52;
        this.f143873b = m12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f143872a.getClass();
        return new C43834a(ItemsSearchLink.class, null, new C43834a.b.C11809b(this.f143873b));
    }
}
