package com.avito.android.bbip_common.ui.chips;

import AK.c;
import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
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
import com.akita.compose.component.chips.y;
import com.akita.compose.foundation.r;
import com.akita.compose.foundation.ui.g;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BbipChipContent.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lcom/akita/compose/component/chips/y$a;", "chipStyle", "_avito_bbip_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {

    /* compiled from: BbipChipContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bbip_common.ui.chips.a$a, reason: collision with other inner class name */
    public static final class C2985a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b f99066l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2985a(b bVar, int i12) {
            super(2);
            this.f99066l = bVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            a.a(this.f99066l, a12, iA2);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k b bVar, @l A a12, int i12) {
        B bE2 = a12.E(-456134506);
        if ((((bE2.B(bVar) ? 4 : 2) | i12) & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            r rVar = ((y.a) com.akita.compose.theme.re23.b.d(bE2).getF66026e().a(bVar.f99069d, true, bE2).getF42167b()).f60988a.f60846r;
            v.a aVar = v.f42878y1;
            h.a aVar2 = h.f42849c;
            v vVarK = R1.k(20, 0.0f, 2, aVar);
            C20585k.f28659a.getClass();
            C20585k.C1589k c1589k = C20585k.f28660b;
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVarK);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
                c.y(i13, bE2, i13, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            com.akita.compose.foundation.ui.p.b(bVar.f99067b, rVar, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
            bE2.C(-903299665);
            String str = bVar.f99068c;
            if (str != null) {
                g.b(6, null, bE2, 6, 2);
                com.akita.compose.component.strikethrough.b.b(str, rVar, com.akita.compose.theme.re23.b.f63984b.f63880R0, null, 0, 0, bE2, 0, 56);
            }
            bE2.X(false);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C2985a(bVar, i12);
        }
    }
}
