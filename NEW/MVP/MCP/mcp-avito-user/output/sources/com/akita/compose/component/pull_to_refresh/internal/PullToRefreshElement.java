package com.akita.compose.component.pull_to_refresh.internal;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.pull_to_refresh.j;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43259k;

/* compiled from: PullToRefreshElement.kt */
@P
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/akita/compose/component/pull_to_refresh/internal/PullToRefreshElement;", "Landroidx/compose/ui/node/p0;", "Lcom/akita/compose/component/pull_to_refresh/internal/c;", "Lkotlin/Function0;", "Lkotlin/G0;", "onRefresh", "", "enabled", "Lcom/akita/compose/component/pull_to_refresh/j;", VoiceInfo.STATE, "Landroidx/compose/ui/unit/h;", "threshold", "isRefreshing", "<init>", "(LY41/a;ZLcom/akita/compose/component/pull_to_refresh/j;FZLkotlin/jvm/internal/w;)V", "pull-to-refresh_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PullToRefreshElement extends AbstractC22430p0<c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y41.a<G0> f62439b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f62440c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final j f62441d;

    /* renamed from: e, reason: collision with root package name */
    public final float f62442e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f62443f;

    public PullToRefreshElement() {
        throw null;
    }

    public PullToRefreshElement(Y41.a aVar, boolean z12, j jVar, float f12, boolean z13, C42822w c42822w) {
        this.f62439b = aVar;
        this.f62440c = z12;
        this.f62441d = jVar;
        this.f62442e = f12;
        this.f62443f = z13;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new c(this.f62439b, this.f62440c, this.f62441d, this.f62442e, this.f62443f, null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        c cVar = (c) dVar;
        cVar.f62448r = this.f62439b;
        cVar.f62449s = this.f62440c;
        cVar.f62450t = this.f62441d;
        cVar.f62451u = this.f62442e;
        boolean z12 = cVar.f62452v;
        boolean z13 = this.f62443f;
        if (z12 != z13) {
            cVar.f62452v = z13;
            C43259k.d(cVar.Y1(), null, null, new f(cVar, null), 3);
        }
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PullToRefreshElement)) {
            return false;
        }
        PullToRefreshElement pullToRefreshElement = (PullToRefreshElement) obj;
        return L.f(this.f62439b, pullToRefreshElement.f62439b) && this.f62440c == pullToRefreshElement.f62440c && L.f(this.f62441d, pullToRefreshElement.f62441d) && h.b(this.f62442e, pullToRefreshElement.f62442e) && this.f62443f == pullToRefreshElement.f62443f;
    }

    public final int hashCode() {
        int iHashCode = (this.f62441d.hashCode() + r.i(this.f62439b.hashCode() * 31, 31, this.f62440c)) * 31;
        h.a aVar = h.f42849c;
        return Boolean.hashCode(this.f62443f) + r.d(this.f62442e, iHashCode, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PullToRefreshElement(onRefresh=");
        sb2.append(this.f62439b);
        sb2.append(", enabled=");
        sb2.append(this.f62440c);
        sb2.append(", state=");
        sb2.append(this.f62441d);
        sb2.append(", threshold=");
        H.u(this.f62442e, ", isRefreshing=", sb2);
        return r.x(sb2, this.f62443f, ')');
    }
}
