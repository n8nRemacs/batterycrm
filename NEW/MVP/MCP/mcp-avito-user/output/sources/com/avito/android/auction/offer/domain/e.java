package com.avito.android.auction.offer.domain;

import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AuctionOfferInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.auction.offer.domain.AuctionOfferInteractorImpl", f = "AuctionOfferInteractor.kt", i = {}, l = {88}, m = "loadOfferV2ViaContracts", n = {}, s = {})
/* loaded from: classes11.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f92503q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f92504r;

    /* renamed from: s, reason: collision with root package name */
    public int f92505s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f92504r = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f92503q = obj;
        this.f92505s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f92504r.d(null, this);
    }
}
