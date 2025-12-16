package com.avito.android.user_advert.advert.items.reservation;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;

/* compiled from: MyAdvertReservationInfoView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/reservation/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/reservation/g;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f310024b;

    public h(@k View view) {
        super(view);
        this.f310024b = (TextView) view;
    }

    @Override // com.avito.android.user_advert.advert.items.reservation.g
    public final void Pb(@k String str) {
        this.f310024b.setText(str);
    }
}
