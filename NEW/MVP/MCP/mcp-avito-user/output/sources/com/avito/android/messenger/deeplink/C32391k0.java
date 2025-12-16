package com.avito.android.messenger.deeplink;

import com.avito.android.deep_linking.links.BlockUserWithReasonLink;
import lv.C43834a;

/* compiled from: MessengerDeeplinkHandlerModule_ProvideBlockUserWithReasonDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.deeplink.k0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32391k0 implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32379e0 f195521a;

    /* renamed from: b, reason: collision with root package name */
    public final C32376d f195522b;

    public C32391k0(C32379e0 c32379e0, C32376d c32376d) {
        this.f195521a = c32379e0;
        this.f195522b = c32376d;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C32376d c32376d = this.f195522b;
        this.f195521a.getClass();
        return new C43834a(BlockUserWithReasonLink.class, null, new C43834a.b.C11809b(c32376d));
    }
}
