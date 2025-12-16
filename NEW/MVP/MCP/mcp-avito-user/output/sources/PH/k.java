package pH;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.gig.slot_impl.generated.api.slot_v_7.RouteDetail;
import com.avito.android.gig.slot_impl.generated.api.slot_v_7.SlotInfo;
import com.avito.android.gig.slot_impl.generated.api.slot_v_7.SlotInfoV2;
import com.avito.android.gig.slot_impl.generated.api.slot_v_7.SlotWarningV3;
import com.avito.android.gig.slot_impl.generated.api.slot_v_7.SupportButtonV4;
import com.avito.android.gig.slot_impl.generated.api.slot_v_7.Timer;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GigSlotInternalAction.kt */
@P
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"LpH/k;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "LpH/k$a;", "LpH/k$b;", "LpH/k$c;", "LpH/k$d;", "LpH/k$e;", "LpH/k$f;", "LpH/k$g;", "LpH/k$h;", "LpH/k$i;", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class k {

    /* compiled from: GigSlotInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpH/k$a;", "LpH/k;", "<init>", "()V", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f428376a = new a();

        public a() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -270189697;
        }

        @Y61.k
        public final String toString() {
            return "ConfirmError";
        }
    }

    /* compiled from: GigSlotInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpH/k$b;", "LpH/k;", "<init>", "()V", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f428377a = new b();

        public b() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -138622733;
        }

        @Y61.k
        public final String toString() {
            return "ConfirmLoading";
        }
    }

    /* compiled from: GigSlotInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpH/k$c;", "LpH/k;", "<init>", "()V", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f428378a = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1952524218;
        }

        @Y61.k
        public final String toString() {
            return "ConfirmSuccess";
        }
    }

    /* compiled from: GigSlotInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/k$d;", "LpH/k;", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final LG.n f428379a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final LG.n f428380b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final LG.c f428381c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final LG.d f428382d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f428383e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f428384f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final LG.e f428385g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final SlotWarningV3 f428386h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final String f428387i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final String f428388j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final LG.m f428389k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public final SlotInfo f428390l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public final SlotInfoV2 f428391m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        public final SupportButtonV4 f428392n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.l
        public final Timer f428393o;

        /* renamed from: p, reason: collision with root package name */
        @Y61.l
        public final LG.q f428394p;

        /* renamed from: q, reason: collision with root package name */
        @Y61.l
        public final LG.f f428395q;

        /* renamed from: r, reason: collision with root package name */
        @Y61.l
        public final LG.k f428396r;

        /* renamed from: s, reason: collision with root package name */
        @Y61.l
        public final DeepLink f428397s;

        /* renamed from: t, reason: collision with root package name */
        @Y61.l
        public final LG.h f428398t;

        /* renamed from: u, reason: collision with root package name */
        @Y61.l
        public final DeepLink f428399u;

        /* renamed from: v, reason: collision with root package name */
        @Y61.l
        public final RouteDetail f428400v;

        public /* synthetic */ d(LG.n nVar, LG.n nVar2, LG.c cVar, LG.d dVar, String str, String str2, LG.e eVar, SlotWarningV3 slotWarningV3, String str3, String str4, LG.m mVar, SlotInfo slotInfo, SlotInfoV2 slotInfoV2, SupportButtonV4 supportButtonV4, Timer timer, LG.q qVar, LG.f fVar, LG.k kVar, DeepLink deepLink, LG.h hVar, DeepLink deepLink2, RouteDetail routeDetail, int i12, C42822w c42822w) {
            this(nVar, nVar2, cVar, dVar, str, str2, eVar, slotWarningV3, str3, str4, mVar, slotInfo, slotInfoV2, supportButtonV4, timer, qVar, fVar, kVar, (i12 & 262144) != 0 ? null : deepLink, (i12 & 524288) != 0 ? null : hVar, (i12 & 1048576) != 0 ? null : deepLink2, (i12 & 2097152) != 0 ? null : routeDetail);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f428379a, dVar.f428379a) && L.f(this.f428380b, dVar.f428380b) && L.f(this.f428381c, dVar.f428381c) && L.f(this.f428382d, dVar.f428382d) && L.f(this.f428383e, dVar.f428383e) && L.f(this.f428384f, dVar.f428384f) && L.f(this.f428385g, dVar.f428385g) && L.f(this.f428386h, dVar.f428386h) && L.f(this.f428387i, dVar.f428387i) && L.f(this.f428388j, dVar.f428388j) && L.f(this.f428389k, dVar.f428389k) && L.f(this.f428390l, dVar.f428390l) && L.f(this.f428391m, dVar.f428391m) && L.f(this.f428392n, dVar.f428392n) && L.f(this.f428393o, dVar.f428393o) && L.f(this.f428394p, dVar.f428394p) && L.f(this.f428395q, dVar.f428395q) && L.f(this.f428396r, dVar.f428396r) && L.f(this.f428397s, dVar.f428397s) && L.f(this.f428398t, dVar.f428398t) && L.f(this.f428399u, dVar.f428399u) && L.f(this.f428400v, dVar.f428400v);
        }

        public final int hashCode() {
            LG.n nVar = this.f428379a;
            int iHashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
            LG.n nVar2 = this.f428380b;
            int iHashCode2 = (iHashCode + (nVar2 == null ? 0 : nVar2.hashCode())) * 31;
            LG.c cVar = this.f428381c;
            int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            LG.d dVar = this.f428382d;
            int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            String str = this.f428383e;
            int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f428384f;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            LG.e eVar = this.f428385g;
            int iHashCode7 = (iHashCode6 + (eVar == null ? 0 : eVar.hashCode())) * 31;
            SlotWarningV3 slotWarningV3 = this.f428386h;
            int iHashCode8 = (iHashCode7 + (slotWarningV3 == null ? 0 : slotWarningV3.hashCode())) * 31;
            String str3 = this.f428387i;
            int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f428388j;
            int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
            LG.m mVar = this.f428389k;
            int iHashCode11 = (iHashCode10 + (mVar == null ? 0 : mVar.hashCode())) * 31;
            SlotInfo slotInfo = this.f428390l;
            int iHashCode12 = (iHashCode11 + (slotInfo == null ? 0 : slotInfo.hashCode())) * 31;
            SlotInfoV2 slotInfoV2 = this.f428391m;
            int iHashCode13 = (iHashCode12 + (slotInfoV2 == null ? 0 : slotInfoV2.hashCode())) * 31;
            SupportButtonV4 supportButtonV4 = this.f428392n;
            int iHashCode14 = (iHashCode13 + (supportButtonV4 == null ? 0 : supportButtonV4.hashCode())) * 31;
            Timer timer = this.f428393o;
            int iHashCode15 = (iHashCode14 + (timer == null ? 0 : timer.hashCode())) * 31;
            LG.q qVar = this.f428394p;
            int iHashCode16 = (iHashCode15 + (qVar == null ? 0 : qVar.hashCode())) * 31;
            LG.f fVar = this.f428395q;
            int iHashCode17 = (iHashCode16 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            LG.k kVar = this.f428396r;
            int iHashCode18 = (iHashCode17 + (kVar == null ? 0 : kVar.hashCode())) * 31;
            DeepLink deepLink = this.f428397s;
            int iHashCode19 = (iHashCode18 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            LG.h hVar = this.f428398t;
            int iHashCode20 = (iHashCode19 + (hVar == null ? 0 : hVar.hashCode())) * 31;
            DeepLink deepLink2 = this.f428399u;
            int iHashCode21 = (iHashCode20 + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
            RouteDetail routeDetail = this.f428400v;
            return iHashCode21 + (routeDetail != null ? routeDetail.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "ContentLoaded(actionButtons=" + this.f428379a + ", confirmButtons=" + this.f428380b + ", documents=" + this.f428381c + ", duties=" + this.f428382d + ", gigerEndTime=" + this.f428383e + ", gigerStartTime=" + this.f428384f + ", header=" + this.f428385g + ", notification=" + this.f428386h + ", requirements=" + this.f428387i + ", route=" + this.f428388j + ", shiftInfo=" + this.f428389k + ", slotInfo=" + this.f428390l + ", slotInfoV2=" + this.f428391m + ", supportButton=" + this.f428392n + ", timer=" + this.f428393o + ", requisitesButton=" + this.f428394p + ", mapView=" + this.f428395q + ", tutorialsBanner=" + this.f428396r + ", paymentBannerDeeplink=" + this.f428397s + ", paymentInfo=" + this.f428398t + ", uxFeedbackDeeplink=" + this.f428399u + ", routeDetail=" + this.f428400v + ')';
        }

        public d(@Y61.l LG.n nVar, @Y61.l LG.n nVar2, @Y61.l LG.c cVar, @Y61.l LG.d dVar, @Y61.l String str, @Y61.l String str2, @Y61.l LG.e eVar, @Y61.l SlotWarningV3 slotWarningV3, @Y61.l String str3, @Y61.l String str4, @Y61.l LG.m mVar, @Y61.l SlotInfo slotInfo, @Y61.l SlotInfoV2 slotInfoV2, @Y61.l SupportButtonV4 supportButtonV4, @Y61.l Timer timer, @Y61.l LG.q qVar, @Y61.l LG.f fVar, @Y61.l LG.k kVar, @Y61.l DeepLink deepLink, @Y61.l LG.h hVar, @Y61.l DeepLink deepLink2, @Y61.l RouteDetail routeDetail) {
            super(null);
            this.f428379a = nVar;
            this.f428380b = nVar2;
            this.f428381c = cVar;
            this.f428382d = dVar;
            this.f428383e = str;
            this.f428384f = str2;
            this.f428385g = eVar;
            this.f428386h = slotWarningV3;
            this.f428387i = str3;
            this.f428388j = str4;
            this.f428389k = mVar;
            this.f428390l = slotInfo;
            this.f428391m = slotInfoV2;
            this.f428392n = supportButtonV4;
            this.f428393o = timer;
            this.f428394p = qVar;
            this.f428395q = fVar;
            this.f428396r = kVar;
            this.f428397s = deepLink;
            this.f428398t = hVar;
            this.f428399u = deepLink2;
            this.f428400v = routeDetail;
        }
    }

    /* compiled from: GigSlotInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpH/k$e;", "LpH/k;", "<init>", "()V", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e extends k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f428401a = new e();

        public e() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 232746385;
        }

        @Y61.k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: GigSlotInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/k$f;", "LpH/k;", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f extends k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f428402a;

        public f(@Y61.k String str) {
            super(null);
            this.f428402a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f428402a, ((f) obj).f428402a);
        }

        public final int hashCode() {
            return this.f428402a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ErrorToast(message="), this.f428402a, ')');
        }
    }

    /* compiled from: GigSlotInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpH/k$g;", "LpH/k;", "<init>", "()V", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g extends k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f428403a = new g();

        public g() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 2146614917;
        }

        @Y61.k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: GigSlotInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/k$h;", "LpH/k;", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h extends k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f428404a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<String> f428405b;

        public h(@Y61.k PrintableText printableText, @Y61.k List<String> list) {
            super(null);
            this.f428404a = printableText;
            this.f428405b = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f428404a, hVar.f428404a) && L.f(this.f428405b, hVar.f428405b);
        }

        public final int hashCode() {
            return this.f428405b.hashCode() + (this.f428404a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnShowMoreClick(title=");
            sb2.append(this.f428404a);
            sb2.append(", items=");
            return H.p(sb2, this.f428405b, ')');
        }
    }

    /* compiled from: GigSlotInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpH/k$i;", "LpH/k;", "<init>", "()V", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i extends k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f428406a = new i();

        public i() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 1430522873;
        }

        @Y61.k
        public final String toString() {
            return "PaymentError";
        }
    }

    public /* synthetic */ k(C42822w c42822w) {
        this();
    }

    public k() {
    }
}
