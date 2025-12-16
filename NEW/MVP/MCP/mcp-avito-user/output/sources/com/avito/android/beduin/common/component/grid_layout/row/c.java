package com.avito.android.beduin.common.component.grid_layout.row;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinGridLayoutRowContainer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/grid_layout/row/c;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<f<?>> f101374a;

    public c() {
        this(null, 1, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && L.f(this.f101374a, ((c) obj).f101374a);
    }

    public final int hashCode() {
        return this.f101374a.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("BeduinGridLayoutRowContainerBoundData(childBoundClasses="), this.f101374a, ')');
    }

    public c(List list, int i12, C42822w c42822w) {
        this.f101374a = (i12 & 1) != 0 ? new ArrayList() : list;
    }
}
