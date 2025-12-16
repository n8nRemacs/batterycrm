package com.avito.android.iac_util_deeplinks.impl_module.replace_contact;

import com.avito.android.iac_util_deeplinks.public_module.replace_contact.ReplaceContactLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: RunOnceLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f169219a;

    public f(c cVar) {
        this.f169219a = cVar;
    }

    public static C43834a a(c cVar) {
        e.f169218a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ReplaceContactLink.class, new ReplaceContactLinkParser(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ReplaceContactLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f169219a);
    }
}
