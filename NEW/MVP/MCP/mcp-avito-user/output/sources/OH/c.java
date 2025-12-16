package OH;

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

/* compiled from: GigTutorialsState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOH/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_gig_tutorials_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c extends q {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12149b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12150c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f12151d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f12152e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<NH.a> f12153f;

    public c() {
        this(false, false, null, null, null, 31, null);
    }

    public static c a(c cVar, boolean z12, boolean z13) {
        String str = cVar.f12151d;
        String str2 = cVar.f12152e;
        List<NH.a> list = cVar.f12153f;
        cVar.getClass();
        return new c(z12, z13, str, str2, list);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f12149b == cVar.f12149b && this.f12150c == cVar.f12150c && L.f(this.f12151d, cVar.f12151d) && L.f(this.f12152e, cVar.f12152e) && L.f(this.f12153f, cVar.f12153f);
    }

    public final int hashCode() {
        return this.f12153f.hashCode() + H.d(H.d(r.i(Boolean.hashCode(this.f12149b) * 31, 31, this.f12150c), 31, this.f12151d), 31, this.f12152e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigTutorialsState(isLoading=");
        sb2.append(this.f12149b);
        sb2.append(", isError=");
        sb2.append(this.f12150c);
        sb2.append(", title=");
        sb2.append(this.f12151d);
        sb2.append(", description=");
        sb2.append(this.f12152e);
        sb2.append(", docs=");
        return H.p(sb2, this.f12153f, ')');
    }

    public c(boolean z12, boolean z13, String str, String str2, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? true : z12, (i12 & 2) != 0 ? false : z13, (i12 & 4) != 0 ? "" : str, (i12 & 8) == 0 ? str2 : "", (i12 & 16) != 0 ? C42784z0.f406748b : list);
    }

    public c(boolean z12, boolean z13, @k String str, @k String str2, @k List<NH.a> list) {
        this.f12149b = z12;
        this.f12150c = z13;
        this.f12151d = str;
        this.f12152e = str2;
        this.f12153f = list;
    }
}
