package jQ0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import java.util.List;
import kQ0.InterfaceC42620a;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AppliesToVacancyState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjQ0/b;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<InterfaceC42620a> f405608b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f405609c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f405610d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f405611e;

    public b() {
        this(null, null, false, false, 15, null);
    }

    public static b a(b bVar, String str, boolean z12, boolean z13) {
        List<InterfaceC42620a> list = bVar.f405608b;
        bVar.getClass();
        return new b(str, list, z12, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f405608b, bVar.f405608b) && L.f(this.f405609c, bVar.f405609c) && this.f405610d == bVar.f405610d && this.f405611e == bVar.f405611e;
    }

    public final int hashCode() {
        int iHashCode = this.f405608b.hashCode() * 31;
        String str = this.f405609c;
        return Boolean.hashCode(this.f405611e) + r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f405610d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AppliesToVacancyState(applies=");
        sb2.append(this.f405608b);
        sb2.append(", errorMsg=");
        sb2.append(this.f405609c);
        sb2.append(", isLoadingPage=");
        sb2.append(this.f405610d);
        sb2.append(", isLoadingPullToRefresh=");
        return r.x(sb2, this.f405611e, ')');
    }

    public b(@l String str, @k List list, boolean z12, boolean z13) {
        this.f405608b = list;
        this.f405609c = str;
        this.f405610d = z12;
        this.f405611e = z13;
    }

    public b(List list, String str, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this((i12 & 2) != 0 ? null : str, (i12 & 1) != 0 ? C42784z0.f406748b : list, (i12 & 4) != 0 ? true : z12, (i12 & 8) != 0 ? false : z13);
    }
}
