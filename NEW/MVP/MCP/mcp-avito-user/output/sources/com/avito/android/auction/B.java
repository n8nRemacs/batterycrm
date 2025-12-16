package com.avito.android.auction;

import Pd.InterfaceC14769a;
import com.avito.android.auction.remote.model.AuctionSendingResult;
import com.avito.android.deep_linking.links.AuctionAddLink;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.rx3.O;
import kotlinx.coroutines.rx3.Q;
import lD.C43617a;
import sj0.InterfaceC48373a;

/* compiled from: SendDraftToAuctionInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auction/B;", "Lcom/avito/android/auction/z;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class B implements z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14769a f92307a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48373a f92308b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f92309c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C43617a f92310d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f92311e;

    @Inject
    public B(@Y61.k InterfaceC14769a interfaceC14769a, @Y61.k InterfaceC48373a interfaceC48373a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k C43617a c43617a, @Y61.k com.avito.android.deep_linking.x xVar) {
        this.f92307a = interfaceC14769a;
        this.f92308b = interfaceC48373a;
        this.f92309c = interfaceC35745a5;
        this.f92310d = c43617a;
        this.f92311e = xVar;
    }

    @Override // com.avito.android.auction.z
    @Y61.k
    public final io.reactivex.rxjava3.core.z<TypedResult<AuctionSendingResult>> a(@Y61.k AuctionAddLink.Arguments arguments) {
        C43617a c43617a = this.f92310d;
        c43617a.getClass();
        kotlin.reflect.n<Object> nVar = C43617a.f413588V[39];
        boolean zBooleanValue = ((Boolean) c43617a.f413603O.a().invoke()).booleanValue();
        InterfaceC35745a5 interfaceC35745a5 = this.f92309c;
        return zBooleanValue ? Q.a(O.c(interfaceC35745a5.a()), new A(this, arguments, null)).F() : this.f92307a.d(arguments.f133014b, arguments.f133015c, arguments.f133016d).z(interfaceC35745a5.a()).F();
    }
}
