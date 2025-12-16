package com.avito.android.reputation.ui.items.reputation_pie_chart;

import Y61.l;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReputationPieChartState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/reputation/ui/items/reputation_pie_chart/h;", "", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    public final float f254906a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final r f254907b;

    public h(float f12, @l r rVar) {
        this.f254906a = f12;
        this.f254907b = rVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Float.compare(this.f254906a, hVar.f254906a) == 0 && L.f(this.f254907b, hVar.f254907b);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f254906a) * 31;
        r rVar = this.f254907b;
        return iHashCode + (rVar == null ? 0 : rVar.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "ReputationPieChartState(percent=" + this.f254906a + ", color=" + this.f254907b + ')';
    }
}
