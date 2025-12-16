package com.avito.android.service_transportation_info.advert_details.geo;

import Y41.p;
import androidx.compose.runtime.A;
import com.avito.android.service_transportation_info.model.TransportationGeo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsServicesTransportationGeoItemView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsServicesTransportationGeoItem f279744l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AdvertDetailsServicesTransportationGeoItem advertDetailsServicesTransportationGeoItem) {
        super(2);
        this.f279744l = advertDetailsServicesTransportationGeoItem;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            TransportationGeo transportationGeo = this.f279744l.f279734b;
            if (transportationGeo instanceof TransportationGeo.Raw) {
                a13.C(1781269192);
                com.avito.android.service_transportation_info.advert_details.geo.view.c.a((TransportationGeo.Raw) transportationGeo, a13, 8);
                a13.h();
            } else if (transportationGeo instanceof TransportationGeo.Routes) {
                a13.C(1781271947);
                com.avito.android.service_transportation_info.advert_details.geo.view.h.b((TransportationGeo.Routes) transportationGeo, a13, 8);
                a13.h();
            } else {
                a13.C(-615091076);
                a13.h();
            }
        }
        return G0.f406611a;
    }
}
