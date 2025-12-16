package Ut0;

import Y61.l;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.SchedulePeriod;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingWorkHoursMviState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUt0/c;", "", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ut0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C15568c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<C15567b> f16723a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final k f16724b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final SchedulePeriod f16725c;

    public C15568c() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15568c)) {
            return false;
        }
        C15568c c15568c = (C15568c) obj;
        return L.f(this.f16723a, c15568c.f16723a) && L.f(this.f16724b, c15568c.f16724b) && L.f(this.f16725c, c15568c.f16725c);
    }

    public final int hashCode() {
        int iHashCode = this.f16723a.hashCode() * 31;
        k kVar = this.f16724b;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        SchedulePeriod schedulePeriod = this.f16725c;
        return iHashCode2 + (schedulePeriod != null ? schedulePeriod.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "InitialState(days=" + this.f16723a + ", timeGap=" + this.f16724b + ", schedulePeriod=" + this.f16725c + ')';
    }

    public C15568c(List list, k kVar, SchedulePeriod schedulePeriod, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? C42784z0.f406748b : list, (i12 & 2) != 0 ? null : kVar, (i12 & 4) != 0 ? null : schedulePeriod);
    }

    public C15568c(@Y61.k List<C15567b> list, @l k kVar, @l SchedulePeriod schedulePeriod) {
        this.f16723a = list;
        this.f16724b = kVar;
        this.f16725c = schedulePeriod;
    }
}
