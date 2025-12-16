package mQ0;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.cv_snippet.CvSnippet;
import com.avito.android.remote.error.ApiError;
import com.avito.android.work_profile.domain.entity.CvsAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CvsState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmQ0/b;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mQ0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C44003b extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<CvSnippet> f414501b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final CvsAction f414502c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f414503d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ApiError f414504e;

    public C44003b() {
        this(null, null, false, null, 15, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44003b)) {
            return false;
        }
        C44003b c44003b = (C44003b) obj;
        return L.f(this.f414501b, c44003b.f414501b) && L.f(this.f414502c, c44003b.f414502c) && this.f414503d == c44003b.f414503d && L.f(this.f414504e, c44003b.f414504e);
    }

    public final int hashCode() {
        int iHashCode = this.f414501b.hashCode() * 31;
        CvsAction cvsAction = this.f414502c;
        int i12 = r.i((iHashCode + (cvsAction == null ? 0 : cvsAction.hashCode())) * 31, 31, this.f414503d);
        ApiError apiError = this.f414504e;
        return i12 + (apiError != null ? apiError.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CvsState(list=");
        sb2.append(this.f414501b);
        sb2.append(", action=");
        sb2.append(this.f414502c);
        sb2.append(", isLoadingPage=");
        sb2.append(this.f414503d);
        sb2.append(", error=");
        return c.n(sb2, this.f414504e, ')');
    }

    public C44003b(@k List<CvSnippet> list, @l CvsAction cvsAction, boolean z12, @l ApiError apiError) {
        this.f414501b = list;
        this.f414502c = cvsAction;
        this.f414503d = z12;
        this.f414504e = apiError;
    }

    public C44003b(List list, CvsAction cvsAction, boolean z12, ApiError apiError, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? C42784z0.f406748b : list, (i12 & 2) != 0 ? null : cvsAction, (i12 & 4) != 0 ? true : z12, (i12 & 8) != 0 ? null : apiError);
    }
}
