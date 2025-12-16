package com.avito.android.auction.details.mvi;

import Md.b;
import Md.c;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AuctionDetailsOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/auction/details/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "LMd/b;", "LMd/c;", "<init>", "()V", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements t<Md.b, Md.c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Md.c b(Md.b bVar) {
        Md.c dVar;
        Md.b bVar2 = bVar;
        if (bVar2.equals(b.a.f10915a)) {
            return c.a.f10920a;
        }
        if (bVar2 instanceof b.c) {
            dVar = new c.C0691c(((b.c) bVar2).f10917a);
        } else {
            if (bVar2.equals(b.d.f10918a)) {
                return c.b.f10921a;
            }
            if (!(bVar2 instanceof b.e)) {
                return null;
            }
            dVar = new c.d(((b.e) bVar2).f10919a);
        }
        return dVar;
    }
}
