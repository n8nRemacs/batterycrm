package Ld;

import Kd.C14298a;
import com.avito.android.auction.g;
import com.avito.android.deep_linking.links.AuctionAddLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: AuctionDeepLinkHandlerModule_ProvideAddAuctionDeepLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: Ld.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14380b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f10019a;

    public C14380b(g gVar) {
        this.f10019a = gVar;
    }

    public static C43834a a(g gVar) {
        C14379a.f10018a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AuctionAddLink.class, new C14298a(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AuctionAddLink.class), gVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f10019a);
    }
}
