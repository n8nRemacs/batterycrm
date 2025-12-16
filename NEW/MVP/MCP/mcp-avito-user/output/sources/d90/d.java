package D90;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile.pro.impl.ProfileTabUserType;
import com.avito.android.profile.pro.impl.interactor.ProfileProWidgetsParams;
import com.avito.android.profile.pro.impl.network.response.ProDashboardResponse;
import com.avito.android.service_booking_user_profile.view.model.ServiceBookingBlockParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD90/d;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final B90.a f3061a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3062b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f3063c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f3064d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3065e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f3066f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ProDashboardResponse f3067g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final ServiceBookingBlockParams f3068h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3069i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3070j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final ProfileProWidgetsParams f3071k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final List<DeepLink> f3072l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final ProfileTabUserType f3073m;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@l B90.a aVar, boolean z12, @l String str, @l String str2, boolean z13, @k List<? extends com.avito.conveyor_item.a> list, @l ProDashboardResponse proDashboardResponse, @l ServiceBookingBlockParams serviceBookingBlockParams, int i12, int i13, @k ProfileProWidgetsParams profileProWidgetsParams, @k List<? extends DeepLink> list2, @k ProfileTabUserType profileTabUserType) {
        this.f3061a = aVar;
        this.f3062b = z12;
        this.f3063c = str;
        this.f3064d = str2;
        this.f3065e = z13;
        this.f3066f = list;
        this.f3067g = proDashboardResponse;
        this.f3068h = serviceBookingBlockParams;
        this.f3069i = i12;
        this.f3070j = i13;
        this.f3071k = profileProWidgetsParams;
        this.f3072l = list2;
        this.f3073m = profileTabUserType;
    }

    public static d a(d dVar, B90.a aVar, boolean z12, String str, String str2, boolean z13, List list, ProDashboardResponse proDashboardResponse, ServiceBookingBlockParams serviceBookingBlockParams, int i12, int i13, ProfileProWidgetsParams profileProWidgetsParams, List list2, ProfileTabUserType profileTabUserType, int i14) {
        B90.a aVar2 = (i14 & 1) != 0 ? dVar.f3061a : aVar;
        boolean z14 = (i14 & 2) != 0 ? dVar.f3062b : z12;
        String str3 = (i14 & 4) != 0 ? dVar.f3063c : str;
        String str4 = (i14 & 8) != 0 ? dVar.f3064d : str2;
        boolean z15 = (i14 & 16) != 0 ? dVar.f3065e : z13;
        List list3 = (i14 & 32) != 0 ? dVar.f3066f : list;
        ProDashboardResponse proDashboardResponse2 = (i14 & 64) != 0 ? dVar.f3067g : proDashboardResponse;
        ServiceBookingBlockParams serviceBookingBlockParams2 = (i14 & 128) != 0 ? dVar.f3068h : serviceBookingBlockParams;
        int i15 = (i14 & 256) != 0 ? dVar.f3069i : i12;
        int i16 = (i14 & 512) != 0 ? dVar.f3070j : i13;
        ProfileProWidgetsParams profileProWidgetsParams2 = (i14 & 1024) != 0 ? dVar.f3071k : profileProWidgetsParams;
        List list4 = (i14 & 2048) != 0 ? dVar.f3072l : list2;
        ProfileTabUserType profileTabUserType2 = (i14 & 4096) != 0 ? dVar.f3073m : profileTabUserType;
        dVar.getClass();
        return new d(aVar2, z14, str3, str4, z15, list3, proDashboardResponse2, serviceBookingBlockParams2, i15, i16, profileProWidgetsParams2, list4, profileTabUserType2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f3061a, dVar.f3061a) && this.f3062b == dVar.f3062b && L.f(this.f3063c, dVar.f3063c) && L.f(this.f3064d, dVar.f3064d) && this.f3065e == dVar.f3065e && L.f(this.f3066f, dVar.f3066f) && L.f(this.f3067g, dVar.f3067g) && L.f(this.f3068h, dVar.f3068h) && this.f3069i == dVar.f3069i && this.f3070j == dVar.f3070j && L.f(this.f3071k, dVar.f3071k) && L.f(this.f3072l, dVar.f3072l) && this.f3073m == dVar.f3073m;
    }

    public final int hashCode() {
        B90.a aVar = this.f3061a;
        int i12 = r.i((aVar == null ? 0 : aVar.hashCode()) * 31, 31, this.f3062b);
        String str = this.f3063c;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f3064d;
        int iE2 = H.e(r.i((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f3065e), 31, this.f3066f);
        ProDashboardResponse proDashboardResponse = this.f3067g;
        int iHashCode2 = (iE2 + (proDashboardResponse == null ? 0 : proDashboardResponse.hashCode())) * 31;
        ServiceBookingBlockParams serviceBookingBlockParams = this.f3068h;
        return this.f3073m.hashCode() + H.e((this.f3071k.hashCode() + r.e(this.f3070j, r.e(this.f3069i, (iHashCode2 + (serviceBookingBlockParams != null ? serviceBookingBlockParams.hashCode() : 0)) * 31, 31), 31)) * 31, 31, this.f3072l);
    }

    @k
    public final String toString() {
        return "ProfileProState(profileTabInfo=" + this.f3061a + ", isLoading=" + this.f3062b + ", error=" + this.f3063c + ", notificationsCount=" + this.f3064d + ", hideNotifications=" + this.f3065e + ", items=" + this.f3066f + ", dashboard=" + this.f3067g + ", serviceBookingBlockParams=" + this.f3068h + ", callsHistoryUnreadCounter=" + this.f3069i + ", callsTrackingUnreadCounter=" + this.f3070j + ", widgetsParams=" + this.f3071k + ", uxFeedbackDeepLinks=" + this.f3072l + ", userType=" + this.f3073m + ')';
    }
}
