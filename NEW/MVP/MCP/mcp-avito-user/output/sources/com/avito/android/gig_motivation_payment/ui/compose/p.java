package com.avito.android.gig_motivation_payment.ui.compose;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.a2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35829k2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import sH.C48049a;
import vH.InterfaceC49211a;
import vH.c;

/* compiled from: MotivationPaymentScreen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class p extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c.b f160156l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC49211a, G0> f160157m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(c.b bVar, Y41.l<? super InterfaceC49211a, G0> lVar) {
        super(2);
        this.f160156l = bVar;
        this.f160157m = lVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        v.a aVar;
        C48049a c48049a;
        Y41.l<InterfaceC49211a, G0> lVar;
        int i12;
        Y41.l<InterfaceC49211a, G0> lVar2;
        com.avito.android.gig_apply.ui.common.h hVar;
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarM = R1.m(a2.b(C20588k2.d(aVar2, 1.0f), a2.a(a13), true, true), 0.0f, 40, 0.0f, 0.0f, 13);
            InterfaceC22215f.f39074a.getClass();
            i.a aVar4 = InterfaceC22215f.a.f39089o;
            C20585k.f28659a.getClass();
            I iA2 = H.a(C20585k.f28662d, aVar4, a13, 48);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarM);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar5 = InterfaceC22413h.a.f40791b;
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar5);
            } else {
                a13.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, a13, iA2);
            R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
            K k12 = K.f28344a;
            C48049a c48049a2 = this.f160156l.f440640c;
            Context context = (Context) a13.o(AndroidCompositionLocals_androidKt.f41069b);
            float f12 = 60;
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) a13.o(Q0.f41199h);
            Uri uriC = C35829k2.b(UniversalImageKt.getImageDependsOnTheme(c48049a2.f437567c, com.avito.android.lib.util.darkTheme.c.b(context)), kotlin.math.b.b(dVar.M0(f12)), kotlin.math.b.b(dVar.M0(f12)), 0.0f, 1, 44).c(o.f160155b);
            a13.C(1731474261);
            if (uriC != null) {
                coil.compose.v.b(uriC, "icon", C20588k2.o(aVar2, f12), null, null, null, a13, 440, 4088);
            }
            a13.h();
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.r rVar = iVar.f65233d;
            androidx.compose.ui.text.style.i.f42675b.getClass();
            int i13 = androidx.compose.ui.text.style.i.f42678e;
            com.akita.compose.foundation.ui.p.b(c48049a2.f437565a, rVar, C22501m2.a(aVar2, "HeaderTitleTag"), false, 0L, androidx.compose.ui.text.style.i.a(i13), 0, 0, false, null, a13, 384, 984);
            com.akita.compose.foundation.ui.p.b(c48049a2.f437566b, iVar.f65241l, C22501m2.a(aVar2, "HeaderSubtitleTag"), false, 0L, androidx.compose.ui.text.style.i.a(i13), 0, 0, false, null, a13, 384, 984);
            a13.C(1731497642);
            Y41.l<InterfaceC49211a, G0> lVar3 = this.f160157m;
            sH.h hVar2 = c48049a2.f437568d;
            if (hVar2 == null) {
                c48049a = c48049a2;
                lVar = lVar3;
                i12 = 28;
                aVar = aVar2;
            } else {
                aVar = aVar2;
                c48049a = c48049a2;
                lVar = lVar3;
                i12 = 28;
                com.akita.compose.component.button.m.c(hVar2.f437588a, new k(lVar3, hVar2), com.akita.compose.theme.re23.b.c(a13).f2(), C22501m2.a(R1.m(R1.k(16, 0.0f, 2, C20588k2.d(aVar2, 1.0f)), 0.0f, 28, 0.0f, 0.0f, 13), "MotivationPaymentPrimaryButtonTag"), null, null, null, false, false, null, a13, 3584, 1008);
            }
            a13.h();
            a13.C(1731518806);
            sH.e eVar = c48049a.f437569e;
            if (eVar != null) {
                C20608p2.a(a13, R1.m(aVar, 0.0f, i12, 0.0f, 0.0f, 13));
                sH.f fVar = eVar.f437578a;
                if (fVar != null) {
                    String str = fVar.f437582a;
                    hVar = new com.avito.android.gig_apply.ui.common.h(fVar.f437584c, fVar.f437583b, fVar.f437585d, str);
                } else {
                    hVar = null;
                }
                lVar2 = lVar;
                com.avito.android.gig_apply.ui.common.i.c(new com.avito.android.gig_apply.ui.common.t(hVar, eVar.f437579b, eVar.f437580c, eVar.f437581d), new l(lVar2, c48049a), new m(lVar2, c48049a), a13, 8, 2);
            } else {
                lVar2 = lVar;
            }
            a13.h();
            a13.C(1731551496);
            sH.d dVar2 = c48049a.f437570f;
            if (dVar2 != null) {
                F.c(dVar2, R1.m(aVar, 0.0f, 32, 0.0f, 0.0f, 13), a13, 56);
            }
            a13.h();
            a13.C(1731557444);
            sH.i iVar2 = c48049a.f437571g;
            if (iVar2 != null) {
                com.akita.compose.component.button.m.c(iVar2.f437590a, new n(lVar2, iVar2), com.akita.compose.theme.re23.b.c(a13).M(), R1.m(R1.k(16, 0.0f, 2, C20588k2.d(aVar, 1.0f)), 0.0f, 38, 0.0f, 0.0f, 13), null, null, null, false, false, null, a13, 3584, 1008);
            }
            a13.h();
            a13.z();
        }
        return G0.f406611a;
    }
}
