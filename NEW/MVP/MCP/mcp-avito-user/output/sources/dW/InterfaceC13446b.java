package Dw;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.domain.GetDealRoomInfoResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DealRoomDevelopmentInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LDw/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "LDw/b$a;", "LDw/b$b;", "LDw/b$c;", "LDw/b$d;", "LDw/b$e;", "LDw/b$f;", "LDw/b$g;", "LDw/b$h;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Dw.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC13446b {

    /* compiled from: DealRoomDevelopmentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDw/b$a;", "LDw/b;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dw.b$a */
    public static final /* data */ class a implements InterfaceC13446b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f3528a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1047765122;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: DealRoomDevelopmentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDw/b$b;", "LDw/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dw.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0203b implements InterfaceC13446b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final GetDealRoomInfoResponse.Deal.SelectionHistory.Item f3529a;

        public C0203b(@k GetDealRoomInfoResponse.Deal.SelectionHistory.Item item) {
            this.f3529a = item;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0203b) && L.f(this.f3529a, ((C0203b) obj).f3529a);
        }

        public final int hashCode() {
            return this.f3529a.hashCode();
        }

        @k
        public final String toString() {
            return "Init(developmentItem=" + this.f3529a + ')';
        }
    }

    /* compiled from: DealRoomDevelopmentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDw/b$c;", "LDw/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dw.b$c */
    public static final /* data */ class c implements InterfaceC13446b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f3530a;

        public c(@k String str) {
            this.f3530a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f3530a, ((c) obj).f3530a);
        }

        public final int hashCode() {
            return this.f3530a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowAgencyCommissionTooltip(tooltipText="), this.f3530a, ')');
        }
    }

    /* compiled from: DealRoomDevelopmentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDw/b$d;", "LDw/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dw.b$d */
    public static final /* data */ class d implements InterfaceC13446b {

        /* renamed from: a, reason: collision with root package name */
        public final long f3531a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f3532b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3533c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Double f3534d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Double f3535e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f3536f;

        public d(long j12, @k String str, int i12, @l Double d12, @l Double d13, @k String str2) {
            this.f3531a = j12;
            this.f3532b = str;
            this.f3533c = i12;
            this.f3534d = d12;
            this.f3535e = d13;
            this.f3536f = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f3531a == dVar.f3531a && L.f(this.f3532b, dVar.f3532b) && this.f3533c == dVar.f3533c && L.f(this.f3534d, dVar.f3534d) && L.f(this.f3535e, dVar.f3535e) && L.f(this.f3536f, dVar.f3536f);
        }

        public final int hashCode() {
            int iE2 = r.e(this.f3533c, H.d(Long.hashCode(this.f3531a) * 31, 31, this.f3532b), 31);
            Double d12 = this.f3534d;
            int iHashCode = (iE2 + (d12 == null ? 0 : d12.hashCode())) * 31;
            Double d13 = this.f3535e;
            return this.f3536f.hashCode() + ((iHashCode + (d13 != null ? d13.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowAgencySearchScreen(developmentId=");
            sb2.append(this.f3531a);
            sb2.append(", developmentName=");
            sb2.append(this.f3532b);
            sb2.append(", locationId=");
            sb2.append(this.f3533c);
            sb2.append(", latitude=");
            sb2.append(this.f3534d);
            sb2.append(", longitude=");
            sb2.append(this.f3535e);
            sb2.append(", clientId=");
            return C22026a.c(sb2, this.f3536f, ')');
        }
    }

    /* compiled from: DealRoomDevelopmentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDw/b$e;", "LDw/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dw.b$e */
    public static final /* data */ class e implements InterfaceC13446b {

        /* renamed from: a, reason: collision with root package name */
        public final long f3537a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f3538b;

        public e(long j12, @k String str) {
            this.f3537a = j12;
            this.f3538b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f3537a == eVar.f3537a && L.f(this.f3538b, eVar.f3538b);
        }

        public final int hashCode() {
            return this.f3538b.hashCode() + (Long.hashCode(this.f3537a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowBookingScreen(lotId=");
            sb2.append(this.f3537a);
            sb2.append(", clientId=");
            return C22026a.c(sb2, this.f3538b, ')');
        }
    }

    /* compiled from: DealRoomDevelopmentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDw/b$f;", "LDw/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dw.b$f */
    public static final /* data */ class f implements InterfaceC13446b {

        /* renamed from: a, reason: collision with root package name */
        public final long f3539a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f3540b;

        public f(long j12, @k String str) {
            this.f3539a = j12;
            this.f3540b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f3539a == fVar.f3539a && L.f(this.f3540b, fVar.f3540b);
        }

        public final int hashCode() {
            return this.f3540b.hashCode() + (Long.hashCode(this.f3539a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowClientFixationScreen(developmentId=");
            sb2.append(this.f3539a);
            sb2.append(", clientId=");
            return C22026a.c(sb2, this.f3540b, ')');
        }
    }

    /* compiled from: DealRoomDevelopmentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDw/b$g;", "LDw/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dw.b$g */
    public static final /* data */ class g implements InterfaceC13446b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f3541a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f3542b;

        public g(@k String str, @k String str2) {
            this.f3541a = str;
            this.f3542b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f3541a, gVar.f3541a) && L.f(this.f3542b, gVar.f3542b);
        }

        public final int hashCode() {
            return this.f3542b.hashCode() + (this.f3541a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowDealCabinetScreen(locationId=");
            sb2.append(this.f3541a);
            sb2.append(", parentScreen=");
            return C22026a.c(sb2, this.f3542b, ')');
        }
    }

    /* compiled from: DealRoomDevelopmentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDw/b$h;", "LDw/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dw.b$h */
    public static final /* data */ class h implements InterfaceC13446b {

        /* renamed from: a, reason: collision with root package name */
        public final long f3543a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f3544b;

        public h(long j12, @k String str) {
            this.f3543a = j12;
            this.f3544b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f3543a == hVar.f3543a && L.f(this.f3544b, hVar.f3544b);
        }

        public final int hashCode() {
            return this.f3544b.hashCode() + (Long.hashCode(this.f3543a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowDevelopmentCardScreen(developmentId=");
            sb2.append(this.f3543a);
            sb2.append(", clientId=");
            return C22026a.c(sb2, this.f3544b, ')');
        }
    }
}
