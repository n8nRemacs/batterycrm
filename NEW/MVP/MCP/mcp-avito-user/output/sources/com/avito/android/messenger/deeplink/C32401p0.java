package com.avito.android.messenger.deeplink;

import com.avito.android.deep_linking.links.CreateChannelByOpponentUserLink;
import lv.C43834a;

/* compiled from: MessengerDeeplinkHandlerModule_ProvideCreateChannelByOpponentUserDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.deeplink.p0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32401p0 implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32379e0 f195540a;

    /* renamed from: b, reason: collision with root package name */
    public final A f195541b;

    public C32401p0(C32379e0 c32379e0, A a12) {
        this.f195540a = c32379e0;
        this.f195541b = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        A a12 = this.f195541b;
        this.f195540a.getClass();
        return new C43834a(CreateChannelByOpponentUserLink.class, null, new C43834a.b.C11809b(a12));
    }
}
