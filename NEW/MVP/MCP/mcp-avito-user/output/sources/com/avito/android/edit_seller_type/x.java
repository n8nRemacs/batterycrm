package com.avito.android.edit_seller_type;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.edit_seller_type.mvi.entity.c;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EditSellerTypeScreen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class x extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c.d f146873l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<c.f, G0> f146874m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(c.d dVar, Y41.l<? super c.f, G0> lVar) {
        super(2);
        this.f146873l = dVar;
        this.f146874m = lVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        v.a aVar;
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            i.a aVar3 = InterfaceC22215f.a.f39088n;
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, aVar3, a13, 0);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, aVar2);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar4);
            } else {
                a13.d();
            }
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, a13, iA2);
            Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, a13, vVarC);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            c.d dVar = this.f146873l;
            String str = dVar.f146812b;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            int i12 = 11;
            com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65234e, null, false, 0L, null, 0, 0, false, null, a13, 0, 1020);
            a13.C(-1572246463);
            AttributedText attributedText = dVar.f146813c;
            if (attributedText == null) {
                aVar = aVar2;
            } else {
                h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
                aVar = aVar2;
                C20608p2.a(a13, C20588k2.f(aVar, 4));
                com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, null, 0, null, null, 0, a13, 8, 62);
            }
            a13.h();
            androidx.compose.foundation.layout.I iA3 = androidx.compose.foundation.layout.H.a(lVar, aVar3, a13, 0);
            int f37888q2 = a13.getF37888Q();
            O1 o1Y2 = a13.y();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(a13, aVar);
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar4);
            } else {
                a13.d();
            }
            R3.b(pVar, a13, iA3);
            R3.b(pVar2, a13, o1Y2);
            if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q2))) {
                androidx.appcompat.app.r.B(f37888q2, a13, f37888q2, pVar3);
            }
            R3.b(pVar4, a13, vVarC2);
            a13.C(558511950);
            for (c.e eVar : dVar.f146814d) {
                h.a aVar6 = androidx.compose.ui.unit.h.f42849c;
                C20608p2.a(a13, C20588k2.f(androidx.compose.ui.v.f42878y1, i12));
                o.f(eVar, new w(this.f146874m, eVar), a13, 8);
                i12 = i12;
            }
            a13.h();
            a13.z();
            a13.z();
        }
        return G0.f406611a;
    }
}
