package com.avito.android.gig_tutorials.gigtutorials.screens;

import Y41.p;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
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
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: GigTutorialsLoadingScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_gig_tutorials_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i {

    /* compiled from: GigTutorialsLoadingScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f161176l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f161177m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i12, Y41.a aVar) {
            super(2);
            this.f161176l = (N) aVar;
            this.f161177m = i12;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f161177m | 1);
            i.a(this.f161176l, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k Y41.a<G0> aVar, @Y61.l A a12, int i12) {
        int i13;
        B bE2 = a12.E(-1651992379);
        if ((i12 & 14) == 0) {
            i13 = (bE2.u(aVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            v.a aVar2 = v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            aVar2.getClass();
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            v vVarK = R1.k(16, 0.0f, 2, fillElement);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = androidx.compose.ui.n.c(bE2, vVarK);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            j.b(aVar, bE2, i13 & 14);
            v vVarD = c20644z.d(aVar2, InterfaceC22215f.a.f39080f);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.spinner.b.a(com.akita.compose.theme.re23.b.r(bE2).getF66694c(), vVarD, bE2, 0, 0);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(i12, aVar);
        }
    }
}
