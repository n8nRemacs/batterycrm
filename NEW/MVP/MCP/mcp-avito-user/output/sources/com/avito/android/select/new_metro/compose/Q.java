package com.avito.android.select.new_metro.compose;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.V;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: StationCircles.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_select_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Q {

    /* compiled from: StationCircles.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ List<Integer> f266073l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ long f266074m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f266075n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f266076o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<Integer> list, long j12, androidx.compose.ui.v vVar, int i12, int i13) {
            super(2);
            this.f266073l = list;
            this.f266074m = j12;
            this.f266075n = vVar;
            this.f266076o = i13;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(9);
            List<Integer> list = this.f266073l;
            int i12 = this.f266076o;
            Q.b(list, this.f266074m, this.f266075n, a12, iA2, i12);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(int i12, long j12, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i13) {
        androidx.compose.runtime.B bE2 = a12.E(-1952738843);
        if ((((bE2.m(i12) ? 4 : 2) | i13 | (bE2.n(j12) ? 32 : 16) | (bE2.B(vVar) ? 256 : 128)) & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarO = C20588k2.o(aVar2, 12);
            androidx.compose.foundation.shape.n nVar = androidx.compose.foundation.shape.o.f30153a;
            androidx.compose.ui.v vVarA = androidx.compose.ui.draw.k.a(vVarO, nVar);
            Y0.a aVar4 = Y0.f39346a;
            C20632w.a(androidx.compose.foundation.A.b(vVarA, j12, aVar4), bE2, 0);
            C20632w.a(c20644z.d(androidx.compose.foundation.A.b(androidx.compose.ui.draw.k.a(C20588k2.o(aVar2, 8), nVar), V.b(i12), aVar4), InterfaceC22215f.a.f39080f), bE2, 0);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new P(i12, j12, vVar, i13);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@Y61.k List<Integer> list, long j12, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12, int i13) {
        androidx.compose.runtime.B bE2 = a12.E(-2066928823);
        androidx.compose.ui.v vVar2 = (i13 & 4) != 0 ? androidx.compose.ui.v.f42878y1 : vVar;
        InterfaceC22215f.f39074a.getClass();
        InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
        int i14 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar2);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
        if (bE2.f37890b == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar);
        } else {
            bE2.d();
        }
        R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20644z c20644z = C20644z.f28804a;
        bE2.C(-961712153);
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                C42745f0.H0();
                throw null;
            }
            int iIntValue = ((Number) obj).intValue();
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            float f12 = i15 * 7;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            a(iIntValue, j12, R1.m(aVar2, f12, 0.0f, 0.0f, 0.0f, 14), bE2, 0);
            i15 = i16;
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, false, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new a(list, j12, vVar2, i12, i13);
        }
    }
}
