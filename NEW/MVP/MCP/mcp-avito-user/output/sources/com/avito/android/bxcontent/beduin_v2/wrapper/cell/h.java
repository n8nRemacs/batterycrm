package com.avito.android.bxcontent.beduin_v2.wrapper.cell;

import kotlin.Metadata;

/* compiled from: BxCellWrapperState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/beduin_v2/wrapper/cell/h;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CellWrapper f109585a;

    public h(@Y61.k CellWrapper cellWrapper) {
        this.f109585a = cellWrapper;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f109585a == ((h) obj).f109585a;
    }

    public final int hashCode() {
        return this.f109585a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "BxCellWrapperState(wrapper=" + this.f109585a + ')';
    }
}
