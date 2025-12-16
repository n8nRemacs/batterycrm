package com.avito.android.tariff_lf_constructor.configure.level.compose;

import android.content.Context;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import mD0.C43950b;

/* compiled from: ConstructorConfigureLevelFeatureItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_tariff-lf-constructor_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    /* compiled from: ConstructorConfigureLevelFeatureItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C43950b.a f299756l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C43950b.a aVar, int i12) {
            super(2);
            this.f299756l = aVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            b.a(this.f299756l, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k C43950b.a aVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-1187046211);
        if ((((bE2.B(aVar) ? 4 : 2) | i12) & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarD = C20588k2.d(aVar2, 1.0f);
            C20585k.f28659a.getClass();
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, bE2, 48);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarD);
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
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            Context context = (Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b);
            aVar.getClass();
            com.akita.compose.foundation.ui.e.a(u0.e.a(C35835l0.j(R.attr.ic_check16, context), 0, bE2), null, null, aVar.f414422b, bE2, 56, 4);
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.g.b(8, null, bE2, 6, 2);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.p.b(aVar.f414421a, com.akita.compose.theme.re23.b.f63988f.f65241l, C22501m2.a(aVar2, "ConstructorConfigureLevelFeatureText"), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(aVar, i12);
        }
    }
}
