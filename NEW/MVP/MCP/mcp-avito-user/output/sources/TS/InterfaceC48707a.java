package ts;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CpxPromoGeoAction.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lts/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "Lts/a$a;", "Lts/a$b;", "Lts/a$c;", "Lts/a$d;", "Lts/a$e;", "Lts/a$f;", "Lts/a$g;", "Lts/a$h;", "Lts/a$i;", "Lts/a$j;", "Lts/a$k;", "Lts/a$l;", "Lts/a$m;", "Lts/a$n;", "Lts/a$o;", "Lts/a$p;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ts.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC48707a {

    /* compiled from: CpxPromoGeoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lts/a$a;", "Lts/a;", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12684a implements InterfaceC48707a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C12684a f439464a = new C12684a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C12684a);
        }

        public final int hashCode() {
            return 1256771571;
        }

        @Y61.k
        public final String toString() {
            return "CloseResetDialog";
        }
    }

    /* compiled from: CpxPromoGeoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/a$b;", "Lts/a;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.a$b */
    public static final /* data */ class b implements InterfaceC48707a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f439465a;

        public b(@Y61.k DeepLink deepLink) {
            this.f439465a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f439465a, ((b) obj).f439465a);
        }

        public final int hashCode() {
            return this.f439465a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnChooseLocationClicked(deeplink="), this.f439465a, ')');
        }
    }

    /* compiled from: CpxPromoGeoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/a$c;", "Lts/a;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.a$c */
    public static final /* data */ class c implements InterfaceC48707a {

        /* renamed from: a, reason: collision with root package name */
        public final long f439466a;

        public c(long j12) {
            this.f439466a = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f439466a == ((c) obj).f439466a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f439466a);
        }

        @Y61.k
        public final String toString() {
            return r.u(new StringBuilder("OnClearLimitClicked(locationId="), this.f439466a, ')');
        }
    }

    /* compiled from: CpxPromoGeoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/a$d;", "Lts/a;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.a$d */
    public static final /* data */ class d implements InterfaceC48707a {

        /* renamed from: a, reason: collision with root package name */
        public final int f439467a;

        public d(int i12) {
            this.f439467a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f439467a == ((d) obj).f439467a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f439467a);
        }

        @Y61.k
        public final String toString() {
            return r.t(new StringBuilder("OnDayCountClicked(position="), this.f439467a, ')');
        }
    }

    /* compiled from: CpxPromoGeoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/a$e;", "Lts/a;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.a$e */
    public static final /* data */ class e implements InterfaceC48707a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f439468a;

        public e(@Y61.k DeepLink deepLink) {
            this.f439468a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f439468a, ((e) obj).f439468a);
        }

        public final int hashCode() {
            return this.f439468a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnDeeplinkClicked(deeplink="), this.f439468a, ')');
        }
    }

    /* compiled from: CpxPromoGeoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lts/a$f;", "Lts/a;", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.a$f */
    public static final /* data */ class f implements InterfaceC48707a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f439469a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -262788807;
        }

        @Y61.k
        public final String toString() {
            return "OnInputDone";
        }
    }

    /* compiled from: CpxPromoGeoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/a$g;", "Lts/a;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.a$g */
    public static final /* data */ class g implements InterfaceC48707a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f439470a;

        /* renamed from: b, reason: collision with root package name */
        public final long f439471b;

        public g(@Y61.k String str, long j12) {
            this.f439470a = str;
            this.f439471b = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f439470a, gVar.f439470a) && this.f439471b == gVar.f439471b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f439471b) + (this.f439470a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnLocationSettingQueryLimitChanged(query=");
            sb2.append(this.f439470a);
            sb2.append(", locationId=");
            return r.u(sb2, this.f439471b, ')');
        }
    }

    /* compiled from: CpxPromoGeoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lts/a$j;", "Lts/a;", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.a$j */
    public static final /* data */ class j implements InterfaceC48707a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f439480a = new j();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -2025791189;
        }

        @Y61.k
        public final String toString() {
            return "OnNavBarIconClicked";
        }
    }

    /* compiled from: CpxPromoGeoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lts/a$k;", "Lts/a;", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.a$k */
    public static final /* data */ class k implements InterfaceC48707a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f439481a = new k();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -825054560;
        }

        @Y61.k
        public final String toString() {
            return "OnRetryButtonClicked";
        }
    }

    /* compiled from: CpxPromoGeoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lts/a$l;", "Lts/a;", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.a$l */
    public static final /* data */ class l implements InterfaceC48707a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final l f439482a = new l();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 1818654693;
        }

        @Y61.k
        public final String toString() {
            return "OnSaveButtonClicked";
        }
    }

    /* compiled from: CpxPromoGeoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/a$m;", "Lts/a;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.a$m */
    public static final /* data */ class m implements InterfaceC48707a {

        /* renamed from: a, reason: collision with root package name */
        public final int f439483a;

        public m(int i12) {
            this.f439483a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.f439483a == ((m) obj).f439483a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f439483a);
        }

        @Y61.k
        public final String toString() {
            return r.t(new StringBuilder("OnSegmentClicked(index="), this.f439483a, ')');
        }
    }

    /* compiled from: CpxPromoGeoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/a$n;", "Lts/a;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.a$n */
    public static final /* data */ class n implements InterfaceC48707a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f439484a;

        public n(boolean z12) {
            this.f439484a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f439484a == ((n) obj).f439484a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f439484a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("OnToggleClicked(isToggleEnabled="), this.f439484a, ')');
        }
    }

    /* compiled from: CpxPromoGeoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lts/a$o;", "Lts/a;", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.a$o */
    public static final /* data */ class o implements InterfaceC48707a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final o f439485a = new o();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 1495858277;
        }

        @Y61.k
        public final String toString() {
            return "ResetPrices";
        }
    }

    /* compiled from: CpxPromoGeoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lts/a$p;", "Lts/a;", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.a$p */
    public static final /* data */ class p implements InterfaceC48707a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final p f439486a = new p();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return -1128159194;
        }

        @Y61.k
        public final String toString() {
            return "ShowResetDialog";
        }
    }

    /* compiled from: CpxPromoGeoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/a$h;", "Lts/a;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.a$h */
    public static final /* data */ class h implements InterfaceC48707a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f439472a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Long f439473b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f439474c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f439475d;

        public h(@Y61.k String str, @Y61.l Long l12, boolean z12, @Y61.l String str2) {
            this.f439472a = str;
            this.f439473b = l12;
            this.f439474c = z12;
            this.f439475d = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f439472a, hVar.f439472a) && L.f(this.f439473b, hVar.f439473b) && this.f439474c == hVar.f439474c && L.f(this.f439475d, hVar.f439475d);
        }

        public final int hashCode() {
            int iHashCode = this.f439472a.hashCode() * 31;
            Long l12 = this.f439473b;
            int i12 = r.i((iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31, 31, this.f439474c);
            String str = this.f439475d;
            return i12 + (str != null ? str.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnLocationSettingQueryPriceChanged(query=");
            sb2.append(this.f439472a);
            sb2.append(", locationId=");
            sb2.append(this.f439473b);
            sb2.append(", isManual=");
            sb2.append(this.f439474c);
            sb2.append(", day=");
            return C22026a.c(sb2, this.f439475d, ')');
        }

        public /* synthetic */ h(String str, Long l12, boolean z12, String str2, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : l12, z12, (i12 & 8) != 0 ? null : str2);
        }
    }

    /* compiled from: CpxPromoGeoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/a$i;", "Lts/a;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.a$i */
    public static final /* data */ class i implements InterfaceC48707a {

        /* renamed from: a, reason: collision with root package name */
        public final float f439476a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Long f439477b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f439478c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f439479d;

        public i(float f12, @Y61.l Long l12, boolean z12, @Y61.l String str) {
            this.f439476a = f12;
            this.f439477b = l12;
            this.f439478c = z12;
            this.f439479d = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Float.compare(this.f439476a, iVar.f439476a) == 0 && L.f(this.f439477b, iVar.f439477b) && this.f439478c == iVar.f439478c && L.f(this.f439479d, iVar.f439479d);
        }

        public final int hashCode() {
            int iHashCode = Float.hashCode(this.f439476a) * 31;
            Long l12 = this.f439477b;
            int i12 = r.i((iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31, 31, this.f439478c);
            String str = this.f439479d;
            return i12 + (str != null ? str.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnLocationSettingSliderPriceChanged(value=");
            sb2.append(this.f439476a);
            sb2.append(", locationId=");
            sb2.append(this.f439477b);
            sb2.append(", isManual=");
            sb2.append(this.f439478c);
            sb2.append(", day=");
            return C22026a.c(sb2, this.f439479d, ')');
        }

        public /* synthetic */ i(float f12, Long l12, boolean z12, String str, int i12, C42822w c42822w) {
            this(f12, (i12 & 2) != 0 ? null : l12, z12, (i12 & 8) != 0 ? null : str);
        }
    }
}
