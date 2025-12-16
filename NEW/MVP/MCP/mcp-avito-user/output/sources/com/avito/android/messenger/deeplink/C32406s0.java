package com.avito.android.messenger.deeplink;

import com.avito.android.deep_linking.links.DeleteChannelLink;
import lv.C43834a;

/* compiled from: MessengerDeeplinkHandlerModule_ProvideDeleteChannelDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.deeplink.s0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32406s0 implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32379e0 f195566a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.deeplinks.delete_channel.e f195567b;

    public C32406s0(C32379e0 c32379e0, com.avito.android.messenger.conversation.mvi.deeplinks.delete_channel.e eVar) {
        this.f195566a = c32379e0;
        this.f195567b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.messenger.conversation.mvi.deeplinks.delete_channel.e eVar = this.f195567b;
        this.f195566a.getClass();
        return new C43834a(DeleteChannelLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(DeleteChannelLink.class), eVar));
    }
}
