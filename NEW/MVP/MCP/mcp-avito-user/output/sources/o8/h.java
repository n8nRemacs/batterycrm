package o8;

import androidx.compose.foundation.H;
import com.avito.android.analytics.InterfaceC28457i;
import com.avito.android.analytics.InterfaceC28459j;
import com.avito.android.analytics_adjust.AdjustTokenWithFirebaseName;
import com.avito.android.analytics_adjust.C28537e;
import com.avito.android.analytics_adjust.InterfaceC28535c;
import com.avito.android.analytics_adjust.utils.AdjustContentType;
import com.avito.android.remote.model.AdvertisementVerticalAlias;
import com.avito.android.remote.model.MicroCategoryIds;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.L;

/* compiled from: ContactSellerMicroCategoryEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo8/h;", "Lcom/avito/android/analytics/j;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class h implements InterfaceC28459j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f419422b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f419423c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AdvertisementVerticalAlias f419424d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Double f419425e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f419426f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Set<InterfaceC28457i> f419427g;

    /* compiled from: ContactSellerMicroCategoryEvent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f419428a;

        static {
            int[] iArr = new int[AdvertisementVerticalAlias.values().length];
            try {
                iArr[AdvertisementVerticalAlias.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f419428a = iArr;
        }
    }

    public h(@Y61.k AdvertisementVerticalAlias advertisementVerticalAlias, @Y61.l Double d12, @Y61.k String str, @Y61.k String str2, @Y61.l Map map) {
        this.f419422b = str;
        this.f419423c = str2;
        this.f419424d = advertisementVerticalAlias;
        this.f419425e = d12;
        this.f419426f = map;
        AdjustTokenWithFirebaseName adjustTokenWithFirebaseName = null;
        if (a.f419428a[advertisementVerticalAlias.ordinal()] == 1) {
            MicroCategoryIds microCategoryIds = MicroCategoryIds.INSTANCE;
            if (microCategoryIds.getMOTORCYCLES().contains(str) || microCategoryIds.getMOPEDS_AND_SCOOTERS().contains(str)) {
                adjustTokenWithFirebaseName = AdjustTokenWithFirebaseName.f91137Q;
            }
        }
        Qc.g gVarA = com.avito.android.analytics_adjust.t.a(adjustTokenWithFirebaseName);
        gVarA.j(map);
        gVarA.i(d12);
        InterfaceC28535c interfaceC28535cB = C28537e.b(adjustTokenWithFirebaseName);
        AdjustContentType[] adjustContentTypeArr = AdjustContentType.f91246b;
        interfaceC28535cB.c();
        interfaceC28535cB.f(str2);
        interfaceC28535cB.a(d12);
        interfaceC28535cB.d(map);
        interfaceC28535cB.h();
        this.f419427g = C42756l.l0(new InterfaceC28457i[]{gVarA, interfaceC28535cB});
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f419422b, hVar.f419422b) && L.f(this.f419423c, hVar.f419423c) && this.f419424d == hVar.f419424d && L.f(this.f419425e, hVar.f419425e) && L.f(this.f419426f, hVar.f419426f);
    }

    @Override // com.avito.android.analytics.InterfaceC28459j
    @Y61.k
    public final Set<InterfaceC28457i> getEvents() {
        return this.f419427g;
    }

    public final int hashCode() {
        int iHashCode = (this.f419424d.hashCode() + H.d(this.f419422b.hashCode() * 31, 31, this.f419423c)) * 31;
        Double d12 = this.f419425e;
        int iHashCode2 = (iHashCode + (d12 == null ? 0 : d12.hashCode())) * 31;
        Map<String, String> map = this.f419426f;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContactSellerMicroCategoryEvent(microCategoryId=");
        sb2.append(this.f419422b);
        sb2.append(", advertId=");
        sb2.append(this.f419423c);
        sb2.append(", verticalAlias=");
        sb2.append(this.f419424d);
        sb2.append(", customerValue=");
        sb2.append(this.f419425e);
        sb2.append(", params=");
        return androidx.appcompat.app.r.w(sb2, this.f419426f, ')');
    }
}
