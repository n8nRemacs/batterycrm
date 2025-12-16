package com.avito.android.service_transportation_info.advert_details.geo;

import Y41.p;
import Y61.k;
import android.view.View;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsServicesTransportationGeoItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_transportation_info/advert_details/geo/h;", "Lcom/avito/android/service_transportation_info/advert_details/geo/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_service-transportation-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ComposeView f279745b;

    /* compiled from: AdvertDetailsServicesTransportationGeoItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AdvertDetailsServicesTransportationGeoItem f279746l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AdvertDetailsServicesTransportationGeoItem advertDetailsServicesTransportationGeoItem) {
            super(2);
            this.f279746l = advertDetailsServicesTransportationGeoItem;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.c.a(false, r.c(-739699320, new g(this.f279746l), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    static {
        int i12 = ComposeView.f41092l;
    }

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.compose_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
        }
        ComposeView composeView = (ComposeView) viewFindViewById;
        this.f279745b = composeView;
        composeView.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
    }

    @Override // com.avito.android.service_transportation_info.advert_details.geo.f
    public final void M70(@k AdvertDetailsServicesTransportationGeoItem advertDetailsServicesTransportationGeoItem) {
        this.f279745b.setContent(new C22096n(-1431267219, new a(advertDetailsServicesTransportationGeoItem), true));
    }
}
