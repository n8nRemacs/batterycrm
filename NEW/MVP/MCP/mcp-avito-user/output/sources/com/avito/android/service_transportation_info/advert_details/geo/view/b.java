package com.avito.android.service_transportation_info.advert_details.geo.view;

import Y41.p;
import Y61.k;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.service_transportation_info.model.TransportationGeo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: ServicesTransportationGeoRoutes.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f279750a = new b();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C22096n f279751b = new C22096n(942027422, a.f279752l, false);

    /* compiled from: ServicesTransportationGeoRoutes.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f279752l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                Boolean bool = Boolean.TRUE;
                h.b(new TransportationGeo.Routes("География перевозок", C42745f0.U(new TransportationGeo.Routes.Route("Москва", "Санкт-Петербург", bool), new TransportationGeo.Routes.Route("Москва", "Самара", Boolean.FALSE), new TransportationGeo.Routes.Route("Москва", "Чебоксары", bool), new TransportationGeo.Routes.Route("Москва", "Шумерля", null), new TransportationGeo.Routes.Route("Москва", "1", null), new TransportationGeo.Routes.Route("Москва", "2", null), new TransportationGeo.Routes.Route("Москва", "3", null)), 3, "Ещё 7 маршрутов"), a13, 8);
            }
            return G0.f406611a;
        }
    }
}
