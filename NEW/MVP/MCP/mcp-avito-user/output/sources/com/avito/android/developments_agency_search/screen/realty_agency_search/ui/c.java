package com.avito.android.developments_agency_search.screen.realty_agency_search.ui;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.shape.o;
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
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.i;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.foundation.modifier.e;
import com.akita.compose.foundation.ui.g;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalImage;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import wZ.m;

/* compiled from: NavigationMenuButton.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_developments-agency-search_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c {

    /* compiled from: NavigationMenuButton.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f139001l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f139002m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i12, Y41.a aVar) {
            super(2);
            this.f139001l = (N) aVar;
            this.f139002m = i12;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f139002m | 1);
            c.a(this.f139001l, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k Y41.a<G0> aVar, @l A a12, int i12) {
        int i13;
        B b12;
        B bE2 = a12.E(960693012);
        if ((i12 & 14) == 0) {
            i13 = (bE2.u(aVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            v vVarX = C20588k2.x(v.f42878y1, null, 3);
            h.a aVar2 = h.f42849c;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.a aVar3 = com.akita.compose.theme.re23.b.f63984b;
            float f12 = 16;
            v vVarA = C22501m2.a(R1.j(androidx.compose.foundation.A.b(C21086w0.c(androidx.compose.ui.draw.k.a(com.akita.compose.foundation.modifier.d.a(vVarX, new e(0.0f, 4, 24, aVar3.f63938l.a(0.12f), 1, null), new e(0.0f, 1, 3, aVar3.f63938l.a(0.05f), 1, null), f12), o.a(f12)), false, null, null, aVar, 7), aVar3.f63851H1.c(bE2), Y0.f39346a), f12, 13), "NavigationMenuButton");
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            C20585k.f28659a.getClass();
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, bE2, 48);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVarA);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            wZ.l lVarA = m.a((UniversalImage) com.avito.android.developments_agency_search.screen.realty_agency_search.model.a.f138684c.getValue());
            if (lVarA == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            b12 = bE2;
            com.avito.android.mnz_common.compose.i.b(lVarA, 58, 26, "NAVIGATION_MENU_IMAGE_TAG", null, null, null, null, b12, 3512, 496);
            g.b(10, null, b12, 6, 2);
            com.akita.compose.foundation.ui.p.b(u0.i.c(b12, R.string.developments_agency_search_navigation_menu), com.akita.compose.theme.re23.b.f63988f.f65241l, null, false, 0L, null, 0, 0, false, null, b12, 0, 1020);
            b12.X(true);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(i12, aVar);
        }
    }
}
