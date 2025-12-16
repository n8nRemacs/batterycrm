package Ut0;

import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.service_booking.api.models.work_hours.ServiceBookingWorkHours;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.SchedulePeriod;
import com.avito.android.service_booking_utils.BookingSettingsStatus;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingWorkHoursMviState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LUt0/h;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class h extends q {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final a f16738p = new a(null);

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final h f16739q = new h(true, null, "", "", C42784z0.f406748b, null, new f(false, false, 3, null), null, null, null, null, null, BookingSettingsStatus.f278279e, new C15568c(null, null, null, 7, null));

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16740b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f16741c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f16742d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f16743e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final List<C15567b> f16744f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ServiceBookingWorkHours.WorkHoursLink f16745g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final f f16746h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final k f16747i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final SchedulePeriod f16748j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final C15566a f16749k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final g f16750l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final e f16751m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final BookingSettingsStatus f16752n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final C15568c f16753o;

    /* compiled from: ServiceBookingWorkHoursMviState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUt0/h$a;", "", "<init>", "()V", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public h(boolean z12, @l String str, @Y61.k String str2, @Y61.k String str3, @Y61.k List<C15567b> list, @l ServiceBookingWorkHours.WorkHoursLink workHoursLink, @Y61.k f fVar, @l k kVar, @l SchedulePeriod schedulePeriod, @l C15566a c15566a, @l g gVar, @l e eVar, @Y61.k BookingSettingsStatus bookingSettingsStatus, @Y61.k C15568c c15568c) {
        this.f16740b = z12;
        this.f16741c = str;
        this.f16742d = str2;
        this.f16743e = str3;
        this.f16744f = list;
        this.f16745g = workHoursLink;
        this.f16746h = fVar;
        this.f16747i = kVar;
        this.f16748j = schedulePeriod;
        this.f16749k = c15566a;
        this.f16750l = gVar;
        this.f16751m = eVar;
        this.f16752n = bookingSettingsStatus;
        this.f16753o = c15568c;
    }

    public static h a(h hVar, boolean z12, String str, String str2, String str3, ArrayList arrayList, ServiceBookingWorkHours.WorkHoursLink workHoursLink, f fVar, k kVar, SchedulePeriod schedulePeriod, C15566a c15566a, g gVar, e eVar, BookingSettingsStatus bookingSettingsStatus, C15568c c15568c, int i12) {
        boolean z13 = (i12 & 1) != 0 ? hVar.f16740b : z12;
        String str4 = (i12 & 2) != 0 ? hVar.f16741c : str;
        String str5 = (i12 & 4) != 0 ? hVar.f16742d : str2;
        String str6 = (i12 & 8) != 0 ? hVar.f16743e : str3;
        List<C15567b> list = (i12 & 16) != 0 ? hVar.f16744f : arrayList;
        ServiceBookingWorkHours.WorkHoursLink workHoursLink2 = (i12 & 32) != 0 ? hVar.f16745g : workHoursLink;
        f fVar2 = (i12 & 64) != 0 ? hVar.f16746h : fVar;
        k kVar2 = (i12 & 128) != 0 ? hVar.f16747i : kVar;
        SchedulePeriod schedulePeriod2 = (i12 & 256) != 0 ? hVar.f16748j : schedulePeriod;
        C15566a c15566a2 = (i12 & 512) != 0 ? hVar.f16749k : c15566a;
        g gVar2 = (i12 & 1024) != 0 ? hVar.f16750l : gVar;
        e eVar2 = (i12 & 2048) != 0 ? hVar.f16751m : eVar;
        BookingSettingsStatus bookingSettingsStatus2 = (i12 & 4096) != 0 ? hVar.f16752n : bookingSettingsStatus;
        C15568c c15568c2 = (i12 & 8192) != 0 ? hVar.f16753o : c15568c;
        hVar.getClass();
        return new h(z13, str4, str5, str6, list, workHoursLink2, fVar2, kVar2, schedulePeriod2, c15566a2, gVar2, eVar2, bookingSettingsStatus2, c15568c2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f16740b == hVar.f16740b && L.f(this.f16741c, hVar.f16741c) && L.f(this.f16742d, hVar.f16742d) && L.f(this.f16743e, hVar.f16743e) && L.f(this.f16744f, hVar.f16744f) && L.f(this.f16745g, hVar.f16745g) && L.f(this.f16746h, hVar.f16746h) && L.f(this.f16747i, hVar.f16747i) && L.f(this.f16748j, hVar.f16748j) && L.f(this.f16749k, hVar.f16749k) && L.f(this.f16750l, hVar.f16750l) && L.f(this.f16751m, hVar.f16751m) && this.f16752n == hVar.f16752n && L.f(this.f16753o, hVar.f16753o);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f16740b) * 31;
        String str = this.f16741c;
        int iE2 = H.e(H.d(H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f16742d), 31, this.f16743e), 31, this.f16744f);
        ServiceBookingWorkHours.WorkHoursLink workHoursLink = this.f16745g;
        int iHashCode2 = (this.f16746h.hashCode() + ((iE2 + (workHoursLink == null ? 0 : workHoursLink.hashCode())) * 31)) * 31;
        k kVar = this.f16747i;
        int iHashCode3 = (iHashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        SchedulePeriod schedulePeriod = this.f16748j;
        int iHashCode4 = (iHashCode3 + (schedulePeriod == null ? 0 : schedulePeriod.hashCode())) * 31;
        C15566a c15566a = this.f16749k;
        int iHashCode5 = (iHashCode4 + (c15566a == null ? 0 : c15566a.hashCode())) * 31;
        g gVar = this.f16750l;
        int iHashCode6 = (iHashCode5 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        e eVar = this.f16751m;
        int iHashCode7 = eVar != null ? eVar.hashCode() : 0;
        return this.f16753o.hashCode() + ((this.f16752n.hashCode() + ((iHashCode6 + iHashCode7) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "ServiceBookingWorkHoursMviState(isLoading=" + this.f16740b + ", error=" + this.f16741c + ", title=" + this.f16742d + ", actionTitle=" + this.f16743e + ", days=" + this.f16744f + ", linkToRedirect=" + this.f16745g + ", saveButtonState=" + this.f16746h + ", timeGap=" + this.f16747i + ", schedulePeriod=" + this.f16748j + ", contentDescription=" + this.f16749k + ", saveScheduleInfo=" + this.f16750l + ", licenseAgreement=" + this.f16751m + ", settingsStatus=" + this.f16752n + ", initialState=" + this.f16753o + ')';
    }
}
