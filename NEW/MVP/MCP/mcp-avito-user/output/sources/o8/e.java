package o8;

import androidx.compose.foundation.H;
import com.avito.android.analytics.InterfaceC28457i;
import com.avito.android.analytics.InterfaceC28459j;
import com.avito.android.analytics_adjust.AdjustTokenWithFirebaseName;
import com.avito.android.analytics_adjust.C28537e;
import com.avito.android.analytics_adjust.InterfaceC28535c;
import com.avito.android.analytics_adjust.utils.AdjustContentType;
import com.avito.android.remote.model.AdvertisementCategoryAlias;
import com.avito.android.remote.model.CategoryIds;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.L;

/* compiled from: ContactSellerCategoryEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo8/e;", "Lcom/avito/android/analytics/j;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class e implements InterfaceC28459j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f419409b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AdvertisementCategoryAlias f419410c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f419411d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Double f419412e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f419413f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Set<InterfaceC28457i> f419414g;

    /* compiled from: ContactSellerCategoryEvent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f419415a;

        static {
            int[] iArr = new int[AdvertisementCategoryAlias.values().length];
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_TRANSPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_CONSTRUCTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_GARDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_BEAUTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_REPAIR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_COURSES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_INSTALLATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_CLEANING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_EVENTS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_PHOTOGRAPHY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AdvertisementCategoryAlias.NO_VALUE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f419415a = iArr;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public e(@Y61.l String str, @Y61.l AdvertisementCategoryAlias advertisementCategoryAlias, @Y61.k String str2, @Y61.l Double d12, @Y61.l Map<String, String> map) {
        AdjustTokenWithFirebaseName adjustTokenWithFirebaseName;
        this.f419409b = str;
        this.f419410c = advertisementCategoryAlias;
        this.f419411d = str2;
        this.f419412e = d12;
        this.f419413f = map;
        AdjustTokenWithFirebaseName adjustTokenWithFirebaseName2 = null;
        if (L.f(str, CategoryIds.AUTO.SPAREPARTS.getId())) {
            adjustTokenWithFirebaseName = AdjustTokenWithFirebaseName.f91161i0;
        } else {
            adjustTokenWithFirebaseName = L.f(str, CategoryIds.AUTO.MOTO.getId()) ? true : L.f(str, CategoryIds.AUTO.WATER.getId()) ? AdjustTokenWithFirebaseName.f91157g0 : L.f(str, CategoryIds.AUTO.TRUCKS.getId()) ? AdjustTokenWithFirebaseName.f91159h0 : null;
        }
        if (adjustTokenWithFirebaseName == null) {
            switch (advertisementCategoryAlias == null ? -1 : a.f419415a[advertisementCategoryAlias.ordinal()]) {
                case -1:
                case 11:
                    adjustTokenWithFirebaseName = adjustTokenWithFirebaseName2;
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    adjustTokenWithFirebaseName2 = AdjustTokenWithFirebaseName.f91143W;
                    adjustTokenWithFirebaseName = adjustTokenWithFirebaseName2;
                    break;
                case 2:
                    adjustTokenWithFirebaseName2 = AdjustTokenWithFirebaseName.f91144X;
                    adjustTokenWithFirebaseName = adjustTokenWithFirebaseName2;
                    break;
                case 3:
                    adjustTokenWithFirebaseName2 = AdjustTokenWithFirebaseName.f91145Y;
                    adjustTokenWithFirebaseName = adjustTokenWithFirebaseName2;
                    break;
                case 4:
                    adjustTokenWithFirebaseName2 = AdjustTokenWithFirebaseName.f91146Z;
                    adjustTokenWithFirebaseName = adjustTokenWithFirebaseName2;
                    break;
                case 5:
                    adjustTokenWithFirebaseName2 = AdjustTokenWithFirebaseName.f91147a0;
                    adjustTokenWithFirebaseName = adjustTokenWithFirebaseName2;
                    break;
                case 6:
                    adjustTokenWithFirebaseName2 = AdjustTokenWithFirebaseName.f91148b0;
                    adjustTokenWithFirebaseName = adjustTokenWithFirebaseName2;
                    break;
                case 7:
                    adjustTokenWithFirebaseName2 = AdjustTokenWithFirebaseName.f91149c0;
                    adjustTokenWithFirebaseName = adjustTokenWithFirebaseName2;
                    break;
                case 8:
                    adjustTokenWithFirebaseName2 = AdjustTokenWithFirebaseName.f91151d0;
                    adjustTokenWithFirebaseName = adjustTokenWithFirebaseName2;
                    break;
                case 9:
                    adjustTokenWithFirebaseName2 = AdjustTokenWithFirebaseName.f91153e0;
                    adjustTokenWithFirebaseName = adjustTokenWithFirebaseName2;
                    break;
                case 10:
                    adjustTokenWithFirebaseName2 = AdjustTokenWithFirebaseName.f91155f0;
                    adjustTokenWithFirebaseName = adjustTokenWithFirebaseName2;
                    break;
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
        this.f419414g = C42756l.l0(new InterfaceC28457i[]{gVarA, interfaceC28535cB});
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f419409b, eVar.f419409b) && this.f419410c == eVar.f419410c && L.f(this.f419411d, eVar.f419411d) && L.f(this.f419412e, eVar.f419412e) && L.f(this.f419413f, eVar.f419413f);
    }

    @Override // com.avito.android.analytics.InterfaceC28459j
    @Y61.k
    public final Set<InterfaceC28457i> getEvents() {
        return this.f419414g;
    }

    public final int hashCode() {
        String str = this.f419409b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AdvertisementCategoryAlias advertisementCategoryAlias = this.f419410c;
        int iD2 = H.d((iHashCode + (advertisementCategoryAlias == null ? 0 : advertisementCategoryAlias.hashCode())) * 31, 31, this.f419411d);
        Double d12 = this.f419412e;
        int iHashCode2 = (iD2 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Map<String, String> map = this.f419413f;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContactSellerCategoryEvent(categoryId=");
        sb2.append(this.f419409b);
        sb2.append(", categoryAlias=");
        sb2.append(this.f419410c);
        sb2.append(", advertId=");
        sb2.append(this.f419411d);
        sb2.append(", customerValue=");
        sb2.append(this.f419412e);
        sb2.append(", params=");
        return androidx.appcompat.app.r.w(sb2, this.f419413f, ')');
    }
}
