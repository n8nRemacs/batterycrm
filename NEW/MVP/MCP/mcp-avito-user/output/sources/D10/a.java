package D10;

import F10.a;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import x10.C49742a;
import y10.C50036a;

/* compiled from: CalculatorPrivateState.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LD10/a;", "", "a", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final C0143a f2843o = new C0143a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a.b f2844a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a.C0271a f2845b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C50036a f2846c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f2847d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2848e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final DeepLink f2849f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final DeepLink f2850g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final H10.a f2851h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f2852i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f2853j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f2854k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final String f2855l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final String f2856m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final String f2857n;

    /* compiled from: CalculatorPrivateState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LD10/a$a;", "", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: D10.a$a, reason: collision with other inner class name */
    public static final class C0143a {
        public /* synthetic */ C0143a(C42822w c42822w) {
            this();
        }

        @k
        public static a a(@k E10.c cVar) {
            DeepLink deepLink = cVar.f3690o.f442081b;
            C49742a c49742a = cVar.f3691p;
            return new a(cVar.f3686k, cVar.f3687l, cVar.f3688m, cVar.f3680e, cVar.f3679d, deepLink, c49742a != null ? c49742a.f442081b : null, null, cVar.f3677b, cVar.f3678c, cVar.f3681f, cVar.f3682g, cVar.f3683h, cVar.f3684i);
        }

        public C0143a() {
        }
    }

    public a(@k a.b bVar, @k a.C0271a c0271a, @k C50036a c50036a, @k String str, long j12, @k DeepLink deepLink, @l DeepLink deepLink2, @l H10.a aVar, @k String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7) {
        this.f2844a = bVar;
        this.f2845b = c0271a;
        this.f2846c = c50036a;
        this.f2847d = str;
        this.f2848e = j12;
        this.f2849f = deepLink;
        this.f2850g = deepLink2;
        this.f2851h = aVar;
        this.f2852i = str2;
        this.f2853j = str3;
        this.f2854k = str4;
        this.f2855l = str5;
        this.f2856m = str6;
        this.f2857n = str7;
    }

    public static a a(a aVar, a.b bVar, a.C0271a c0271a, C50036a c50036a, String str, long j12, DeepLink deepLink, DeepLink deepLink2, H10.a aVar2, String str2, String str3, String str4, String str5, String str6, String str7, int i12) {
        a.b bVar2 = (i12 & 1) != 0 ? aVar.f2844a : bVar;
        a.C0271a c0271a2 = (i12 & 2) != 0 ? aVar.f2845b : c0271a;
        C50036a c50036a2 = (i12 & 4) != 0 ? aVar.f2846c : c50036a;
        String str8 = (i12 & 8) != 0 ? aVar.f2847d : str;
        long j13 = (i12 & 16) != 0 ? aVar.f2848e : j12;
        DeepLink deepLink3 = (i12 & 32) != 0 ? aVar.f2849f : deepLink;
        DeepLink deepLink4 = (i12 & 64) != 0 ? aVar.f2850g : deepLink2;
        H10.a aVar3 = (i12 & 128) != 0 ? aVar.f2851h : aVar2;
        String str9 = (i12 & 256) != 0 ? aVar.f2852i : str2;
        String str10 = (i12 & 512) != 0 ? aVar.f2853j : str3;
        String str11 = (i12 & 1024) != 0 ? aVar.f2854k : str4;
        String str12 = (i12 & 2048) != 0 ? aVar.f2855l : str5;
        String str13 = (i12 & 4096) != 0 ? aVar.f2856m : str6;
        String str14 = (i12 & 8192) != 0 ? aVar.f2857n : str7;
        aVar.getClass();
        return new a(bVar2, c0271a2, c50036a2, str8, j13, deepLink3, deepLink4, aVar3, str9, str10, str11, str12, str13, str14);
    }

    @k
    public final F10.a b() {
        a.C0271a c0271a = this.f2845b;
        if (!c0271a.f4477d) {
            c0271a = null;
        }
        return c0271a != null ? c0271a : this.f2844a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f2844a, aVar.f2844a) && L.f(this.f2845b, aVar.f2845b) && L.f(this.f2846c, aVar.f2846c) && L.f(this.f2847d, aVar.f2847d) && this.f2848e == aVar.f2848e && L.f(this.f2849f, aVar.f2849f) && L.f(this.f2850g, aVar.f2850g) && L.f(this.f2851h, aVar.f2851h) && L.f(this.f2852i, aVar.f2852i) && L.f(this.f2853j, aVar.f2853j) && L.f(this.f2854k, aVar.f2854k) && L.f(this.f2855l, aVar.f2855l) && L.f(this.f2856m, aVar.f2856m) && L.f(this.f2857n, aVar.f2857n);
    }

    public final int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.f2849f, r.g(H.d((this.f2846c.hashCode() + ((this.f2845b.hashCode() + (this.f2844a.hashCode() * 31)) * 31)) * 31, 31, this.f2847d), 31, this.f2848e), 31);
        DeepLink deepLink = this.f2850g;
        int iHashCode = (iE2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        H10.a aVar = this.f2851h;
        int iD2 = H.d((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f2852i);
        String str = this.f2853j;
        int iHashCode2 = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2854k;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2855l;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f2856m;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f2857n;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalculatorPrivateState(propertyCostBasis=");
        sb2.append(this.f2844a);
        sb2.append(", monthlyPaymentBasis=");
        sb2.append(this.f2845b);
        sb2.append(", creditTerm=");
        sb2.append(this.f2846c);
        sb2.append(", purposeId=");
        sb2.append(this.f2847d);
        sb2.append(", locationId=");
        sb2.append(this.f2848e);
        sb2.append(", primaryDeeplink=");
        sb2.append(this.f2849f);
        sb2.append(", secondaryDeeplink=");
        sb2.append(this.f2850g);
        sb2.append(", snippet=");
        sb2.append(this.f2851h);
        sb2.append(", entityType=");
        sb2.append(this.f2852i);
        sb2.append(", entityId=");
        sb2.append(this.f2853j);
        sb2.append(", utmSource=");
        sb2.append(this.f2854k);
        sb2.append(", utmTerm=");
        sb2.append(this.f2855l);
        sb2.append(", utmCampaign=");
        sb2.append(this.f2856m);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f2857n, ')');
    }
}
