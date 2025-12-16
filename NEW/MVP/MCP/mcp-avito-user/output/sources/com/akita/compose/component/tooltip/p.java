package com.akita.compose.component.tooltip;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Tooltip.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class p extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f63530l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f63531m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f63532n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f63533o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f63534p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f63535q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, androidx.compose.ui.v vVar, Y41.a aVar, boolean z12, C22096n c22096n, int i12) {
        super(2);
        this.f63530l = rVar;
        this.f63531m = vVar;
        this.f63532n = aVar;
        this.f63533o = z12;
        this.f63534p = c22096n;
        this.f63535q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f63535q | 1);
        C22096n c22096n = this.f63534p;
        androidx.compose.ui.v vVar = this.f63531m;
        Y41.a<G0> aVar = this.f63532n;
        k.b(this.f63530l, vVar, aVar, this.f63533o, c22096n, a12, iA2);
        return G0.f406611a;
    }
}
