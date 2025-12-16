package bB0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CpaInfoState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LbB0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bB0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C25490c extends q {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final a f56996j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final C25490c f56997k = new C25490c("", C42784z0.f406748b, null, null, false, false, false, false);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f56998b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f56999c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f57000d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f57001e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f57002f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f57003g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f57004h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f57005i;

    /* compiled from: CpaInfoState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbB0/c$a;", "", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bB0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C25490c(@k String str, @k List<? extends com.avito.conveyor_item.a> list, @l String str2, @l String str3, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f56998b = str;
        this.f56999c = list;
        this.f57000d = str2;
        this.f57001e = str3;
        this.f57002f = z12;
        this.f57003g = z13;
        this.f57004h = z14;
        this.f57005i = z15;
    }

    public static C25490c a(C25490c c25490c, String str, List list, String str2, String str3, boolean z12, boolean z13, boolean z14, boolean z15, int i12) {
        String str4 = (i12 & 1) != 0 ? c25490c.f56998b : str;
        List list2 = (i12 & 2) != 0 ? c25490c.f56999c : list;
        String str5 = (i12 & 4) != 0 ? c25490c.f57000d : str2;
        String str6 = (i12 & 8) != 0 ? c25490c.f57001e : str3;
        boolean z16 = (i12 & 16) != 0 ? c25490c.f57002f : z12;
        boolean z17 = (i12 & 32) != 0 ? c25490c.f57003g : z13;
        boolean z18 = (i12 & 64) != 0 ? c25490c.f57004h : z14;
        boolean z19 = (i12 & 128) != 0 ? c25490c.f57005i : z15;
        c25490c.getClass();
        return new C25490c(str4, list2, str5, str6, z16, z17, z18, z19);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25490c)) {
            return false;
        }
        C25490c c25490c = (C25490c) obj;
        return L.f(this.f56998b, c25490c.f56998b) && L.f(this.f56999c, c25490c.f56999c) && L.f(this.f57000d, c25490c.f57000d) && L.f(this.f57001e, c25490c.f57001e) && this.f57002f == c25490c.f57002f && this.f57003g == c25490c.f57003g && this.f57004h == c25490c.f57004h && this.f57005i == c25490c.f57005i;
    }

    public final int hashCode() {
        int iE2 = H.e(this.f56998b.hashCode() * 31, 31, this.f56999c);
        String str = this.f57000d;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57001e;
        return Boolean.hashCode(this.f57005i) + r.i(r.i(r.i((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f57002f), 31, this.f57003g), 31, this.f57004h);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CpaInfoState(title=");
        sb2.append(this.f56998b);
        sb2.append(", items=");
        sb2.append(this.f56999c);
        sb2.append(", successPaymentMessage=");
        sb2.append(this.f57000d);
        sb2.append(", error=");
        sb2.append(this.f57001e);
        sb2.append(", isLoading=");
        sb2.append(this.f57002f);
        sb2.append(", isDelayedLoading=");
        sb2.append(this.f57003g);
        sb2.append(", needToRefreshOnStartup=");
        sb2.append(this.f57004h);
        sb2.append(", needToRefreshLevelInfo=");
        return r.x(sb2, this.f57005i, ')');
    }
}
