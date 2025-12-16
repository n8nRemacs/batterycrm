package com.avito.android.extended_profile_map.di;

import com.avito.android.extended_profile_map.map.ExtendedProfileMapLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;
import yA.C50090a;
import yA.C50092c;

/* compiled from: ExtendedProfileMapMappingsModule_ProvideExtendedProfileMapLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f151242a;

    /* renamed from: b, reason: collision with root package name */
    public final C50092c f151243b;

    public e(d dVar, C50092c c50092c) {
        this.f151242a = dVar;
        this.f151243b = c50092c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C50092c c50092c = this.f151243b;
        this.f151242a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ExtendedProfileMapLink.class, new C50090a(), new C43834a.b.C11809b(c50092c));
    }
}
