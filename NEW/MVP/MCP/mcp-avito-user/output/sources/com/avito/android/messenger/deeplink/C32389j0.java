package com.avito.android.messenger.deeplink;

import com.avito.android.deep_linking.links.BlockUserLink;
import lv.C43834a;

/* compiled from: MessengerDeeplinkHandlerModule_ProvideBlockUserDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.deeplink.j0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32389j0 implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32379e0 f195518a;

    /* renamed from: b, reason: collision with root package name */
    public final C32372b f195519b;

    public C32389j0(C32379e0 c32379e0, C32372b c32372b) {
        this.f195518a = c32379e0;
        this.f195519b = c32372b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C32372b c32372b = this.f195519b;
        this.f195518a.getClass();
        return new C43834a(BlockUserLink.class, null, new C43834a.b.C11809b(c32372b));
    }
}
