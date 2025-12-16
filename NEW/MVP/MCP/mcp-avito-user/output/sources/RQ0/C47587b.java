package rQ0;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.error.ApiError;
import com.avito.android.work_profile.intent_factory.WorkProfileTab;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: WorkProfileHostState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrQ0/b;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rQ0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C47587b extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<WorkProfileTab> f429810b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final WorkProfileTab f429811c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f429812d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ApiError f429813e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f429814f;

    public C47587b() {
        this(null, null, false, null, 15, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47587b)) {
            return false;
        }
        C47587b c47587b = (C47587b) obj;
        return L.f(this.f429810b, c47587b.f429810b) && this.f429811c == c47587b.f429811c && this.f429812d == c47587b.f429812d && L.f(this.f429813e, c47587b.f429813e);
    }

    public final int hashCode() {
        int iHashCode = this.f429810b.hashCode() * 31;
        WorkProfileTab workProfileTab = this.f429811c;
        int i12 = r.i((iHashCode + (workProfileTab == null ? 0 : workProfileTab.hashCode())) * 31, 31, this.f429812d);
        ApiError apiError = this.f429813e;
        return i12 + (apiError != null ? apiError.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkProfileHostState(tabs=");
        sb2.append(this.f429810b);
        sb2.append(", currentTab=");
        sb2.append(this.f429811c);
        sb2.append(", isLoading=");
        sb2.append(this.f429812d);
        sb2.append(", error=");
        return c.n(sb2, this.f429813e, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C47587b(@k List<? extends WorkProfileTab> list, @l WorkProfileTab workProfileTab, boolean z12, @l ApiError apiError) {
        this.f429810b = list;
        this.f429811c = workProfileTab;
        this.f429812d = z12;
        this.f429813e = apiError;
        this.f429814f = apiError != null;
    }

    public C47587b(List list, WorkProfileTab workProfileTab, boolean z12, ApiError apiError, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? C42784z0.f406748b : list, (i12 & 2) != 0 ? null : workProfileTab, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? null : apiError);
    }
}
