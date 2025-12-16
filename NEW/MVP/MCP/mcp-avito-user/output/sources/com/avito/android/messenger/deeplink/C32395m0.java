package com.avito.android.messenger.deeplink;

import com.avito.android.deep_linking.links.ChannelDetailsLink;
import lv.C43834a;

/* compiled from: MessengerDeeplinkHandlerModule_ProvideChannelDetailsMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.deeplink.m0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32395m0 implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32379e0 f195529a;

    /* renamed from: b, reason: collision with root package name */
    public final C32407t f195530b;

    public C32395m0(C32379e0 c32379e0, C32407t c32407t) {
        this.f195529a = c32379e0;
        this.f195530b = c32407t;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C32407t c32407t = this.f195530b;
        this.f195529a.getClass();
        return new C43834a(ChannelDetailsLink.class, null, new C43834a.b.C11809b(c32407t));
    }
}
