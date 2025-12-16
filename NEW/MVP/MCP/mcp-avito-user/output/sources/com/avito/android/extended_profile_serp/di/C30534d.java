package com.avito.android.extended_profile_serp.di;

import aB.C19749b;
import aB.C19751d;
import com.avito.android.extended_profile_serp.deep_linking.ExtendedProfileSerpLink;
import lv.C43834a;

/* compiled from: ExtendedProfileSerpDeeplinkModule_ProvideExtendedProfileSerpLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.extended_profile_serp.di.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30534d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C19749b f152850a;

    public C30534d(C19749b c19749b) {
        this.f152850a = c19749b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C19749b c19749b = this.f152850a;
        C30533c.f152849a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ExtendedProfileSerpLink.class, new C19751d(), new C43834a.b.C11809b(c19749b));
    }
}
