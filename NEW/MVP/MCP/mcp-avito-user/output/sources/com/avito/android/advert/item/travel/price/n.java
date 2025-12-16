package com.avito.android.advert.item.travel.price;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: AdvertDetailsTravelPriceViewImplDiscountText.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/travel/price/n;", "Lcom/avito/android/advert/item/travel/price/l;", "Lcom/avito/android/advert/item/travel/price/k;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class n extends l implements k {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f80594e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final View f80595f;

    public n(@Y61.k View view) {
        super(view);
        this.f80594e = (TextView) view.findViewById(R.id.discount_percent);
        this.f80595f = view.findViewById(R.id.delimiter);
    }

    @Override // com.avito.android.advert.item.travel.price.l
    public final void B80(@Y61.l String str) {
        I5.a(this.f80594e, str, false);
    }

    @Override // com.avito.android.advert.item.travel.price.l
    public final void C80() {
        D6.w(this.f80594e);
        View view = this.f80595f;
        if (view != null) {
            D6.w(view);
        }
    }
}
