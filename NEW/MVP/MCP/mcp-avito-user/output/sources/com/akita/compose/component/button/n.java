package com.akita.compose.component.button;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Button.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class n extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f60800l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f60801m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t f60802n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f60803o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f60804p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f60805q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f60806r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f60807s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f60808t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i12, Y41.a<G0> aVar, t tVar, v vVar, float f12, boolean z12, boolean z13, r rVar, int i13, int i14) {
        super(2);
        this.f60800l = i12;
        this.f60801m = aVar;
        this.f60802n = tVar;
        this.f60803o = vVar;
        this.f60804p = z12;
        this.f60805q = z13;
        this.f60806r = rVar;
        this.f60807s = i13;
        this.f60808t = i14;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f60807s | 1);
        boolean z12 = this.f60804p;
        m.e(this.f60800l, this.f60801m, this.f60802n, this.f60803o, z12, this.f60805q, this.f60806r, a12, iA2, this.f60808t);
        return G0.f406611a;
    }
}
