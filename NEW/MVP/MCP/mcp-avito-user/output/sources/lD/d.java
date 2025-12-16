package Ld;

import Kd.C14301d;
import com.avito.android.deep_linking.links.AuctionDetailsBottomSheetLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: AuctionDeepLinkHandlerModule_ProvideAuctionDetailsDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.auction.details.b f10021a;

    public d(com.avito.android.auction.details.b bVar) {
        this.f10021a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.auction.details.b bVar = this.f10021a;
        C14379a.f10018a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AuctionDetailsBottomSheetLink.class, new C14301d(), new C43834a.b.C11809b(bVar));
    }
}
