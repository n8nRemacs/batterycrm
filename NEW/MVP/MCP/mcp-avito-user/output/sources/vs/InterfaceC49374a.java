package vs;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RegionSheetAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lvs/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "Lvs/a$a;", "Lvs/a$b;", "Lvs/a$c;", "Lvs/a$d;", "Lvs/a$e;", "Lvs/a$f;", "Lvs/a$g;", "Lvs/a$h;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vs.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC49374a {

    /* compiled from: RegionSheetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvs/a$a;", "Lvs/a;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vs.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12794a implements InterfaceC49374a {

        /* renamed from: a, reason: collision with root package name */
        public final long f441006a;

        public C12794a(long j12) {
            this.f441006a = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12794a) && this.f441006a == ((C12794a) obj).f441006a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f441006a);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("ExpandLocation(locationId="), this.f441006a, ')');
        }
    }

    /* compiled from: RegionSheetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvs/a$b;", "Lvs/a;", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vs.a$b */
    public static final /* data */ class b implements InterfaceC49374a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f441007a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2124009107;
        }

        @k
        public final String toString() {
            return "RetrySearch";
        }
    }

    /* compiled from: RegionSheetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvs/a$c;", "Lvs/a;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vs.a$c */
    public static final /* data */ class c implements InterfaceC49374a {

        /* renamed from: a, reason: collision with root package name */
        public final long f441008a;

        public c(long j12) {
            this.f441008a = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f441008a == ((c) obj).f441008a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f441008a);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("RetrySubLoading(locationId="), this.f441008a, ')');
        }
    }

    /* compiled from: RegionSheetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvs/a$d;", "Lvs/a;", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vs.a$d */
    public static final /* data */ class d implements InterfaceC49374a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f441009a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1899632928;
        }

        @k
        public final String toString() {
            return "Save";
        }
    }

    /* compiled from: RegionSheetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvs/a$e;", "Lvs/a;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vs.a$e */
    public static final /* data */ class e implements InterfaceC49374a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f441010a;

        public e(@k String str) {
            this.f441010a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f441010a, ((e) obj).f441010a);
        }

        public final int hashCode() {
            return this.f441010a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SearchInputChange(query="), this.f441010a, ')');
        }
    }

    /* compiled from: RegionSheetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvs/a$f;", "Lvs/a;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vs.a$f */
    public static final /* data */ class f implements InterfaceC49374a {

        /* renamed from: a, reason: collision with root package name */
        public final long f441011a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Long f441012b;

        public f(long j12, @l Long l12) {
            this.f441011a = j12;
            this.f441012b = l12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f441011a == fVar.f441011a && L.f(this.f441012b, fVar.f441012b);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f441011a) * 31;
            Long l12 = this.f441012b;
            return iHashCode + (l12 == null ? 0 : l12.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectLocation(parentLocationId=");
            sb2.append(this.f441011a);
            sb2.append(", childLocationId=");
            return m.m(sb2, this.f441012b, ')');
        }

        public /* synthetic */ f(long j12, Long l12, int i12, C42822w c42822w) {
            this(j12, (i12 & 2) != 0 ? null : l12);
        }
    }

    /* compiled from: RegionSheetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvs/a$g;", "Lvs/a;", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vs.a$g */
    public static final /* data */ class g implements InterfaceC49374a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f441013a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 707388341;
        }

        @k
        public final String toString() {
            return "SelectRootRegion";
        }
    }

    /* compiled from: RegionSheetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvs/a$h;", "Lvs/a;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vs.a$h */
    public static final /* data */ class h implements InterfaceC49374a {

        /* renamed from: a, reason: collision with root package name */
        public final long f441014a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Long f441015b;

        public h(long j12, @l Long l12) {
            this.f441014a = j12;
            this.f441015b = l12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f441014a == hVar.f441014a && L.f(this.f441015b, hVar.f441015b);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f441014a) * 31;
            Long l12 = this.f441015b;
            return iHashCode + (l12 == null ? 0 : l12.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectSearchLocation(parentLocationId=");
            sb2.append(this.f441014a);
            sb2.append(", childLocationId=");
            return m.m(sb2, this.f441015b, ')');
        }

        public /* synthetic */ h(long j12, Long l12, int i12, C42822w c42822w) {
            this(j12, (i12 & 2) != 0 ? null : l12);
        }
    }
}
