package Cb1;

import Fc1.a8;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.u0;
import okhttp3.internal.http2.Http2;
import ru.uxfeedback.pub.sdk.UxFbTargetPlatform;
import shark.AndroidResourceIdNames;

@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LCb1/h;", "", "a", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class h {

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final a f2300r = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public boolean f2301a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2302b;

    /* renamed from: c, reason: collision with root package name */
    public int f2303c;

    /* renamed from: d, reason: collision with root package name */
    public int f2304d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2305e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2306f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final b f2307g;

    /* renamed from: h, reason: collision with root package name */
    public int f2308h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2309i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final b f2310j;

    /* renamed from: k, reason: collision with root package name */
    public int f2311k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2312l;

    /* renamed from: m, reason: collision with root package name */
    public int f2313m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final String f2314n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final String f2315o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final UxFbTargetPlatform f2316p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final String f2317q;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCb1/h$a;", "", "<init>", "()V", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    public h() {
        this(false, false, 0, 0, 0, false, null, 0, 0, null, 0, 0, 0, null, null, null, null, 131071, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f2301a == hVar.f2301a && this.f2302b == hVar.f2302b && this.f2303c == hVar.f2303c && this.f2304d == hVar.f2304d && this.f2305e == hVar.f2305e && this.f2306f == hVar.f2306f && L.f(this.f2307g, hVar.f2307g) && this.f2308h == hVar.f2308h && this.f2309i == hVar.f2309i && L.f(this.f2310j, hVar.f2310j) && this.f2311k == hVar.f2311k && this.f2312l == hVar.f2312l && this.f2313m == hVar.f2313m && L.f(this.f2314n, hVar.f2314n) && L.f(this.f2315o, hVar.f2315o) && this.f2316p == hVar.f2316p && L.f(this.f2317q, hVar.f2317q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    public final int hashCode() {
        boolean z12 = this.f2301a;
        ?? r02 = z12;
        if (z12) {
            r02 = 1;
        }
        int i12 = r02 * 31;
        ?? r32 = this.f2302b;
        int i13 = r32;
        if (r32 != 0) {
            i13 = 1;
        }
        int iE2 = r.e(this.f2305e, r.e(this.f2304d, r.e(this.f2303c, (i12 + i13) * 31, 31), 31), 31);
        boolean z13 = this.f2306f;
        return this.f2317q.hashCode() + ((this.f2316p.hashCode() + H.d(H.d(r.e(this.f2313m, r.e(this.f2312l, r.e(this.f2311k, a8.a(this.f2310j, r.e(this.f2309i, r.e(this.f2308h, a8.a(this.f2307g, (iE2 + (z13 ? 1 : z13 ? 1 : 0)) * 31), 31), 31)), 31), 31), 31), 31, this.f2314n), 31, this.f2315o)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UxFbSettings(debugEnabled=");
        sb2.append(this.f2301a);
        sb2.append(", fieldsEventEnabled=");
        sb2.append(this.f2302b);
        sb2.append(", retryTimeout=");
        sb2.append(this.f2303c);
        sb2.append(", retryCount=");
        sb2.append(this.f2304d);
        sb2.append(", socketTimeout=");
        sb2.append(this.f2305e);
        sb2.append(", slideInUiBlocked=");
        sb2.append(this.f2306f);
        sb2.append(", slideInUiBlackoutColor=");
        sb2.append(this.f2307g);
        sb2.append(", slideInUiBlackoutOpacity=");
        sb2.append(this.f2308h);
        sb2.append(", slideInUiBlackoutBlur=");
        sb2.append(this.f2309i);
        sb2.append(", popupUiBlackoutColor=");
        sb2.append(this.f2310j);
        sb2.append(", popupUiBlackoutOpacity=");
        sb2.append(this.f2311k);
        sb2.append(", popupUiBlackoutBlur=");
        sb2.append(this.f2312l);
        sb2.append(", startGlobalDelayTimer=");
        sb2.append(this.f2313m);
        sb2.append(", apiUrlDedicated=");
        sb2.append(this.f2314n);
        sb2.append(", processName=");
        sb2.append(this.f2315o);
        sb2.append(", targetPlatform=");
        sb2.append(this.f2316p);
        sb2.append(", targetPlatformVersion=");
        return C22026a.c(sb2, this.f2317q, ')');
    }

    public h(boolean z12, boolean z13, int i12, int i13, int i14, boolean z14, b bVar, int i15, int i16, b bVar2, int i17, int i18, int i19, String str, String str2, UxFbTargetPlatform uxFbTargetPlatform, String str3, int i22, C42822w c42822w) {
        b bVar3;
        int i23;
        int i24;
        b bVar4;
        int i25;
        String str4;
        String str5;
        String str6;
        int i26 = 0;
        boolean z15 = (i22 & 1) != 0 ? false : z12;
        boolean z16 = (i22 & 2) != 0 ? false : z13;
        int i27 = (i22 & 4) != 0 ? 300 : i12;
        int i28 = (i22 & 8) != 0 ? 10 : i13;
        int i29 = (i22 & 16) != 0 ? 25 : i14;
        boolean z17 = (i22 & 32) != 0 ? false : z14;
        if ((i22 & 64) != 0) {
            b.f2292b.getClass();
            bVar3 = new b(null);
            bVar3.f2293a = 0;
        } else {
            bVar3 = bVar;
        }
        if ((i22 & 128) != 0) {
            int i32 = J.f406821a;
            i23 = 0;
        } else {
            i23 = i15;
        }
        if ((i22 & 256) != 0) {
            int i33 = J.f406821a;
            i24 = 0;
        } else {
            i24 = i16;
        }
        if ((i22 & 512) != 0) {
            b.f2292b.getClass();
            bVar4 = new b(null);
            bVar4.f2293a = 0;
        } else {
            bVar4 = bVar2;
        }
        if ((i22 & 1024) != 0) {
            int i34 = J.f406821a;
            i25 = 0;
        } else {
            i25 = i17;
        }
        if ((i22 & 2048) != 0) {
            int i35 = J.f406821a;
        } else {
            i26 = i18;
        }
        int i36 = (i22 & 4096) != 0 ? 1800 : i19;
        if ((i22 & 8192) != 0) {
            u0 u0Var = u0.f406856a;
            str4 = "";
        } else {
            str4 = str;
        }
        String str7 = str4;
        if ((i22 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            u0 u0Var2 = u0.f406856a;
            str5 = "";
        } else {
            str5 = str2;
        }
        UxFbTargetPlatform uxFbTargetPlatform2 = (i22 & 32768) != 0 ? UxFbTargetPlatform.f437151b : uxFbTargetPlatform;
        if ((i22 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0) {
            u0 u0Var3 = u0.f406856a;
            str6 = "";
        } else {
            str6 = str3;
        }
        this.f2301a = z15;
        this.f2302b = z16;
        this.f2303c = i27;
        this.f2304d = i28;
        this.f2305e = i29;
        this.f2306f = z17;
        this.f2307g = bVar3;
        this.f2308h = i23;
        this.f2309i = i24;
        this.f2310j = bVar4;
        this.f2311k = i25;
        this.f2312l = i26;
        this.f2313m = i36;
        this.f2314n = str7;
        this.f2315o = str5;
        this.f2316p = uxFbTargetPlatform2;
        this.f2317q = str6;
    }
}
