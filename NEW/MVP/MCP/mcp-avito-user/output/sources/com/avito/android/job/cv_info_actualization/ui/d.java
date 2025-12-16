package com.avito.android.job.cv_info_actualization.ui;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JsxCvInfoActualizationUiState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/ui/d;", "LTP/b;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d implements TP.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TP.d f174214b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f174215c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f174216d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f174217e;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k TP.d dVar, @l String str, @k List<? extends com.avito.conveyor_item.a> list) {
        this.f174214b = dVar;
        this.f174215c = str;
        this.f174216d = list;
        this.f174217e = !dVar.f15662e;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f174214b, dVar.f174214b) && L.f(this.f174215c, dVar.f174215c) && L.f(this.f174216d, dVar.f174216d);
    }

    public final int hashCode() {
        int iHashCode = this.f174214b.hashCode() * 31;
        String str = this.f174215c;
        return this.f174216d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JsxCvInfoActualizationUiState(domainState=");
        sb2.append(this.f174214b);
        sb2.append(", actionButtonText=");
        sb2.append(this.f174215c);
        sb2.append(", cvInfoItems=");
        return H.p(sb2, this.f174216d, ')');
    }
}
