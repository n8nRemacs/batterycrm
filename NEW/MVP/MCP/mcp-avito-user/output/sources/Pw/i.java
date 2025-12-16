package PW;

import com.avito.android.loyalty.links.reputation_unavailable.ReputationUnavailableLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: LoyaltyDeepLinkHandlerModule_ProvideReputationUnavailableLinkSyncHandlerMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final YW.b f13101a;

    public i(YW.b bVar) {
        this.f13101a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        YW.b bVar = this.f13101a;
        a.f13093a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ReputationUnavailableLink.class, new YW.c(), new C43834a.b.C11809b(bVar));
    }
}
