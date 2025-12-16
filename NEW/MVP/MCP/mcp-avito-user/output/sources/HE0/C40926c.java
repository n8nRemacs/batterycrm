package he0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.util.ApiException;
import ge0.C40669a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: FreeDeliveryState.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lhe0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: he0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C40926c extends q {

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final a f397328n = new a(null);

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final C40926c f397329o = new C40926c(0, 0, 0, "", false, false, false, null, null, false, false, false);

    /* renamed from: b, reason: collision with root package name */
    public final int f397330b;

    /* renamed from: c, reason: collision with root package name */
    public final int f397331c;

    /* renamed from: d, reason: collision with root package name */
    public final int f397332d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f397333e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f397334f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f397335g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f397336h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Throwable f397337i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final C40669a f397338j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f397339k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f397340l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f397341m;

    /* compiled from: FreeDeliveryState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhe0/c$a;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: he0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C40926c(int i12, int i13, int i14, @k String str, boolean z12, boolean z13, boolean z14, @l Throwable th2, @l C40669a c40669a, boolean z15, boolean z16, boolean z17) {
        this.f397330b = i12;
        this.f397331c = i13;
        this.f397332d = i14;
        this.f397333e = str;
        this.f397334f = z12;
        this.f397335g = z13;
        this.f397336h = z14;
        this.f397337i = th2;
        this.f397338j = c40669a;
        this.f397339k = z15;
        this.f397340l = z16;
        this.f397341m = z17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Throwable] */
    public static C40926c a(C40926c c40926c, int i12, int i13, int i14, String str, boolean z12, ApiException apiException, C40669a c40669a, boolean z13, int i15) {
        int i16 = (i15 & 1) != 0 ? c40926c.f397330b : i12;
        int i17 = (i15 & 2) != 0 ? c40926c.f397331c : i13;
        int i18 = (i15 & 4) != 0 ? c40926c.f397332d : i14;
        String str2 = (i15 & 8) != 0 ? c40926c.f397333e : str;
        boolean z14 = (i15 & 16) != 0 ? c40926c.f397334f : true;
        boolean z15 = (i15 & 32) != 0 ? c40926c.f397335g : true;
        boolean z16 = (i15 & 64) != 0 ? c40926c.f397336h : z12;
        ApiException apiException2 = (i15 & 128) != 0 ? c40926c.f397337i : apiException;
        C40669a c40669a2 = (i15 & 256) != 0 ? c40926c.f397338j : c40669a;
        boolean z17 = (i15 & 512) != 0 ? c40926c.f397339k : true;
        boolean z18 = (i15 & 1024) != 0 ? c40926c.f397340l : z13;
        boolean z19 = (i15 & 2048) != 0 ? c40926c.f397341m : true;
        c40926c.getClass();
        return new C40926c(i16, i17, i18, str2, z14, z15, z16, apiException2, c40669a2, z17, z18, z19);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40926c)) {
            return false;
        }
        C40926c c40926c = (C40926c) obj;
        return this.f397330b == c40926c.f397330b && this.f397331c == c40926c.f397331c && this.f397332d == c40926c.f397332d && L.f(this.f397333e, c40926c.f397333e) && this.f397334f == c40926c.f397334f && this.f397335g == c40926c.f397335g && this.f397336h == c40926c.f397336h && L.f(this.f397337i, c40926c.f397337i) && L.f(this.f397338j, c40926c.f397338j) && this.f397339k == c40926c.f397339k && this.f397340l == c40926c.f397340l && this.f397341m == c40926c.f397341m;
    }

    public final int hashCode() {
        int i12 = r.i(r.i(r.i(H.d(r.e(this.f397332d, r.e(this.f397331c, Integer.hashCode(this.f397330b) * 31, 31), 31), 31, this.f397333e), 31, this.f397334f), 31, this.f397335g), 31, this.f397336h);
        Throwable th2 = this.f397337i;
        int iHashCode = (i12 + (th2 == null ? 0 : th2.hashCode())) * 31;
        C40669a c40669a = this.f397338j;
        return Boolean.hashCode(this.f397341m) + r.i(r.i((iHashCode + (c40669a != null ? c40669a.hashCode() : 0)) * 31, 31, this.f397339k), 31, this.f397340l);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FreeDeliveryState(curSubsidy=");
        sb2.append(this.f397330b);
        sb2.append(", minSubsidy=");
        sb2.append(this.f397331c);
        sb2.append(", maxSubsidy=");
        sb2.append(this.f397332d);
        sb2.append(", hint=");
        sb2.append(this.f397333e);
        sb2.append(", usedSlider=");
        sb2.append(this.f397334f);
        sb2.append(", usedInput=");
        sb2.append(this.f397335g);
        sb2.append(", loading=");
        sb2.append(this.f397336h);
        sb2.append(", error=");
        sb2.append(this.f397337i);
        sb2.append(", content=");
        sb2.append(this.f397338j);
        sb2.append(", loaded=");
        sb2.append(this.f397339k);
        sb2.append(", isKeyboardOpen=");
        sb2.append(this.f397340l);
        sb2.append(", isToastShown=");
        return r.x(sb2, this.f397341m, ')');
    }
}
