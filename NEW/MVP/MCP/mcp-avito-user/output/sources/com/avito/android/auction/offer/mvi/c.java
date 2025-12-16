package com.avito.android.auction.offer.mvi;

import Nd.InterfaceC14561a;
import Nd.c;
import com.avito.android.arch.mvi.a;
import com.avito.android.auction.offer.AuctionOfferParams;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import lD.C43617a;

/* compiled from: AuctionActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/auction/offer/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LNd/a;", "LNd/c;", "LNd/d;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC14561a, Nd.c, Nd.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.auction.offer.domain.d f92569a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AuctionOfferParams f92570b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.auction.offer.domain.j f92571c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C43617a f92572d;

    @Inject
    public c(@Y61.k com.avito.android.auction.offer.domain.d dVar, @Y61.k AuctionOfferParams auctionOfferParams, @Y61.k com.avito.android.auction.offer.domain.j jVar, @Y61.k C43617a c43617a) {
        this.f92569a = dVar;
        this.f92570b = auctionOfferParams;
        this.f92571c = jVar;
        this.f92572d = c43617a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<Nd.c> b(InterfaceC14561a interfaceC14561a, Nd.d dVar) {
        C43210w c43210w;
        InterfaceC14561a interfaceC14561a2 = interfaceC14561a;
        if (interfaceC14561a2 instanceof InterfaceC14561a.e) {
            return C43175k.G(new a(this, null));
        }
        if (interfaceC14561a2 instanceof InterfaceC14561a.d) {
            return new C43210w(new c.d(((InterfaceC14561a.d) interfaceC14561a2).f11620a));
        }
        if (interfaceC14561a2 instanceof InterfaceC14561a.C0746a) {
            return C43175k.G(new b(this, null));
        }
        if (interfaceC14561a2 instanceof InterfaceC14561a.c ? true : interfaceC14561a2.equals(InterfaceC14561a.b.f11618a) ? true : interfaceC14561a2.equals(InterfaceC14561a.g.f11623a)) {
            c43210w = new C43210w(c.b.f11629a);
        } else {
            if (!(interfaceC14561a2 instanceof InterfaceC14561a.f)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(c.a.f11628a);
        }
        return c43210w;
    }
}
