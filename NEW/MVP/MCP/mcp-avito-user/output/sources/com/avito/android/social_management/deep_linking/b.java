package com.avito.android.social_management.deep_linking;

import com.avito.android.deep_linking.links.auth.SocialsListLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: SocialManagementLinkHandlerModule_ProvideSocialManagementDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f284568a;

    /* renamed from: b, reason: collision with root package name */
    public final f f284569b;

    public b(d dVar, f fVar) {
        this.f284568a = dVar;
        this.f284569b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f284569b.getClass();
        e eVar = new e();
        d dVar = this.f284568a;
        a.f284567a.getClass();
        return new C43834a(SocialsListLink.class, eVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(SocialsListLink.class), dVar));
    }
}
