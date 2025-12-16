package com.avito.android.service_booking.api.models.work_hours;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingWorkHours.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001:\u0007/012345Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b-\u0010.¨\u00066"}, d2 = {"Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours;", "Landroid/os/Parcelable;", "", "title", "actionTitle", "Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$WorkHoursLink;", "linkToRedirect", "", "Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingDay;", "days", "Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingTimeGap;", "timeGap", "Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingSchedulePeriod;", "schedulePeriod", "Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingContentDescription;", "contentDescription", "Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingSaveScheduleInfo;", "saveScheduleInfo", "Lcom/avito/android/remote/model/text/AttributedText;", "licenseAgreement", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$WorkHoursLink;Ljava/util/List;Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingTimeGap;Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingSchedulePeriod;Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingContentDescription;Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingSaveScheduleInfo;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "c", "Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$WorkHoursLink;", "g", "()Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$WorkHoursLink;", "Ljava/util/List;", "e", "()Ljava/util/List;", "Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingTimeGap;", "j", "()Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingTimeGap;", "Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingSchedulePeriod;", "i", "()Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingSchedulePeriod;", "Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingContentDescription;", "d", "()Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingContentDescription;", "Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingSaveScheduleInfo;", "h", "()Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingSaveScheduleInfo;", "Lcom/avito/android/remote/model/text/AttributedText;", "f", "()Lcom/avito/android/remote/model/text/AttributedText;", "Options", "ServiceBookingContentDescription", "ServiceBookingDay", "ServiceBookingSaveScheduleInfo", "ServiceBookingSchedulePeriod", "ServiceBookingTimeGap", "WorkHoursLink", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServiceBookingWorkHours implements Parcelable {

    @k
    public static final Parcelable.Creator<ServiceBookingWorkHours> CREATOR = new a();

    @c("actionTitle")
    @k
    private final String actionTitle;

    @c("contentDescription")
    @l
    private final ServiceBookingContentDescription contentDescription;

    @c("days")
    @k
    private final List<ServiceBookingDay> days;

    @c("licenseAgreement")
    @l
    private final AttributedText licenseAgreement;

    @c("linkToRedirect")
    @l
    private final WorkHoursLink linkToRedirect;

    @c("saveScheduleInfo")
    @l
    private final ServiceBookingSaveScheduleInfo saveScheduleInfo;

    @c("schedulePeriod")
    @l
    private final ServiceBookingSchedulePeriod schedulePeriod;

    @c("timeGap")
    @l
    private final ServiceBookingTimeGap timeGap;

    @c("title")
    @k
    private final String title;

    /* compiled from: ServiceBookingWorkHours.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$Options;", "Landroid/os/Parcelable;", "", "id", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Options implements Parcelable {

        @k
        public static final Parcelable.Creator<Options> CREATOR = new a();

        @c("id")
        @k
        private final String id;

        @c("title")
        @k
        private final String title;

        /* compiled from: ServiceBookingWorkHours.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Options> {
            @Override // android.os.Parcelable.Creator
            public final Options createFromParcel(Parcel parcel) {
                return new Options(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Options[] newArray(int i12) {
                return new Options[i12];
            }
        }

        public Options(@k String str, @k String str2) {
            this.id = str;
            this.title = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Options)) {
                return false;
            }
            Options options = (Options) obj;
            return L.f(this.id, options.id) && L.f(this.title, options.title);
        }

        @k
        public final String getId() {
            return this.id;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.title.hashCode() + (this.id.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Options(id=");
            sb2.append(this.id);
            sb2.append(", title=");
            return C22026a.c(sb2, this.title, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.id);
            parcel.writeString(this.title);
        }
    }

    /* compiled from: ServiceBookingWorkHours.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingContentDescription;", "Landroid/os/Parcelable;", "", "title", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ServiceBookingContentDescription implements Parcelable {

        @k
        public static final Parcelable.Creator<ServiceBookingContentDescription> CREATOR = new a();

        @c("description")
        @k
        private final String description;

        @c("title")
        @k
        private final String title;

        /* compiled from: ServiceBookingWorkHours.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ServiceBookingContentDescription> {
            @Override // android.os.Parcelable.Creator
            public final ServiceBookingContentDescription createFromParcel(Parcel parcel) {
                return new ServiceBookingContentDescription(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ServiceBookingContentDescription[] newArray(int i12) {
                return new ServiceBookingContentDescription[i12];
            }
        }

        public ServiceBookingContentDescription(@k String str, @k String str2) {
            this.title = str;
            this.description = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServiceBookingContentDescription)) {
                return false;
            }
            ServiceBookingContentDescription serviceBookingContentDescription = (ServiceBookingContentDescription) obj;
            return L.f(this.title, serviceBookingContentDescription.title) && L.f(this.description, serviceBookingContentDescription.description);
        }

        @k
        public final String getDescription() {
            return this.description;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.description.hashCode() + (this.title.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ServiceBookingContentDescription(title=");
            sb2.append(this.title);
            sb2.append(", description=");
            return C22026a.c(sb2, this.description, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            parcel.writeString(this.description);
        }
    }

    /* compiled from: ServiceBookingWorkHours.kt */
    @d
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0015\u0010\u000eR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingDay;", "Landroid/os/Parcelable;", "", "id", "", "title", "", "enabled", "dayFromSeconds", "dayToSeconds", "<init>", "(ILjava/lang/String;ZII)V", "I", "e", "()I", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Z", "getEnabled", "()Z", "c", "d", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ServiceBookingDay implements Parcelable {

        @k
        public static final Parcelable.Creator<ServiceBookingDay> CREATOR = new a();

        @c(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME)
        private final int dayFromSeconds;

        @c(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME)
        private final int dayToSeconds;

        @c("enabled")
        private final boolean enabled;

        @c("id")
        private final int id;

        @c("title")
        @k
        private final String title;

        /* compiled from: ServiceBookingWorkHours.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ServiceBookingDay> {
            @Override // android.os.Parcelable.Creator
            public final ServiceBookingDay createFromParcel(Parcel parcel) {
                return new ServiceBookingDay(parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final ServiceBookingDay[] newArray(int i12) {
                return new ServiceBookingDay[i12];
            }
        }

        public ServiceBookingDay(int i12, @k String str, boolean z12, int i13, int i14) {
            this.id = i12;
            this.title = str;
            this.enabled = z12;
            this.dayFromSeconds = i13;
            this.dayToSeconds = i14;
        }

        /* renamed from: c, reason: from getter */
        public final int getDayFromSeconds() {
            return this.dayFromSeconds;
        }

        /* renamed from: d, reason: from getter */
        public final int getDayToSeconds() {
            return this.dayToSeconds;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* renamed from: e, reason: from getter */
        public final int getId() {
            return this.id;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServiceBookingDay)) {
                return false;
            }
            ServiceBookingDay serviceBookingDay = (ServiceBookingDay) obj;
            return this.id == serviceBookingDay.id && L.f(this.title, serviceBookingDay.title) && this.enabled == serviceBookingDay.enabled && this.dayFromSeconds == serviceBookingDay.dayFromSeconds && this.dayToSeconds == serviceBookingDay.dayToSeconds;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return Integer.hashCode(this.dayToSeconds) + r.e(this.dayFromSeconds, r.i(H.d(Integer.hashCode(this.id) * 31, 31, this.title), 31, this.enabled), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ServiceBookingDay(id=");
            sb2.append(this.id);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", enabled=");
            sb2.append(this.enabled);
            sb2.append(", dayFromSeconds=");
            sb2.append(this.dayFromSeconds);
            sb2.append(", dayToSeconds=");
            return r.t(sb2, this.dayToSeconds, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.id);
            parcel.writeString(this.title);
            parcel.writeInt(this.enabled ? 1 : 0);
            parcel.writeInt(this.dayFromSeconds);
            parcel.writeInt(this.dayToSeconds);
        }
    }

    /* compiled from: ServiceBookingWorkHours.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingSaveScheduleInfo;", "Landroid/os/Parcelable;", "", "title", "description", "Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingSaveScheduleInfo$ActionButton;", "acceptButton", "cancelButton", "fromPage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingSaveScheduleInfo$ActionButton;Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingSaveScheduleInfo$ActionButton;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingSaveScheduleInfo$ActionButton;", "c", "()Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingSaveScheduleInfo$ActionButton;", "d", "e", "ActionButton", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ServiceBookingSaveScheduleInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<ServiceBookingSaveScheduleInfo> CREATOR = new a();

        @c("acceptButton")
        @k
        private final ActionButton acceptButton;

        @c("cancelButton")
        @k
        private final ActionButton cancelButton;

        @c("description")
        @k
        private final String description;

        @c("fromPage")
        @k
        private final String fromPage;

        @c("title")
        @k
        private final String title;

        /* compiled from: ServiceBookingWorkHours.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingSaveScheduleInfo$ActionButton;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingSaveScheduleInfo$ActionButton$ButtonStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingSaveScheduleInfo$ActionButton$ButtonStyle;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingSaveScheduleInfo$ActionButton$ButtonStyle;", "c", "()Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingSaveScheduleInfo$ActionButton$ButtonStyle;", "ButtonStyle", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class ActionButton implements Parcelable {

            @k
            public static final Parcelable.Creator<ActionButton> CREATOR = new a();

            @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
            @k
            private final ButtonStyle style;

            @c("title")
            @k
            private final String title;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: ServiceBookingWorkHours.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingSaveScheduleInfo$ActionButton$ButtonStyle;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final class ButtonStyle implements Parcelable {

                @k
                public static final Parcelable.Creator<ButtonStyle> CREATOR;

                @c("primary")
                public static final ButtonStyle PRIMARY;

                @c("secondary")
                public static final ButtonStyle SECONDARY;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ ButtonStyle[] f274168b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ kotlin.enums.a f274169c;

                /* compiled from: ServiceBookingWorkHours.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<ButtonStyle> {
                    @Override // android.os.Parcelable.Creator
                    public final ButtonStyle createFromParcel(Parcel parcel) {
                        return ButtonStyle.valueOf(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final ButtonStyle[] newArray(int i12) {
                        return new ButtonStyle[i12];
                    }
                }

                static {
                    ButtonStyle buttonStyle = new ButtonStyle("PRIMARY", 0);
                    PRIMARY = buttonStyle;
                    ButtonStyle buttonStyle2 = new ButtonStyle("SECONDARY", 1);
                    SECONDARY = buttonStyle2;
                    ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2};
                    f274168b = buttonStyleArr;
                    f274169c = kotlin.enums.c.a(buttonStyleArr);
                    CREATOR = new a();
                }

                private ButtonStyle(String str, int i12) {
                }

                public static ButtonStyle valueOf(String str) {
                    return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
                }

                public static ButtonStyle[] values() {
                    return (ButtonStyle[]) f274168b.clone();
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeString(name());
                }
            }

            /* compiled from: ServiceBookingWorkHours.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ActionButton> {
                @Override // android.os.Parcelable.Creator
                public final ActionButton createFromParcel(Parcel parcel) {
                    return new ActionButton(parcel.readString(), ButtonStyle.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final ActionButton[] newArray(int i12) {
                    return new ActionButton[i12];
                }
            }

            public ActionButton(@k String str, @k ButtonStyle buttonStyle) {
                this.title = str;
                this.style = buttonStyle;
            }

            @k
            /* renamed from: c, reason: from getter */
            public final ButtonStyle getStyle() {
                return this.style;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionButton)) {
                    return false;
                }
                ActionButton actionButton = (ActionButton) obj;
                return L.f(this.title, actionButton.title) && this.style == actionButton.style;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public final int hashCode() {
                return this.style.hashCode() + (this.title.hashCode() * 31);
            }

            @k
            public final String toString() {
                return "ActionButton(title=" + this.title + ", style=" + this.style + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.title);
                this.style.writeToParcel(parcel, i12);
            }
        }

        /* compiled from: ServiceBookingWorkHours.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ServiceBookingSaveScheduleInfo> {
            @Override // android.os.Parcelable.Creator
            public final ServiceBookingSaveScheduleInfo createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                Parcelable.Creator<ActionButton> creator = ActionButton.CREATOR;
                return new ServiceBookingSaveScheduleInfo(string, string2, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ServiceBookingSaveScheduleInfo[] newArray(int i12) {
                return new ServiceBookingSaveScheduleInfo[i12];
            }
        }

        public ServiceBookingSaveScheduleInfo(@k String str, @k String str2, @k ActionButton actionButton, @k ActionButton actionButton2, @k String str3) {
            this.title = str;
            this.description = str2;
            this.acceptButton = actionButton;
            this.cancelButton = actionButton2;
            this.fromPage = str3;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final ActionButton getAcceptButton() {
            return this.acceptButton;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final ActionButton getCancelButton() {
            return this.cancelButton;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @k
        /* renamed from: e, reason: from getter */
        public final String getFromPage() {
            return this.fromPage;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServiceBookingSaveScheduleInfo)) {
                return false;
            }
            ServiceBookingSaveScheduleInfo serviceBookingSaveScheduleInfo = (ServiceBookingSaveScheduleInfo) obj;
            return L.f(this.title, serviceBookingSaveScheduleInfo.title) && L.f(this.description, serviceBookingSaveScheduleInfo.description) && L.f(this.acceptButton, serviceBookingSaveScheduleInfo.acceptButton) && L.f(this.cancelButton, serviceBookingSaveScheduleInfo.cancelButton) && L.f(this.fromPage, serviceBookingSaveScheduleInfo.fromPage);
        }

        @k
        public final String getDescription() {
            return this.description;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.fromPage.hashCode() + ((this.cancelButton.hashCode() + ((this.acceptButton.hashCode() + H.d(this.title.hashCode() * 31, 31, this.description)) * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ServiceBookingSaveScheduleInfo(title=");
            sb2.append(this.title);
            sb2.append(", description=");
            sb2.append(this.description);
            sb2.append(", acceptButton=");
            sb2.append(this.acceptButton);
            sb2.append(", cancelButton=");
            sb2.append(this.cancelButton);
            sb2.append(", fromPage=");
            return C22026a.c(sb2, this.fromPage, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            parcel.writeString(this.description);
            this.acceptButton.writeToParcel(parcel, i12);
            this.cancelButton.writeToParcel(parcel, i12);
            parcel.writeString(this.fromPage);
        }
    }

    /* compiled from: ServiceBookingWorkHours.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingSchedulePeriod;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingSchedulePeriod$ScheduleOptions;", "options", "", ChannelContext.Item.PLACEHOLDER, "title", "value", "fromPage", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/List;", "d", "()Ljava/util/List;", "Ljava/lang/String;", "getPlaceholder", "()Ljava/lang/String;", "getTitle", "getValue", "c", "ScheduleOptions", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ServiceBookingSchedulePeriod implements Parcelable {

        @k
        public static final Parcelable.Creator<ServiceBookingSchedulePeriod> CREATOR = new a();

        @c("fromPage")
        @l
        private final String fromPage;

        @c("options")
        @k
        private final List<ScheduleOptions> options;

        @c(ChannelContext.Item.PLACEHOLDER)
        @l
        private final String placeholder;

        @c("title")
        @l
        private final String title;

        @c("value")
        @l
        private final String value;

        /* compiled from: ServiceBookingWorkHours.kt */
        @d
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingSchedulePeriod$ScheduleOptions;", "Landroid/os/Parcelable;", "", "id", "title", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "getLabel", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ScheduleOptions implements Parcelable {

            @k
            public static final Parcelable.Creator<ScheduleOptions> CREATOR = new a();

            @c("id")
            @k
            private final String id;

            @c("label")
            @k
            private final String label;

            @c("title")
            @k
            private final String title;

            /* compiled from: ServiceBookingWorkHours.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ScheduleOptions> {
                @Override // android.os.Parcelable.Creator
                public final ScheduleOptions createFromParcel(Parcel parcel) {
                    return new ScheduleOptions(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ScheduleOptions[] newArray(int i12) {
                    return new ScheduleOptions[i12];
                }
            }

            public ScheduleOptions(@k String str, @k String str2, @k String str3) {
                this.id = str;
                this.title = str2;
                this.label = str3;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ScheduleOptions)) {
                    return false;
                }
                ScheduleOptions scheduleOptions = (ScheduleOptions) obj;
                return L.f(this.id, scheduleOptions.id) && L.f(this.title, scheduleOptions.title) && L.f(this.label, scheduleOptions.label);
            }

            @k
            public final String getId() {
                return this.id;
            }

            @k
            public final String getLabel() {
                return this.label;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public final int hashCode() {
                return this.label.hashCode() + H.d(this.id.hashCode() * 31, 31, this.title);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ScheduleOptions(id=");
                sb2.append(this.id);
                sb2.append(", title=");
                sb2.append(this.title);
                sb2.append(", label=");
                return C22026a.c(sb2, this.label, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.id);
                parcel.writeString(this.title);
                parcel.writeString(this.label);
            }
        }

        /* compiled from: ServiceBookingWorkHours.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ServiceBookingSchedulePeriod> {
            @Override // android.os.Parcelable.Creator
            public final ServiceBookingSchedulePeriod createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(ScheduleOptions.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new ServiceBookingSchedulePeriod(arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ServiceBookingSchedulePeriod[] newArray(int i12) {
                return new ServiceBookingSchedulePeriod[i12];
            }
        }

        public ServiceBookingSchedulePeriod(@k List<ScheduleOptions> list, @l String str, @l String str2, @l String str3, @l String str4) {
            this.options = list;
            this.placeholder = str;
            this.title = str2;
            this.value = str3;
            this.fromPage = str4;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getFromPage() {
            return this.fromPage;
        }

        @k
        public final List<ScheduleOptions> d() {
            return this.options;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServiceBookingSchedulePeriod)) {
                return false;
            }
            ServiceBookingSchedulePeriod serviceBookingSchedulePeriod = (ServiceBookingSchedulePeriod) obj;
            return L.f(this.options, serviceBookingSchedulePeriod.options) && L.f(this.placeholder, serviceBookingSchedulePeriod.placeholder) && L.f(this.title, serviceBookingSchedulePeriod.title) && L.f(this.value, serviceBookingSchedulePeriod.value) && L.f(this.fromPage, serviceBookingSchedulePeriod.fromPage);
        }

        @l
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @l
        public final String getValue() {
            return this.value;
        }

        public final int hashCode() {
            int iHashCode = this.options.hashCode() * 31;
            String str = this.placeholder;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.title;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.value;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.fromPage;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ServiceBookingSchedulePeriod(options=");
            sb2.append(this.options);
            sb2.append(", placeholder=");
            sb2.append(this.placeholder);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", value=");
            sb2.append(this.value);
            sb2.append(", fromPage=");
            return C22026a.c(sb2, this.fromPage, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            Iterator itJ = C0.j(this.options, parcel);
            while (itJ.hasNext()) {
                ((ScheduleOptions) itJ.next()).writeToParcel(parcel, i12);
            }
            parcel.writeString(this.placeholder);
            parcel.writeString(this.title);
            parcel.writeString(this.value);
            parcel.writeString(this.fromPage);
        }
    }

    /* compiled from: ServiceBookingWorkHours.kt */
    @d
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0011\u0010\u000eR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$ServiceBookingTimeGap;", "Landroid/os/Parcelable;", "", "title", "description", ChannelContext.Item.PLACEHOLDER, "value", "", "Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$Options;", "options", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "getPlaceholder", "getValue", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ServiceBookingTimeGap implements Parcelable {

        @k
        public static final Parcelable.Creator<ServiceBookingTimeGap> CREATOR = new a();

        @c("description")
        @k
        private final String description;

        @c("options")
        @k
        private final List<Options> options;

        @c(ChannelContext.Item.PLACEHOLDER)
        @l
        private final String placeholder;

        @c("title")
        @k
        private final String title;

        @c("value")
        @l
        private final String value;

        /* compiled from: ServiceBookingWorkHours.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ServiceBookingTimeGap> {
            @Override // android.os.Parcelable.Creator
            public final ServiceBookingTimeGap createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Options.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new ServiceBookingTimeGap(string, string2, string3, string4, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final ServiceBookingTimeGap[] newArray(int i12) {
                return new ServiceBookingTimeGap[i12];
            }
        }

        public ServiceBookingTimeGap(@k String str, @k String str2, @l String str3, @l String str4, @k List<Options> list) {
            this.title = str;
            this.description = str2;
            this.placeholder = str3;
            this.value = str4;
            this.options = list;
        }

        @k
        public final List<Options> c() {
            return this.options;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServiceBookingTimeGap)) {
                return false;
            }
            ServiceBookingTimeGap serviceBookingTimeGap = (ServiceBookingTimeGap) obj;
            return L.f(this.title, serviceBookingTimeGap.title) && L.f(this.description, serviceBookingTimeGap.description) && L.f(this.placeholder, serviceBookingTimeGap.placeholder) && L.f(this.value, serviceBookingTimeGap.value) && L.f(this.options, serviceBookingTimeGap.options);
        }

        @k
        public final String getDescription() {
            return this.description;
        }

        @l
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @l
        public final String getValue() {
            return this.value;
        }

        public final int hashCode() {
            int iD2 = H.d(this.title.hashCode() * 31, 31, this.description);
            String str = this.placeholder;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.value;
            return this.options.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ServiceBookingTimeGap(title=");
            sb2.append(this.title);
            sb2.append(", description=");
            sb2.append(this.description);
            sb2.append(", placeholder=");
            sb2.append(this.placeholder);
            sb2.append(", value=");
            sb2.append(this.value);
            sb2.append(", options=");
            return H.p(sb2, this.options, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            parcel.writeString(this.description);
            parcel.writeString(this.placeholder);
            parcel.writeString(this.value);
            Iterator itJ = C0.j(this.options, parcel);
            while (itJ.hasNext()) {
                ((Options) itJ.next()).writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: ServiceBookingWorkHours.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours$WorkHoursLink;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class WorkHoursLink implements Parcelable {

        @k
        public static final Parcelable.Creator<WorkHoursLink> CREATOR = new a();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink uri;

        /* compiled from: ServiceBookingWorkHours.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<WorkHoursLink> {
            @Override // android.os.Parcelable.Creator
            public final WorkHoursLink createFromParcel(Parcel parcel) {
                return new WorkHoursLink((DeepLink) parcel.readParcelable(WorkHoursLink.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final WorkHoursLink[] newArray(int i12) {
                return new WorkHoursLink[i12];
            }
        }

        public WorkHoursLink(@k DeepLink deepLink) {
            this.uri = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WorkHoursLink) && L.f(this.uri, ((WorkHoursLink) obj).uri);
        }

        @k
        public final DeepLink getUri() {
            return this.uri;
        }

        public final int hashCode() {
            return this.uri.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("WorkHoursLink(uri="), this.uri, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.uri, i12);
        }
    }

    /* compiled from: ServiceBookingWorkHours.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceBookingWorkHours> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingWorkHours createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            WorkHoursLink workHoursLinkCreateFromParcel = parcel.readInt() == 0 ? null : WorkHoursLink.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(ServiceBookingDay.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ServiceBookingWorkHours(string, string2, workHoursLinkCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : ServiceBookingTimeGap.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ServiceBookingSchedulePeriod.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ServiceBookingContentDescription.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ServiceBookingSaveScheduleInfo.CREATOR.createFromParcel(parcel) : null, (AttributedText) parcel.readParcelable(ServiceBookingWorkHours.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingWorkHours[] newArray(int i12) {
            return new ServiceBookingWorkHours[i12];
        }
    }

    public ServiceBookingWorkHours(@k String str, @k String str2, @l WorkHoursLink workHoursLink, @k List<ServiceBookingDay> list, @l ServiceBookingTimeGap serviceBookingTimeGap, @l ServiceBookingSchedulePeriod serviceBookingSchedulePeriod, @l ServiceBookingContentDescription serviceBookingContentDescription, @l ServiceBookingSaveScheduleInfo serviceBookingSaveScheduleInfo, @l AttributedText attributedText) {
        this.title = str;
        this.actionTitle = str2;
        this.linkToRedirect = workHoursLink;
        this.days = list;
        this.timeGap = serviceBookingTimeGap;
        this.schedulePeriod = serviceBookingSchedulePeriod;
        this.contentDescription = serviceBookingContentDescription;
        this.saveScheduleInfo = serviceBookingSaveScheduleInfo;
        this.licenseAgreement = attributedText;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getActionTitle() {
        return this.actionTitle;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final ServiceBookingContentDescription getContentDescription() {
        return this.contentDescription;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    public final List<ServiceBookingDay> e() {
        return this.days;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingWorkHours)) {
            return false;
        }
        ServiceBookingWorkHours serviceBookingWorkHours = (ServiceBookingWorkHours) obj;
        return L.f(this.title, serviceBookingWorkHours.title) && L.f(this.actionTitle, serviceBookingWorkHours.actionTitle) && L.f(this.linkToRedirect, serviceBookingWorkHours.linkToRedirect) && L.f(this.days, serviceBookingWorkHours.days) && L.f(this.timeGap, serviceBookingWorkHours.timeGap) && L.f(this.schedulePeriod, serviceBookingWorkHours.schedulePeriod) && L.f(this.contentDescription, serviceBookingWorkHours.contentDescription) && L.f(this.saveScheduleInfo, serviceBookingWorkHours.saveScheduleInfo) && L.f(this.licenseAgreement, serviceBookingWorkHours.licenseAgreement);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final AttributedText getLicenseAgreement() {
        return this.licenseAgreement;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final WorkHoursLink getLinkToRedirect() {
        return this.linkToRedirect;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final ServiceBookingSaveScheduleInfo getSaveScheduleInfo() {
        return this.saveScheduleInfo;
    }

    public final int hashCode() {
        int iD2 = H.d(this.title.hashCode() * 31, 31, this.actionTitle);
        WorkHoursLink workHoursLink = this.linkToRedirect;
        int iE2 = H.e((iD2 + (workHoursLink == null ? 0 : workHoursLink.hashCode())) * 31, 31, this.days);
        ServiceBookingTimeGap serviceBookingTimeGap = this.timeGap;
        int iHashCode = (iE2 + (serviceBookingTimeGap == null ? 0 : serviceBookingTimeGap.hashCode())) * 31;
        ServiceBookingSchedulePeriod serviceBookingSchedulePeriod = this.schedulePeriod;
        int iHashCode2 = (iHashCode + (serviceBookingSchedulePeriod == null ? 0 : serviceBookingSchedulePeriod.hashCode())) * 31;
        ServiceBookingContentDescription serviceBookingContentDescription = this.contentDescription;
        int iHashCode3 = (iHashCode2 + (serviceBookingContentDescription == null ? 0 : serviceBookingContentDescription.hashCode())) * 31;
        ServiceBookingSaveScheduleInfo serviceBookingSaveScheduleInfo = this.saveScheduleInfo;
        int iHashCode4 = (iHashCode3 + (serviceBookingSaveScheduleInfo == null ? 0 : serviceBookingSaveScheduleInfo.hashCode())) * 31;
        AttributedText attributedText = this.licenseAgreement;
        return iHashCode4 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @l
    /* renamed from: i, reason: from getter */
    public final ServiceBookingSchedulePeriod getSchedulePeriod() {
        return this.schedulePeriod;
    }

    @l
    /* renamed from: j, reason: from getter */
    public final ServiceBookingTimeGap getTimeGap() {
        return this.timeGap;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceBookingWorkHours(title=");
        sb2.append(this.title);
        sb2.append(", actionTitle=");
        sb2.append(this.actionTitle);
        sb2.append(", linkToRedirect=");
        sb2.append(this.linkToRedirect);
        sb2.append(", days=");
        sb2.append(this.days);
        sb2.append(", timeGap=");
        sb2.append(this.timeGap);
        sb2.append(", schedulePeriod=");
        sb2.append(this.schedulePeriod);
        sb2.append(", contentDescription=");
        sb2.append(this.contentDescription);
        sb2.append(", saveScheduleInfo=");
        sb2.append(this.saveScheduleInfo);
        sb2.append(", licenseAgreement=");
        return com.avito.android.actions_sheet.a.w(sb2, this.licenseAgreement, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.actionTitle);
        WorkHoursLink workHoursLink = this.linkToRedirect;
        if (workHoursLink == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            workHoursLink.writeToParcel(parcel, i12);
        }
        Iterator itJ = C0.j(this.days, parcel);
        while (itJ.hasNext()) {
            ((ServiceBookingDay) itJ.next()).writeToParcel(parcel, i12);
        }
        ServiceBookingTimeGap serviceBookingTimeGap = this.timeGap;
        if (serviceBookingTimeGap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serviceBookingTimeGap.writeToParcel(parcel, i12);
        }
        ServiceBookingSchedulePeriod serviceBookingSchedulePeriod = this.schedulePeriod;
        if (serviceBookingSchedulePeriod == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serviceBookingSchedulePeriod.writeToParcel(parcel, i12);
        }
        ServiceBookingContentDescription serviceBookingContentDescription = this.contentDescription;
        if (serviceBookingContentDescription == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serviceBookingContentDescription.writeToParcel(parcel, i12);
        }
        ServiceBookingSaveScheduleInfo serviceBookingSaveScheduleInfo = this.saveScheduleInfo;
        if (serviceBookingSaveScheduleInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serviceBookingSaveScheduleInfo.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.licenseAgreement, i12);
    }
}
