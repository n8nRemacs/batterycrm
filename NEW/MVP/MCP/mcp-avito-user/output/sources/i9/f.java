package i9;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.InterfaceC28457i;
import com.avito.android.analytics.InterfaceC28459j;
import com.avito.android.analytics_adjust.AdjustTokenWithFirebaseName;
import com.avito.android.analytics_adjust.t;
import com.avito.android.remote.model.AdvertisementVerticalAlias;
import com.avito.android.remote.model.MicroCategoryIds;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertViewedMicroCategoryEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li9/f;", "Lcom/avito/android/analytics/j;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class f implements InterfaceC28459j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AdvertisementVerticalAlias f398375b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f398376c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f398377d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Double f398378e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f398379f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Set<InterfaceC28457i> f398380g;

    /* compiled from: AdvertViewedMicroCategoryEvent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f398381a;

        static {
            int[] iArr = new int[AdvertisementVerticalAlias.values().length];
            try {
                iArr[AdvertisementVerticalAlias.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f398381a = iArr;
        }
    }

    public f(@Y61.k AdvertisementVerticalAlias advertisementVerticalAlias, @Y61.l Double d12, @Y61.k String str, @Y61.k String str2, @Y61.l Map map) {
        this.f398375b = advertisementVerticalAlias;
        this.f398376c = str;
        this.f398377d = str2;
        this.f398378e = d12;
        this.f398379f = map;
        AdjustTokenWithFirebaseName adjustTokenWithFirebaseName = null;
        if (a.f398381a[advertisementVerticalAlias.ordinal()] == 1) {
            MicroCategoryIds microCategoryIds = MicroCategoryIds.INSTANCE;
            if (microCategoryIds.getMOTORCYCLES().contains(str) || microCategoryIds.getMOPEDS_AND_SCOOTERS().contains(str)) {
                adjustTokenWithFirebaseName = AdjustTokenWithFirebaseName.f91137Q;
            }
        }
        Qc.g gVarA = t.a(adjustTokenWithFirebaseName);
        gVarA.i(d12);
        gVarA.j(map);
        this.f398380g = Collections.singleton(gVarA);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f398375b == fVar.f398375b && L.f(this.f398376c, fVar.f398376c) && L.f(this.f398377d, fVar.f398377d) && L.f(this.f398378e, fVar.f398378e) && L.f(this.f398379f, fVar.f398379f);
    }

    @Override // com.avito.android.analytics.InterfaceC28459j
    @Y61.k
    public final Set<InterfaceC28457i> getEvents() {
        return this.f398380g;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f398375b.hashCode() * 31, 31, this.f398376c), 31, this.f398377d);
        Double d12 = this.f398378e;
        int iHashCode = (iD2 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Map<String, String> map = this.f398379f;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertViewedMicroCategoryEvent(verticalAlias=");
        sb2.append(this.f398375b);
        sb2.append(", microCategoryId=");
        sb2.append(this.f398376c);
        sb2.append(", advertId=");
        sb2.append(this.f398377d);
        sb2.append(", customerValue=");
        sb2.append(this.f398378e);
        sb2.append(", params=");
        return r.w(sb2, this.f398379f, ')');
    }
}
