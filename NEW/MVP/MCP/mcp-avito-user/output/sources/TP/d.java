package TP;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: JsxCvInfoActualizationState.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LTP/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "LTP/b;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d extends q implements b {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final com.avito.android.job.cv_info_actualization.mvi.domain.a f15659b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15660c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15661d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15662e;

    public d() {
        this(null, false, false, false, 15, null);
    }

    public static d a(d dVar, com.avito.android.job.cv_info_actualization.mvi.domain.a aVar, boolean z12, boolean z13, boolean z14, int i12) {
        if ((i12 & 1) != 0) {
            aVar = dVar.f15659b;
        }
        if ((i12 & 2) != 0) {
            z12 = dVar.f15660c;
        }
        if ((i12 & 4) != 0) {
            z13 = dVar.f15661d;
        }
        if ((i12 & 8) != 0) {
            z14 = dVar.f15662e;
        }
        dVar.getClass();
        return new d(aVar, z12, z13, z14);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f15659b, dVar.f15659b) && this.f15660c == dVar.f15660c && this.f15661d == dVar.f15661d && this.f15662e == dVar.f15662e;
    }

    public final int hashCode() {
        com.avito.android.job.cv_info_actualization.mvi.domain.a aVar = this.f15659b;
        return Boolean.hashCode(this.f15662e) + r.i(r.i((aVar == null ? 0 : aVar.hashCode()) * 31, 31, this.f15660c), 31, this.f15661d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JsxCvInfoActualizationState(cvActualizationInfo=");
        sb2.append(this.f15659b);
        sb2.append(", isError=");
        sb2.append(this.f15660c);
        sb2.append(", isLoading=");
        sb2.append(this.f15661d);
        sb2.append(", isActionButtonLoading=");
        return r.x(sb2, this.f15662e, ')');
    }

    public /* synthetic */ d(com.avito.android.job.cv_info_actualization.mvi.domain.a aVar, boolean z12, boolean z13, boolean z14, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : aVar, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? true : z13, (i12 & 8) != 0 ? false : z14);
    }

    public d(@l com.avito.android.job.cv_info_actualization.mvi.domain.a aVar, boolean z12, boolean z13, boolean z14) {
        this.f15659b = aVar;
        this.f15660c = z12;
        this.f15661d = z13;
        this.f15662e = z14;
    }
}
