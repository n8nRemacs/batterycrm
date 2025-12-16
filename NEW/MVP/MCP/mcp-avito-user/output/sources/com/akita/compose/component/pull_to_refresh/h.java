package com.akita.compose.component.pull_to_refresh;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PullToRefresh.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class h extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f62430l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f62431m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f62432n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f62433o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l f62434p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.i f62435q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C22096n f62436r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f62437s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f62438t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, boolean z12, Y41.a aVar, v vVar, l lVar, androidx.compose.ui.i iVar, C22096n c22096n, int i12, int i13) {
        super(2);
        this.f62430l = jVar;
        this.f62431m = z12;
        this.f62432n = aVar;
        this.f62433o = vVar;
        this.f62434p = lVar;
        this.f62435q = iVar;
        this.f62436r = c22096n;
        this.f62437s = i12;
        this.f62438t = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f62437s | 1);
        l lVar = this.f62434p;
        i.b(this.f62430l, this.f62431m, this.f62432n, this.f62433o, lVar, this.f62435q, this.f62436r, a12, iA2, this.f62438t);
        return G0.f406611a;
    }
}
