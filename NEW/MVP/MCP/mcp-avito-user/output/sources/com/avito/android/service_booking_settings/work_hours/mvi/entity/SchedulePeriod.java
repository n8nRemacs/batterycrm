package com.avito.android.service_booking_settings.work_hours.mvi.entity;

import K51.d;
import Ut0.InterfaceC15569d;
import Ut0.j;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.ParcelableEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingWorkHoursMviState.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/SchedulePeriod;", "LUt0/j;", "LUt0/d;", "ScheduleOptionsItem", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SchedulePeriod extends j implements InterfaceC15569d {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f278055f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<ScheduleOptionsItem> f278056g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f278057h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f278058i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final ScheduleOptionsItem f278059j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f278060k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f278061l;

    /* compiled from: ServiceBookingWorkHoursMviState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/SchedulePeriod$ScheduleOptionsItem;", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ScheduleOptionsItem implements ParcelableEntity<String> {

        @k
        public static final Parcelable.Creator<ScheduleOptionsItem> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f278062b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f278063c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f278064d;

        /* compiled from: ServiceBookingWorkHoursMviState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ScheduleOptionsItem> {
            @Override // android.os.Parcelable.Creator
            public final ScheduleOptionsItem createFromParcel(Parcel parcel) {
                return new ScheduleOptionsItem(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ScheduleOptionsItem[] newArray(int i12) {
                return new ScheduleOptionsItem[i12];
            }
        }

        public ScheduleOptionsItem(@k String str, @l String str2, @k String str3) {
            this.f278062b = str;
            this.f278063c = str2;
            this.f278064d = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScheduleOptionsItem)) {
                return false;
            }
            ScheduleOptionsItem scheduleOptionsItem = (ScheduleOptionsItem) obj;
            return L.f(this.f278062b, scheduleOptionsItem.f278062b) && L.f(this.f278063c, scheduleOptionsItem.f278063c) && L.f(this.f278064d, scheduleOptionsItem.f278064d);
        }

        @Override // com.avito.android.remote.model.Entity
        public final Object getId() {
            return this.f278062b;
        }

        @Override // com.avito.android.remote.model.Entity
        @l
        /* renamed from: getName, reason: from getter */
        public final String getTitle() {
            return this.f278063c;
        }

        public final int hashCode() {
            int iHashCode = this.f278062b.hashCode() * 31;
            String str = this.f278063c;
            return this.f278064d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ScheduleOptionsItem(id=");
            sb2.append(this.f278062b);
            sb2.append(", name=");
            sb2.append(this.f278063c);
            sb2.append(", label=");
            return C22026a.c(sb2, this.f278064d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f278062b);
            parcel.writeString(this.f278063c);
            parcel.writeString(this.f278064d);
        }
    }

    public /* synthetic */ SchedulePeriod(String str, List list, String str2, String str3, ScheduleOptionsItem scheduleOptionsItem, String str4, boolean z12, int i12, C42822w c42822w) {
        this(str, list, str2, str3, scheduleOptionsItem, str4, (i12 & 64) != 0 ? true : z12);
    }

    public static SchedulePeriod f(SchedulePeriod schedulePeriod, ScheduleOptionsItem scheduleOptionsItem, boolean z12, int i12) {
        String str = schedulePeriod.f278055f;
        List<ScheduleOptionsItem> list = schedulePeriod.f278056g;
        String str2 = schedulePeriod.f278057h;
        String str3 = schedulePeriod.f278058i;
        if ((i12 & 16) != 0) {
            scheduleOptionsItem = schedulePeriod.f278059j;
        }
        ScheduleOptionsItem scheduleOptionsItem2 = scheduleOptionsItem;
        String str4 = schedulePeriod.f278060k;
        if ((i12 & 64) != 0) {
            z12 = schedulePeriod.f278061l;
        }
        schedulePeriod.getClass();
        return new SchedulePeriod(str, list, str2, str3, scheduleOptionsItem2, str4, z12);
    }

    @Override // Ut0.j
    @k
    public final List<ScheduleOptionsItem> a() {
        return this.f278056g;
    }

    @Override // Ut0.j
    public final ParcelableEntity b() {
        return this.f278059j;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchedulePeriod)) {
            return false;
        }
        SchedulePeriod schedulePeriod = (SchedulePeriod) obj;
        return L.f(this.f278055f, schedulePeriod.f278055f) && L.f(this.f278056g, schedulePeriod.f278056g) && L.f(this.f278057h, schedulePeriod.f278057h) && L.f(this.f278058i, schedulePeriod.f278058i) && L.f(this.f278059j, schedulePeriod.f278059j) && L.f(this.f278060k, schedulePeriod.f278060k) && this.f278061l == schedulePeriod.f278061l;
    }

    @Override // Ut0.j, com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF16758b() {
        return this.f278055f;
    }

    @Override // Ut0.j
    @l
    /* renamed from: getTitle, reason: from getter */
    public final String getF16759c() {
        return this.f278058i;
    }

    public final int hashCode() {
        int iE2 = H.e(this.f278055f.hashCode() * 31, 31, this.f278056g);
        String str = this.f278057h;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f278058i;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ScheduleOptionsItem scheduleOptionsItem = this.f278059j;
        int iHashCode3 = (iHashCode2 + (scheduleOptionsItem == null ? 0 : scheduleOptionsItem.hashCode())) * 31;
        String str3 = this.f278060k;
        return Boolean.hashCode(this.f278061l) + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SchedulePeriod(stringId=");
        sb2.append(this.f278055f);
        sb2.append(", options=");
        sb2.append(this.f278056g);
        sb2.append(", placeholder=");
        sb2.append(this.f278057h);
        sb2.append(", title=");
        sb2.append(this.f278058i);
        sb2.append(", value=");
        sb2.append(this.f278059j);
        sb2.append(", fromPage=");
        sb2.append(this.f278060k);
        sb2.append(", viewEnabled=");
        return r.x(sb2, this.f278061l, ')');
    }

    public SchedulePeriod(@k String str, @k List<ScheduleOptionsItem> list, @l String str2, @l String str3, @l ScheduleOptionsItem scheduleOptionsItem, @l String str4, boolean z12) {
        super(str, str3, scheduleOptionsItem, list);
        this.f278055f = str;
        this.f278056g = list;
        this.f278057h = str2;
        this.f278058i = str3;
        this.f278059j = scheduleOptionsItem;
        this.f278060k = str4;
        this.f278061l = z12;
    }
}
