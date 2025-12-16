package com.avito.android.advert.item.geo_distance;

import androidx.compose.runtime.internal.P;
import com.avito.android.travel_time_calculator.data.TransportType;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsAddressGeoDistanceTextBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/geo_distance/m;", "", "<init>", "()V", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final List<Q<TransportType, String>> f75717a;

    /* compiled from: AdvertDetailsAddressGeoDistanceTextBuilder.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/advert/item/geo_distance/m$a;", "", "<init>", "()V", "", "Lkotlin/Q;", "Lcom/avito/android/travel_time_calculator/data/TransportType;", "", "TRANSPORT_TYPE_ORDER", "Ljava/util/List;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f75717a = C42745f0.U(new Q(TransportType.f303310c, "footPassenger"), new Q(TransportType.f303309b, "car"), new Q(TransportType.f303311d, "bus"));
    }

    @Inject
    public m() {
    }
}
