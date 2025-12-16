package com.avito.android.iac_util_deeplinks.impl_module;

import com.avito.android.iac_util_deeplinks.public_module.ClickStreamLocalLink;
import lv.C43834a;

/* compiled from: ClickStreamLocalLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.iac_util_deeplinks.impl_module.h, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C30957h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30955f f169145a;

    public C30957h(C30955f c30955f) {
        this.f169145a = c30955f;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C30955f c30955f = this.f169145a;
        C30956g.f169144a.getClass();
        return new C43834a(ClickStreamLocalLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ClickStreamLocalLink.class), c30955f));
    }
}
