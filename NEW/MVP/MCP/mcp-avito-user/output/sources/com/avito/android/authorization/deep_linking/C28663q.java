package com.avito.android.authorization.deep_linking;

import com.avito.android.deep_linking.links.auth.PhoneUnavailableReasonLink;
import lv.C43834a;

/* compiled from: AuthorizationDeeplinkMappingsModule_ProvidePhoneUnavailableReasonLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.authorization.deep_linking.q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28663q implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final Y f93799a;

    public C28663q(Y y12) {
        this.f93799a = y12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C28655i.f93789a.getClass();
        return new C43834a(PhoneUnavailableReasonLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PhoneUnavailableReasonLink.class), this.f93799a));
    }
}
