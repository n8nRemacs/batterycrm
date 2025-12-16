package com.avito.android.service_booking_common.blueprints.price_list;

import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.util.I5;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import qt0.i;

/* compiled from: SbPriceListItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/price_list/c;", "LTV0/d;", "Lcom/avito/android/service_booking_common/blueprints/price_list/e;", "Lqt0/i;", "<init>", "()V", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements TV0.d<e, i> {
    @Inject
    public c() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) throws InterruptedException {
        e eVar2 = (e) eVar;
        i iVar = (i) aVar;
        I5.a(eVar2.f276481c, iVar.f429448c, false);
        ViewGroup viewGroup = eVar2.f276482d;
        viewGroup.removeAllViews();
        Iterator it = iVar.f429449d.iterator();
        while (it.hasNext()) {
            eVar2.f276480b.a(R.layout.service_booking_item_price_list_value, viewGroup, new com.avito.android.offlinization.ui.a((i.a) it.next(), 22));
        }
    }
}
