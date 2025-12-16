package com.akita.compose.component.avatar.group;

import Y41.p;
import Y41.r;
import Y61.l;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.draw.o;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AvatarGroup.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"avatar_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k k kVar, @l v.a aVar, @l String str, @Y61.k Y41.l lVar, @l A a12, int i12) {
        v.a aVar2;
        B bE2 = a12.E(-972063970);
        int i13 = i12 | (bE2.B(kVar) ? 4 : 2) | 48 | (bE2.B(str) ? 256 : 128);
        if ((i13 & 5851) == 1170 && bE2.c()) {
            bE2.f();
            aVar2 = aVar;
        } else {
            v.a aVar3 = v.f42878y1;
            InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(lVar, bE2);
            bE2.C(907860559);
            Object objT = bE2.t();
            A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = C22126m3.d(new d(interfaceC22204y1M));
                bE2.H(objT);
            }
            I3 i32 = (I3) objT;
            bE2.X(false);
            C20585k c20585k = C20585k.f28659a;
            float f12 = kVar.f60323c;
            c20585k.getClass();
            C20585k.j jVarG = C20585k.g(f12);
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(jVarG, InterfaceC22215f.a.f39086l, bE2, 48);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, aVar3);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar4);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            long jC2 = kVar.f60325e.c(bE2);
            bE2.C(-1290544248);
            Iterator it = ((j) i32.getF42167b()).f60320a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r rVar = (r) it.next();
                v.a aVar5 = v.f42878y1;
                bE2.C(-2064632403);
                boolean zN2 = bE2.n(jC2) | ((i13 & 14) == 4);
                Object objT2 = bE2.t();
                if (zN2 || objT2 == A.a.f37868b) {
                    objT2 = new a(jC2, kVar);
                    bE2.H(objT2);
                }
                bE2.X(false);
                rVar.invoke(kVar.f60321a, o.b(aVar5, (Y41.l) objT2), bE2, 0);
            }
            bE2.X(false);
            if (str != null) {
                v.a aVar6 = v.f42878y1;
                bE2.C(-1290529847);
                boolean zN3 = ((i13 & 14) == 4) | bE2.n(jC2);
                Object objT3 = bE2.t();
                if (zN3 || objT3 == A.a.f37868b) {
                    objT3 = new b(jC2, kVar);
                    bE2.H(objT3);
                }
                bE2.X(false);
                com.akita.compose.component.badge.a.a(kVar.f60322b, o.b(aVar6, (Y41.l) objT3), str, 0, false, false, bE2, i13 & 896, 56);
            }
            bE2.X(true);
            aVar2 = aVar3;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(kVar, aVar2, str, lVar, i12);
        }
    }
}
