package com.akita.view.component.pull_to_refresh.state;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: PullToRefreshState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/view/component/pull_to_refresh/state/a;", "", "pull-to-refresh_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f66991a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f66992b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<G0> f66993c;

    /* compiled from: PullToRefreshState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.akita.view.component.pull_to_refresh.state.a$a, reason: collision with other inner class name */
    public static final class C2117a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2117a f66994l = new C2117a();

        public C2117a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    public a() {
        this(false, false, null, 7, null);
    }

    public static a a(a aVar, boolean z12, int i12) {
        boolean z13 = (i12 & 1) != 0 ? aVar.f66991a : true;
        if ((i12 & 2) != 0) {
            z12 = aVar.f66992b;
        }
        Y41.a<G0> aVar2 = aVar.f66993c;
        aVar.getClass();
        return new a(z13, z12, aVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f66991a == aVar.f66991a && this.f66992b == aVar.f66992b && L.f(this.f66993c, aVar.f66993c);
    }

    public final int hashCode() {
        return this.f66993c.hashCode() + r.i(Boolean.hashCode(this.f66991a) * 31, 31, this.f66992b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PullToRefreshState(isRefreshing=");
        sb2.append(this.f66991a);
        sb2.append(", disableScrollWhileRefreshing=");
        sb2.append(this.f66992b);
        sb2.append(", onRefresh=");
        return r.v(sb2, this.f66993c, ')');
    }

    public a(boolean z12, boolean z13, @k Y41.a<G0> aVar) {
        this.f66991a = z12;
        this.f66992b = z13;
        this.f66993c = aVar;
    }

    public /* synthetic */ a(boolean z12, boolean z13, Y41.a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13, (i12 & 4) != 0 ? C2117a.f66994l : aVar);
    }
}
