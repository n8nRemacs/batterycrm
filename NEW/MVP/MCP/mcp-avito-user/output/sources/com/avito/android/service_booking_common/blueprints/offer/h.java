package com.avito.android.service_booking_common.blueprints.offer;

import Y61.k;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: SbOfferViewHolder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/offer/h;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f276465b;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.sb_offer_text);
        ((TextView) viewFindViewById).setMovementMethod(LinkMovementMethod.getInstance());
        this.f276465b = (TextView) viewFindViewById;
    }
}
