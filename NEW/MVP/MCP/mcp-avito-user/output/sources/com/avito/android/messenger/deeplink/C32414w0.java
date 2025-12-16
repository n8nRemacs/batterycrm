package com.avito.android.messenger.deeplink;

import com.avito.android.deep_linking.links.RequestReviewLink;
import lv.C43834a;

/* compiled from: MessengerDeeplinkHandlerModule_ProvideRequestReviewLinkDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.deeplink.w0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32414w0 implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32379e0 f195580a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.deeplinks.review.i f195581b;

    public C32414w0(C32379e0 c32379e0, com.avito.android.messenger.conversation.mvi.deeplinks.review.i iVar) {
        this.f195580a = c32379e0;
        this.f195581b = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.messenger.conversation.mvi.deeplinks.review.i iVar = this.f195581b;
        this.f195580a.getClass();
        return new C43834a(RequestReviewLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(RequestReviewLink.class), iVar));
    }
}
