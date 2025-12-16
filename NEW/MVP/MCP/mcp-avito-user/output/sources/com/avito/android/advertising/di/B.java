package com.avito.android.advertising.di;

import com.avito.android.deep_linking.links.OpenCreativeTargetingLink;
import lv.C43834a;
import yb.C50209b;

/* compiled from: OpenCreativeTargetingLinkModule_ProvideOpenCreativeTargetingLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class B implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C50209b f87810a;

    public B(C50209b c50209b) {
        this.f87810a = c50209b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C50209b c50209b = this.f87810a;
        A.f87809a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(OpenCreativeTargetingLink.class, new OpenCreativeTargetingLink.b(), new C43834a.b.C11809b(c50209b));
    }
}
