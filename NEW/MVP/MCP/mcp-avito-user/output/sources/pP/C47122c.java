package pp;

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

/* compiled from: ContractSignState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lpp/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pp.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C47122c extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f428772g = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f428773b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f428774c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f428775d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f428776e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f428777f;

    /* compiled from: ContractSignState.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpp/c$a;", "", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pp.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C47122c(boolean z12, boolean z13, boolean z14, @k String str, @k String str2) {
        this.f428773b = str;
        this.f428774c = str2;
        this.f428775d = z12;
        this.f428776e = z13;
        this.f428777f = z14;
    }

    public static C47122c a(C47122c c47122c, String str, boolean z12, boolean z13, int i12) {
        if ((i12 & 1) != 0) {
            str = c47122c.f428773b;
        }
        String str2 = str;
        String str3 = c47122c.f428774c;
        if ((i12 & 4) != 0) {
            z12 = c47122c.f428775d;
        }
        boolean z14 = z12;
        if ((i12 & 8) != 0) {
            z13 = c47122c.f428776e;
        }
        boolean z15 = z13;
        boolean z16 = (i12 & 16) != 0 ? c47122c.f428777f : true;
        c47122c.getClass();
        return new C47122c(z14, z15, z16, str2, str3);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47122c)) {
            return false;
        }
        C47122c c47122c = (C47122c) obj;
        return L.f(this.f428773b, c47122c.f428773b) && L.f(this.f428774c, c47122c.f428774c) && this.f428775d == c47122c.f428775d && this.f428776e == c47122c.f428776e && this.f428777f == c47122c.f428777f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f428777f) + r.i(r.i(H.d(this.f428773b.hashCode() * 31, 31, this.f428774c), 31, this.f428775d), 31, this.f428776e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContractSignState(contractUrl=");
        sb2.append(this.f428773b);
        sb2.append(", processId=");
        sb2.append(this.f428774c);
        sb2.append(", buttonIsLoading=");
        sb2.append(this.f428775d);
        sb2.append(", offerIsLoading=");
        sb2.append(this.f428776e);
        sb2.append(", showSuccessDialog=");
        return r.x(sb2, this.f428777f, ')');
    }
}
