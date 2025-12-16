package com.avito.android.hotel_booking.konveyor.text;

import RI.b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BookingFormTextPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/text/h;", "LTV0/f;", "Lcom/avito/android/hotel_booking/konveyor/text/l;", "Lcom/avito/android/hotel_booking/konveyor/text/BookingFormTextItem;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements TV0.f<l, BookingFormTextItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<RI.b, G0> f163808b;

    /* compiled from: BookingFormTextPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ DeepLink f163810m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ BookingFormTextItem f163811n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DeepLink deepLink, BookingFormTextItem bookingFormTextItem) {
            super(0);
            this.f163810m = deepLink;
            this.f163811n = bookingFormTextItem;
        }

        @Override // Y41.a
        public final G0 invoke() {
            h.this.f163808b.invoke(new b.f(this.f163810m, this.f163811n.f163783b));
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@Y61.k Y41.l<? super RI.b, G0> lVar) {
        this.f163808b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        l lVar = (l) eVar;
        BookingFormTextItem bookingFormTextItem = (BookingFormTextItem) aVar;
        lVar.F(bookingFormTextItem.f163784c);
        lVar.u3(bookingFormTextItem.f163785d);
        k(lVar, bookingFormTextItem);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        l lVar = (l) eVar;
        BookingFormTextItem bookingFormTextItem = (BookingFormTextItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof g) {
                obj = obj2;
            }
        }
        g gVar = (g) (obj instanceof g ? obj : null);
        if (gVar == null) {
            lVar.F(bookingFormTextItem.f163784c);
            lVar.u3(bookingFormTextItem.f163785d);
            k(lVar, bookingFormTextItem);
            return;
        }
        AttributedText attributedText = gVar.f163806a;
        if (attributedText != null) {
            lVar.F(attributedText);
        }
        Integer num = gVar.f163807b;
        if (num != null) {
            lVar.u3(num.intValue());
        }
        k(lVar, bookingFormTextItem);
    }

    public final void k(l lVar, BookingFormTextItem bookingFormTextItem) {
        G0 g02;
        AttributedText attributedText;
        DeepLink deepLink = bookingFormTextItem.f163787f;
        if (deepLink != null) {
            lVar.X(new a(deepLink, bookingFormTextItem));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 != null || (attributedText = bookingFormTextItem.f163784c) == null) {
            return;
        }
        attributedText.setOnDeepLinkClickListener(new com.avito.android.advert_details_items.buyer_bonuses.g(3, this, bookingFormTextItem));
    }
}
