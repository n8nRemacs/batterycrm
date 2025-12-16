package py0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.str_calendar.common.models.DateRange;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingCalendarOneTimeEvent.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lpy0/b;", "", "a", "b", "c", "d", "e", "f", "g", "Lpy0/b$a;", "Lpy0/b$b;", "Lpy0/b$c;", "Lpy0/b$d;", "Lpy0/b$e;", "Lpy0/b$f;", "Lpy0/b$g;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: py0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC47165b {

    /* compiled from: StrBookingCalendarOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpy0/b$a;", "Lpy0/b;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: py0.b$a */
    public static final /* data */ class a implements InterfaceC47165b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f428902a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 276354093;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: StrBookingCalendarOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpy0/b$b;", "Lpy0/b;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: py0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12298b implements InterfaceC47165b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12298b f428903a = new C12298b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12298b);
        }

        public final int hashCode() {
            return 1012980116;
        }

        @k
        public final String toString() {
            return "HideRestrictionToast";
        }
    }

    /* compiled from: StrBookingCalendarOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpy0/b$c;", "Lpy0/b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: py0.b$c */
    public static final /* data */ class c implements InterfaceC47165b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Date f428904a;

        public c(@k Date date) {
            this.f428904a = date;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f428904a, ((c) obj).f428904a);
        }

        public final int hashCode() {
            return this.f428904a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.bxcontent.mvi.entity.f.n(new StringBuilder("PassClickedDate(date="), this.f428904a, ')');
        }
    }

    /* compiled from: StrBookingCalendarOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpy0/b$d;", "Lpy0/b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: py0.b$d */
    public static final /* data */ class d implements InterfaceC47165b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DateRange f428905a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f428906b;

        public d(@k DateRange dateRange, @l String str) {
            this.f428905a = dateRange;
            this.f428906b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f428905a, dVar.f428905a) && L.f(this.f428906b, dVar.f428906b);
        }

        public final int hashCode() {
            int iHashCode = this.f428905a.hashCode() * 31;
            String str = this.f428906b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PassSelectedDates(selectedDateRange=");
            sb2.append(this.f428905a);
            sb2.append(", requestId=");
            return C22026a.c(sb2, this.f428906b, ')');
        }
    }

    /* compiled from: StrBookingCalendarOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpy0/b$e;", "Lpy0/b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: py0.b$e */
    public static final /* data */ class e implements InterfaceC47165b {

        /* renamed from: a, reason: collision with root package name */
        public final int f428907a;

        public e(int i12) {
            this.f428907a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f428907a == ((e) obj).f428907a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f428907a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollToPosition(position="), this.f428907a, ')');
        }
    }

    /* compiled from: StrBookingCalendarOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpy0/b$f;", "Lpy0/b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: py0.b$f */
    public static final /* data */ class f implements InterfaceC47165b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f428908a;

        public f(@k String str) {
            this.f428908a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f428908a, ((f) obj).f428908a);
        }

        public final int hashCode() {
            return this.f428908a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowRestrictionToast(message="), this.f428908a, ')');
        }
    }

    /* compiled from: StrBookingCalendarOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpy0/b$g;", "Lpy0/b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: py0.b$g */
    public static final /* data */ class g implements InterfaceC47165b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f428909a;

        public g(@k String str) {
            this.f428909a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f428909a, ((g) obj).f428909a);
        }

        public final int hashCode() {
            return this.f428909a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowValidationDialog(validationErrorText="), this.f428909a, ')');
        }
    }
}
