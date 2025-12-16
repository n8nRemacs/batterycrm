package com.avito.android.bxcontent.di.module;

import com.avito.android.deep_linking.links.BxContentLink;
import lv.C43834a;

/* compiled from: BxContentDeepLinkHandlerModule_ProvideMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.bxcontent.di.module.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29060h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C29059g f110996a;

    /* renamed from: b, reason: collision with root package name */
    public final kl.b f110997b;

    public C29060h(C29059g c29059g, kl.b bVar) {
        this.f110996a = c29059g;
        this.f110997b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        kl.b bVar = this.f110997b;
        this.f110996a.getClass();
        return new C43834a(BxContentLink.class, null, new C43834a.b.C11809b(bVar));
    }
}
