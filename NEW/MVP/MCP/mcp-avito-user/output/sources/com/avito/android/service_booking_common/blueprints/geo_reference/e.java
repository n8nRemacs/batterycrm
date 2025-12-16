package com.avito.android.service_booking_common.blueprints.geo_reference;

import Y41.l;
import Y61.k;
import android.widget.TextView;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.serp.adapter.serp_advert_card.i;
import com.avito.android.util.I5;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import qt0.C47441e;

/* compiled from: SbGeoReferencePresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/geo_reference/e;", "Lcom/avito/android/service_booking_common/blueprints/geo_reference/c;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f276415b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super DeepLink, G0> lVar) {
        this.f276415b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        C47441e c47441e = (C47441e) aVar;
        d dVar = new d(c47441e, this);
        I5.a((TextView) hVar.f276420b.getValue(), c47441e.f429426b, false);
        I5.a((TextView) hVar.f276421c.getValue(), c47441e.f429427c, false);
        InterfaceC42726C interfaceC42726C = hVar.f276422d;
        I5.a((TextView) interfaceC42726C.getValue(), c47441e.f429429e.f429437a, false);
        ((TextView) interfaceC42726C.getValue()).setOnClickListener(new i(29, dVar));
        hVar.itemView.setOnClickListener(new g(0, dVar));
    }
}
