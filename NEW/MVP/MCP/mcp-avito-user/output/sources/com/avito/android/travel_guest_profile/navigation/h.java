package com.avito.android.travel_guest_profile.navigation;

import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;
import navigation.TravelGuestProfileLink;

/* compiled from: TravelGuestProfileLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f302215a;

    /* renamed from: b, reason: collision with root package name */
    public final f f302216b;

    public h(g gVar, f fVar) {
        this.f302215a = gVar;
        this.f302216b = fVar;
    }

    public static C43834a a(g gVar, f fVar) {
        gVar.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TravelGuestProfileLink.class, new i(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TravelGuestProfileLink.class), fVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f302215a, this.f302216b);
    }
}
