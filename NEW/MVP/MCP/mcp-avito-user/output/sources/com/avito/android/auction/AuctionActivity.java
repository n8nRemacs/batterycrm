package com.avito.android.auction;

import android.R;
import android.os.Bundle;
import androidx.fragment.app.H;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.AuctionBody;
import kotlin.Metadata;

/* compiled from: AuctionActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/auction/AuctionActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AuctionActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        AuctionBody auctionBody = (AuctionBody) getIntent().getParcelableExtra("auction_body");
        H hE2 = getSupportFragmentManager().e();
        AuctionFragment.f92304p0.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("auction_body", auctionBody);
        AuctionFragment auctionFragment = new AuctionFragment();
        auctionFragment.setArguments(bundle2);
        hE2.n(R.id.content, auctionFragment, null);
        hE2.e();
    }
}
