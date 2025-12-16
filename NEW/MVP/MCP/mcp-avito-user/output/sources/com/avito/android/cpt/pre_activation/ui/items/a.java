package com.avito.android.cpt.pre_activation.ui.items;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.button.m;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PreActivationFooter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_cpt_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: PreActivationFooter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.cpt.pre_activation.ui.items.a$a, reason: collision with other inner class name */
    public static final class C3779a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f126779l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f126780m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ v f126781n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f126782o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f126783p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3779a(int i12, int i13, Y41.a aVar, v vVar, String str) {
            super(2);
            this.f126779l = str;
            this.f126780m = aVar;
            this.f126781n = vVar;
            this.f126782o = i12;
            this.f126783p = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f126782o | 1);
            a.a(iA2, this.f126783p, this.f126780m, a12, this.f126781n, this.f126779l);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(int i12, int i13, @k Y41.a aVar, @l A a12, @l v vVar, @k String str) {
        int i14;
        v vVar2;
        int i15;
        v vVar3;
        B bE2 = a12.E(777656398);
        if ((i12 & 14) == 0) {
            i14 = i12 | (bE2.B(str) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 112) == 0) {
            i14 |= bE2.u(aVar) ? 32 : 16;
        }
        int i16 = i13 & 4;
        if (i16 != 0) {
            i15 = i14 | 384;
            vVar2 = vVar;
        } else {
            vVar2 = vVar;
            i15 = i14 | (bE2.B(vVar2) ? 256 : 128);
        }
        if ((i15 & 731) == 146 && bE2.c()) {
            bE2.f();
            vVar3 = vVar2;
        } else {
            v vVar4 = i16 != 0 ? v.f42878y1 : vVar2;
            v vVarD = C20588k2.d(vVar4, 1.0f);
            float f12 = 10;
            h.a aVar2 = h.f42849c;
            v vVarL = R1.l(vVarD, f12, f12, f12, 16);
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i17 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVarL);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar3);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i17))) {
                AK.c.y(i17, bE2, i17, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            m.c(str, aVar, com.akita.compose.theme.re23.b.c(bE2).f2(), C20588k2.d(v.f42878y1, 1.0f), null, null, null, false, false, null, bE2, (i15 & 112) | (i15 & 14) | 3072 | 512, 1008);
            bE2.X(true);
            vVar3 = vVar4;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C3779a(i12, i13, aVar, vVar3, str);
        }
    }
}
