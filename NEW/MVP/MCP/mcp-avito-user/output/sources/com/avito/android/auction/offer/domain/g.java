package com.avito.android.auction.offer.domain;

import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AuctionOfferInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.auction.offer.domain.AuctionOfferInteractorImpl", f = "AuctionOfferInteractor.kt", i = {0}, l = {63}, m = "sendToAuctionViaContracts", n = {"this"}, s = {"L$0"})
/* loaded from: classes11.dex */
final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public h f92506q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f92507r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f92508s;

    /* renamed from: t, reason: collision with root package name */
    public int f92509t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f92508s = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f92507r = obj;
        this.f92509t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f92508s.e(null, null, this);
    }
}
