package com.avito.android.str_calendar.seller.core;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.StrSellerCalendarRejectInfo;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import com.avito.android.str_calendar.common.models.UpdatedParametersInfo;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerCalendarCoreRouterEvent.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/str_calendar/seller/core/d;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "Lcom/avito/android/str_calendar/seller/core/d$a;", "Lcom/avito/android/str_calendar/seller/core/d$b;", "Lcom/avito/android/str_calendar/seller/core/d$c;", "Lcom/avito/android/str_calendar/seller/core/d$d;", "Lcom/avito/android/str_calendar/seller/core/d$e;", "Lcom/avito/android/str_calendar/seller/core/d$f;", "Lcom/avito/android/str_calendar/seller/core/d$g;", "Lcom/avito/android/str_calendar/seller/core/d$h;", "Lcom/avito/android/str_calendar/seller/core/d$i;", "Lcom/avito/android/str_calendar/seller/core/d$j;", "Lcom/avito/android/str_calendar/seller/core/d$k;", "Lcom/avito/android/str_calendar/seller/core/d$l;", "Lcom/avito/android/str_calendar/seller/core/d$m;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface d {

    /* compiled from: StrSellerCalendarCoreRouterEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/core/d$a;", "Lcom/avito/android/str_calendar/seller/core/d;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {
        static {
            new a();
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1223851179;
        }

        @Y61.k
        public final String toString() {
            return "CloseRefundFlow";
        }
    }

    /* compiled from: StrSellerCalendarCoreRouterEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/core/d$b;", "Lcom/avito/android/str_calendar/seller/core/d;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f287805a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 846457154;
        }

        @Y61.k
        public final String toString() {
            return "CloseSellerCalendar";
        }
    }

    /* compiled from: StrSellerCalendarCoreRouterEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/core/d$c;", "Lcom/avito/android/str_calendar/seller/core/d;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f287806a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final UpdatedParametersInfo f287807b;

        public c(boolean z12, @Y61.l UpdatedParametersInfo updatedParametersInfo) {
            this.f287806a = z12;
            this.f287807b = updatedParametersInfo;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f287806a == cVar.f287806a && L.f(this.f287807b, cVar.f287807b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f287806a) * 31;
            UpdatedParametersInfo updatedParametersInfo = this.f287807b;
            return iHashCode + (updatedParametersInfo == null ? 0 : updatedParametersInfo.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "LeaveEditParametersScreen(updateCalendar=" + this.f287806a + ", updatedParametersInfo=" + this.f287807b + ')';
        }
    }

    /* compiled from: StrSellerCalendarCoreRouterEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/core/d$d;", "Lcom/avito/android/str_calendar/seller/core/d;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.str_calendar.seller.core.d$d, reason: collision with other inner class name */
    public static final /* data */ class C8643d implements d {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f287808a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final UpdatedParametersInfo f287809b;

        public C8643d(boolean z12, @Y61.l UpdatedParametersInfo updatedParametersInfo) {
            this.f287808a = z12;
            this.f287809b = updatedParametersInfo;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8643d)) {
                return false;
            }
            C8643d c8643d = (C8643d) obj;
            return this.f287808a == c8643d.f287808a && L.f(this.f287809b, c8643d.f287809b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f287808a) * 31;
            UpdatedParametersInfo updatedParametersInfo = this.f287809b;
            return iHashCode + (updatedParametersInfo == null ? 0 : updatedParametersInfo.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "LeaveLastMinuteOfferScreen(updateCalendar=" + this.f287808a + ", updatedParametersInfo=" + this.f287809b + ')';
        }
    }

    /* compiled from: StrSellerCalendarCoreRouterEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/core/d$e;", "Lcom/avito/android/str_calendar/seller/core/d;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements d {
        static {
            new e();
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1778420921;
        }

        @Y61.k
        public final String toString() {
            return "LeaveRefundRulesScreen";
        }
    }

    /* compiled from: StrSellerCalendarCoreRouterEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/core/d$f;", "Lcom/avito/android/str_calendar/seller/core/d;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements d {
        static {
            new f();
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 681386219;
        }

        @Y61.k
        public final String toString() {
            return "LeaveRefundSettingsScreen";
        }
    }

    /* compiled from: StrSellerCalendarCoreRouterEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/core/d$g;", "Lcom/avito/android/str_calendar/seller/core/d;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f287810a = new g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1222494769;
        }

        @Y61.k
        public final String toString() {
            return "LeaveRejectScreen";
        }
    }

    /* compiled from: StrSellerCalendarCoreRouterEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/core/d$h;", "Lcom/avito/android/str_calendar/seller/core/d;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f287811a;

        public h(@Y61.k String str) {
            this.f287811a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f287811a, ((h) obj).f287811a);
        }

        public final int hashCode() {
            return this.f287811a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenUrl(url="), this.f287811a, ')');
        }
    }

    /* compiled from: StrSellerCalendarCoreRouterEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/core/d$i;", "Lcom/avito/android/str_calendar/seller/core/d;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f287812a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Date f287813b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Date f287814c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f287815d;

        public i(@Y61.k String str, @Y61.l Date date, @Y61.l Date date2, boolean z12) {
            this.f287812a = str;
            this.f287813b = date;
            this.f287814c = date2;
            this.f287815d = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f287812a, iVar.f287812a) && L.f(this.f287813b, iVar.f287813b) && L.f(this.f287814c, iVar.f287814c) && this.f287815d == iVar.f287815d;
        }

        public final int hashCode() {
            int iHashCode = this.f287812a.hashCode() * 31;
            Date date = this.f287813b;
            int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
            Date date2 = this.f287814c;
            return Boolean.hashCode(this.f287815d) + ((iHashCode2 + (date2 != null ? date2.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowCalendarParameterScreen(advertId=");
            sb2.append(this.f287812a);
            sb2.append(", startDate=");
            sb2.append(this.f287813b);
            sb2.append(", endDate=");
            sb2.append(this.f287814c);
            sb2.append(", shouldCloseFlowAfterApply=");
            return r.x(sb2, this.f287815d, ')');
        }
    }

    /* compiled from: StrSellerCalendarCoreRouterEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/core/d$j;", "Lcom/avito/android/str_calendar/seller/core/d;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f287816a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final SelectedDateRange f287817b;

        public j(@Y61.k String str, @Y61.l SelectedDateRange selectedDateRange) {
            this.f287816a = str;
            this.f287817b = selectedDateRange;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return L.f(this.f287816a, jVar.f287816a) && L.f(this.f287817b, jVar.f287817b);
        }

        public final int hashCode() {
            int iHashCode = this.f287816a.hashCode() * 31;
            SelectedDateRange selectedDateRange = this.f287817b;
            return iHashCode + (selectedDateRange == null ? 0 : selectedDateRange.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "ShowLastMinuteOffer(advertId=" + this.f287816a + ", selectedDateRange=" + this.f287817b + ')';
        }
    }

    /* compiled from: StrSellerCalendarCoreRouterEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/core/d$k;", "Lcom/avito/android/str_calendar/seller/core/d;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final StrSellerCalendarRejectInfo f287818a;

        public k(@Y61.k StrSellerCalendarRejectInfo strSellerCalendarRejectInfo) {
            this.f287818a = strSellerCalendarRejectInfo;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f287818a, ((k) obj).f287818a);
        }

        public final int hashCode() {
            return this.f287818a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowRejectInfoScreen(rejectInfo=" + this.f287818a + ')';
        }
    }

    /* compiled from: StrSellerCalendarCoreRouterEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/core/d$l;", "Lcom/avito/android/str_calendar/seller/core/d;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f287819a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f287820b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f287821c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f287822d;

        public l(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, boolean z12) {
            this.f287819a = str;
            this.f287820b = str2;
            this.f287821c = str3;
            this.f287822d = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return L.f(this.f287819a, lVar.f287819a) && L.f(this.f287820b, lVar.f287820b) && L.f(this.f287821c, lVar.f287821c) && this.f287822d == lVar.f287822d;
        }

        public final int hashCode() {
            int iHashCode = this.f287819a.hashCode() * 31;
            String str = this.f287820b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f287821c;
            return Boolean.hashCode(this.f287822d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowSellerCalendar(advertId=");
            sb2.append(this.f287819a);
            sb2.append(", firstSelectedDate=");
            sb2.append(this.f287820b);
            sb2.append(", lastSelectedDate=");
            sb2.append(this.f287821c);
            sb2.append(", shouldCloseFlowAfterApply=");
            return r.x(sb2, this.f287822d, ')');
        }
    }

    /* compiled from: StrSellerCalendarCoreRouterEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/core/d$m;", "Lcom/avito/android/str_calendar/seller/core/d;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SK0.f f287823a;

        public m(@Y61.k SK0.f fVar) {
            this.f287823a = fVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && L.f(this.f287823a, ((m) obj).f287823a);
        }

        public final int hashCode() {
            return this.f287823a.f14906a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowUxFeedback(properties=" + this.f287823a + ')';
        }
    }
}
