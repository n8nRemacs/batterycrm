package com.avito.android.di;

import com.avito.android.deep_linking.links.EditSellerTypeLink;
import lv.C43834a;

/* compiled from: ProfileSettingsMappingsModule_ProvideEditSellerTypeLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class I implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final H f139248a;

    /* renamed from: b, reason: collision with root package name */
    public final xy.b f139249b;

    public I(H h12, xy.b bVar) {
        this.f139248a = h12;
        this.f139249b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        xy.b bVar = this.f139249b;
        this.f139248a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(EditSellerTypeLink.class, new xy.c(), new C43834a.b.C11809b(bVar));
    }
}
