package com.avito.android.bundles.vas_union.viewmodel;

import androidx.compose.foundation.H;
import com.avito.android.util.P2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VasUnionViewState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bundles/vas_union/viewmodel/w;", "", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final P2<Dk.j> f108742a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final List<com.avito.conveyor_item.a> f108743b;

    /* JADX WARN: Multi-variable type inference failed */
    public w() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return L.f(this.f108742a, wVar.f108742a) && L.f(this.f108743b, wVar.f108743b);
    }

    public final int hashCode() {
        int iHashCode = this.f108742a.hashCode() * 31;
        List<com.avito.conveyor_item.a> list = this.f108743b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VasUnionViewState(loadingState=");
        sb2.append(this.f108742a);
        sb2.append(", items=");
        return H.p(sb2, this.f108743b, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w(@Y61.k P2<? super Dk.j> p22, @Y61.l List<? extends com.avito.conveyor_item.a> list) {
        this.f108742a = p22;
        this.f108743b = list;
    }

    public /* synthetic */ w(P2 p22, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? P2.c.f318721a : p22, (i12 & 2) != 0 ? null : list);
    }
}
