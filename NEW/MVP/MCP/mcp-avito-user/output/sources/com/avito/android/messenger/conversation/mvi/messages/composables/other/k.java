package com.avito.android.messenger.conversation.mvi.messages.composables.other;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
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
import androidx.compose.ui.i;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PaginationErrorContent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k {

    /* compiled from: PaginationErrorContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f192805l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: PaginationErrorContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f192806l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f192807m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f192808n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, int i13, Y41.a aVar, androidx.compose.ui.v vVar) {
            super(2);
            this.f192806l = vVar;
            this.f192807m = aVar;
            this.f192808n = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            Y41.a<G0> aVar = this.f192807m;
            k.a(iA2, this.f192808n, aVar, a12, this.f192806l);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(int i12, int i13, @Y61.l Y41.a aVar, @Y61.l A a12, @Y61.l androidx.compose.ui.v vVar) {
        androidx.compose.ui.v vVar2;
        int i14;
        Y41.a aVar2;
        int i15;
        Y41.a aVar3;
        B bE2 = a12.E(-306128570);
        int i16 = i13 & 1;
        if (i16 != 0) {
            i14 = i12 | 6;
            vVar2 = vVar;
        } else {
            vVar2 = vVar;
            i14 = (bE2.B(vVar2) ? 4 : 2) | i12;
        }
        int i17 = 2 & i13;
        if (i17 != 0) {
            i15 = i14 | 48;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i15 = i14 | (bE2.u(aVar2) ? 32 : 16);
        }
        int i18 = i15;
        if ((i18 & 91) == 18 && bE2.c()) {
            bE2.f();
            aVar3 = aVar2;
        } else {
            androidx.compose.ui.v vVar3 = i16 != 0 ? androidx.compose.ui.v.f42878y1 : vVar2;
            aVar3 = i17 != 0 ? a.f192805l : aVar2;
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            float f12 = 12;
            androidx.compose.ui.v vVarD = C20588k2.d(R1.j(vVar3, 16, f12), 1.0f);
            InterfaceC22215f.f39074a.getClass();
            i.a aVar5 = InterfaceC22215f.a.f39089o;
            C20585k.f28659a.getClass();
            I iA2 = H.a(C20585k.f28662d, aVar5, bE2, 48);
            int i19 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarD);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar6 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar6);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i19))) {
                AK.c.y(i19, bE2, i19, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            String strC = u0.i.c(bE2, R.string.messenger_chat_pagination_error_message);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.p.b(strC, com.akita.compose.theme.re23.b.f63988f.f65245p, null, false, com.akita.compose.theme.re23.b.f63984b.f63918e0.c(bE2), null, 0, 0, false, null, bE2, 3072, 996);
            C20608p2.a(bE2, C20588k2.f(androidx.compose.ui.v.f42878y1, f12));
            com.akita.compose.component.button.m.a(R.string.retry, aVar3, com.akita.compose.theme.re23.b.c(bE2).r2(), null, null, false, false, bE2, (i18 & 112) | 512, 1016);
            bE2.X(true);
            vVar2 = vVar3;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(i12, i13, aVar3, vVar2);
        }
    }
}
