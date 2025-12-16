package com.avito.android.auction.offer.items.title;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: AuctionTitleView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auction/offer/items/title/f;", "Lcom/avito/android/auction/offer/items/title/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f92561b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f92562c;

    public f(@k View view) {
        super(view);
        this.f92561b = view;
        this.f92562c = (TextView) view;
    }

    @Override // com.avito.android.auction.offer.items.title.e
    public final void setTitle(@k String str) {
        I5.a(this.f92562c, str, false);
    }
}
