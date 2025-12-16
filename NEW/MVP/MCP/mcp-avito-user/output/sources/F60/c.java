package f60;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.passport.network.model.BusinessVrfDuplication;
import com.avito.android.passport.network.model.MergeAccountsProfile;
import com.avito.android.passport.profile_add.merge.profiles_list.recycler.v;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProfilesListState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf60/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c extends q {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f395670b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f395671c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f395672d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f395673e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<v> f395674f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<v> f395675g;

    /* renamed from: h, reason: collision with root package name */
    public final int f395676h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final List<MergeAccountsProfile> f395677i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final BusinessVrfDuplication f395678j;

    public c() {
        this(false, false, false, false, null, null, 0, null, null, 511, null);
    }

    public static c a(c cVar, boolean z12, boolean z13, boolean z14, boolean z15, List list, List list2, int i12, List list3, BusinessVrfDuplication businessVrfDuplication, int i13) {
        boolean z16 = (i13 & 1) != 0 ? cVar.f395670b : z12;
        boolean z17 = (i13 & 2) != 0 ? cVar.f395671c : z13;
        boolean z18 = (i13 & 4) != 0 ? cVar.f395672d : z14;
        boolean z19 = (i13 & 8) != 0 ? cVar.f395673e : z15;
        List list4 = (i13 & 16) != 0 ? cVar.f395674f : list;
        List list5 = (i13 & 32) != 0 ? cVar.f395675g : list2;
        int i14 = (i13 & 64) != 0 ? cVar.f395676h : i12;
        List list6 = (i13 & 128) != 0 ? cVar.f395677i : list3;
        BusinessVrfDuplication businessVrfDuplication2 = (i13 & 256) != 0 ? cVar.f395678j : businessVrfDuplication;
        cVar.getClass();
        return new c(z16, z17, z18, z19, list4, list5, i14, list6, businessVrfDuplication2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f395670b == cVar.f395670b && this.f395671c == cVar.f395671c && this.f395672d == cVar.f395672d && this.f395673e == cVar.f395673e && L.f(this.f395674f, cVar.f395674f) && L.f(this.f395675g, cVar.f395675g) && this.f395676h == cVar.f395676h && L.f(this.f395677i, cVar.f395677i) && L.f(this.f395678j, cVar.f395678j);
    }

    public final int hashCode() {
        int iE2 = H.e(r.e(this.f395676h, H.e(H.e(r.i(r.i(r.i(Boolean.hashCode(this.f395670b) * 31, 31, this.f395671c), 31, this.f395672d), 31, this.f395673e), 31, this.f395674f), 31, this.f395675g), 31), 31, this.f395677i);
        BusinessVrfDuplication businessVrfDuplication = this.f395678j;
        return iE2 + (businessVrfDuplication == null ? 0 : businessVrfDuplication.hashCode());
    }

    @k
    public final String toString() {
        return "ProfilesListState(isLoading=" + this.f395670b + ", isUnknownError=" + this.f395671c + ", isExpanded=" + this.f395672d + ", isMergeFinishInProgress=" + this.f395673e + ", items=" + this.f395674f + ", visibleItems=" + this.f395675g + ", alwaysVisibleCount=" + this.f395676h + ", profilesToConvert=" + this.f395677i + ", businessVrfDuplication=" + this.f395678j + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(boolean z12, boolean z13, boolean z14, boolean z15, @k List<? extends v> list, @k List<? extends v> list2, int i12, @k List<MergeAccountsProfile> list3, @l BusinessVrfDuplication businessVrfDuplication) {
        this.f395670b = z12;
        this.f395671c = z13;
        this.f395672d = z14;
        this.f395673e = z15;
        this.f395674f = list;
        this.f395675g = list2;
        this.f395676h = i12;
        this.f395677i = list3;
        this.f395678j = businessVrfDuplication;
    }

    public c(boolean z12, boolean z13, boolean z14, boolean z15, List list, List list2, int i12, List list3, BusinessVrfDuplication businessVrfDuplication, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? true : z12, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14, (i13 & 8) != 0 ? false : z15, (i13 & 16) != 0 ? C42784z0.f406748b : list, (i13 & 32) != 0 ? C42784z0.f406748b : list2, (i13 & 64) == 0 ? i12 : 0, (i13 & 128) != 0 ? C42784z0.f406748b : list3, (i13 & 256) != 0 ? null : businessVrfDuplication);
    }
}
