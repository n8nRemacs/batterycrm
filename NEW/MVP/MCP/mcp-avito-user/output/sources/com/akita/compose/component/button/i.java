package com.akita.compose.component.button;

import androidx.compose.animation.l2;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.graphics.C22274n0;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class i extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f60725l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f60726m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f60727n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ t f60728o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f60729p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f60730q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.shape.n f60731r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f60732s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f60733t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f60734u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C22096n f60735v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(v vVar, float f12, float f13, t tVar, boolean z12, Y41.a aVar, androidx.compose.foundation.shape.n nVar, float f14, androidx.compose.foundation.interaction.m mVar, r rVar, C22096n c22096n) {
        super(2);
        this.f60725l = vVar;
        this.f60726m = f12;
        this.f60727n = f13;
        this.f60728o = tVar;
        this.f60729p = z12;
        this.f60730q = aVar;
        this.f60731r = nVar;
        this.f60732s = f14;
        this.f60733t = mVar;
        this.f60734u = rVar;
        this.f60735v = c22096n;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        com.akita.compose.foundation.p pVar;
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            v vVarA = C22274n0.a(androidx.compose.ui.semantics.r.b(C20588k2.a(this.f60725l, this.f60726m, this.f60727n), false, f.f60722l), new g(this.f60734u));
            t tVar = this.f60728o;
            tVar.getClass();
            a13.C(-114172562);
            boolean z12 = this.f60729p;
            if (z12) {
                a13.C(-1380093865);
                pVar = tVar.f60837i;
            } else {
                a13.C(-1380093121);
                pVar = tVar.f60838j;
            }
            long jC2 = pVar.c(a13);
            a13.h();
            I3 i3B = l2.b(jC2, tVar.f60854z, a13, 64, 12);
            a13.h();
            long j12 = ((T) i3B.getF42167b()).f39331a;
            com.akita.compose.foundation.p pVar2 = z12 ? tVar.f60839k : tVar.f60841m;
            com.akita.compose.foundation.ui.n.c(this.f60730q, j12, vVarA, this.f60731r, this.f60732s, pVar2, this.f60733t, com.akita.compose.foundation.n.d(0.0f, 7, 0L, false), this.f60729p, androidx.compose.runtime.internal.r.c(-2007276283, new h(this.f60735v), a13), a13, 100663296, 6);
        }
        return G0.f406611a;
    }
}
