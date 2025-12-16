package com.avito.android.competitor_analytics.ui;

import androidx.compose.animation.InterfaceC20343e0;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import com.avito.android.competitor_analytics.mvi.entity.b;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: CompetitorAnalyticsSuggestsV2.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/animation/e0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/e0;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class E0 extends kotlin.jvm.internal.N implements Y41.q<InterfaceC20343e0, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b.k f124608l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124609m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public E0(b.k kVar, Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar) {
        super(3);
        this.f124608l = kVar;
        this.f124609m = lVar;
    }

    @Override // Y41.q
    public final kotlin.G0 invoke(InterfaceC20343e0 interfaceC20343e0, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        num.intValue();
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        androidx.compose.ui.v vVarM = R1.m(androidx.compose.ui.v.f42878y1, 0.0f, 12, 0.0f, 0.0f, 13);
        C20585k.f28659a.getClass();
        C20585k.l lVar = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, a13, 0);
        int f37888q = a13.getF37888Q();
        O1 o1Y = a13.y();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarM);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
        if (a13.F() == null) {
            C22190v.b();
            throw null;
        }
        a13.A();
        if (a13.getF37887P()) {
            a13.b(aVar2);
        } else {
            a13.d();
        }
        R3.b(InterfaceC22413h.a.f40796g, a13, iA2);
        R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
        Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
        if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
            androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
        androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
        a13.C(1055169960);
        b.k kVar = this.f124608l;
        int i12 = 0;
        for (Object obj : kVar.f124545d) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            B0.b((b.k.a) obj, i12 == kVar.f124545d.size() - 1, this.f124609m, a13, 8);
            i12 = i13;
        }
        a13.h();
        a13.z();
        return kotlin.G0.f406611a;
    }
}
