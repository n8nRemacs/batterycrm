package com.akita.compose.component.button;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Button.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class p extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f60813l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f60814m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f60815n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f60816o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r f60817p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f60818q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f60819r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f60820s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Y41.a aVar, t tVar, v vVar, boolean z12, r rVar, C22096n c22096n, int i12, int i13) {
        super(2);
        this.f60813l = aVar;
        this.f60814m = tVar;
        this.f60815n = vVar;
        this.f60816o = z12;
        this.f60817p = rVar;
        this.f60818q = c22096n;
        this.f60819r = i12;
        this.f60820s = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f60819r | 1);
        boolean z12 = this.f60816o;
        m.b(this.f60813l, this.f60814m, this.f60815n, z12, this.f60817p, this.f60818q, a12, iA2, this.f60820s);
        return G0.f406611a;
    }
}
