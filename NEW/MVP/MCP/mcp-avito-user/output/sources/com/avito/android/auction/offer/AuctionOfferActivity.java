package com.avito.android.auction.offer;

import Y61.k;
import Y61.l;
import android.R;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.auction.offer.AuctionOfferFragment;
import com.avito.android.util.C35961v3;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AuctionOfferActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/auction/offer/AuctionOfferActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AuctionOfferActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final a f92423n = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @k
    public final Object f92424m = C35961v3.a(this);

    /* compiled from: AuctionOfferActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auction/offer/AuctionOfferActivity$a;", "", "<init>", "()V", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        Object next;
        Iterator<T> it = getSupportFragmentManager().P().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Fragment fragment = (Fragment) next;
            if (fragment.isVisible() && (fragment instanceof com.avito.android.ui.fragments.c)) {
                break;
            }
        }
        com.avito.android.ui.fragments.c cVar = (com.avito.android.ui.fragments.c) (next instanceof com.avito.android.ui.fragments.c ? next : null);
        if (cVar == null || !cVar.i0()) {
            super.onBackPressed();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            H hE2 = getSupportFragmentManager().e();
            AuctionOfferFragment.a aVar = AuctionOfferFragment.f92425x0;
            AuctionOfferParams auctionOfferParams = (AuctionOfferParams) this.f92424m.getValue();
            aVar.getClass();
            AuctionOfferFragment auctionOfferFragment = new AuctionOfferFragment();
            auctionOfferFragment.f92427n0.setValue(auctionOfferFragment, AuctionOfferFragment.f92426y0[0], auctionOfferParams);
            hE2.j(R.id.content, auctionOfferFragment, null, 1);
            hE2.e();
        }
    }
}
