package com.avito.android.change_specific.di;

import com.avito.android.change_specific.deep_linking.ProfileChangeSpecificLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ProfileChangeSpecificLinkHandlerModule_ProvideProfileChangeSpecificLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final k f117977a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.change_specific.deep_linking.c f117978b;

    public l(k kVar, com.avito.android.change_specific.deep_linking.c cVar) {
        this.f117977a = kVar;
        this.f117978b = cVar;
    }

    public static C43834a a(k kVar, com.avito.android.change_specific.deep_linking.c cVar) {
        kVar.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ProfileChangeSpecificLink.class, new com.avito.android.change_specific.deep_linking.e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ProfileChangeSpecificLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f117977a, this.f117978b);
    }
}
