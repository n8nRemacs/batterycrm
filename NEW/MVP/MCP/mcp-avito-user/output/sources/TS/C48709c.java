package ts;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.H0;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import com.akita.compose.component.chips.InterfaceC27333b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import j.InterfaceC42165v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: CpxPromoGeoState.kt */
@H0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0081\b\u0018\u00002\u00020\u0001:\u001c\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lts/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ts.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C48709c extends com.avito.android.analytics.screens.mvi.q {

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final e f439491r = new e(null);

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public static final C48709c f439492s = new C48709c(true, false, null, null, null, false, null, null, null, null, C42784z0.f406748b, null, null, null, null, null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f439493b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f439494c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Throwable f439495d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final d f439496e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f439497f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f439498g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final AttributedText f439499h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final C48711b f439500i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final w f439501j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f439502k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final List<g> f439503l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final n f439504m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final o f439505n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final A f439506o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final j f439507p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final t f439508q;

    /* compiled from: CpxPromoGeoState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/c$A;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.c$A */
    public static final /* data */ class A {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f439509a;

        public A(@Y61.k String str) {
            this.f439509a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof A) && L.f(this.f439509a, ((A) obj).f439509a);
        }

        public final int hashCode() {
            return this.f439509a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ToastErrors(limitMinValidationError="), this.f439509a, ')');
        }
    }

    /* compiled from: CpxPromoGeoState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/c$B;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.c$B */
    public static final /* data */ class B {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f439510a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f439511b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final N f439512c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final N f439513d;

        /* JADX WARN: Multi-variable type inference failed */
        public B(@Y61.k String str, @Y61.k String str2, @Y61.k Y41.p<? super androidx.compose.runtime.A, ? super Integer, com.akita.compose.foundation.p> pVar, @Y61.k Y41.p<? super androidx.compose.runtime.A, ? super Integer, com.akita.compose.foundation.p> pVar2) {
            this.f439510a = str;
            this.f439511b = str2;
            this.f439512c = (N) pVar;
            this.f439513d = (N) pVar2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof B)) {
                return false;
            }
            B b12 = (B) obj;
            return L.f(this.f439510a, b12.f439510a) && L.f(this.f439511b, b12.f439511b) && L.f(this.f439512c, b12.f439512c) && L.f(this.f439513d, b12.f439513d);
        }

        public final int hashCode() {
            return this.f439513d.hashCode() + ((this.f439512c.hashCode() + H.d(this.f439510a.hashCode() * 31, 31, this.f439511b)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TriggerData(title=");
            sb2.append(this.f439510a);
            sb2.append(", subtitle=");
            sb2.append(this.f439511b);
            sb2.append(", sliderColor=");
            sb2.append(this.f439512c);
            sb2.append(", bannerColor=");
            return C22026a.d(sb2, this.f439513d, ')');
        }
    }

    /* compiled from: CpxPromoGeoState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/c$a;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.c$a, reason: case insensitive filesystem */
    public static final /* data */ class C48710a {

        /* renamed from: a, reason: collision with root package name */
        public final long f439514a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final C12686c f439515b;

        public C48710a(long j12, @Y61.k C12686c c12686c) {
            this.f439514a = j12;
            this.f439515b = c12686c;
        }

        public static C48710a a(C48710a c48710a, C12686c c12686c) {
            return new C48710a(c48710a.f439514a, c12686c);
        }

        /* renamed from: b, reason: from getter */
        public final long getF439514a() {
            return this.f439514a;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final C12686c getF439515b() {
            return this.f439515b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C48710a)) {
                return false;
            }
            C48710a c48710a = (C48710a) obj;
            return this.f439514a == c48710a.f439514a && L.f(this.f439515b, c48710a.f439515b);
        }

        public final int hashCode() {
            return this.f439515b.hashCode() + (Long.hashCode(this.f439514a) * 31);
        }

        @Y61.k
        public final String toString() {
            return "AutoLocation(locationId=" + this.f439514a + ", priceBlock=" + this.f439515b + ')';
        }
    }

    /* compiled from: CpxPromoGeoState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/c$b;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.c$b, reason: case insensitive filesystem */
    public static final /* data */ class C48711b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f439516a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final z f439517b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f439518c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final List<v> f439519d;

        public C48711b(@Y61.k String str, @Y61.l z zVar, boolean z12, @Y61.k List<v> list) {
            this.f439516a = str;
            this.f439517b = zVar;
            this.f439518c = z12;
            this.f439519d = list;
        }

        public static C48711b a(C48711b c48711b, boolean z12) {
            return new C48711b(c48711b.f439516a, c48711b.f439517b, z12, c48711b.f439519d);
        }

        /* renamed from: b, reason: from getter */
        public final boolean getF439518c() {
            return this.f439518c;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C48711b)) {
                return false;
            }
            C48711b c48711b = (C48711b) obj;
            return L.f(this.f439516a, c48711b.f439516a) && L.f(this.f439517b, c48711b.f439517b) && this.f439518c == c48711b.f439518c && L.f(this.f439519d, c48711b.f439519d);
        }

        public final int hashCode() {
            int iHashCode = this.f439516a.hashCode() * 31;
            z zVar = this.f439517b;
            return this.f439519d.hashCode() + androidx.appcompat.app.r.i((iHashCode + (zVar == null ? 0 : zVar.hashCode())) * 31, 31, this.f439518c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AutoManual(title=");
            sb2.append(this.f439516a);
            sb2.append(", icon=");
            sb2.append(this.f439517b);
            sb2.append(", isSelectAutoType=");
            sb2.append(this.f439518c);
            sb2.append(", segments=");
            return H.p(sb2, this.f439519d, ')');
        }
    }

    /* compiled from: CpxPromoGeoState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/c$d;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.c$d */
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f439526a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final DeepLink f439527b;

        public d(@Y61.k String str, @Y61.l DeepLink deepLink) {
            this.f439526a = str;
            this.f439527b = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f439526a, dVar.f439526a) && L.f(this.f439527b, dVar.f439527b);
        }

        public final int hashCode() {
            int iHashCode = this.f439526a.hashCode() * 31;
            DeepLink deepLink = this.f439527b;
            return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(title=");
            sb2.append(this.f439526a);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f439527b, ')');
        }
    }

    /* compiled from: CpxPromoGeoState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lts/c$e;", "", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.c$e */
    public static final class e {
        public /* synthetic */ e(C42822w c42822w) {
            this();
        }

        public e() {
        }
    }

    /* compiled from: CpxPromoGeoState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/c$f;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.c$f */
    public static final /* data */ class f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final s f439528a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Object f439529b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final l f439530c;

        public f(@Y61.k s sVar, @Y61.k List<y> list, @Y61.k l lVar) {
            this.f439528a = sVar;
            this.f439529b = list;
            this.f439530c = lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        public static f a(f fVar, s sVar, l lVar) {
            ?? r02 = fVar.f439529b;
            fVar.getClass();
            return new f(sVar, r02, lVar);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<ts.c$y>] */
        @Y61.k
        public final List<y> b() {
            return this.f439529b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f439528a.equals(fVar.f439528a) && L.f(this.f439529b, fVar.f439529b) && this.f439530c.equals(fVar.f439530c);
        }

        public final int hashCode() {
            return this.f439530c.hashCode() + C23088b.a(this.f439528a.hashCode() * 31, 31, this.f439529b);
        }

        @Y61.k
        public final String toString() {
            return "Day(input=" + this.f439528a + ", steps=" + this.f439529b + ", hint=" + this.f439530c + ')';
        }
    }

    /* compiled from: CpxPromoGeoState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/c$h;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.c$h */
    public static final /* data */ class h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f439535a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final i f439536b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final l f439537c;

        public h(@Y61.k String str, @Y61.k i iVar, @Y61.l l lVar) {
            this.f439535a = str;
            this.f439536b = iVar;
            this.f439537c = lVar;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final i getF439536b() {
            return this.f439536b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f439535a, hVar.f439535a) && L.f(this.f439536b, hVar.f439536b) && L.f(this.f439537c, hVar.f439537c);
        }

        public final int hashCode() {
            int iHashCode = (this.f439536b.hashCode() + (this.f439535a.hashCode() * 31)) * 31;
            l lVar = this.f439537c;
            return iHashCode + (lVar == null ? 0 : lVar.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "DayLimitBlock(title=" + this.f439535a + ", input=" + this.f439536b + ", hint=" + this.f439537c + ')';
        }
    }

    /* compiled from: CpxPromoGeoState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/c$j;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.c$j */
    public static final /* data */ class j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final k f439543a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final d f439544b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final d f439545c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final d f439546d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final d f439547e;

        public j(@Y61.k k kVar, @Y61.k d dVar, @Y61.k d dVar2, @Y61.k d dVar3, @Y61.k d dVar4) {
            this.f439543a = kVar;
            this.f439544b = dVar;
            this.f439545c = dVar2;
            this.f439546d = dVar3;
            this.f439547e = dVar4;
        }

        public static j a(j jVar, k kVar) {
            return new j(kVar, jVar.f439544b, jVar.f439545c, jVar.f439546d, jVar.f439547e);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return L.f(this.f439543a, jVar.f439543a) && L.f(this.f439544b, jVar.f439544b) && L.f(this.f439545c, jVar.f439545c) && L.f(this.f439546d, jVar.f439546d) && L.f(this.f439547e, jVar.f439547e);
        }

        public final int hashCode() {
            return this.f439547e.hashCode() + ((this.f439546d.hashCode() + ((this.f439545c.hashCode() + ((this.f439544b.hashCode() + (this.f439543a.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "FloatingFooter(type=" + this.f439543a + ", saveButton=" + this.f439544b + ", skipButton=" + this.f439545c + ", resetButton=" + this.f439546d + ", continueWithMinButton=" + this.f439547e + ')';
        }
    }

    /* compiled from: CpxPromoGeoState.kt */
    @H0
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lts/c$k;", "", "a", "b", "c", "Lts/c$k$a;", "Lts/c$k$b;", "Lts/c$k$c;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.c$k */
    public interface k {

        /* compiled from: CpxPromoGeoState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lts/c$k$a;", "Lts/c$k;", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ts.c$k$a */
        public static final /* data */ class a implements k {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f439548a = new a();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1874637462;
            }

            @Y61.k
            public final String toString() {
                return "ContinueWithMinPrice";
            }
        }

        /* compiled from: CpxPromoGeoState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lts/c$k$b;", "Lts/c$k;", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ts.c$k$b */
        public static final /* data */ class b implements k {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f439549a = new b();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 800858491;
            }

            @Y61.k
            public final String toString() {
                return "ContinueWithoutChangesReset";
            }
        }

        /* compiled from: CpxPromoGeoState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lts/c$k$c;", "Lts/c$k;", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ts.c$k$c, reason: collision with other inner class name */
        public static final /* data */ class C12687c implements k {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C12687c f439550a = new C12687c();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C12687c);
            }

            public final int hashCode() {
                return 2029414848;
            }

            @Y61.k
            public final String toString() {
                return "SaveReset";
            }
        }
    }

    /* compiled from: CpxPromoGeoState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/c$m;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.c$m */
    public static final /* data */ class m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f439554a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f439555b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f439556c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f439557d;

        public m(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
            this.f439554a = str;
            this.f439555b = str2;
            this.f439556c = str3;
            this.f439557d = str4;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return L.f(this.f439554a, mVar.f439554a) && L.f(this.f439555b, mVar.f439555b) && L.f(this.f439556c, mVar.f439556c) && L.f(this.f439557d, mVar.f439557d);
        }

        public final int hashCode() {
            String str = this.f439554a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f439555b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f439556c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f439557d;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HintState(minError=");
            sb2.append(this.f439554a);
            sb2.append(", maxError=");
            sb2.append(this.f439555b);
            sb2.append(", minHint=");
            sb2.append(this.f439556c);
            sb2.append(", limitSet=");
            return C22026a.c(sb2, this.f439557d, ')');
        }
    }

    /* compiled from: CpxPromoGeoState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/c$n;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.c$n */
    public static final /* data */ class n {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f439558a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f439559b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f439560c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final z f439561d;

        public n(@Y61.k String str, @Y61.k DeepLink deepLink, @Y61.k String str2, @Y61.l z zVar) {
            this.f439558a = str;
            this.f439559b = deepLink;
            this.f439560c = str2;
            this.f439561d = zVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return L.f(this.f439558a, nVar.f439558a) && L.f(this.f439559b, nVar.f439559b) && L.f(this.f439560c, nVar.f439560c) && L.f(this.f439561d, nVar.f439561d);
        }

        public final int hashCode() {
            int iD2 = H.d(com.avito.android.actions_sheet.a.e(this.f439559b, this.f439558a.hashCode() * 31, 31), 31, this.f439560c);
            z zVar = this.f439561d;
            return iD2 + (zVar == null ? 0 : zVar.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "LocationChooser(title=" + this.f439558a + ", uri=" + this.f439559b + ", preselectedInputText=" + this.f439560c + ", icon=" + this.f439561d + ')';
        }
    }

    /* compiled from: CpxPromoGeoState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/c$o;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.c$o */
    public static final /* data */ class o {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final r f439562a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<C48710a> f439563b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final List<p> f439564c;

        public o(@Y61.k r rVar, @Y61.k List<C48710a> list, @Y61.k List<p> list2) {
            this.f439562a = rVar;
            this.f439563b = list;
            this.f439564c = list2;
        }

        public static o a(o oVar, ArrayList arrayList) {
            return new o(oVar.f439562a, oVar.f439563b, arrayList);
        }

        @Y61.k
        public final List<C48710a> b() {
            return this.f439563b;
        }

        @Y61.k
        public final List<p> c() {
            return this.f439564c;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final r getF439562a() {
            return this.f439562a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return L.f(this.f439562a, oVar.f439562a) && L.f(this.f439563b, oVar.f439563b) && L.f(this.f439564c, oVar.f439564c);
        }

        public final int hashCode() {
            return this.f439564c.hashCode() + H.e(this.f439562a.f439576a.hashCode() * 31, 31, this.f439563b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Locations(mergedLocation=");
            sb2.append(this.f439562a);
            sb2.append(", autoLocations=");
            sb2.append(this.f439563b);
            sb2.append(", manualLocations=");
            return H.p(sb2, this.f439564c, ')');
        }
    }

    /* compiled from: CpxPromoGeoState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/c$p;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.c$p */
    public static final /* data */ class p {

        /* renamed from: a, reason: collision with root package name */
        public final long f439565a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final q f439566b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final h f439567c;

        public p(long j12, @Y61.k q qVar, @Y61.k h hVar) {
            this.f439565a = j12;
            this.f439566b = qVar;
            this.f439567c = hVar;
        }

        public static p a(p pVar, q qVar, h hVar, int i12) {
            if ((i12 & 2) != 0) {
                qVar = pVar.f439566b;
            }
            return new p(pVar.f439565a, qVar, hVar);
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final q getF439566b() {
            return this.f439566b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return this.f439565a == pVar.f439565a && L.f(this.f439566b, pVar.f439566b) && L.f(this.f439567c, pVar.f439567c);
        }

        public final int hashCode() {
            return this.f439567c.hashCode() + ((this.f439566b.hashCode() + (Long.hashCode(this.f439565a) * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "ManualLocation(locationId=" + this.f439565a + ", priceBlock=" + this.f439566b + ", dayLimitBlock=" + this.f439567c + ')';
        }
    }

    /* compiled from: CpxPromoGeoState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/c$r;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.c$r */
    public static final /* data */ class r {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C12686c f439576a;

        public r(@Y61.k C12686c c12686c) {
            this.f439576a = c12686c;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final C12686c getF439576a() {
            return this.f439576a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && L.f(this.f439576a, ((r) obj).f439576a);
        }

        public final int hashCode() {
            return this.f439576a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "MergedLocation(priceBlock=" + this.f439576a + ')';
        }
    }

    /* compiled from: CpxPromoGeoState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/c$t;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.c$t */
    public static final /* data */ class t {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f439582a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final u f439583b;

        public t(boolean z12, @Y61.k u uVar) {
            this.f439582a = z12;
            this.f439583b = uVar;
        }

        public static t a(t tVar, boolean z12) {
            return new t(z12, tVar.f439583b);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return this.f439582a == tVar.f439582a && this.f439583b.equals(tVar.f439583b);
        }

        public final int hashCode() {
            return this.f439583b.hashCode() + (Boolean.hashCode(this.f439582a) * 31);
        }

        @Y61.k
        public final String toString() {
            return "ResetDialog(show=" + this.f439582a + ", data=" + this.f439583b + ')';
        }
    }

    /* compiled from: CpxPromoGeoState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/c$u;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.c$u */
    public static final /* data */ class u {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f439584a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f439585b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f439586c;

        public u(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
            this.f439584a = str;
            this.f439585b = str2;
            this.f439586c = str3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return L.f(this.f439584a, uVar.f439584a) && L.f(this.f439585b, uVar.f439585b) && L.f(this.f439586c, uVar.f439586c);
        }

        public final int hashCode() {
            return this.f439586c.hashCode() + H.d(this.f439584a.hashCode() * 31, 31, this.f439585b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ResetDialogData(title=");
            sb2.append(this.f439584a);
            sb2.append(", confirmButtonTitle=");
            sb2.append(this.f439585b);
            sb2.append(", cancelButtonTitle=");
            return C22026a.c(sb2, this.f439586c, ')');
        }
    }

    /* compiled from: CpxPromoGeoState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/c$v;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.c$v */
    public static final /* data */ class v {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f439587a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f439588b;

        public v(boolean z12, @Y61.k String str) {
            this.f439587a = z12;
            this.f439588b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return this.f439587a == vVar.f439587a && L.f(this.f439588b, vVar.f439588b);
        }

        public final int hashCode() {
            return this.f439588b.hashCode() + (Boolean.hashCode(this.f439587a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Segment(isAutoType=");
            sb2.append(this.f439587a);
            sb2.append(", title=");
            return C22026a.c(sb2, this.f439588b, ')');
        }
    }

    /* compiled from: CpxPromoGeoState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/c$w;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.c$w */
    public static final /* data */ class w {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f439589a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f439590b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final z f439591c;

        public w(boolean z12, @Y61.k String str, @Y61.l z zVar) {
            this.f439589a = z12;
            this.f439590b = str;
            this.f439591c = zVar;
        }

        public static w a(w wVar, boolean z12) {
            return new w(z12, wVar.f439590b, wVar.f439591c);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            w wVar = (w) obj;
            return this.f439589a == wVar.f439589a && L.f(this.f439590b, wVar.f439590b) && L.f(this.f439591c, wVar.f439591c);
        }

        public final int hashCode() {
            int iD2 = H.d(Boolean.hashCode(this.f439589a) * 31, 31, this.f439590b);
            z zVar = this.f439591c;
            return iD2 + (zVar == null ? 0 : zVar.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "SeparateRegionsToggle(isToggleEnabled=" + this.f439589a + ", toggleText=" + this.f439590b + ", icon=" + this.f439591c + ')';
        }
    }

    /* compiled from: CpxPromoGeoState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/c$y;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.c$y */
    public static final /* data */ class y {

        /* renamed from: a, reason: collision with root package name */
        public final float f439596a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f439597b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f439598c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final B f439599d;

        public y(float f12, @Y61.k String str, @Y61.l String str2, @Y61.l B b12) {
            this.f439596a = f12;
            this.f439597b = str;
            this.f439598c = str2;
            this.f439599d = b12;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF439597b() {
            return this.f439597b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            return Float.compare(this.f439596a, yVar.f439596a) == 0 && L.f(this.f439597b, yVar.f439597b) && L.f(this.f439598c, yVar.f439598c) && L.f(this.f439599d, yVar.f439599d);
        }

        public final int hashCode() {
            int iD2 = H.d(Float.hashCode(this.f439596a) * 31, 31, this.f439597b);
            String str = this.f439598c;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            B b12 = this.f439599d;
            return iHashCode + (b12 != null ? b12.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "Step(sliderPercent=" + this.f439596a + ", value=" + this.f439597b + ", hintText=" + this.f439598c + ", triggerData=" + this.f439599d + ')';
        }
    }

    /* compiled from: CpxPromoGeoState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/c$z;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.c$z */
    public static final /* data */ class z {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f439600a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final DeepLink f439601b;

        public z(@Y61.l String str, @Y61.l DeepLink deepLink) {
            this.f439600a = str;
            this.f439601b = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof z)) {
                return false;
            }
            z zVar = (z) obj;
            return L.f(this.f439600a, zVar.f439600a) && L.f(this.f439601b, zVar.f439601b);
        }

        public final int hashCode() {
            String str = this.f439600a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            DeepLink deepLink = this.f439601b;
            return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TextIcon(symbol=");
            sb2.append(this.f439600a);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f439601b, ')');
        }
    }

    public C48709c(boolean z12, boolean z13, @Y61.l Throwable th2, @Y61.l d dVar, @Y61.l String str, boolean z14, @Y61.l AttributedText attributedText, @Y61.l C48711b c48711b, @Y61.l w wVar, @Y61.l String str2, @Y61.k List list, @Y61.l n nVar, @Y61.l o oVar, @Y61.l A a12, @Y61.l j jVar, @Y61.l t tVar) {
        this.f439493b = z12;
        this.f439494c = z13;
        this.f439495d = th2;
        this.f439496e = dVar;
        this.f439497f = str;
        this.f439498g = z14;
        this.f439499h = attributedText;
        this.f439500i = c48711b;
        this.f439501j = wVar;
        this.f439502k = str2;
        this.f439503l = list;
        this.f439504m = nVar;
        this.f439505n = oVar;
        this.f439506o = a12;
        this.f439507p = jVar;
        this.f439508q = tVar;
    }

    public static C48709c a(C48709c c48709c, boolean z12, boolean z13, Throwable th2, d dVar, String str, boolean z14, AttributedText attributedText, C48711b c48711b, w wVar, String str2, ArrayList arrayList, n nVar, o oVar, A a12, j jVar, t tVar, int i12) {
        c48709c.getClass();
        boolean z15 = (i12 & 2) != 0 ? c48709c.f439493b : z12;
        boolean z16 = (i12 & 4) != 0 ? c48709c.f439494c : z13;
        Throwable th3 = (i12 & 8) != 0 ? c48709c.f439495d : th2;
        d dVar2 = (i12 & 16) != 0 ? c48709c.f439496e : dVar;
        String str3 = (i12 & 32) != 0 ? c48709c.f439497f : str;
        boolean z17 = (i12 & 64) != 0 ? c48709c.f439498g : z14;
        AttributedText attributedText2 = (i12 & 128) != 0 ? c48709c.f439499h : attributedText;
        C48711b c48711b2 = (i12 & 256) != 0 ? c48709c.f439500i : c48711b;
        w wVar2 = (i12 & 512) != 0 ? c48709c.f439501j : wVar;
        String str4 = (i12 & 1024) != 0 ? c48709c.f439502k : str2;
        List<g> list = (i12 & 2048) != 0 ? c48709c.f439503l : arrayList;
        n nVar2 = (i12 & 4096) != 0 ? c48709c.f439504m : nVar;
        o oVar2 = (i12 & 8192) != 0 ? c48709c.f439505n : oVar;
        A a13 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? c48709c.f439506o : a12;
        j jVar2 = (i12 & 32768) != 0 ? c48709c.f439507p : jVar;
        t tVar2 = (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? c48709c.f439508q : tVar;
        c48709c.getClass();
        return new C48709c(z15, z16, th3, dVar2, str3, z17, attributedText2, c48711b2, wVar2, str4, list, nVar2, oVar2, a13, jVar2, tVar2);
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final j getF439507p() {
        return this.f439507p;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final o getF439505n() {
        return this.f439505n;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final String getF439502k() {
        return this.f439502k;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48709c)) {
            return false;
        }
        C48709c c48709c = (C48709c) obj;
        c48709c.getClass();
        return this.f439493b == c48709c.f439493b && this.f439494c == c48709c.f439494c && L.f(this.f439495d, c48709c.f439495d) && L.f(this.f439496e, c48709c.f439496e) && L.f(this.f439497f, c48709c.f439497f) && this.f439498g == c48709c.f439498g && L.f(this.f439499h, c48709c.f439499h) && L.f(this.f439500i, c48709c.f439500i) && L.f(this.f439501j, c48709c.f439501j) && L.f(this.f439502k, c48709c.f439502k) && L.f(this.f439503l, c48709c.f439503l) && L.f(this.f439504m, c48709c.f439504m) && L.f(this.f439505n, c48709c.f439505n) && L.f(this.f439506o, c48709c.f439506o) && L.f(this.f439507p, c48709c.f439507p) && L.f(this.f439508q, c48709c.f439508q);
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final w getF439501j() {
        return this.f439501j;
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(Boolean.hashCode(false) * 31, 31, this.f439493b), 31, this.f439494c);
        Throwable th2 = this.f439495d;
        int iHashCode = (i12 + (th2 == null ? 0 : th2.hashCode())) * 31;
        d dVar = this.f439496e;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.f439497f;
        int i13 = androidx.appcompat.app.r.i((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f439498g);
        AttributedText attributedText = this.f439499h;
        int iHashCode3 = (i13 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        C48711b c48711b = this.f439500i;
        int iHashCode4 = (iHashCode3 + (c48711b == null ? 0 : c48711b.hashCode())) * 31;
        w wVar = this.f439501j;
        int iHashCode5 = (iHashCode4 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        String str2 = this.f439502k;
        int iE2 = H.e((iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f439503l);
        n nVar = this.f439504m;
        int iHashCode6 = (iE2 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        o oVar = this.f439505n;
        int iHashCode7 = (iHashCode6 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        A a12 = this.f439506o;
        int iHashCode8 = (iHashCode7 + (a12 == null ? 0 : a12.f439509a.hashCode())) * 31;
        j jVar = this.f439507p;
        int iHashCode9 = (iHashCode8 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        t tVar = this.f439508q;
        return iHashCode9 + (tVar != null ? tVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "CpxPromoGeoState(isClosable=false, isLoading=" + this.f439493b + ", isPostLoading=" + this.f439494c + ", error=" + this.f439495d + ", navButton=" + this.f439496e + ", title=" + this.f439497f + ", isChanged=" + this.f439498g + ", description=" + this.f439499h + ", autoManual=" + this.f439500i + ", separateRegionsToggle=" + this.f439501j + ", selectedDay=" + this.f439502k + ", days=" + this.f439503l + ", locationChooser=" + this.f439504m + ", locations=" + this.f439505n + ", toastErrors=" + this.f439506o + ", floatingFooter=" + this.f439507p + ", resetDialog=" + this.f439508q + ')';
    }

    /* compiled from: CpxPromoGeoState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/c$l;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.c$l */
    public static final /* data */ class l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f439551a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f439552b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final m f439553c;

        public l(@Y61.l String str, boolean z12, @Y61.l m mVar) {
            this.f439551a = str;
            this.f439552b = z12;
            this.f439553c = mVar;
        }

        public static l a(l lVar, String str, boolean z12) {
            m mVar = lVar.f439553c;
            lVar.getClass();
            return new l(str, z12, mVar);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return L.f(this.f439551a, lVar.f439551a) && this.f439552b == lVar.f439552b && L.f(this.f439553c, lVar.f439553c);
        }

        public final int hashCode() {
            String str = this.f439551a;
            int i12 = androidx.appcompat.app.r.i((str == null ? 0 : str.hashCode()) * 31, 31, this.f439552b);
            m mVar = this.f439553c;
            return i12 + (mVar != null ? mVar.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "Hint(text=" + this.f439551a + ", isError=" + this.f439552b + ", state=" + this.f439553c + ')';
        }

        public /* synthetic */ l(String str, boolean z12, m mVar, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? false : z12, mVar);
        }
    }

    /* compiled from: CpxPromoGeoState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/c$g;", "Lcom/akita/compose/component/chips/b;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.c$g */
    public static final /* data */ class g implements InterfaceC27333b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f439531b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f439532c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f439533d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f439534e;

        public g(@Y61.k String str, @Y61.k String str2, boolean z12, boolean z13) {
            this.f439531b = str;
            this.f439532c = str2;
            this.f439533d = z12;
            this.f439534e = z13;
        }

        public static g a(g gVar, boolean z12) {
            String str = gVar.f439531b;
            String str2 = gVar.f439532c;
            boolean z13 = gVar.f439534e;
            gVar.getClass();
            return new g(str, str2, z12, z13);
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getF439531b() {
            return this.f439531b;
        }

        @Override // com.akita.compose.component.chips.InterfaceC27333b
        @InterfaceC42165v
        @Y61.l
        /* renamed from: c */
        public final Integer getF60871f() {
            return null;
        }

        @Override // com.akita.compose.component.chips.InterfaceC27333b
        @InterfaceC42165v
        @Y61.l
        /* renamed from: d */
        public final Integer getF60870e() {
            return null;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f439531b, gVar.f439531b) && L.f(this.f439532c, gVar.f439532c) && this.f439533d == gVar.f439533d && this.f439534e == gVar.f439534e;
        }

        @Override // com.akita.compose.component.chips.InterfaceC27333b
        @Y61.k
        /* renamed from: getTitle, reason: from getter */
        public final String getF439532c() {
            return this.f439532c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f439534e) + androidx.appcompat.app.r.i(H.d(this.f439531b.hashCode() * 31, 31, this.f439532c), 31, this.f439533d);
        }

        @Override // com.akita.compose.component.chips.InterfaceC27333b
        /* renamed from: isActive */
        public final boolean getF99070e() {
            return true;
        }

        @Override // com.akita.compose.component.chips.InterfaceC27333b
        /* renamed from: isEnabled, reason: from getter */
        public final boolean getF439534e() {
            return this.f439534e;
        }

        @Override // com.akita.compose.component.chips.InterfaceC27333b
        /* renamed from: isSelected, reason: from getter */
        public final boolean getF439533d() {
            return this.f439533d;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DayCount(dayCount=");
            sb2.append(this.f439531b);
            sb2.append(", title=");
            sb2.append(this.f439532c);
            sb2.append(", isSelected=");
            sb2.append(this.f439533d);
            sb2.append(", isEnabled=");
            return androidx.appcompat.app.r.x(sb2, this.f439534e, ')');
        }

        public /* synthetic */ g(String str, String str2, boolean z12, boolean z13, int i12, C42822w c42822w) {
            this(str, str2, z12, (i12 & 8) != 0 ? true : z13);
        }
    }

    /* compiled from: CpxPromoGeoState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/c$x;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.c$x */
    public static final /* data */ class x {

        /* renamed from: a, reason: collision with root package name */
        public final float f439592a;

        /* renamed from: b, reason: collision with root package name */
        public final float f439593b;

        /* renamed from: c, reason: collision with root package name */
        public final float f439594c;

        /* renamed from: d, reason: collision with root package name */
        public final int f439595d;

        public x(float f12, float f13, float f14, int i12) {
            this.f439592a = f12;
            this.f439593b = f13;
            this.f439594c = f14;
            this.f439595d = i12;
        }

        public static x a(x xVar, float f12) {
            float f13 = xVar.f439593b;
            float f14 = xVar.f439594c;
            int i12 = xVar.f439595d;
            xVar.getClass();
            return new x(f12, f13, f14, i12);
        }

        /* renamed from: b, reason: from getter */
        public final float getF439592a() {
            return this.f439592a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            x xVar = (x) obj;
            return Float.compare(this.f439592a, xVar.f439592a) == 0 && Float.compare(this.f439593b, xVar.f439593b) == 0 && Float.compare(this.f439594c, xVar.f439594c) == 0 && this.f439595d == xVar.f439595d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f439595d) + androidx.appcompat.app.r.d(this.f439594c, androidx.appcompat.app.r.d(this.f439593b, Float.hashCode(this.f439592a) * 31, 31), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Slider(value=");
            sb2.append(this.f439592a);
            sb2.append(", min=");
            sb2.append(this.f439593b);
            sb2.append(", max=");
            sb2.append(this.f439594c);
            sb2.append(", stepsCount=");
            return androidx.appcompat.app.r.t(sb2, this.f439595d, ')');
        }

        public /* synthetic */ x(float f12, float f13, float f14, int i12, int i13, C42822w c42822w) {
            this((i13 & 1) != 0 ? 0.0f : f12, (i13 & 2) != 0 ? 0.0f : f13, f14, i12);
        }
    }

    /* compiled from: CpxPromoGeoState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/c$i;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.c$i */
    public static final /* data */ class i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f439538a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f439539b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f439540c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f439541d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f439542e;

        public i(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.k String str4, @Y61.k String str5) {
            this.f439538a = str;
            this.f439539b = str2;
            this.f439540c = str3;
            this.f439541d = str4;
            this.f439542e = str5;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF439538a() {
            return this.f439538a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f439538a, iVar.f439538a) && L.f(this.f439539b, iVar.f439539b) && L.f(this.f439540c, iVar.f439540c) && L.f(this.f439541d, iVar.f439541d) && L.f(this.f439542e, iVar.f439542e);
        }

        public final int hashCode() {
            int iHashCode = this.f439538a.hashCode() * 31;
            String str = this.f439539b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f439540c;
            return this.f439542e.hashCode() + H.d((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f439541d);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DayLimitInput(value=");
            sb2.append(this.f439538a);
            sb2.append(", placeholder=");
            sb2.append(this.f439539b);
            sb2.append(", minPricePlaceholder=");
            sb2.append(this.f439540c);
            sb2.append(", minLimit=");
            sb2.append(this.f439541d);
            sb2.append(", maxLimit=");
            return C22026a.c(sb2, this.f439542e, ')');
        }

        public /* synthetic */ i(String str, String str2, String str3, String str4, String str5, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? "" : str, str2, str3, str4, str5);
        }
    }

    /* compiled from: CpxPromoGeoState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/c$s;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.c$s */
    public static final /* data */ class s {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f439577a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f439578b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f439579c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f439580d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f439581e;

        public s(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k String str5) {
            this.f439577a = str;
            this.f439578b = str2;
            this.f439579c = str3;
            this.f439580d = str4;
            this.f439581e = str5;
        }

        public static s a(s sVar, String str) {
            String str2 = sVar.f439578b;
            String str3 = sVar.f439579c;
            String str4 = sVar.f439580d;
            String str5 = sVar.f439581e;
            sVar.getClass();
            return new s(str, str2, str3, str4, str5);
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getF439577a() {
            return this.f439577a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return L.f(this.f439577a, sVar.f439577a) && L.f(this.f439578b, sVar.f439578b) && L.f(this.f439579c, sVar.f439579c) && L.f(this.f439580d, sVar.f439580d) && L.f(this.f439581e, sVar.f439581e);
        }

        public final int hashCode() {
            int iHashCode = this.f439577a.hashCode() * 31;
            String str = this.f439578b;
            return this.f439581e.hashCode() + H.d(H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f439579c), 31, this.f439580d);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PriceInput(value=");
            sb2.append(this.f439577a);
            sb2.append(", placeholder=");
            sb2.append(this.f439578b);
            sb2.append(", clearedValue=");
            sb2.append(this.f439579c);
            sb2.append(", minLimit=");
            sb2.append(this.f439580d);
            sb2.append(", maxLimit=");
            return C22026a.c(sb2, this.f439581e, ')');
        }

        public /* synthetic */ s(String str, String str2, String str3, String str4, String str5, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? "" : str, str2, str3, str4, str5);
        }
    }

    /* compiled from: CpxPromoGeoState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/c$c;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12686c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f439520a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f439521b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final z f439522c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final x f439523d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Map<String, f> f439524e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final B f439525f;

        public C12686c(@Y61.l String str, @Y61.l String str2, @Y61.l z zVar, @Y61.k x xVar, @Y61.k Map<String, f> map, @Y61.l B b12) {
            this.f439520a = str;
            this.f439521b = str2;
            this.f439522c = zVar;
            this.f439523d = xVar;
            this.f439524e = map;
            this.f439525f = b12;
        }

        @Y61.k
        public final Map<String, f> a() {
            return this.f439524e;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12686c)) {
                return false;
            }
            C12686c c12686c = (C12686c) obj;
            return L.f(this.f439520a, c12686c.f439520a) && L.f(this.f439521b, c12686c.f439521b) && L.f(this.f439522c, c12686c.f439522c) && L.f(this.f439523d, c12686c.f439523d) && L.f(this.f439524e, c12686c.f439524e) && L.f(this.f439525f, c12686c.f439525f);
        }

        public final int hashCode() {
            String str = this.f439520a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f439521b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            z zVar = this.f439522c;
            int iC2 = AK.c.c((this.f439523d.hashCode() + ((iHashCode2 + (zVar == null ? 0 : zVar.hashCode())) * 31)) * 31, 31, this.f439524e);
            B b12 = this.f439525f;
            return iC2 + (b12 != null ? b12.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "AutoPriceBlock(title=" + this.f439520a + ", subTitle=" + this.f439521b + ", icon=" + this.f439522c + ", slider=" + this.f439523d + ", days=" + this.f439524e + ", triggerData=" + this.f439525f + ')';
        }

        public /* synthetic */ C12686c(String str, String str2, z zVar, x xVar, Map map, B b12, int i12, C42822w c42822w) {
            this(str, str2, zVar, xVar, map, (i12 & 32) != 0 ? null : b12);
        }
    }

    /* compiled from: CpxPromoGeoState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts/c$q;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ts.c$q */
    public static final /* data */ class q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f439568a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f439569b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final z f439570c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final s f439571d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final List<y> f439572e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final x f439573f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final l f439574g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final B f439575h;

        public q(@Y61.l String str, @Y61.l String str2, @Y61.l z zVar, @Y61.k s sVar, @Y61.k List<y> list, @Y61.k x xVar, @Y61.k l lVar, @Y61.l B b12) {
            this.f439568a = str;
            this.f439569b = str2;
            this.f439570c = zVar;
            this.f439571d = sVar;
            this.f439572e = list;
            this.f439573f = xVar;
            this.f439574g = lVar;
            this.f439575h = b12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return L.f(this.f439568a, qVar.f439568a) && L.f(this.f439569b, qVar.f439569b) && L.f(this.f439570c, qVar.f439570c) && L.f(this.f439571d, qVar.f439571d) && L.f(this.f439572e, qVar.f439572e) && L.f(this.f439573f, qVar.f439573f) && L.f(this.f439574g, qVar.f439574g) && L.f(this.f439575h, qVar.f439575h);
        }

        public final int hashCode() {
            String str = this.f439568a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f439569b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            z zVar = this.f439570c;
            int iHashCode3 = (this.f439574g.hashCode() + ((this.f439573f.hashCode() + H.e((this.f439571d.hashCode() + ((iHashCode2 + (zVar == null ? 0 : zVar.hashCode())) * 31)) * 31, 31, this.f439572e)) * 31)) * 31;
            B b12 = this.f439575h;
            return iHashCode3 + (b12 != null ? b12.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "ManualPriceBlock(title=" + this.f439568a + ", subTitle=" + this.f439569b + ", icon=" + this.f439570c + ", input=" + this.f439571d + ", steps=" + this.f439572e + ", slider=" + this.f439573f + ", hint=" + this.f439574g + ", triggerData=" + this.f439575h + ')';
        }

        public /* synthetic */ q(String str, String str2, z zVar, s sVar, List list, x xVar, l lVar, B b12, int i12, C42822w c42822w) {
            this(str, str2, zVar, sVar, list, xVar, lVar, (i12 & 128) != 0 ? null : b12);
        }
    }
}
