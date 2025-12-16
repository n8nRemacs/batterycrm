package UE;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: FreeDeliveryState.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LUE/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_free-delivery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c extends q {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f16311i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final c f16312j = new c(0, "", false, false, false, false, false);

    /* renamed from: b, reason: collision with root package name */
    public final int f16313b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f16314c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16315d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16316e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16317f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f16318g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f16319h;

    /* compiled from: FreeDeliveryState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUE/c$a;", "", "<init>", "()V", "_avito_free-delivery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(int i12, @k String str, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f16313b = i12;
        this.f16314c = str;
        this.f16315d = z12;
        this.f16316e = z13;
        this.f16317f = z14;
        this.f16318g = z15;
        this.f16319h = z16;
    }

    public static c a(c cVar, int i12, String str, boolean z12, int i13) {
        if ((i13 & 1) != 0) {
            i12 = cVar.f16313b;
        }
        int i14 = i12;
        if ((i13 & 2) != 0) {
            str = cVar.f16314c;
        }
        String str2 = str;
        boolean z13 = (i13 & 4) != 0 ? cVar.f16315d : true;
        boolean z14 = (i13 & 8) != 0 ? cVar.f16316e : true;
        boolean z15 = (i13 & 16) != 0 ? cVar.f16317f : true;
        if ((i13 & 32) != 0) {
            z12 = cVar.f16318g;
        }
        boolean z16 = z12;
        cVar.getClass();
        boolean z17 = (i13 & 128) != 0 ? cVar.f16319h : true;
        cVar.getClass();
        return new c(i14, str2, z13, z14, z15, z16, z17);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f16313b == cVar.f16313b && L.f(this.f16314c, cVar.f16314c) && this.f16315d == cVar.f16315d && this.f16316e == cVar.f16316e && this.f16317f == cVar.f16317f && this.f16318g == cVar.f16318g && L.f(null, null) && this.f16319h == cVar.f16319h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16319h) + r.i(r.i(r.i(r.i(H.d(Integer.hashCode(this.f16313b) * 31, 31, this.f16314c), 31, this.f16315d), 31, this.f16316e), 31, this.f16317f), 961, this.f16318g);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FreeDeliveryState(curSubsidy=");
        sb2.append(this.f16313b);
        sb2.append(", hint=");
        sb2.append(this.f16314c);
        sb2.append(", usedSlider=");
        sb2.append(this.f16315d);
        sb2.append(", usedInput=");
        sb2.append(this.f16316e);
        sb2.append(", accepted=");
        sb2.append(this.f16317f);
        sb2.append(", loading=");
        sb2.append(this.f16318g);
        sb2.append(", error=null, isKeyboardOpen=");
        return r.x(sb2, this.f16319h, ')');
    }
}
