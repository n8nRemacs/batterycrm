package com.avito.android.iac_util_deeplinks.impl_module;

import com.avito.android.iac_util_deeplinks.public_module.OpenSystemSettingsLink;
import lv.C43834a;

/* compiled from: OpenSystemSettingsLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.iac_util_deeplinks.impl_module.p, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C30965p implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30967s f169159a;

    /* renamed from: b, reason: collision with root package name */
    public final C30963n f169160b;

    public C30965p(C30967s c30967s, C30963n c30963n) {
        this.f169159a = c30967s;
        this.f169160b = c30963n;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f169159a.get();
        C30963n c30963n = this.f169160b;
        C30964o.f169158a.getClass();
        return new C43834a(OpenSystemSettingsLink.class, rVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(OpenSystemSettingsLink.class), c30963n));
    }
}
