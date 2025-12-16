package com.avito.android.lib.design.tab_group;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TabGroupState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/tab_group/d;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<b> f180736a;

    /* renamed from: b, reason: collision with root package name */
    public final int f180737b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Y41.l<Integer, G0> f180738c;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k List<b> list, int i12, @l Y41.l<? super Integer, G0> lVar) {
        this.f180736a = list;
        this.f180737b = i12;
        this.f180738c = lVar;
    }

    public static d a(d dVar, List list, int i12) {
        Y41.l<Integer, G0> lVar = dVar.f180738c;
        dVar.getClass();
        return new d(list, i12, lVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f180736a, dVar.f180736a) && this.f180737b == dVar.f180737b && L.f(this.f180738c, dVar.f180738c);
    }

    public final int hashCode() {
        int iE2 = r.e(this.f180737b, this.f180736a.hashCode() * 31, 31);
        Y41.l<Integer, G0> lVar = this.f180738c;
        return iE2 + (lVar == null ? 0 : lVar.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabGroupState(tabs=");
        sb2.append(this.f180736a);
        sb2.append(", currentTab=");
        sb2.append(this.f180737b);
        sb2.append(", onTabSelected=");
        return H.l(sb2, this.f180738c, ')');
    }

    public /* synthetic */ d(List list, int i12, Y41.l lVar, int i13, C42822w c42822w) {
        this(list, i12, (i13 & 4) != 0 ? null : lVar);
    }
}
