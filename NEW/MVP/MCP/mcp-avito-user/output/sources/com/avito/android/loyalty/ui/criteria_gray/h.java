package com.avito.android.loyalty.ui.criteria_gray;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CriteriaGrayItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria_gray/h;", "", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f183599a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final IW.b f183600b;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@k List<? extends com.avito.conveyor_item.a> list, @l IW.b bVar) {
        this.f183599a = list;
        this.f183600b = bVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f183599a, hVar.f183599a) && L.f(this.f183600b, hVar.f183600b);
    }

    public final int hashCode() {
        int iHashCode = this.f183599a.hashCode() * 31;
        IW.b bVar = this.f183600b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    @k
    public final String toString() {
        return "CriteriaGrayItem(items=" + this.f183599a + ", analyticsInfo=" + this.f183600b + ')';
    }

    public /* synthetic */ h(List list, IW.b bVar, int i12, C42822w c42822w) {
        this(list, (i12 & 2) != 0 ? null : bVar);
    }
}
