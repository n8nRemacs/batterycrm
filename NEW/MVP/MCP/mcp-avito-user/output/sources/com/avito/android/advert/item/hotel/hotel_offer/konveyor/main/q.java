package com.avito.android.advert.item.hotel.hotel_offer.konveyor.main;

import android.os.Parcelable;
import androidx.recyclerview.widget.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.advert.item.hotel.hotel_offer.AdvertDetailsHotelOffer;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.hotel.model.HotelActionButton;
import com.avito.android.hotel.model.HotelOfferDiscount;
import com.avito.android.hotel.model.HotelOfferInstallments;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertDetailsHotelOfferView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/konveyor/main/q;", "LTV0/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface q extends TV0.e {

    /* compiled from: AdvertDetailsHotelOfferView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void Bm(@Y61.k PrintableText printableText);

    void CL(@Y61.k RecyclerView.r rVar);

    void EG(@Y61.l Parcelable parcelable);

    void EV(@Y61.l AttributedText attributedText);

    void Gz(@Y61.l AttributedText attributedText);

    void Lc(@Y61.l Y41.a<G0> aVar);

    void Ni();

    void OJ(boolean z12);

    void OR(@Y61.l AttributedText attributedText);

    void QI(@Y61.l Image image);

    void RM(int i12);

    void Tn(@Y61.k PrintableText printableText);

    void Tp(@Y61.k PrintableText printableText);

    void UW(@Y61.l Y41.a<G0> aVar);

    void VK(@Y61.l AdvertDetailsHotelOffer.Action action, @Y61.k Y41.a<G0> aVar);

    void ZJ(@Y61.l Y41.a<G0> aVar);

    void dM(int i12);

    void e4(@Y61.k Y41.l<? super HotelActionButton, G0> lVar);

    void eX(@Y61.l Y41.a<G0> aVar);

    void g1(@Y61.k Y41.l<? super DeepLink, G0> lVar);

    void ge(boolean z12);

    void go(@Y61.k PrintableText printableText);

    void gt(boolean z12);

    void h4(@Y61.l Y41.a<G0> aVar);

    void lq();

    void m10(boolean z12);

    void ne(@Y61.l List<? extends HotelActionButton> list);

    void o10(@Y61.l PrintableText printableText);

    @Y61.l
    Parcelable os();

    void qd(@Y61.k Y41.a<G0> aVar);

    void rL(boolean z12);

    void setAdapter(@Y61.l RecyclerView.Adapter<com.avito.konveyor.adapter.b> adapter);

    void setTitle(@Y61.l String str);

    void t(@Y61.k Y41.a<G0> aVar);

    void uT();

    void wt(@Y61.l HotelOfferInstallments hotelOfferInstallments);

    void xK(@Y61.l HotelOfferDiscount hotelOfferDiscount);

    void yk(boolean z12);

    void zB(@Y61.k P p12);
}
