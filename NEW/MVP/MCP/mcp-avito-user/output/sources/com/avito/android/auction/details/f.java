package com.avito.android.auction.details;

import android.app.Application;
import android.content.Intent;
import com.avito.android.deep_linking.links.AuctionDetails;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AuctionDetailsIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auction/details/f;", "Lcom/avito/android/auction/details/e;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f92342a;

    @Inject
    public f(@Y61.k Application application) {
        this.f92342a = application;
    }

    @Override // com.avito.android.auction.details.e
    @Y61.k
    public final Intent a(@Y61.k AuctionDetails auctionDetails) {
        Intent intent = new Intent(this.f92342a, (Class<?>) AuctionDetailsSheetActivity.class);
        intent.putExtra("auction_details", auctionDetails);
        return intent;
    }
}
