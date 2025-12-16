package com.avito.android.early_access.adapter.parameter.element;

import W2.q;
import X2.h;
import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.adjust.sdk.network.ErrorCodes;
import com.akita.compose.foundation.r;
import com.akita.compose.foundation.ui.o;
import com.akita.compose.theme.re23.g;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EarlyAccessParameter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_early-access_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: EarlyAccessParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.early_access.adapter.parameter.element.a$a, reason: collision with other inner class name */
    public static final class C4221a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ EarlyAccessParameterItem f145144l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ v f145145m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f145146n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4221a(EarlyAccessParameterItem earlyAccessParameterItem, v vVar, int i12, int i13) {
            super(2);
            this.f145144l = earlyAccessParameterItem;
            this.f145145m = vVar;
            this.f145146n = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            v vVar = this.f145145m;
            int i12 = this.f145146n;
            a.a(this.f145144l, vVar, a12, iA2, i12);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k EarlyAccessParameterItem earlyAccessParameterItem, @l v vVar, @l A a12, int i12, int i13) {
        v vVar2;
        int i14;
        B bE2 = a12.E(1420973285);
        int i15 = (bE2.B(earlyAccessParameterItem) ? 4 : 2) | i12;
        int i16 = i13 & 2;
        if (i16 != 0) {
            i14 = i15 | 48;
            vVar2 = vVar;
        } else {
            vVar2 = vVar;
            i14 = i15 | (bE2.B(vVar2) ? 32 : 16);
        }
        if ((i14 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            v vVar3 = i16 != 0 ? v.f42878y1 : vVar2;
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39085k;
            C20585k.f28659a.getClass();
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, bE2, 48);
            int i17 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVar3);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, bE2, c20568f2A);
            p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i17))) {
                AK.c.y(i17, bE2, i17, pVar3);
            }
            p<InterfaceC22413h, v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            g gVar = com.akita.compose.theme.re23.b.f63986d;
            String str = earlyAccessParameterItem.f145141c;
            gVar.getClass();
            String strA = g.a(str);
            if (strA == null) {
                strA = "";
            }
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            r rVar = iVar.f65241l;
            com.akita.compose.theme.re23.semantic.b bVar2 = com.akita.compose.theme.re23.b.f63987e;
            bVar2.getClass();
            q qVar = com.akita.compose.theme.re23.semantic.b.f65954b;
            qVar.getText().getClass();
            v vVar4 = vVar3;
            o.a(strA, rVar, null, h.f18556d, bE2, 0, 4);
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.g.b(10, null, bE2, 6, 2);
            v.a aVar3 = v.f42878y1;
            I iA2 = H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, bE2, 0);
            int i18 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            v vVarC2 = n.c(bE2, aVar3);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            R3.b(pVar, bE2, iA2);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i18))) {
                AK.c.y(i18, bE2, i18, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            K k12 = K.f28344a;
            com.akita.compose.foundation.ui.p.b(earlyAccessParameterItem.f145142d, iVar.f65241l, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
            bE2.C(-1247343055);
            if (earlyAccessParameterItem.f145143e != null) {
                com.akita.compose.foundation.ui.g.a(2, null, bE2, 6);
                bVar2.getClass();
                qVar.getText().getClass();
                com.akita.compose.foundation.ui.p.b(earlyAccessParameterItem.f145143e, iVar.f65245p, null, false, X2.h.f18557e.c(bE2), null, 0, 0, false, null, bE2, 0, ErrorCodes.PROTOCOL_EXCEPTION);
            }
            androidx.compose.foundation.H.A(bE2, false, true, true);
            vVar2 = vVar4;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C4221a(earlyAccessParameterItem, vVar2, i12, i13);
        }
    }
}
