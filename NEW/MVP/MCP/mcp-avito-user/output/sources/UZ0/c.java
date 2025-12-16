package Uz0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersCalendarOneTimeEvent.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"LUz0/c;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "LUz0/c$a;", "LUz0/c$b;", "LUz0/c$c;", "LUz0/c$d;", "LUz0/c$e;", "LUz0/c$f;", "LUz0/c$g;", "LUz0/c$h;", "LUz0/c$i;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface c {

    /* compiled from: StrOrdersCalendarOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUz0/c$a;", "LUz0/c;", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f16840a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1067448213;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: StrOrdersCalendarOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUz0/c$b;", "LUz0/c;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f16841a;

        public b(@k DeepLink deepLink) {
            this.f16841a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f16841a, ((b) obj).f16841a);
        }

        public final int hashCode() {
            return this.f16841a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f16841a, ')');
        }
    }

    /* compiled from: StrOrdersCalendarOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUz0/c$c;", "LUz0/c;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Uz0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C1158c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f16842a;

        public C1158c(@k String str) {
            this.f16842a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1158c) && L.f(this.f16842a, ((C1158c) obj).f16842a);
        }

        public final int hashCode() {
            return this.f16842a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenMonthSelector(currentMonthId="), this.f16842a, ')');
        }
    }

    /* compiled from: StrOrdersCalendarOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUz0/c$d;", "LUz0/c;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f16843a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Date f16844b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Date f16845c;

        public d(@k String str, @l Date date, @l Date date2) {
            this.f16843a = str;
            this.f16844b = date;
            this.f16845c = date2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f16843a, dVar.f16843a) && L.f(this.f16844b, dVar.f16844b) && L.f(this.f16845c, dVar.f16845c);
        }

        public final int hashCode() {
            int iHashCode = this.f16843a.hashCode() * 31;
            Date date = this.f16844b;
            int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
            Date date2 = this.f16845c;
            return iHashCode2 + (date2 != null ? date2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenSellerCalendarScreen(itemId=");
            sb2.append(this.f16843a);
            sb2.append(", startDate=");
            sb2.append(this.f16844b);
            sb2.append(", endDate=");
            return com.avito.android.bxcontent.mvi.entity.f.n(sb2, this.f16845c, ')');
        }
    }

    /* compiled from: StrOrdersCalendarOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUz0/c$e;", "LUz0/c;", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f16846a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -2002911584;
        }

        @k
        public final String toString() {
            return "RotateScreen";
        }
    }

    /* compiled from: StrOrdersCalendarOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUz0/c$f;", "LUz0/c;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements c {

        /* renamed from: a, reason: collision with root package name */
        public final int f16847a;

        public f(int i12) {
            this.f16847a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f16847a == ((f) obj).f16847a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f16847a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollToHorizontalPosition(position="), this.f16847a, ')');
        }
    }

    /* compiled from: StrOrdersCalendarOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUz0/c$g;", "LUz0/c;", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f16848a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -732439396;
        }

        @k
        public final String toString() {
            return "ShowBookingsLoadingError";
        }
    }

    /* compiled from: StrOrdersCalendarOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUz0/c$h;", "LUz0/c;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SK0.f f16849a;

        public h(@k SK0.f fVar) {
            this.f16849a = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f16849a, ((h) obj).f16849a);
        }

        public final int hashCode() {
            return this.f16849a.f14906a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowUxFeedback(properties=" + this.f16849a + ')';
        }
    }

    /* compiled from: StrOrdersCalendarOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUz0/c$i;", "LUz0/c;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f16850a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f16851b;

        public i(@k PrintableText printableText, boolean z12) {
            this.f16850a = z12;
            this.f16851b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f16850a == iVar.f16850a && this.f16851b.equals(iVar.f16851b);
        }

        public final int hashCode() {
            return this.f16851b.hashCode() + (Boolean.hashCode(this.f16850a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ToggleFlatRecyclerCollapse(isCollapsed=");
            sb2.append(this.f16850a);
            sb2.append(", rotationButtonText=");
            return AK.c.m(sb2, this.f16851b, ')');
        }
    }
}
