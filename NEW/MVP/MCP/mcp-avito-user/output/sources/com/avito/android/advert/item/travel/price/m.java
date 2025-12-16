package com.avito.android.advert.item.travel.price;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: AdvertDetailsTravelPriceViewImplDiscountBadge.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/travel/price/m;", "Lcom/avito/android/advert/item/travel/price/l;", "Lcom/avito/android/advert/item/travel/price/k;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m extends l implements k {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Badge f80592e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final TextView f80593f;

    public m(@Y61.k View view) {
        super(view);
        this.f80592e = (Badge) view.findViewById(R.id.discount_percent_badge);
        this.f80593f = (TextView) view.findViewById(R.id.delimiter);
    }

    @Override // com.avito.android.advert.item.travel.price.l
    public final void B80(@Y61.l String str) {
        if (str == null) {
            return;
        }
        this.f80592e.setTitleText(str);
        D6.H(this.f80593f);
    }

    @Override // com.avito.android.advert.item.travel.price.l
    public final void C80() {
        D6.w(this.f80592e);
        D6.w(this.f80593f);
    }
}
