package com.avito.android.map_core.view.zoom;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ZoomButtonState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map_core/view/zoom/a;", "", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Y41.a<G0> f185831a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Y41.a<G0> f185832b;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f185831a, aVar.f185831a) && L.f(this.f185832b, aVar.f185832b);
    }

    public final int hashCode() {
        Y41.a<G0> aVar = this.f185831a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        Y41.a<G0> aVar2 = this.f185832b;
        return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ZoomButtonState(onZoomInClick=");
        sb2.append(this.f185831a);
        sb2.append(", onZoomOutClick=");
        return r.v(sb2, this.f185832b, ')');
    }

    public a(@l Y41.a<G0> aVar, @l Y41.a<G0> aVar2) {
        this.f185831a = aVar;
        this.f185832b = aVar2;
    }

    public /* synthetic */ a(Y41.a aVar, Y41.a aVar2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : aVar, (i12 & 2) != 0 ? null : aVar2);
    }
}
