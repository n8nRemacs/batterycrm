package com.avito.android.mortgage.acceptance_dialog;

import Y41.l;
import Y41.p;
import Y61.k;
import android.os.Parcelable;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.C20646z1;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
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
import androidx.compose.ui.draw.o;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22543x1;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.button.m;
import com.akita.compose.component.button.t;
import com.avito.android.mortgage.acceptance_dialog.model.ButtonStyle;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: AcceptanceScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mortgage_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g {

    /* compiled from: AcceptanceScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f198180l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f198181m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ButtonStyle f198182n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f198183o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f198184p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f198185q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, ButtonStyle buttonStyle, String str3, Y41.a<G0> aVar, Y41.a<G0> aVar2, int i12) {
            super(2);
            this.f198180l = str;
            this.f198181m = str2;
            this.f198182n = buttonStyle;
            this.f198183o = str3;
            this.f198184p = aVar;
            this.f198185q = aVar2;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            Y41.a<G0> aVar = this.f198184p;
            Y41.a<G0> aVar2 = this.f198185q;
            ButtonStyle buttonStyle = this.f198182n;
            String str = this.f198183o;
            g.a(this.f198180l, this.f198181m, buttonStyle, str, aVar, aVar2, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: ContentDrawTracking.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/d;)V", "com/avito/android/analytics/screens/compose/d", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<androidx.compose.ui.graphics.drawscope.d, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.analytics.screens.compose.a f198186l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.analytics.screens.compose.a aVar) {
            super(1);
            this.f198186l = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
            dVar.y1();
            this.f198186l.f();
            return G0.f406611a;
        }
    }

    /* compiled from: AcceptanceScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[ButtonStyle.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Parcelable.Creator<ButtonStyle> creator = ButtonStyle.CREATOR;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k String str, @k String str2, @k ButtonStyle buttonStyle, @k String str3, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2, @Y61.l A a12, int i12) {
        boolean z12;
        t tVarF2;
        boolean z13;
        t tVarF22;
        B bE2 = a12.E(-1327112295);
        int i13 = i12 | (bE2.B(str) ? 4 : 2) | (bE2.B(str2) ? 32 : 16) | (bE2.B(buttonStyle) ? 256 : 128) | (bE2.B(str3) ? 2048 : 1024) | (bE2.u(aVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bE2.u(aVar2) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR);
        if ((i13 & 374491) == 74898 && bE2.c()) {
            bE2.f();
        } else {
            v.a aVar3 = v.f42878y1;
            v vVarA = C20646z1.a(aVar3, IntrinsicSize.f28333b);
            InterfaceC22215f.f39074a.getClass();
            i iVar = InterfaceC22215f.a.f39076b;
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(iVar, false);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVarA);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar4);
            } else {
                bE2.d();
            }
            p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, bE2, interfaceC22365i0D);
            p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            p<InterfaceC22413h, v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            bE2.C(-976608008);
            bE2.C(2063036140);
            if (((Boolean) bE2.o(C22543x1.f41638a)).booleanValue()) {
                bE2.C(421109671);
                v vVarD = C20588k2.d(aVar3, 1.0f);
                h.a aVar5 = h.f42849c;
                v vVarK = R1.k(16, 0.0f, 2, vVarD);
                C20585k.f28659a.getClass();
                I iA2 = H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, bE2, 0);
                int i15 = bE2.f37888Q;
                O1 o1S2 = bE2.S();
                v vVarC2 = n.c(bE2, vVarK);
                if (interfaceC22078i == null) {
                    C22190v.b();
                    throw null;
                }
                bE2.A();
                if (bE2.f37887P) {
                    bE2.b(aVar4);
                } else {
                    bE2.d();
                }
                R3.b(pVar, bE2, iA2);
                R3.b(pVar2, bE2, o1S2);
                if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                    AK.c.y(i15, bE2, i15, pVar3);
                }
                R3.b(pVar4, bE2, vVarC2);
                K k12 = K.f28344a;
                C20608p2.a(bE2, C20588k2.f(aVar3, 8));
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65241l, null, false, 0L, null, 0, 0, false, null, bE2, i13 & 14, 1020);
                C20608p2.a(bE2, C20588k2.f(aVar3, 28));
                int iOrdinal = buttonStyle.ordinal();
                if (iOrdinal != 0) {
                    z12 = true;
                    if (iOrdinal != 1) {
                        throw com.avito.android.bxcontent.mvi.entity.f.q(-1361836187, bE2, false);
                    }
                    bE2.C(-1361779856);
                    tVarF2 = com.akita.compose.theme.re23.b.c(bE2).p2();
                    bE2.X(false);
                } else {
                    z12 = true;
                    bE2.C(-1361782447);
                    tVarF2 = com.akita.compose.theme.re23.b.c(bE2).f2();
                    bE2.X(false);
                }
                int i16 = i13 >> 9;
                m.c(str2, aVar, tVarF2, C20588k2.d(aVar3, 1.0f), null, null, null, false, false, null, bE2, ((i13 >> 3) & 14) | 3072 | (i16 & 112) | 512, 1008);
                C20608p2.a(bE2, C20588k2.f(aVar3, 6));
                m.c(str3, aVar2, com.akita.compose.theme.re23.b.c(bE2).M(), C20588k2.d(aVar3, 1.0f), null, null, null, false, false, null, bE2, (i16 & 14) | 3072 | ((i13 >> 12) & 112) | 512, 1008);
                bE2.X(z12);
                z13 = false;
                bE2.X(false);
            } else {
                bE2.C(420357239);
                com.avito.android.analytics.screens.compose.a aVar6 = (com.avito.android.analytics.screens.compose.a) bE2.o(com.avito.android.analytics.screens.compose.c.f90576a);
                aVar6.l();
                v vVarD2 = o.d(aVar3, new b(aVar6));
                InterfaceC22365i0 interfaceC22365i0D2 = C20632w.d(iVar, false);
                int i17 = bE2.f37888Q;
                O1 o1S3 = bE2.S();
                v vVarC3 = n.c(bE2, vVarD2);
                if (interfaceC22078i == null) {
                    C22190v.b();
                    throw null;
                }
                bE2.A();
                if (bE2.f37887P) {
                    bE2.b(aVar4);
                } else {
                    bE2.d();
                }
                R3.b(pVar, bE2, interfaceC22365i0D2);
                R3.b(pVar2, bE2, o1S3);
                if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i17))) {
                    AK.c.y(i17, bE2, i17, pVar3);
                }
                R3.b(pVar4, bE2, vVarC3);
                v vVarD3 = C20588k2.d(aVar3, 1.0f);
                h.a aVar7 = h.f42849c;
                v vVarK2 = R1.k(16, 0.0f, 2, vVarD3);
                C20585k.f28659a.getClass();
                I iA3 = H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, bE2, 0);
                int i18 = bE2.f37888Q;
                O1 o1S4 = bE2.S();
                v vVarC4 = n.c(bE2, vVarK2);
                if (interfaceC22078i == null) {
                    C22190v.b();
                    throw null;
                }
                bE2.A();
                if (bE2.f37887P) {
                    bE2.b(aVar4);
                } else {
                    bE2.d();
                }
                R3.b(pVar, bE2, iA3);
                R3.b(pVar2, bE2, o1S4);
                if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i18))) {
                    AK.c.y(i18, bE2, i18, pVar3);
                }
                R3.b(pVar4, bE2, vVarC4);
                K k13 = K.f28344a;
                C20608p2.a(bE2, C20588k2.f(aVar3, 8));
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65241l, null, false, 0L, null, 0, 0, false, null, bE2, i13 & 14, 1020);
                C20608p2.a(bE2, C20588k2.f(aVar3, 28));
                int iOrdinal2 = buttonStyle.ordinal();
                if (iOrdinal2 == 0) {
                    bE2.C(-1361782447);
                    tVarF22 = com.akita.compose.theme.re23.b.c(bE2).f2();
                    bE2.X(false);
                } else {
                    if (iOrdinal2 != 1) {
                        throw com.avito.android.bxcontent.mvi.entity.f.q(-1361836187, bE2, false);
                    }
                    bE2.C(-1361779856);
                    tVarF22 = com.akita.compose.theme.re23.b.c(bE2).p2();
                    bE2.X(false);
                }
                int i19 = i13 >> 9;
                m.c(str2, aVar, tVarF22, C20588k2.d(aVar3, 1.0f), null, null, null, false, false, null, bE2, ((i13 >> 3) & 14) | 3072 | (i19 & 112) | 512, 1008);
                C20608p2.a(bE2, C20588k2.f(aVar3, 6));
                m.c(str3, aVar2, com.akita.compose.theme.re23.b.c(bE2).M(), C20588k2.d(aVar3, 1.0f), null, null, null, false, false, null, bE2, (i19 & 14) | 3072 | ((i13 >> 12) & 112) | 512, 1008);
                androidx.compose.foundation.H.A(bE2, true, true, false);
                z12 = true;
                z13 = false;
            }
            androidx.compose.foundation.H.A(bE2, z13, z13, z12);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(str, str2, buttonStyle, str3, aVar, aVar2, i12);
        }
    }
}
