package J00;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PhoneConfirmState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LJ00/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c extends q {

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final a f8699o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    @k
    public static final c f8700p = new c("", "", null, "personal", "", "", "", 6, null, 60, 60, false, false);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f8701b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f8702c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f8703d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f8704e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f8705f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f8706g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f8707h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8708i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f8709j;

    /* renamed from: k, reason: collision with root package name */
    public final int f8710k;

    /* renamed from: l, reason: collision with root package name */
    public final int f8711l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f8712m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f8713n;

    /* compiled from: PhoneConfirmState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJ00/c$a;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k String str, @k String str2, @l String str3, @k String str4, @k String str5, @k String str6, @k String str7, int i12, @l String str8, int i13, int i14, boolean z12, boolean z13) {
        this.f8701b = str;
        this.f8702c = str2;
        this.f8703d = str3;
        this.f8704e = str4;
        this.f8705f = str5;
        this.f8706g = str6;
        this.f8707h = str7;
        this.f8708i = i12;
        this.f8709j = str8;
        this.f8710k = i13;
        this.f8711l = i14;
        this.f8712m = z12;
        this.f8713n = z13;
    }

    public static c a(c cVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i12, int i13, boolean z12, boolean z13, int i14) {
        String str8 = (i14 & 1) != 0 ? cVar.f8701b : str;
        String str9 = (i14 & 2) != 0 ? cVar.f8702c : str2;
        String str10 = (i14 & 4) != 0 ? cVar.f8703d : str3;
        String str11 = cVar.f8704e;
        String str12 = (i14 & 16) != 0 ? cVar.f8705f : str4;
        String str13 = (i14 & 32) != 0 ? cVar.f8706g : str5;
        String str14 = (i14 & 64) != 0 ? cVar.f8707h : str6;
        int i15 = cVar.f8708i;
        String str15 = (i14 & 256) != 0 ? cVar.f8709j : str7;
        int i16 = (i14 & 512) != 0 ? cVar.f8710k : i12;
        int i17 = (i14 & 1024) != 0 ? cVar.f8711l : i13;
        boolean z14 = (i14 & 2048) != 0 ? cVar.f8712m : z12;
        boolean z15 = (i14 & 4096) != 0 ? cVar.f8713n : z13;
        cVar.getClass();
        return new c(str8, str9, str10, str11, str12, str13, str14, i15, str15, i16, i17, z14, z15);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f8701b, cVar.f8701b) && L.f(this.f8702c, cVar.f8702c) && L.f(this.f8703d, cVar.f8703d) && L.f(this.f8704e, cVar.f8704e) && L.f(this.f8705f, cVar.f8705f) && L.f(this.f8706g, cVar.f8706g) && L.f(this.f8707h, cVar.f8707h) && this.f8708i == cVar.f8708i && L.f(this.f8709j, cVar.f8709j) && this.f8710k == cVar.f8710k && this.f8711l == cVar.f8711l && this.f8712m == cVar.f8712m && this.f8713n == cVar.f8713n;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f8701b.hashCode() * 31, 31, this.f8702c);
        String str = this.f8703d;
        int iE2 = r.e(this.f8708i, H.d(H.d(H.d(H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f8704e), 31, this.f8705f), 31, this.f8706g), 31, this.f8707h), 31);
        String str2 = this.f8709j;
        return Boolean.hashCode(this.f8713n) + r.i(r.e(this.f8711l, r.e(this.f8710k, (iE2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31), 31, this.f8712m);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhoneConfirmState(applicationId=");
        sb2.append(this.f8701b);
        sb2.append(", applicantId=");
        sb2.append(this.f8702c);
        sb2.append(", applicantType=");
        sb2.append(this.f8703d);
        sb2.append(", flowType=");
        sb2.append(this.f8704e);
        sb2.append(", step=");
        sb2.append(this.f8705f);
        sb2.append(", subtitle=");
        sb2.append(this.f8706g);
        sb2.append(", code=");
        sb2.append(this.f8707h);
        sb2.append(", codeSize=");
        sb2.append(this.f8708i);
        sb2.append(", errorMessage=");
        sb2.append(this.f8709j);
        sb2.append(", timeoutSeconds=");
        sb2.append(this.f8710k);
        sb2.append(", timeLeftInSeconds=");
        sb2.append(this.f8711l);
        sb2.append(", confirmationLoading=");
        sb2.append(this.f8712m);
        sb2.append(", retryButtonLoading=");
        return r.x(sb2, this.f8713n, ')');
    }
}
