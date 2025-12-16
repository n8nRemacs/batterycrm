package com.avito.android.cart_sheet_after_adding.ui.components;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.I0;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.text.C22662l;
import androidx.compose.ui.text.X;
import androidx.compose.ui.text.e0;
import androidx.compose.ui.text.font.C22605a0;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.text.font.Z;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CartSheetAfterAddingMainSnippet.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/I0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/I0;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class n extends N implements Y41.q<I0, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f115568l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f115569m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Integer f115570n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, String str2, Integer num) {
        super(3);
        this.f115568l = str;
        this.f115569m = str2;
        this.f115570n = num;
    }

    @Override // Y41.q
    public final G0 invoke(I0 i02, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.ui.v vVarM;
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.r rVar = iVar.f65236g;
            v.a aVar = androidx.compose.ui.v.f42878y1;
            String str = this.f115569m;
            if (str != null) {
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                vVarM = R1.m(aVar, 0.0f, 0.0f, 6, 0.0f, 11);
            } else {
                vVarM = aVar;
            }
            aVar.getClass();
            com.akita.compose.foundation.ui.p.b(this.f115568l, rVar, C22501m2.a(vVarM, "mainItem-price"), false, 0L, null, 0, 0, false, null, a13, 0, 1016);
            if (str != null) {
                C20585k.f28659a.getClass();
                C20585k.C1589k c1589k = C20585k.f28660b;
                InterfaceC22215f.f39074a.getClass();
                C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, a13, 0);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, aVar);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar3);
                } else {
                    a13.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, a13, c20568f2A);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                C20576h2 c20576h2 = C20576h2.f28641a;
                com.akita.compose.theme.re23.a aVar4 = com.akita.compose.theme.re23.b.f63984b;
                com.akita.compose.component.strikethrough.b.a(C22662l.a(str, new e0(aVar4.f63918e0.c(a13), 0L, (androidx.compose.ui.text.font.e0) null, (Z) null, (C22605a0) null, (E) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.n) null, (z0.f) null, 0L, (androidx.compose.ui.text.style.j) null, (f1) null, (X) null, (androidx.compose.ui.graphics.drawscope.j) null, 65534, (C42822w) null)), iVar.f65241l, aVar4.f63880R0, C22501m2.a(aVar, "mainItem-oldPrice"), 0, 0, a13, 3072, 48);
                h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.foundation.ui.g.b(6, null, a13, 6, 2);
                com.akita.compose.foundation.ui.p.b(com.akita.compose.component.accordion.s.j(new StringBuilder("–"), this.f115570n, '%'), iVar.f65240k, C22501m2.a(aVar, "mainItem-discountPercents"), false, aVar4.f63880R0.c(a13), null, 0, 0, false, null, a13, 384, 1000);
                a13.z();
            }
        }
        return G0.f406611a;
    }
}
