package com.avito.android.hotel_booking.konveyor.offer;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BookingFormOfferView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/offer/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/hotel_booking/konveyor/offer/f;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ImageView f163722b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f163723c;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f163722b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f163723c = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.hotel_booking.konveyor.offer.f
    public final void F(@l AttributedText attributedText) {
        j.a(this.f163723c, attributedText, null);
    }

    @Override // com.avito.android.hotel_booking.konveyor.offer.f
    public final void z2(@l Image image) {
        ImageView imageView = this.f163722b;
        ImageRequest.a aVar = new ImageRequest.a(new DM.a(imageView));
        aVar.d(com.avito.android.image_loader.b.b(image));
        aVar.f169491i = true;
        aVar.f169494l = true;
        aVar.f169485c = Integer.valueOf(R.drawable.bg_image_placeholder);
        aVar.f169492j = D6.u(imageView, R.drawable.bg_image_placeholder);
        aVar.f169493k = null;
        aVar.f169486d = true;
        aVar.e(D6.t(imageView, R.dimen.hotel_booking_form_offer_image_corner));
        aVar.c();
    }
}
