package com.avito.android.advert_core.offers.offer_bottomsheet;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.advert_core.offers.items.OfferItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: OffersViewPagerAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/offers/offer_bottomsheet/l;", "Landroidx/viewpager/widget/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l extends androidx.viewpager.widget.a {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<OfferItem> f83891c;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@Y61.k List<? extends OfferItem> list) {
        this.f83891c = list;
    }

    @Override // androidx.viewpager.widget.a
    public final void a(@Y61.k ViewPager viewPager, int i12, @Y61.k Object obj) {
        viewPager.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.a
    public final int c() {
        return this.f83891c.size();
    }

    @Override // androidx.viewpager.widget.a
    @Y61.k
    public final Object f(@Y61.k ViewGroup viewGroup, int i12) {
        View viewB = C0.b(viewGroup, R.layout.fragment_offers_bottom_sheet, viewGroup, false);
        TextView textView = (TextView) viewB.findViewById(R.id.bottom_sheet_offer_header);
        TextView textView2 = (TextView) viewB.findViewById(R.id.bottom_sheet_offer_description);
        List<OfferItem> list = this.f83891c;
        textView.setText(list.get(i12).getF83828c());
        textView2.setText(list.get(i12).getF83829d());
        viewGroup.addView(viewB);
        return viewB;
    }

    @Override // androidx.viewpager.widget.a
    public final boolean g(@Y61.k View view, @Y61.k Object obj) {
        return view.equals(obj);
    }
}
