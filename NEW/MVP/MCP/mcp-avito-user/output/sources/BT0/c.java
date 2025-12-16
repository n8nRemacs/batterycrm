package Bt0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.service_booking.api.remote.model.details.ServiceBookingItemDetailsResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingItemDetailsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LBt0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class c extends q {

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final a f1765l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final c f1766m;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1767b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f1768c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f1769d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f1770e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final List<ServiceBookingItemDetailsResult.ServiceBookingItemDetailsAction> f1771f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final List<ServiceBookingItemDetailsResult.ServiceBookingItemDetailsButtonsAction> f1772g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AttributedText f1773h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final ApiError f1774i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f1775j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1776k;

    /* compiled from: ServiceBookingItemDetailsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBt0/c$a;", "", "<init>", "()V", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        f1766m = new c(false, "", "", c42784z0, c42784z0, c42784z0, null, null, false, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(boolean z12, @k String str, @k String str2, @k List<? extends com.avito.conveyor_item.a> list, @l List<ServiceBookingItemDetailsResult.ServiceBookingItemDetailsAction> list2, @l List<ServiceBookingItemDetailsResult.ServiceBookingItemDetailsButtonsAction> list3, @l AttributedText attributedText, @l ApiError apiError, boolean z13, int i12) {
        this.f1767b = z12;
        this.f1768c = str;
        this.f1769d = str2;
        this.f1770e = list;
        this.f1771f = list2;
        this.f1772g = list3;
        this.f1773h = attributedText;
        this.f1774i = apiError;
        this.f1775j = z13;
        this.f1776k = i12;
    }

    public static c a(c cVar, ArrayList arrayList, ApiError apiError, boolean z12, int i12, int i13) {
        boolean z13 = cVar.f1767b;
        String str = cVar.f1768c;
        String str2 = cVar.f1769d;
        List<com.avito.conveyor_item.a> list = (i13 & 8) != 0 ? cVar.f1770e : arrayList;
        List<ServiceBookingItemDetailsResult.ServiceBookingItemDetailsAction> list2 = cVar.f1771f;
        List<ServiceBookingItemDetailsResult.ServiceBookingItemDetailsButtonsAction> list3 = cVar.f1772g;
        AttributedText attributedText = cVar.f1773h;
        ApiError apiError2 = (i13 & 128) != 0 ? cVar.f1774i : apiError;
        boolean z14 = (i13 & 256) != 0 ? cVar.f1775j : z12;
        int i14 = (i13 & 512) != 0 ? cVar.f1776k : i12;
        cVar.getClass();
        return new c(z13, str, str2, list, list2, list3, attributedText, apiError2, z14, i14);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1767b == cVar.f1767b && L.f(this.f1768c, cVar.f1768c) && L.f(this.f1769d, cVar.f1769d) && L.f(this.f1770e, cVar.f1770e) && L.f(this.f1771f, cVar.f1771f) && L.f(this.f1772g, cVar.f1772g) && L.f(this.f1773h, cVar.f1773h) && L.f(this.f1774i, cVar.f1774i) && this.f1775j == cVar.f1775j && this.f1776k == cVar.f1776k;
    }

    public final int hashCode() {
        int iE2 = H.e(H.d(H.d(Boolean.hashCode(this.f1767b) * 31, 31, this.f1768c), 31, this.f1769d), 31, this.f1770e);
        List<ServiceBookingItemDetailsResult.ServiceBookingItemDetailsAction> list = this.f1771f;
        int iHashCode = (iE2 + (list == null ? 0 : list.hashCode())) * 31;
        List<ServiceBookingItemDetailsResult.ServiceBookingItemDetailsButtonsAction> list2 = this.f1772g;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        AttributedText attributedText = this.f1773h;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        ApiError apiError = this.f1774i;
        return Integer.hashCode(this.f1776k) + r.i((iHashCode3 + (apiError != null ? apiError.hashCode() : 0)) * 31, 31, this.f1775j);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceBookingItemDetailsState(hasCloseButton=");
        sb2.append(this.f1767b);
        sb2.append(", title=");
        sb2.append(this.f1768c);
        sb2.append(", prevActionButton=");
        sb2.append(this.f1769d);
        sb2.append(", params=");
        sb2.append(this.f1770e);
        sb2.append(", actions=");
        sb2.append(this.f1771f);
        sb2.append(", buttons=");
        sb2.append(this.f1772g);
        sb2.append(", disclaimer=");
        sb2.append(this.f1773h);
        sb2.append(", error=");
        sb2.append(this.f1774i);
        sb2.append(", isLoading=");
        sb2.append(this.f1775j);
        sb2.append(", activityResult=");
        return r.t(sb2, this.f1776k, ')');
    }
}
