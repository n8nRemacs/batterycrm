package com.avito.android.service_booking_calendar.data.model;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TimeSlot.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_calendar/data/model/TimeSlot;", "", "ActiveTimeSlot", "a", "Lcom/avito/android/service_booking_calendar/data/model/TimeSlot$ActiveTimeSlot;", "Lcom/avito/android/service_booking_calendar/data/model/TimeSlot$a;", "_avito_service-booking-calendar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TimeSlot {

    /* compiled from: TimeSlot.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001:\u0003'$,Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/avito/android/service_booking_calendar/data/model/TimeSlot$ActiveTimeSlot;", "Lcom/avito/android/service_booking_calendar/data/model/TimeSlot;", "", "id", "statusText", "", "timeStart", "duration", "Lcom/avito/android/service_booking_calendar/data/model/TimeSlot$ActiveTimeSlot$Status;", "status", "", "serviceNames", "totalAmount", "Lcom/avito/android/service_booking_calendar/data/model/TimeSlot$ActiveTimeSlot$b;", "contacts", "Lcom/avito/android/service_booking_calendar/data/model/TimeSlot$ActiveTimeSlot$a;", "action", "techBreak", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLcom/avito/android/service_booking_calendar/data/model/TimeSlot$ActiveTimeSlot$Status;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/service_booking_calendar/data/model/TimeSlot$ActiveTimeSlot$b;Lcom/avito/android/service_booking_calendar/data/model/TimeSlot$ActiveTimeSlot$a;Ljava/lang/Long;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "g", "J", "i", "()J", "c", "Lcom/avito/android/service_booking_calendar/data/model/TimeSlot$ActiveTimeSlot$Status;", "f", "()Lcom/avito/android/service_booking_calendar/data/model/TimeSlot$ActiveTimeSlot$Status;", "Ljava/util/List;", "e", "()Ljava/util/List;", "j", "Lcom/avito/android/service_booking_calendar/data/model/TimeSlot$ActiveTimeSlot$b;", "b", "()Lcom/avito/android/service_booking_calendar/data/model/TimeSlot$ActiveTimeSlot$b;", "Lcom/avito/android/service_booking_calendar/data/model/TimeSlot$ActiveTimeSlot$a;", "a", "()Lcom/avito/android/service_booking_calendar/data/model/TimeSlot$ActiveTimeSlot$a;", "Ljava/lang/Long;", "h", "()Ljava/lang/Long;", "Status", "_avito_service-booking-calendar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ActiveTimeSlot implements TimeSlot {

        @c("action")
        @l
        private final a action;

        @c("contacts")
        @l
        private final b contacts;

        @c("duration")
        private final long duration;

        @c("id")
        @k
        private final String id;

        @c("serviceNames")
        @l
        private final List<String> serviceNames;

        @c("status")
        @l
        private final Status status;

        @c("statusText")
        @k
        private final String statusText;

        @c("techBreak")
        @l
        private final Long techBreak;

        @c("timeStart")
        private final long timeStart;

        @c("totalAmount")
        @l
        private final String totalAmount;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: TimeSlot.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_calendar/data/model/TimeSlot$ActiveTimeSlot$Status;", "", "(Ljava/lang/String;I)V", "CONFIRMED", "NEED_CONFIRMATION_BY_CLIENT", "NEED_CONFIRMATION", "COMPLETED", "_avito_service-booking-calendar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Status {

            @c("completed")
            public static final Status COMPLETED;

            @c("confirmed")
            public static final Status CONFIRMED;

            @c("needConfirmation")
            public static final Status NEED_CONFIRMATION;

            @c("needConfirmationByClient")
            public static final Status NEED_CONFIRMATION_BY_CLIENT;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Status[] f275254b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f275255c;

            static {
                Status status = new Status("CONFIRMED", 0);
                CONFIRMED = status;
                Status status2 = new Status("NEED_CONFIRMATION_BY_CLIENT", 1);
                NEED_CONFIRMATION_BY_CLIENT = status2;
                Status status3 = new Status("NEED_CONFIRMATION", 2);
                NEED_CONFIRMATION = status3;
                Status status4 = new Status("COMPLETED", 3);
                COMPLETED = status4;
                Status[] statusArr = {status, status2, status3, status4};
                f275254b = statusArr;
                f275255c = kotlin.enums.c.a(statusArr);
            }

            private Status(String str, int i12) {
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) f275254b.clone();
            }
        }

        /* compiled from: TimeSlot.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/service_booking_calendar/data/model/TimeSlot$ActiveTimeSlot$a;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_service-booking-calendar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            @c(TooltipAttribute.PARAM_DEEP_LINK)
            @k
            private final DeepLink uri;

            public a(@k DeepLink deepLink) {
                this.uri = deepLink;
            }

            @k
            /* renamed from: a, reason: from getter */
            public final DeepLink getUri() {
                return this.uri;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.uri, ((a) obj).uri);
            }

            public final int hashCode() {
                return this.uri.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("Action(uri="), this.uri, ')');
            }
        }

        /* compiled from: TimeSlot.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/service_booking_calendar/data/model/TimeSlot$ActiveTimeSlot$b;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_service-booking-calendar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b {

            @c("name")
            @l
            private final String name;

            public b(@l String str) {
                this.name = str;
            }

            @l
            /* renamed from: a, reason: from getter */
            public final String getName() {
                return this.name;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.name, ((b) obj).name);
            }

            public final int hashCode() {
                String str = this.name;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Contacts(name="), this.name, ')');
            }
        }

        public ActiveTimeSlot(@k String str, @k String str2, long j12, long j13, @l Status status, @l List<String> list, @l String str3, @l b bVar, @l a aVar, @l Long l12) {
            this.id = str;
            this.statusText = str2;
            this.timeStart = j12;
            this.duration = j13;
            this.status = status;
            this.serviceNames = list;
            this.totalAmount = str3;
            this.contacts = bVar;
            this.action = aVar;
            this.techBreak = l12;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final a getAction() {
            return this.action;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final b getContacts() {
            return this.contacts;
        }

        /* renamed from: c, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @l
        public final List<String> e() {
            return this.serviceNames;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActiveTimeSlot)) {
                return false;
            }
            ActiveTimeSlot activeTimeSlot = (ActiveTimeSlot) obj;
            return L.f(this.id, activeTimeSlot.id) && L.f(this.statusText, activeTimeSlot.statusText) && this.timeStart == activeTimeSlot.timeStart && this.duration == activeTimeSlot.duration && this.status == activeTimeSlot.status && L.f(this.serviceNames, activeTimeSlot.serviceNames) && L.f(this.totalAmount, activeTimeSlot.totalAmount) && L.f(this.contacts, activeTimeSlot.contacts) && L.f(this.action, activeTimeSlot.action) && L.f(this.techBreak, activeTimeSlot.techBreak);
        }

        @l
        /* renamed from: f, reason: from getter */
        public final Status getStatus() {
            return this.status;
        }

        @k
        /* renamed from: g, reason: from getter */
        public final String getStatusText() {
            return this.statusText;
        }

        @l
        /* renamed from: h, reason: from getter */
        public final Long getTechBreak() {
            return this.techBreak;
        }

        public final int hashCode() {
            int iG2 = r.g(r.g(H.d(this.id.hashCode() * 31, 31, this.statusText), 31, this.timeStart), 31, this.duration);
            Status status = this.status;
            int iHashCode = (iG2 + (status == null ? 0 : status.hashCode())) * 31;
            List<String> list = this.serviceNames;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.totalAmount;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            b bVar = this.contacts;
            int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            a aVar = this.action;
            int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            Long l12 = this.techBreak;
            return iHashCode5 + (l12 != null ? l12.hashCode() : 0);
        }

        /* renamed from: i, reason: from getter */
        public final long getTimeStart() {
            return this.timeStart;
        }

        @l
        /* renamed from: j, reason: from getter */
        public final String getTotalAmount() {
            return this.totalAmount;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActiveTimeSlot(id=");
            sb2.append(this.id);
            sb2.append(", statusText=");
            sb2.append(this.statusText);
            sb2.append(", timeStart=");
            sb2.append(this.timeStart);
            sb2.append(", duration=");
            sb2.append(this.duration);
            sb2.append(", status=");
            sb2.append(this.status);
            sb2.append(", serviceNames=");
            sb2.append(this.serviceNames);
            sb2.append(", totalAmount=");
            sb2.append(this.totalAmount);
            sb2.append(", contacts=");
            sb2.append(this.contacts);
            sb2.append(", action=");
            sb2.append(this.action);
            sb2.append(", techBreak=");
            return m.m(sb2, this.techBreak, ')');
        }
    }

    /* compiled from: TimeSlot.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/service_booking_calendar/data/model/TimeSlot$a;", "Lcom/avito/android/service_booking_calendar/data/model/TimeSlot;", "", "timeStart", "duration", "<init>", "(JJ)V", "J", "b", "()J", "a", "_avito_service-booking-calendar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements TimeSlot {

        @c("duration")
        private final long duration;

        @c("timeStart")
        private final long timeStart;

        public a(long j12, long j13) {
            this.timeStart = j12;
            this.duration = j13;
        }

        /* renamed from: a, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        /* renamed from: b, reason: from getter */
        public final long getTimeStart() {
            return this.timeStart;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.timeStart == aVar.timeStart && this.duration == aVar.duration;
        }

        public final int hashCode() {
            return Long.hashCode(this.duration) + (Long.hashCode(this.timeStart) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InactiveTimeSlot(timeStart=");
            sb2.append(this.timeStart);
            sb2.append(", duration=");
            return r.u(sb2, this.duration, ')');
        }
    }
}
