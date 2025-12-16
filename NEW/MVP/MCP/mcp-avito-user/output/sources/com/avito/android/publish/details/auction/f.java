package com.avito.android.publish.details.auction;

import com.avito.android.publish.details.ItemDetailsView;
import kotlin.Metadata;

/* compiled from: PublishAuctionDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f233481b;

    public f(e eVar) {
        this.f233481b = eVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        ItemDetailsView itemDetailsView = this.f233481b.f233478l;
        if (itemDetailsView != null) {
            itemDetailsView.a();
        }
    }
}
