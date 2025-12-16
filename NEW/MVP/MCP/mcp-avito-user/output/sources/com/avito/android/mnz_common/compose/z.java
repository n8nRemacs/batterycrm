package com.avito.android.mnz_common.compose;

import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.C20646z1;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MnzSegmentedControl.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class z extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<String> f197968l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f197969m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Integer f197970n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(List<String> list, Y41.l<? super Integer, G0> lVar, Integer num) {
        super(2);
        this.f197968l = list;
        this.f197969m = lVar;
        this.f197970n = num;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        C20576h2 c20576h2;
        boolean z12;
        float f12;
        androidx.compose.runtime.A a13;
        androidx.compose.runtime.A a14 = a12;
        if ((num.intValue() & 11) == 2 && a14.c()) {
            a14.f();
        } else {
            float f13 = 1.0f;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarA = C20646z1.a(R1.i(C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), 4), IntrinsicSize.f28333b);
            C20585k.f28659a.getClass();
            C20585k.C1589k c1589k = C20585k.f28660b;
            InterfaceC22215f.f39074a.getClass();
            boolean z13 = false;
            C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, a14, 0);
            int f37888q = a14.getF37888Q();
            O1 o1Y = a14.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a14, vVarA);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            if (a14.F() == null) {
                C22190v.b();
                throw null;
            }
            a14.A();
            if (a14.getF37887P()) {
                a14.b(aVar2);
            } else {
                a14.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, a14, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, a14, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (a14.getF37887P() || !L.f(a14.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a14, f37888q, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, a14, vVarC);
            C20576h2 c20576h22 = C20576h2.f28641a;
            a14.C(1958315958);
            int i12 = 0;
            for (Object obj : this.f197968l) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                String str = (String) obj;
                InterfaceC22215f.f39074a.getClass();
                androidx.compose.ui.i iVar = InterfaceC22215f.a.f39080f;
                androidx.compose.ui.v vVar = androidx.compose.ui.v.f42878y1;
                androidx.compose.ui.v vVarD0 = c20576h22.a(vVar, f13, true).d0(C20588k2.f28681b);
                a14.C(1784234554);
                Object objT = a14.t();
                androidx.compose.runtime.A.f37866a.getClass();
                Object obj2 = A.a.f37868b;
                if (objT == obj2) {
                    objT = androidx.compose.foundation.interaction.l.a();
                    a14.H(objT);
                }
                androidx.compose.foundation.interaction.m mVar = (androidx.compose.foundation.interaction.m) objT;
                a14.h();
                a14.C(1784236683);
                Y41.l<Integer, G0> lVar = this.f197969m;
                boolean zB2 = a14.B(lVar) | a14.m(i12);
                Object objT2 = a14.t();
                if (zB2 || objT2 == obj2) {
                    objT2 = new w(i12, lVar);
                    a14.H(objT2);
                }
                a14.h();
                androidx.compose.ui.v vVarB = C21086w0.b(vVarD0, mVar, null, false, null, (Y41.a) objT2, 28);
                a14.C(1784238668);
                Integer num2 = this.f197970n;
                boolean zB3 = a14.B(num2) | a14.m(i12);
                Object objT3 = a14.t();
                if (zB3 || objT3 == obj2) {
                    objT3 = new x(i12, num2);
                    a14.H(objT3);
                }
                a14.h();
                androidx.compose.ui.v vVarD = com.avito.android.bxcontent.mvi.entity.f.d(i12, androidx.compose.ui.semantics.r.b(vVarB, z13, (Y41.l) objT3), "MNZ_SEGMENTED_CONTROL_BOX_TEST_TAG_");
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(iVar, z13);
                int f37888q2 = a14.getF37888Q();
                O1 o1Y2 = a14.y();
                androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(a14, vVarD);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
                if (a14.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a14.A();
                if (a14.getF37887P()) {
                    a14.b(aVar3);
                } else {
                    a14.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, a14, interfaceC22365i0D);
                R3.b(InterfaceC22413h.a.f40795f, a14, o1Y2);
                Y41.p<InterfaceC22413h, Integer, G0> pVar2 = InterfaceC22413h.a.f40799j;
                if (a14.getF37887P() || !L.f(a14.t(), Integer.valueOf(f37888q2))) {
                    androidx.appcompat.app.r.B(f37888q2, a14, f37888q2, pVar2);
                }
                R3.b(InterfaceC22413h.a.f40793d, a14, vVarC2);
                C20644z c20644z = C20644z.f28804a;
                if (num2.intValue() == i12) {
                    a14.C(-1673009826);
                    y yVar = y.f197967l;
                    com.akita.compose.theme.re23.b.f63983a.getClass();
                    com.akita.compose.component.button.t tVarJ = com.akita.compose.theme.re23.b.c(a14).j();
                    com.akita.compose.foundation.modifier.f fVar = com.akita.compose.theme.re23.b.b(a14).getF66891b().f60474l;
                    if (fVar != null) {
                        float f14 = com.akita.compose.foundation.modifier.d.f63611a;
                        androidx.compose.ui.v vVarA2 = com.akita.compose.foundation.modifier.d.a(vVar, fVar.f63623a, fVar.f63624b, com.akita.compose.foundation.modifier.d.f63611a);
                        if (vVarA2 != null) {
                            vVar = vVarA2;
                        }
                    }
                    c20576h2 = c20576h22;
                    z12 = z13;
                    f12 = f13;
                    com.akita.compose.component.button.m.c(str, yVar, tVarJ, com.avito.android.bxcontent.mvi.entity.f.d(i12, vVar.d0(C20588k2.f28682c), "MNZ_SEGMENTED_CONTROL_BUTTON_TEST_TAG_"), null, null, null, false, false, null, a14, 560, 1008);
                    a14.h();
                    a13 = a14;
                } else {
                    c20576h2 = c20576h22;
                    z12 = z13;
                    f12 = f13;
                    a14.C(-1672482919);
                    com.akita.compose.theme.re23.b.f63983a.getClass();
                    long jC2 = com.akita.compose.theme.re23.b.f63984b.f63918e0.c(a14);
                    a13 = a14;
                    com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65241l, C22501m2.a(vVar, "MNZ_SEGMENTED_CONTROL_TEXT_TEST_TAG_" + i12), false, jC2, null, 0, 0, false, null, a14, 0, 1000);
                    a13.h();
                }
                a13.z();
                i12 = i13;
                f13 = f12;
                c20576h22 = c20576h2;
                z13 = z12;
                a14 = a13;
            }
            androidx.compose.runtime.A a15 = a14;
            a15.h();
            a15.z();
        }
        return G0.f406611a;
    }
}
