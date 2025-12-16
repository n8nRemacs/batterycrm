package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.unknown_message;

import Y41.p;
import Y61.l;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.text.style.s;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.foundation.r;
import com.akita.compose.foundation.ui.g;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import u0.i;

/* compiled from: UnknownMessageContent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@l String str, @l v vVar, @l A a12, int i12) {
        v.a aVar;
        B b12;
        int i13;
        v vVar2;
        int i14;
        boolean z12;
        v vVar3;
        B bE2 = a12.E(454045554);
        if ((((bE2.B(str) ? 4 : 2) | i12 | 48) & 91) == 18 && bE2.c()) {
            bE2.f();
            vVar3 = vVar;
            b12 = bE2;
        } else {
            v.a aVar2 = v.f42878y1;
            h.a aVar3 = h.f42849c;
            v vVarA = C22501m2.a(R1.i(aVar2, 16), "UnknownMessageContent");
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i15 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVarA);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            bE2.C(-191871061);
            if (str == null) {
                i14 = 6;
                vVar2 = null;
                z12 = false;
                aVar = aVar2;
                i13 = 4;
                b12 = bE2;
            } else {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                r rVar = com.akita.compose.theme.re23.b.f63988f.f65241l;
                s.f42720b.getClass();
                aVar = aVar2;
                b12 = bE2;
                com.akita.compose.foundation.ui.p.b(str, rVar, null, false, 0L, null, 1, s.f42722d, false, null, bE2, 14158848, 820);
                i13 = 4;
                vVar2 = null;
                i14 = 6;
                g.a(4, null, b12, 6);
                z12 = false;
            }
            b12.X(z12);
            String strC = i.c(b12, R.string.message_body_description_unsupported_type);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.ui.p.b(strC, iVar.f65244o, null, false, 0L, null, 0, 0, false, null, b12, 3072, 1012);
            g.a(i13, vVar2, b12, i14);
            com.akita.compose.foundation.ui.p.b(i.c(b12, R.string.messenger_update_app), iVar.f65246q, null, false, com.akita.compose.theme.re23.b.f63984b.f63971w.c(b12), null, 0, 0, false, null, b12, 3072, 996);
            b12.X(true);
            vVar3 = aVar;
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(i12, vVar3, str);
        }
    }
}
