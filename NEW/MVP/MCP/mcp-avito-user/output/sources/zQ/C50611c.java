package zq;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: ComfortableDealInviteState.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lzq/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zq.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C50611c extends q {

    /* renamed from: w, reason: collision with root package name */
    @k
    public static final a f444278w = new a(null);

    /* renamed from: x, reason: collision with root package name */
    @k
    public static final C50611c f444279x = new C50611c(null, false, false, false, null, null, null, false, null, false, null, false, null, false, null, false, null, false, false, false, false, 2097151, null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f444280b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f444281c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f444282d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f444283e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f444284f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final PrintableText f444285g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f444286h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f444287i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Boolean f444288j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f444289k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final Boolean f444290l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f444291m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final Boolean f444292n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f444293o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final String f444294p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f444295q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final String f444296r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f444297s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f444298t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f444299u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f444300v;

    /* compiled from: ComfortableDealInviteState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzq/c$a;", "", "<init>", "()V", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zq.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C50611c() {
        this(null, false, false, false, null, null, null, false, null, false, null, false, null, false, null, false, null, false, false, false, false, 2097151, null);
    }

    public static C50611c a(C50611c c50611c, String str, boolean z12, String str2, PrintableText printableText, String str3, boolean z13, Boolean bool, boolean z14, Boolean bool2, boolean z15, Boolean bool3, boolean z16, String str4, boolean z17, String str5, boolean z18, boolean z19, boolean z22, boolean z23, int i12) {
        String str6 = (i12 & 1) != 0 ? c50611c.f444280b : str;
        boolean z24 = (i12 & 2) != 0 ? c50611c.f444281c : false;
        boolean z25 = (i12 & 4) != 0 ? c50611c.f444282d : z12;
        boolean z26 = (i12 & 8) != 0 ? c50611c.f444283e : true;
        String str7 = (i12 & 16) != 0 ? c50611c.f444284f : str2;
        PrintableText printableText2 = (i12 & 32) != 0 ? c50611c.f444285g : printableText;
        String str8 = (i12 & 64) != 0 ? c50611c.f444286h : str3;
        boolean z27 = (i12 & 128) != 0 ? c50611c.f444287i : z13;
        Boolean bool4 = (i12 & 256) != 0 ? c50611c.f444288j : bool;
        boolean z28 = (i12 & 512) != 0 ? c50611c.f444289k : z14;
        Boolean bool5 = (i12 & 1024) != 0 ? c50611c.f444290l : bool2;
        boolean z29 = (i12 & 2048) != 0 ? c50611c.f444291m : z15;
        Boolean bool6 = (i12 & 4096) != 0 ? c50611c.f444292n : bool3;
        boolean z32 = (i12 & 8192) != 0 ? c50611c.f444293o : z16;
        String str9 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? c50611c.f444294p : str4;
        boolean z33 = (32768 & i12) != 0 ? c50611c.f444295q : z17;
        String str10 = (65536 & i12) != 0 ? c50611c.f444296r : str5;
        boolean z34 = (131072 & i12) != 0 ? c50611c.f444297s : z18;
        boolean z35 = (262144 & i12) != 0 ? c50611c.f444298t : z19;
        boolean z36 = (524288 & i12) != 0 ? c50611c.f444299u : z22;
        boolean z37 = (i12 & 1048576) != 0 ? c50611c.f444300v : z23;
        c50611c.getClass();
        return new C50611c(str6, z24, z25, z26, str7, printableText2, str8, z27, bool4, z28, bool5, z29, bool6, z32, str9, z33, str10, z34, z35, z36, z37);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50611c)) {
            return false;
        }
        C50611c c50611c = (C50611c) obj;
        return L.f(this.f444280b, c50611c.f444280b) && this.f444281c == c50611c.f444281c && this.f444282d == c50611c.f444282d && this.f444283e == c50611c.f444283e && L.f(this.f444284f, c50611c.f444284f) && L.f(this.f444285g, c50611c.f444285g) && L.f(this.f444286h, c50611c.f444286h) && this.f444287i == c50611c.f444287i && L.f(this.f444288j, c50611c.f444288j) && this.f444289k == c50611c.f444289k && L.f(this.f444290l, c50611c.f444290l) && this.f444291m == c50611c.f444291m && L.f(this.f444292n, c50611c.f444292n) && this.f444293o == c50611c.f444293o && L.f(this.f444294p, c50611c.f444294p) && this.f444295q == c50611c.f444295q && L.f(this.f444296r, c50611c.f444296r) && this.f444297s == c50611c.f444297s && this.f444298t == c50611c.f444298t && this.f444299u == c50611c.f444299u && this.f444300v == c50611c.f444300v;
    }

    public final int hashCode() {
        String str = this.f444280b;
        int iD2 = H.d(r.i(r.i(r.i((str == null ? 0 : str.hashCode()) * 31, 31, this.f444281c), 31, this.f444282d), 31, this.f444283e), 31, this.f444284f);
        PrintableText printableText = this.f444285g;
        int i12 = r.i(H.d((iD2 + (printableText == null ? 0 : printableText.hashCode())) * 31, 31, this.f444286h), 31, this.f444287i);
        Boolean bool = this.f444288j;
        int i13 = r.i((i12 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f444289k);
        Boolean bool2 = this.f444290l;
        int i14 = r.i((i13 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.f444291m);
        Boolean bool3 = this.f444292n;
        return Boolean.hashCode(this.f444300v) + r.i(r.i(r.i(H.d(r.i(H.d(r.i((i14 + (bool3 != null ? bool3.hashCode() : 0)) * 31, 31, this.f444293o), 31, this.f444294p), 31, this.f444295q), 31, this.f444296r), 31, this.f444297s), 31, this.f444298t), 31, this.f444299u);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComfortableDealInviteState(clientId=");
        sb2.append(this.f444280b);
        sb2.append(", isInitial=");
        sb2.append(this.f444281c);
        sb2.append(", isLoading=");
        sb2.append(this.f444282d);
        sb2.append(", isSuccessScreen=");
        sb2.append(this.f444283e);
        sb2.append(", linkInput=");
        sb2.append(this.f444284f);
        sb2.append(", linkInputError=");
        sb2.append(this.f444285g);
        sb2.append(", commissionInput=");
        sb2.append(this.f444286h);
        sb2.append(", commissionInputIsEmpty=");
        sb2.append(this.f444287i);
        sb2.append(", isContractSigned=");
        sb2.append(this.f444288j);
        sb2.append(", isContractSignedEmpty=");
        sb2.append(this.f444289k);
        sb2.append(", hasMinorOwners=");
        sb2.append(this.f444290l);
        sb2.append(", hasMinorOwnersEmpty=");
        sb2.append(this.f444291m);
        sb2.append(", hasRestrictions=");
        sb2.append(this.f444292n);
        sb2.append(", hasRestrictionsEmpty=");
        sb2.append(this.f444293o);
        sb2.append(", responsibleAgent=");
        sb2.append(this.f444294p);
        sb2.append(", responsibleAgentIsEmpty=");
        sb2.append(this.f444295q);
        sb2.append(", comment=");
        sb2.append(this.f444296r);
        sb2.append(", isCallConfirmed=");
        sb2.append(this.f444297s);
        sb2.append(", isCallConfirmedEmpty=");
        sb2.append(this.f444298t);
        sb2.append(", isTermsConfirmed=");
        sb2.append(this.f444299u);
        sb2.append(", isTermsConfirmedEmpty=");
        return r.x(sb2, this.f444300v, ')');
    }

    public /* synthetic */ C50611c(String str, boolean z12, boolean z13, boolean z14, String str2, PrintableText printableText, String str3, boolean z15, Boolean bool, boolean z16, Boolean bool2, boolean z17, Boolean bool3, boolean z18, String str4, boolean z19, String str5, boolean z22, boolean z23, boolean z24, boolean z25, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? true : z12, (i12 & 4) != 0 ? false : z13, (i12 & 8) != 0 ? false : z14, (i12 & 16) != 0 ? "" : str2, (i12 & 32) != 0 ? null : printableText, (i12 & 64) != 0 ? "" : str3, (i12 & 128) != 0 ? false : z15, (i12 & 256) != 0 ? null : bool, (i12 & 512) != 0 ? false : z16, (i12 & 1024) != 0 ? null : bool2, (i12 & 2048) != 0 ? false : z17, (i12 & 4096) != 0 ? null : bool3, (i12 & 8192) != 0 ? false : z18, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? "" : str4, (i12 & 32768) != 0 ? false : z19, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? "" : str5, (i12 & 131072) != 0 ? false : z22, (i12 & 262144) != 0 ? false : z23, (i12 & 524288) != 0 ? false : z24, (i12 & 1048576) != 0 ? false : z25);
    }

    public C50611c(@l String str, boolean z12, boolean z13, boolean z14, @k String str2, @l PrintableText printableText, @k String str3, boolean z15, @l Boolean bool, boolean z16, @l Boolean bool2, boolean z17, @l Boolean bool3, boolean z18, @k String str4, boolean z19, @k String str5, boolean z22, boolean z23, boolean z24, boolean z25) {
        this.f444280b = str;
        this.f444281c = z12;
        this.f444282d = z13;
        this.f444283e = z14;
        this.f444284f = str2;
        this.f444285g = printableText;
        this.f444286h = str3;
        this.f444287i = z15;
        this.f444288j = bool;
        this.f444289k = z16;
        this.f444290l = bool2;
        this.f444291m = z17;
        this.f444292n = bool3;
        this.f444293o = z18;
        this.f444294p = str4;
        this.f444295q = z19;
        this.f444296r = str5;
        this.f444297s = z22;
        this.f444298t = z23;
        this.f444299u = z24;
        this.f444300v = z25;
    }
}
