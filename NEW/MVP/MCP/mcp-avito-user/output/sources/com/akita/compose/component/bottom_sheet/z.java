package com.akita.compose.component.bottom_sheet;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.InterfaceC20639x2;
import androidx.compose.foundation.layout.N2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class z extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22096n f60710l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f60711m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f60712n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f60713o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f60714p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(C22096n c22096n, float f12, boolean z12, Y41.p pVar, C22096n c22096n2) {
        super(2);
        this.f60710l = c22096n;
        this.f60711m = f12;
        this.f60712n = z12;
        this.f60713o = (kotlin.jvm.internal.N) pVar;
        this.f60714p = c22096n2;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.ui.i iVar;
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            a13.C(-1583826060);
            v.a aVar = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarD = C20588k2.d(aVar, 1.0f);
            boolean z12 = this.f60712n;
            C22096n c22096n = this.f60710l;
            androidx.compose.ui.v vVarD0 = vVarD.d0((c22096n != null || Float.isNaN(this.f60711m) || z12) ? aVar : R1.m(aVar, 0.0f, this.f60711m, 0.0f, 0.0f, 13));
            ?? r42 = this.f60713o;
            androidx.compose.ui.v vVarD02 = vVarD0.d0(r42 != 0 ? N2.b(aVar, (InterfaceC20639x2) r42.invoke(a13, 0)) : aVar);
            a13.h();
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.ui.i iVar2 = InterfaceC22215f.a.f39076b;
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(iVar2, false);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarD02);
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
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, a13, interfaceC22365i0D);
            Y41.p<InterfaceC22413h, androidx.compose.runtime.U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, a13, vVarC);
            C20644z c20644z = C20644z.f28804a;
            C20585k.f28659a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, a13, 0);
            int f37888q2 = a13.getF37888Q();
            O1 o1Y2 = a13.y();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(a13, aVar);
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
            R3.b(pVar, a13, iA2);
            R3.b(pVar2, a13, o1Y2);
            if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q2))) {
                androidx.appcompat.app.r.B(f37888q2, a13, f37888q2, pVar3);
            }
            R3.b(pVar4, a13, vVarC2);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            a13.C(-1201203251);
            if (c22096n == null || z12) {
                iVar = iVar2;
            } else {
                androidx.compose.ui.v vVarC3 = k12.c(aVar, InterfaceC22215f.a.f39089o);
                InterfaceC22365i0 interfaceC22365i0D2 = C20632w.d(iVar2, false);
                int f37888q3 = a13.getF37888Q();
                iVar = iVar2;
                O1 o1Y3 = a13.y();
                androidx.compose.ui.v vVarC4 = androidx.compose.ui.n.c(a13, vVarC3);
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
                R3.b(pVar, a13, interfaceC22365i0D2);
                R3.b(pVar2, a13, o1Y3);
                if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q3))) {
                    androidx.appcompat.app.r.B(f37888q3, a13, f37888q3, pVar3);
                }
                R3.b(pVar4, a13, vVarC4);
                c22096n.invoke(a13, 0);
                a13.z();
            }
            a13.h();
            this.f60714p.invoke(k12, a13, 6);
            a13.z();
            if (c22096n != null && z12) {
                androidx.compose.ui.v vVarD2 = c20644z.d(aVar, InterfaceC22215f.a.f39077c);
                InterfaceC22365i0 interfaceC22365i0D3 = C20632w.d(iVar, false);
                int f37888q4 = a13.getF37888Q();
                O1 o1Y4 = a13.y();
                androidx.compose.ui.v vVarC5 = androidx.compose.ui.n.c(a13, vVarD2);
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
                R3.b(pVar, a13, interfaceC22365i0D3);
                R3.b(pVar2, a13, o1Y4);
                if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q4))) {
                    androidx.appcompat.app.r.B(f37888q4, a13, f37888q4, pVar3);
                }
                R3.b(pVar4, a13, vVarC5);
                c22096n.invoke(a13, 0);
                a13.z();
            }
            a13.z();
        }
        return G0.f406611a;
    }
}
