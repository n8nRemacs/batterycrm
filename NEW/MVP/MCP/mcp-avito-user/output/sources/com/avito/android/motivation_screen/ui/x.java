package com.avito.android.motivation_screen.ui;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MotivationLoadingScreen.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_gig_motivation-screen_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class x {

    /* compiled from: MotivationLoadingScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f206456l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a<G0> aVar) {
            super(2);
            this.f206456l = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r1v8, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = androidx.compose.ui.v.f42878y1;
                FillElement fillElement = C20588k2.f28682c;
                aVar.getClass();
                com.akita.compose.theme.re23.b.f63983a.getClass();
                androidx.compose.ui.v vVarA = C22501m2.a(androidx.compose.foundation.A.b(fillElement, com.akita.compose.theme.re23.b.f63984b.f63851H1.c(a13), Y0.f39346a), "MotivationScreenLoading");
                C20585k.f28659a.getClass();
                C20585k.l lVar = C20585k.f28662d;
                InterfaceC22215f.f39074a.getClass();
                I iA2 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, a13, 0);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarA);
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
                R3.b(InterfaceC22413h.a.f40796g, a13, iA2);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                K k12 = K.f28344a;
                C22096n c22096nC = androidx.compose.runtime.internal.r.c(623667713, new w(this.f206456l), a13);
                C32846a.f206405a.getClass();
                com.akita.compose.component.scaffold.g.a(fillElement, c22096nC, null, null, null, null, null, C32846a.f206406b, a13, 12582966, 124);
                a13.z();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MotivationLoadingScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f206457l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f206458m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(int i12, Y41.a aVar) {
            super(2);
            this.f206457l = (N) aVar;
            this.f206458m = i12;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f206458m | 1);
            x.a(this.f206457l, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k Y41.a<G0> aVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(346279276);
        if ((i12 & 14) == 0) {
            i13 = (bE2.u(aVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(-654286393, new a(aVar), bE2), bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(i12, aVar);
        }
    }
}
