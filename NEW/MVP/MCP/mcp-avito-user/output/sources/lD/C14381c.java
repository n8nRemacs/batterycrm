package Ld;

import Kd.g;
import com.avito.android.auction.i;
import com.avito.android.deep_linking.links.AuctionLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: AuctionDeepLinkHandlerModule_ProvideAuctionDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: Ld.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14381c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final i f10020a;

    public C14381c(i iVar) {
        this.f10020a = iVar;
    }

    public static C43834a a(i iVar) {
        C14379a.f10018a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AuctionLink.class, new g(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AuctionLink.class), iVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f10020a);
    }
}
