package com.avito.android.advert.item.hotel.hotel_offer.konveyor.button;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsHotelButtonView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/konveyor/button/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/hotel/hotel_offer/konveyor/button/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f76030b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f76031c;

    public g(@k View view) {
        super(view);
        this.f76030b = view;
        View viewFindViewById = view.findViewById(R.id.text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f76031c = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.button.f
    public final void a(@k Y41.a<G0> aVar) {
        D6.a(aVar, this.f76030b);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.button.f
    public final void j0(int i12) {
        this.f76031c.setTextAppearance(C35835l0.j(i12, this.f76030b.getContext()));
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.button.f
    public final void v0(@l String str) {
        I5.a(this.f76031c, str, false);
    }
}
