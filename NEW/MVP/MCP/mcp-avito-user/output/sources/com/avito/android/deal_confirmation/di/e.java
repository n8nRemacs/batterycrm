package com.avito.android.deal_confirmation.di;

import com.avito.android.deep_linking.links.DealConfirmationFeedbackLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: DealConfirmationLinkHandlerModule_ProvideDealConfirmationFeedbackDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.deal_confirmation.deep_link.d f132756a;

    public e(com.avito.android.deal_confirmation.deep_link.d dVar) {
        this.f132756a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.deal_confirmation.deep_link.d dVar = this.f132756a;
        d.f132755a.getClass();
        return new C43834a(DealConfirmationFeedbackLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(DealConfirmationFeedbackLink.class), dVar));
    }
}
