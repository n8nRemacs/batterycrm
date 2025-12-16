package com.avito.android.messenger.conversation.mvi.messages.composables.messages;

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
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.foundation.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SystemTextMessage.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k String str, @l String str2, @l v.a aVar, @l A a12, int i12) {
        int i13;
        B b12;
        v.a aVar2;
        B bE2 = a12.E(2094441366);
        if ((i12 & 14) == 0) {
            i13 = i12 | (bE2.B(str) ? 4 : 2);
        } else {
            i13 = i12;
        }
        int i14 = i13 | (bE2.B(str2) ? 32 : 16) | 384;
        if ((i14 & 731) == 146 && bE2.c()) {
            bE2.f();
            aVar2 = aVar;
            b12 = bE2;
        } else {
            v.a aVar3 = v.f42878y1;
            InterfaceC22215f.f39074a.getClass();
            i.a aVar4 = InterfaceC22215f.a.f39089o;
            C20585k.f28659a.getClass();
            I iA2 = H.a(C20585k.f28662d, aVar4, bE2, 48);
            int i15 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, aVar3);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar5 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar5);
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
            com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers.common.e.b(str2, null, bE2, ((i14 >> 3) & 14) | 48);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            r rVar = com.akita.compose.theme.re23.b.f63988f.f65245p;
            long jC2 = com.akita.compose.theme.re23.b.f63984b.f63918e0.c(bE2);
            androidx.compose.ui.text.style.i.f42675b.getClass();
            int i16 = androidx.compose.ui.text.style.i.f42678e;
            v vVarD = C20588k2.d(aVar3, 1.0f);
            float f12 = 44;
            h.a aVar6 = androidx.compose.ui.unit.h.f42849c;
            b12 = bE2;
            com.akita.compose.foundation.ui.p.b(str, rVar, R1.l(vVarD, f12, 16, f12, 8), false, jC2, androidx.compose.ui.text.style.i.a(i16), 0, 0, false, null, bE2, (i14 & 14) | 3456, 960);
            b12.X(true);
            aVar2 = aVar3;
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new g(str, str2, aVar2, i12);
        }
    }
}
