package com.akita.compose.component.navbar;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NavBarAction.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class g extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f62220l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f62221m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f62222n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f62223o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f62224p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f62225q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, Y41.a aVar, androidx.compose.ui.v vVar, C22096n c22096n, int i12, int i13) {
        super(2);
        this.f62220l = iVar;
        this.f62221m = aVar;
        this.f62222n = vVar;
        this.f62223o = c22096n;
        this.f62224p = i12;
        this.f62225q = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f62224p | 1);
        C22096n c22096n = this.f62223o;
        Y41.a<G0> aVar = this.f62221m;
        h.b(this.f62220l, aVar, this.f62222n, c22096n, a12, iA2, this.f62225q);
        return G0.f406611a;
    }
}
