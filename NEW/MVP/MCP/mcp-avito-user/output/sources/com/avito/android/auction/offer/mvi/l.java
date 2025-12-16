package com.avito.android.auction.offer.mvi;

import Nd.b;
import Nd.c;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AuctionOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/auction/offer/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "LNd/c;", "LNd/b;", "<init>", "()V", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l implements t<Nd.c, Nd.b> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Nd.b b(Nd.c cVar) {
        Nd.c cVar2 = cVar;
        if (cVar2 instanceof c.j) {
            return new b.c(((c.j) cVar2).f11643a);
        }
        if (cVar2 instanceof c.d) {
            return new b.d(((c.d) cVar2).f11631a);
        }
        if (cVar2 instanceof c.b) {
            return b.a.f11624a;
        }
        if (cVar2 instanceof c.a) {
            return b.C0747b.f11625a;
        }
        return null;
    }
}
