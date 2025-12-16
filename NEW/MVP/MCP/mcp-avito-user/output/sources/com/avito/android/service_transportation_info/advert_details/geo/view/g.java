package com.avito.android.service_transportation_info.advert_details.geo.view;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.service_transportation_info.model.TransportationGeo;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServicesTransportationGeoRoutes.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class g extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<TransportationGeo.Routes.Route> f279758l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f279759m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(List list, v vVar, int i12) {
        super(2);
        this.f279758l = list;
        this.f279759m = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        h.a(this.f279758l, a12, iA2);
        return G0.f406611a;
    }
}
