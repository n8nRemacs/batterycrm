package com.avito.android.messenger.conversation.mvi.messages.composables.other;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
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
import androidx.compose.ui.i;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: UnreadMessagesDividerContent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class y {

    /* compiled from: UnreadMessagesDividerContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f192852l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f192853m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f192854n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.v vVar, int i12, int i13) {
            super(2);
            this.f192852l = vVar;
            this.f192853m = i12;
            this.f192854n = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f192853m | 1);
            int i12 = this.f192854n;
            y.a(this.f192852l, a12, iA2, i12);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.l androidx.compose.ui.v vVar, @Y61.l A a12, int i12, int i13) {
        androidx.compose.ui.v vVar2;
        int i14;
        B bE2 = a12.E(1620288538);
        int i15 = i13 & 1;
        if (i15 != 0) {
            i14 = i12 | 6;
            vVar2 = vVar;
        } else if ((i12 & 14) == 0) {
            vVar2 = vVar;
            i14 = (bE2.B(vVar2) ? 4 : 2) | i12;
        } else {
            vVar2 = vVar;
            i14 = i12;
        }
        if ((i14 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            androidx.compose.ui.v vVar3 = i15 != 0 ? androidx.compose.ui.v.f42878y1 : vVar2;
            androidx.compose.ui.v vVarA = C22501m2.a(C20588k2.d(vVar3, 1.0f), "unreadMessagesDividerTag");
            InterfaceC22215f.f39074a.getClass();
            i.a aVar = InterfaceC22215f.a.f39089o;
            C20585k.f28659a.getClass();
            I iA2 = H.a(C20585k.f28662d, aVar, bE2, 48);
            int i16 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            float f12 = 16;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.g.a(f12, null, bE2, 6);
            String strC = u0.i.c(bE2, R.string.messenger_divider_title);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65245p;
            com.akita.compose.theme.re23.a aVar4 = com.akita.compose.theme.re23.b.f63984b;
            com.akita.compose.foundation.ui.p.b(strC, rVar, null, false, aVar4.f63918e0.c(bE2), null, 0, 0, false, null, bE2, 3072, 996);
            com.akita.compose.foundation.ui.g.a(8, null, bE2, 6);
            com.avito.android.lib.compose.design.shared.divider.a.a(C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), aVar4.f63933j0, 1, 0.0f, bE2, 390, 8);
            com.akita.compose.foundation.ui.g.a(f12, null, bE2, 6);
            bE2.X(true);
            vVar2 = vVar3;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(vVar2, i12, i13);
        }
    }
}
