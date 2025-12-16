package com.avito.android.early_access.di;

import com.avito.android.early_access.C30283e;
import com.avito.android.early_access.deeplink.EarlyAccessLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: EarlyAccessHandlerModule_ProvideEarlyAccessDeepLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f145310a;

    /* renamed from: b, reason: collision with root package name */
    public final C30283e f145311b;

    public e(d dVar, C30283e c30283e) {
        this.f145310a = dVar;
        this.f145311b = c30283e;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C30283e c30283e = this.f145311b;
        this.f145310a.getClass();
        return new C43834a(EarlyAccessLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(EarlyAccessLink.class), c30283e));
    }
}
