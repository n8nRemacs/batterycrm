package com.avito.android.di.module;

import com.avito.android.deep_linking.links.PhoneLink;
import lv.C43834a;

/* compiled from: PhoneCallLinkHandlerModule_ProvideProvideCallLinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class E6 implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final D6 f143910a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.home.y f143911b;

    public E6(D6 d62, com.avito.android.home.y yVar) {
        this.f143910a = d62;
        this.f143911b = yVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.home.y yVar = this.f143911b;
        this.f143910a.getClass();
        return new C43834a(PhoneLink.Call.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PhoneLink.Call.class), yVar));
    }
}
