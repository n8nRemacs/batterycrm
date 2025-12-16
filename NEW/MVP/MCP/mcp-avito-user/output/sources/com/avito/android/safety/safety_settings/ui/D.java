package com.avito.android.safety.safety_settings.ui;

import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.E0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.h;
import com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsElement;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SafetySettingsSessionBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class D extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f257816l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22196w1 f257817m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List<SafetySettingsElement.SessionItem.a> f257818n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.safety.safety_settings.mvi.entity.a, G0> f257819o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public D(boolean z12, InterfaceC22196w1 interfaceC22196w1, List<SafetySettingsElement.SessionItem.a> list, Y41.l<? super com.avito.android.safety.safety_settings.mvi.entity.a, G0> lVar) {
        super(3);
        this.f257816l = z12;
        this.f257817m = interfaceC22196w1;
        this.f257818n = list;
        this.f257819o = lVar;
    }

    @Override // Y41.q
    public final G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
        float fJ2;
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            float f12 = 1.0f;
            boolean z12 = this.f257816l;
            InterfaceC22196w1 interfaceC22196w1 = this.f257817m;
            if (z12) {
                a13.C(-1638551219);
                androidx.compose.ui.v vVarD = C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f);
                a13.C(-52853006);
                if (interfaceC22196w1.e() == 0) {
                    fJ2 = 170;
                    h.a aVar = androidx.compose.ui.unit.h.f42849c;
                } else {
                    fJ2 = ((androidx.compose.ui.unit.d) a13.o(Q0.f41199h)).J(interfaceC22196w1.e());
                }
                a13.h();
                androidx.compose.ui.v vVarF = C20588k2.f(vVarD, fJ2);
                InterfaceC22215f.f39074a.getClass();
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39080f, false);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarF);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar2);
                } else {
                    a13.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                C20644z c20644z = C20644z.f28804a;
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.component.spinner.b.a(com.akita.compose.theme.re23.b.r(a13).getF66694c(), null, a13, 0, 2);
                a13.z();
                a13.h();
            } else {
                a13.C(-1638121838);
                androidx.compose.ui.v vVarD2 = C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f);
                a13.C(-52839451);
                Object objT = a13.t();
                androidx.compose.runtime.A.f37866a.getClass();
                if (objT == A.a.f37868b) {
                    objT = new B(interfaceC22196w1);
                    a13.H(objT);
                }
                a13.h();
                androidx.compose.ui.v vVarA = E0.a(vVarD2, (Y41.l) objT);
                float f13 = 16;
                h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
                androidx.compose.ui.v vVarL = R1.l(vVarA, f13, 12, f13, f13);
                C20585k.f28659a.getClass();
                C20585k.l lVar = C20585k.f28662d;
                InterfaceC22215f.f39074a.getClass();
                androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, a13, 0);
                int f37888q2 = a13.getF37888Q();
                O1 o1Y2 = a13.y();
                androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(a13, vVarL);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar4);
                } else {
                    a13.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, a13, iA2);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y2);
                Y41.p<InterfaceC22413h, Integer, G0> pVar2 = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q2))) {
                    androidx.appcompat.app.r.B(f37888q2, a13, f37888q2, pVar2);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC2);
                androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
                a13.C(-1558583890);
                for (SafetySettingsElement.SessionItem.a aVar5 : this.f257818n) {
                    androidx.compose.ui.v vVarD3 = C20588k2.d(androidx.compose.ui.v.f42878y1, f12);
                    a13.C(1723157922);
                    Object objT2 = a13.t();
                    if (objT2 == A.a.f37868b) {
                        objT2 = androidx.compose.foundation.interaction.l.a();
                        a13.H(objT2);
                    }
                    a13.h();
                    androidx.compose.ui.v vVarM = R1.m(C21086w0.b(vVarD3, (androidx.compose.foundation.interaction.m) objT2, null, false, null, new C(this.f257819o, aVar5), 28), 0.0f, 11, 0.0f, 13, 5);
                    String str = aVar5.f257683a;
                    com.akita.compose.theme.re23.b.f63983a.getClass();
                    com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65241l, vVarM, false, 0L, null, 0, 0, false, null, a13, 0, 1016);
                    f12 = f12;
                }
                a13.h();
                a13.z();
                a13.h();
            }
        }
        return G0.f406611a;
    }
}
