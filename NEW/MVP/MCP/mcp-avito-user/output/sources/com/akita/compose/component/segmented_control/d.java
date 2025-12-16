package com.akita.compose.component.segmented_control;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: SegmentedControlIndicator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/segmented_control/d;", "", "segmented-control_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f62546a;

    /* renamed from: b, reason: collision with root package name */
    public final int f62547b;

    public d(int i12, int i13) {
        this.f62546a = i12;
        this.f62547b = i13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f62546a == dVar.f62546a && this.f62547b == dVar.f62547b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f62547b) + (Integer.hashCode(this.f62546a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SegmentedControlIndicatorData(x=");
        sb2.append(this.f62546a);
        sb2.append(", indicatorWidth=");
        return androidx.appcompat.app.r.t(sb2, this.f62547b, ')');
    }
}
