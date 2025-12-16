package com.avito.android.auction.offer.mvi;

import Nd.c;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: AuctionReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/auction/offer/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "LNd/c;", "LNd/d;", "<init>", "()V", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class n implements u<Nd.c, Nd.d> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Nd.d a(Nd.c cVar, Nd.d dVar) {
        Nd.c cVar2 = cVar;
        Nd.d dVar2 = dVar;
        if (cVar2 instanceof c.i) {
            return Nd.d.a(dVar2, true, null, false, 62);
        }
        if (cVar2 instanceof c.f) {
            c.f fVar = (c.f) cVar2;
            return new Nd.d(false, fVar.f11633a, C42784z0.f406748b, fVar.f11635c, fVar.f11636d, fVar.f11634b, null, false);
        }
        if (!(cVar2 instanceof c.g)) {
            return cVar2 instanceof c.h ? Nd.d.a(dVar2, false, ((c.h) cVar2).f11641a, false, 62) : cVar2 instanceof c.e ? Nd.d.a(dVar2, false, null, true, 127) : cVar2 instanceof c.C0748c ? Nd.d.a(dVar2, false, null, false, 127) : dVar2;
        }
        c.g gVar = (c.g) cVar2;
        return new Nd.d(false, C42784z0.f406748b, gVar.f11637a, gVar.f11639c, gVar.f11640d, gVar.f11638b, null, false);
    }
}
