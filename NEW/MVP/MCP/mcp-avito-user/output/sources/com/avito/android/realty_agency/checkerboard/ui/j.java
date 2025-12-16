package com.avito.android.realty_agency.checkerboard.ui;

import Y41.p;
import Y61.l;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.shape.o;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
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
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Toolbar.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_realty-agency_checkerboard_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j {

    /* compiled from: Toolbar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f251415l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: Toolbar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Image f251416l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f251417m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f251418n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f251419o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f251420p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f251421q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Image image, String str, String str2, Y41.a<G0> aVar, int i12, int i13) {
            super(2);
            this.f251416l = image;
            this.f251417m = str;
            this.f251418n = str2;
            this.f251419o = aVar;
            this.f251420p = i12;
            this.f251421q = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f251420p | 1);
            String str = this.f251417m;
            j.a(this.f251416l, str, this.f251418n, this.f251419o, a12, iA2, this.f251421q);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@l Image image, @Y61.k String str, @Y61.k String str2, @l Y41.a<G0> aVar, @l A a12, int i12, int i13) {
        B bE2 = a12.E(-513414104);
        Y41.a<G0> aVar2 = (i13 & 8) != 0 ? a.f251415l : aVar;
        InterfaceC22215f.f39074a.getClass();
        i.b bVar = InterfaceC22215f.a.f39086l;
        v.a aVar3 = v.f42878y1;
        h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
        v vVarK = R1.k(6, 0.0f, 2, C20588k2.f(C20588k2.d(aVar3, 1.0f), 52));
        C20585k.f28659a.getClass();
        C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, bE2, 48);
        int i14 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = n.c(bE2, vVarK);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar5 = InterfaceC22413h.a.f40791b;
        InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar5);
        } else {
            bE2.d();
        }
        p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
        R3.b(pVar, bE2, c20568f2A);
        p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
        R3.b(pVar2, bE2, o1S);
        p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar3);
        }
        p<InterfaceC22413h, v, G0> pVar4 = InterfaceC22413h.a.f40793d;
        R3.b(pVar4, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        float f12 = 40;
        v vVarC2 = C21086w0.c(androidx.compose.ui.draw.k.a(C20588k2.o(aVar3, f12), o.f30153a), false, null, null, aVar2, 7);
        InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39080f, false);
        int i15 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        v vVarC3 = n.c(bE2, vVarC2);
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar5);
        } else {
            bE2.d();
        }
        R3.b(pVar, bE2, interfaceC22365i0D);
        R3.b(pVar2, bE2, o1S2);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
            AK.c.y(i15, bE2, i15, pVar3);
        }
        R3.b(pVar4, bE2, vVarC3);
        C20644z c20644z = C20644z.f28804a;
        androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(R.drawable.common_ic_arrow_back_24, 0, bE2);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.foundation.ui.e.a(eVarA, null, null, com.akita.compose.theme.re23.b.f63984b.f63938l, bE2, 56, 4);
        bE2.X(true);
        com.akita.compose.foundation.ui.g.b(2, null, bE2, 6, 2);
        InterfaceC22374n.f40491a.getClass();
        com.avito.android.mnz_common.compose.i.a(image, f12, f12, "DevelopmentImage", androidx.compose.ui.draw.k.a(aVar3, o.a(10)), u0.e.a(R.drawable.common_ic_apartment_24, 0, bE2), u0.e.a(R.drawable.common_ic_apartment_24, 0, bE2), null, InterfaceC22374n.a.f40493b, bE2, 103026104, 128);
        com.akita.compose.foundation.ui.g.b(8, null, bE2, 6, 2);
        v vVarW = C20588k2.w(aVar3, null, 3);
        I iA2 = H.a(C20585k.f28664f, InterfaceC22215f.a.f39088n, bE2, 6);
        int i16 = bE2.f37888Q;
        O1 o1S3 = bE2.S();
        v vVarC4 = n.c(bE2, vVarW);
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar5);
        } else {
            bE2.d();
        }
        R3.b(pVar, bE2, iA2);
        R3.b(pVar2, bE2, o1S3);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
            AK.c.y(i16, bE2, i16, pVar3);
        }
        R3.b(pVar4, bE2, vVarC4);
        K k12 = K.f28344a;
        com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
        com.akita.compose.foundation.ui.p.b(str, iVar.f65242m, C20588k2.d(aVar3, 1.0f), false, 0L, null, 1, 0, false, null, bE2, ((i12 >> 3) & 14) | 1573248, 952);
        com.akita.compose.foundation.ui.p.b(str2, iVar.f65245p, C20588k2.d(aVar3, 1.0f), false, 0L, null, 1, 0, false, null, bE2, ((i12 >> 6) & 14) | 1573248, 952);
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, true, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new b(image, str, str2, aVar2, i12, i13);
        }
    }
}
