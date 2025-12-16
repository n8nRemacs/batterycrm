package com.avito.android.auction;

import kotlin.Metadata;

/* compiled from: AuctionPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class q<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f92603b;

    public q(r rVar) {
        this.f92603b = rVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        AuctionFragment auctionFragment = this.f92603b.f92606c;
        if (auctionFragment != null) {
            auctionFragment.q5();
        }
    }
}
