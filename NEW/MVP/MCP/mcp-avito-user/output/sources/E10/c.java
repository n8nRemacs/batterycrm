package E10;

import F10.a;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;
import x10.C49742a;
import y10.C50036a;

/* compiled from: CalculatorState.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LE10/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f3677b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f3678c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3679d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f3680e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f3681f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f3682g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f3683h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f3684i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final PrintableText f3685j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final a.b f3686k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final a.C0271a f3687l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final C50036a f3688m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final G10.a f3689n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final C49742a f3690o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final C49742a f3691p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final x10.b f3692q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final b f3693r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public final e f3694s;

    public c(@k String str, @l String str2, long j12, @k String str3, @l String str4, @l String str5, @l String str6, @l String str7, @k PrintableText printableText, @k a.b bVar, @k a.C0271a c0271a, @k C50036a c50036a, @k G10.a aVar, @k C49742a c49742a, @l C49742a c49742a2, @l x10.b bVar2, @k b bVar3, @l e eVar) {
        this.f3677b = str;
        this.f3678c = str2;
        this.f3679d = j12;
        this.f3680e = str3;
        this.f3681f = str4;
        this.f3682g = str5;
        this.f3683h = str6;
        this.f3684i = str7;
        this.f3685j = printableText;
        this.f3686k = bVar;
        this.f3687l = c0271a;
        this.f3688m = c50036a;
        this.f3689n = aVar;
        this.f3690o = c49742a;
        this.f3691p = c49742a2;
        this.f3692q = bVar2;
        this.f3693r = bVar3;
        this.f3694s = eVar;
    }

    public static c a(c cVar, String str, String str2, long j12, String str3, String str4, String str5, String str6, String str7, PrintableText printableText, a.b bVar, a.C0271a c0271a, C50036a c50036a, G10.a aVar, C49742a c49742a, C49742a c49742a2, x10.b bVar2, b bVar3, e eVar, int i12) {
        String str8 = (i12 & 1) != 0 ? cVar.f3677b : str;
        String str9 = (i12 & 2) != 0 ? cVar.f3678c : str2;
        long j13 = (i12 & 4) != 0 ? cVar.f3679d : j12;
        String str10 = (i12 & 8) != 0 ? cVar.f3680e : str3;
        String str11 = (i12 & 16) != 0 ? cVar.f3681f : str4;
        String str12 = (i12 & 32) != 0 ? cVar.f3682g : str5;
        String str13 = (i12 & 64) != 0 ? cVar.f3683h : str6;
        String str14 = (i12 & 128) != 0 ? cVar.f3684i : str7;
        PrintableText printableText2 = (i12 & 256) != 0 ? cVar.f3685j : printableText;
        a.b bVar4 = (i12 & 512) != 0 ? cVar.f3686k : bVar;
        a.C0271a c0271a2 = (i12 & 1024) != 0 ? cVar.f3687l : c0271a;
        C50036a c50036a2 = (i12 & 2048) != 0 ? cVar.f3688m : c50036a;
        G10.a aVar2 = (i12 & 4096) != 0 ? cVar.f3689n : aVar;
        C49742a c49742a3 = (i12 & 8192) != 0 ? cVar.f3690o : c49742a;
        C49742a c49742a4 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? cVar.f3691p : c49742a2;
        x10.b bVar5 = (i12 & 32768) != 0 ? cVar.f3692q : bVar2;
        b bVar6 = (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? cVar.f3693r : bVar3;
        e eVar2 = (i12 & 131072) != 0 ? cVar.f3694s : eVar;
        cVar.getClass();
        return new c(str8, str9, j13, str10, str11, str12, str13, str14, printableText2, bVar4, c0271a2, c50036a2, aVar2, c49742a3, c49742a4, bVar5, bVar6, eVar2);
    }

    @k
    public final F10.a c() {
        a.C0271a c0271a = this.f3687l;
        if (!c0271a.f4477d) {
            c0271a = null;
        }
        return c0271a != null ? c0271a : this.f3686k;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f3677b, cVar.f3677b) && L.f(this.f3678c, cVar.f3678c) && this.f3679d == cVar.f3679d && L.f(this.f3680e, cVar.f3680e) && L.f(this.f3681f, cVar.f3681f) && L.f(this.f3682g, cVar.f3682g) && L.f(this.f3683h, cVar.f3683h) && L.f(this.f3684i, cVar.f3684i) && L.f(this.f3685j, cVar.f3685j) && L.f(this.f3686k, cVar.f3686k) && L.f(this.f3687l, cVar.f3687l) && L.f(this.f3688m, cVar.f3688m) && L.f(this.f3689n, cVar.f3689n) && L.f(this.f3690o, cVar.f3690o) && L.f(this.f3691p, cVar.f3691p) && L.f(this.f3692q, cVar.f3692q) && L.f(this.f3693r, cVar.f3693r) && L.f(this.f3694s, cVar.f3694s);
    }

    public final int hashCode() {
        int iHashCode = this.f3677b.hashCode() * 31;
        String str = this.f3678c;
        int iD2 = H.d(r.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f3679d), 31, this.f3680e);
        String str2 = this.f3681f;
        int iHashCode2 = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f3682g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f3683h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f3684i;
        int iHashCode5 = (this.f3690o.hashCode() + ((this.f3689n.hashCode() + ((this.f3688m.hashCode() + ((this.f3687l.hashCode() + ((this.f3686k.hashCode() + com.avito.android.actions_sheet.a.f(this.f3685j, (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        C49742a c49742a = this.f3691p;
        int iHashCode6 = (iHashCode5 + (c49742a == null ? 0 : c49742a.hashCode())) * 31;
        x10.b bVar = this.f3692q;
        int iHashCode7 = (this.f3693r.hashCode() + ((iHashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
        e eVar = this.f3694s;
        return iHashCode7 + (eVar != null ? eVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "CalculatorState(entityType=" + this.f3677b + ", entityId=" + this.f3678c + ", locationId=" + this.f3679d + ", purposeId=" + this.f3680e + ", utmSource=" + this.f3681f + ", utmTerm=" + this.f3682g + ", utmCampaign=" + this.f3683h + ", fromPage=" + this.f3684i + ", title=" + this.f3685j + ", propertyCostBasis=" + this.f3686k + ", monthlyPaymentBasis=" + this.f3687l + ", creditTerm=" + this.f3688m + ", offersState=" + this.f3689n + ", primaryButton=" + this.f3690o + ", secondaryButton=" + this.f3691p + ", disclaimer=" + this.f3692q + ", loadingState=" + this.f3693r + ", viewState=" + this.f3694s + ')';
    }
}
