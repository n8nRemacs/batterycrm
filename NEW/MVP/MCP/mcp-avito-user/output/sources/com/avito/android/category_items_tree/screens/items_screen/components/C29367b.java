package com.avito.android.category_items_tree.screens.items_screen.components;

import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.H;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.X;
import androidx.compose.ui.text.e0;
import androidx.compose.ui.text.font.C22605a0;
import androidx.compose.ui.text.font.Z;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.adjust.sdk.network.ErrorCodes;
import com.akita.compose.component.docking_badge.m;
import com.avito.android.category_items_tree.generated.api.api_1_promo_category_tree_items.Api1PromoCategoryTreeItemsResponse;
import com.avito.android.category_items_tree.screens.items_screen.a;
import com.facebook.imageutils.JfifUtil;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_category-items-tree_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.category_items_tree.screens.items_screen.components.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29367b {

    /* compiled from: CategoryItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.category_items_tree.screens.items_screen.components.b$a */
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f116837l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f116838m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f116839n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f116840o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, Y41.a aVar, String str, boolean z12) {
            super(2);
            this.f116837l = z12;
            this.f116838m = str;
            this.f116839n = aVar;
            this.f116840o = i12;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f116840o | 1);
            String str = this.f116838m;
            C29367b.b(iA2, this.f116839n, a12, str, this.f116837l);
            return G0.f406611a;
        }
    }

    /* compiled from: CategoryItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.category_items_tree.screens.items_screen.components.b$b, reason: collision with other inner class name */
    public static final class C3407b extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f116841l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f116842m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f116843n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3407b(androidx.compose.ui.v vVar, int i12, int i13) {
            super(2);
            this.f116841l = vVar;
            this.f116842m = i12;
            this.f116843n = i13;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f116842m | 1);
            int i12 = this.f116843n;
            C29367b.f(this.f116841l, a12, iA2, i12);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k a.b bVar, @Y61.l Api1PromoCategoryTreeItemsResponse.ActionType actionType, @Y61.k Y41.a aVar, @Y61.l v.a aVar2, @Y61.l androidx.compose.runtime.A a12, int i12) {
        v.a aVar3;
        androidx.compose.runtime.B bE2 = a12.E(-71263889);
        int i13 = (bE2.B(bVar) ? 4 : 2) | i12;
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(actionType) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(aVar) ? 256 : 128;
        }
        int i14 = i13 | 3072;
        if ((i14 & 5851) == 1170 && bE2.c()) {
            bE2.f();
            aVar3 = aVar2;
        } else {
            v.a aVar4 = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarC = C21086w0.c(aVar4, actionType == Api1PromoCategoryTreeItemsResponse.ActionType.Item, null, null, aVar, 6);
            float f12 = 16;
            h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
            float f13 = 11;
            androidx.compose.ui.v vVarL = R1.l(vVarC, f12, f13, f12, 13);
            C20585k.f28659a.getClass();
            C20585k.C1589k c1589k = C20585k.f28660b;
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
            int i15 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarL);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC2);
            C20576h2 c20576h2 = C20576h2.f28641a;
            d(bVar.f116809d, null, bE2, 0);
            com.akita.compose.foundation.ui.g.b(10, null, bE2, 6, 2);
            androidx.compose.ui.v vVarA = c20576h2.a(aVar4, 1.0f, true);
            a.d dVar = bVar.f116808c;
            a.C3406a c3406a = bVar.f116812g;
            e(bVar.f116807b, dVar, c3406a, vVarA, bE2, 0);
            bE2.C(-836872766);
            if (actionType == Api1PromoCategoryTreeItemsResponse.ActionType.Button) {
                com.akita.compose.foundation.ui.g.b(f13, null, bE2, 6, 2);
                b(i14 & 896, aVar, bE2, c3406a.f116800a, bVar.f116810e);
            }
            bE2.X(false);
            bE2.X(true);
            aVar3 = aVar4;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C29366a(bVar, actionType, aVar, aVar3, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(int i12, Y41.a aVar, androidx.compose.runtime.A a12, String str, boolean z12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-1447445102);
        if ((i12 & 14) == 0) {
            i13 = (bE2.j(z12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(str) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(aVar) ? 256 : 128;
        }
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
        } else if (z12) {
            bE2.C(37010352);
            String str2 = str == null ? "" : str;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.button.t tVarG1 = com.akita.compose.theme.re23.b.c(bE2).g1();
            com.akita.compose.theme.re23.b.f63985c.getClass();
            com.akita.compose.component.button.m.c(str2, aVar, tVarG1, null, null, null, Integer.valueOf(com.akita.compose.theme.re23.e.f64839x5), false, false, null, bE2, ((i13 >> 3) & 112) | 512, 952);
            bE2 = bE2;
            bE2.X(false);
        } else {
            bE2.C(37240744);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63985c.getClass();
            com.akita.compose.component.button.m.f(u0.e.a(com.akita.compose.theme.re23.e.f64596j, 0, bE2), aVar, com.akita.compose.theme.re23.b.c(bE2).g0(), null, 0.0f, false, false, null, bE2, ((i13 >> 3) & 112) | 197128, JfifUtil.MARKER_SOI);
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(i12, aVar, str, z12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(a.C3406a c3406a, v.a aVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-2132755085);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(c3406a) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if (((i13 | 48) & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            aVar = androidx.compose.ui.v.f42878y1;
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            C20585k c20585k = C20585k.f28659a;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C20568f2 c20568f2A = C20563e2.a(C20585k.g(8), bVar, bE2, 54);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, aVar);
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
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            bE2.C(-875593172);
            bE2.C(-875593171);
            String str = c3406a.f116801b;
            if (str != null) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.b.f63986d.getClass();
                E.a(com.akita.compose.theme.re23.g.f65088f3, str, null, bE2, 0);
            }
            bE2.X(false);
            bE2.C(-875586769);
            String str2 = c3406a.f116803d;
            if (str2 != null) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.b.f63986d.getClass();
                E.a(com.akita.compose.theme.re23.g.f64980O2, str2, null, bE2, 0);
            }
            bE2.X(false);
            bE2.C(-875580269);
            String str3 = c3406a.f116802c;
            if (str3 != null) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.b.f63986d.getClass();
                E.a(com.akita.compose.theme.re23.g.f65219y2, str3, null, bE2, 0);
            }
            bE2.X(false);
            bE2.C(-875573603);
            String str4 = c3406a.f116805f;
            if (str4 != null) {
                coil.compose.v.b(str4, null, androidx.compose.ui.draw.k.a(C20588k2.o(aVar, 16), androidx.compose.foundation.shape.o.f30153a), null, null, null, bE2, 48, 4088);
            }
            bE2.X(false);
            bE2.C(-875563639);
            String str5 = c3406a.f116804e;
            if (str5 != null) {
                m.e eVar = m.e.f61565b;
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.component.docking_badge.b.b(str5, eVar, com.akita.compose.theme.re23.b.h(bE2).getF66148g(), null, null, bE2, 0, 24);
            }
            H.A(bE2, false, false, true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C29368c(c3406a, aVar, i12);
        }
    }

    @InterfaceC22132o
    public static final void d(String str, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(938385686);
        int i13 = (bE2.B(str) ? 4 : 2) | i12 | 48;
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            vVar = androidx.compose.ui.v.f42878y1;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            coil.compose.v.b(str, null, androidx.compose.ui.draw.k.a(C20588k2.o(vVar, 56), androidx.compose.foundation.shape.o.a(12)), null, null, null, bE2, (i13 & 14) | 48, 4088);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C29369d(i12, vVar, str);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void e(String str, a.d dVar, a.C3406a c3406a, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-505207413);
        int i13 = i12 | (bE2.B(str) ? 4 : 2) | (bE2.B(dVar) ? 32 : 16) | (bE2.B(c3406a) ? 256 : 128) | (bE2.B(vVar) ? 2048 : 1024);
        if ((i13 & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            C20585k c20585k = C20585k.f28659a;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C20585k.j jVarG = C20585k.g(6);
            InterfaceC22215f.f39074a.getClass();
            I iA2 = androidx.compose.foundation.layout.H.a(jVarG, InterfaceC22215f.a.f39088n, bE2, 6);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
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
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65241l, null, false, 0L, null, 0, 0, false, null, bE2, i13 & 14, 1020);
            g(dVar, null, bE2, (i13 >> 3) & 14);
            c(c3406a, null, bE2, (i13 >> 6) & 14);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C29370e(str, dVar, c3406a, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void f(@Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12, int i13) {
        androidx.compose.ui.v vVar2;
        int i14;
        androidx.compose.runtime.B bE2 = a12.E(1053270738);
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
            float f12 = 11;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarM = R1.m(vVar3, 0.0f, f12, 0.0f, 13, 5);
            C20585k.f28659a.getClass();
            C20585k.C1589k c1589k = C20585k.f28660b;
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
            int i16 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarM);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, bE2, c20568f2A);
            Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            float f13 = 56;
            float f14 = 12;
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.o(aVar3, f13), androidx.compose.foundation.shape.o.a(f14), null, false, bE2, 6, 6), bE2, 0);
            float f15 = 10;
            com.akita.compose.foundation.ui.g.b(f15, null, bE2, 6, 2);
            androidx.compose.ui.v vVarA = c20576h2.a(aVar3, 1.0f, true);
            float f16 = 6;
            androidx.compose.ui.v vVarM2 = R1.m(vVarA, 0.0f, f16, 0.0f, 4, 5);
            I iA2 = androidx.compose.foundation.layout.H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, bE2, 0);
            int i17 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarM2);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            R3.b(pVar, bE2, iA2);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i17))) {
                AK.c.y(i17, bE2, i17, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            K k12 = K.f28344a;
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.q(aVar3, 198, f15), androidx.compose.foundation.shape.o.a(f16), null, false, bE2, 6, 6), bE2, 0);
            com.akita.compose.foundation.ui.g.a(f15, null, bE2, 6);
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.q(aVar3, 146, f15), androidx.compose.foundation.shape.o.a(f16), null, false, bE2, 6, 6), bE2, 0);
            com.akita.compose.foundation.ui.g.a(16, null, bE2, 6);
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.q(aVar3, 60, f15), androidx.compose.foundation.shape.o.a(f16), null, false, bE2, 6, 6), bE2, 0);
            bE2.X(true);
            com.akita.compose.foundation.ui.g.b(f12, null, bE2, 6, 2);
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.q(aVar3, f13, 36), androidx.compose.foundation.shape.o.a(f14), null, false, bE2, 6, 6), bE2, 0);
            bE2.X(true);
            vVar2 = vVar3;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C3407b(vVar2, i12, i13);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void g(a.d dVar, v.a aVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        com.akita.compose.theme.re23.i iVar;
        boolean z12;
        boolean z13;
        v.a aVar2;
        androidx.compose.runtime.B bE2 = a12.E(788966371);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(dVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if (((i13 | 48) & 91) == 18 && bE2.c()) {
            bE2.f();
            aVar2 = aVar;
        } else {
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            C20585k c20585k = C20585k.f28659a;
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C20568f2 c20568f2A = C20563e2.a(C20585k.g(4), bVar, bE2, 54);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, aVar3);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar5 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar5);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar2 = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.ui.p.b(dVar.f116816a, iVar2.f65239j, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
            bE2.C(-1303426028);
            String str = dVar.f116817b;
            if (str == null) {
                z12 = false;
                iVar = iVar2;
            } else {
                C22602e.b bVar2 = new C22602e.b(0, 1, null);
                androidx.compose.ui.text.style.j.f42684b.getClass();
                int iL2 = bVar2.l(new e0(0L, 0L, (androidx.compose.ui.text.font.e0) null, (Z) null, (C22605a0) null, (androidx.compose.ui.text.font.E) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.n) null, (z0.f) null, 0L, androidx.compose.ui.text.style.j.f42687e, (f1) null, (X) null, (androidx.compose.ui.graphics.drawscope.j) null, 61439, (C42822w) null));
                try {
                    bVar2.f(str);
                    G0 g02 = G0.f406611a;
                    bVar2.h(iL2);
                    iVar = iVar2;
                    com.akita.compose.foundation.ui.p.a(bVar2.m(), iVar2.f65244o, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
                    z12 = false;
                } catch (Throwable th2) {
                    bVar2.h(iL2);
                    throw th2;
                }
            }
            bE2.X(z12);
            bE2.C(-1303414923);
            String str2 = dVar.f116818c;
            if (str2 == null) {
                z13 = z12;
            } else {
                com.akita.compose.foundation.ui.p.b(str2, iVar.f65244o, null, false, com.akita.compose.theme.re23.b.f63984b.f63880R0.c(bE2), null, 0, 0, false, null, bE2, 0, ErrorCodes.PROTOCOL_EXCEPTION);
                z13 = false;
            }
            bE2.X(z13);
            bE2.X(true);
            aVar2 = aVar3;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new h(dVar, aVar2, i12);
        }
    }
}
