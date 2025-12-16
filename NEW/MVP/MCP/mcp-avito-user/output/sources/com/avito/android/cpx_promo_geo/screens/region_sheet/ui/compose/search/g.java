package com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.search;

import Y41.l;
import Y41.p;
import Y61.k;
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
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.foundation.ui.o;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RegionSheetSearchItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_cpx-promo-geo_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g {

    /* compiled from: RegionSheetSearchItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[RegionSheetState.Location.CheckboxState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RegionSheetState.Location.CheckboxState checkboxState = RegionSheetState.Location.CheckboxState.f128405b;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RegionSheetState.Location.CheckboxState checkboxState2 = RegionSheetState.Location.CheckboxState.f128405b;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                RegionSheetState.Location.CheckboxState checkboxState3 = RegionSheetState.Location.CheckboxState.f128405b;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(C20576h2 c20576h2, RegionSheetState.Location location, A a12, int i12) {
        int i13;
        B bE2 = a12.E(712104361);
        InterfaceC22215f.f39074a.getClass();
        androidx.compose.ui.i iVar = InterfaceC22215f.a.f39080f;
        v.a aVar = v.f42878y1;
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        v vVarM = R1.m(C20588k2.q(aVar, 21, 36), 0.0f, 15, 0.0f, 0.0f, 13);
        InterfaceC22365i0 interfaceC22365i0D = C20632w.d(iVar, false);
        int i14 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = n.c(bE2, vVarM);
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20644z c20644z = C20644z.f28804a;
        int iOrdinal = location.f128399c.ordinal();
        if (iOrdinal == 0) {
            i13 = 2;
            bE2.C(-388861308);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63986d.getClass();
            o.a(com.akita.compose.theme.re23.g.f64943I2, com.akita.compose.theme.re23.b.f63988f.f65241l, null, null, bE2, 0, 12);
            bE2.X(false);
        } else if (iOrdinal != 4) {
            bE2.C(-388468817);
            int iOrdinal2 = location.f128399c.ordinal();
            ToggleableState toggleableState = iOrdinal2 != 1 ? iOrdinal2 != 3 ? ToggleableState.f41898d : ToggleableState.f41897c : ToggleableState.f41896b;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            i13 = 2;
            com.akita.compose.component.toggle.j.a(toggleableState, null, com.akita.compose.theme.re23.b.v(bE2).getF66823a(), null, null, null, bE2, 48, 120);
            bE2.X(false);
        } else {
            i13 = 2;
            bE2.C(-388626700);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.spinner.b.a(com.akita.compose.theme.re23.b.r(bE2).getF66693b(), null, bE2, 0, 2);
            bE2.X(false);
        }
        bE2.X(true);
        float f12 = 12;
        com.akita.compose.foundation.ui.g.b(f12, null, bE2, 6, i13);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.foundation.ui.p.b(location.f128398b, com.akita.compose.theme.re23.b.f63988f.f65241l, R1.k(0.0f, 16, 1, c20576h2.a(aVar, 1.0f, true)), false, 0L, null, 0, 0, false, null, bE2, 0, 1016);
        com.akita.compose.foundation.ui.g.b(f12, null, bE2, 6, 2);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(c20576h2, location, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@k RegionSheetState.Location location, @k l lVar, @Y61.l A a12, int i12) {
        boolean z12;
        B bE2 = a12.E(1756264350);
        v.a aVar = v.f42878y1;
        float f12 = 1.0f;
        v vVarD = C20588k2.d(aVar, 1.0f);
        C20585k.f28659a.getClass();
        C20585k.l lVar2 = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        I iA2 = H.a(lVar2, InterfaceC22215f.a.f39088n, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = n.c(bE2, vVarD);
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
        p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
        R3.b(pVar, bE2, iA2);
        p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
        R3.b(pVar2, bE2, o1S);
        p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar3);
        }
        p<InterfaceC22413h, v, G0> pVar4 = InterfaceC22413h.a.f40793d;
        R3.b(pVar4, bE2, vVarC);
        K k12 = K.f28344a;
        v vVarD2 = C20588k2.d(aVar, 1.0f);
        if (location.f128399c != RegionSheetState.Location.CheckboxState.f128405b) {
            vVarD2 = C21086w0.c(vVarD2, false, null, null, new d(lVar, location), 7);
        }
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        v vVarM = R1.m(vVarD2, 16, 0.0f, 0.0f, 0.0f, 14);
        C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, InterfaceC22215f.a.f39085k, bE2, 0);
        int i14 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        v vVarC2 = n.c(bE2, vVarM);
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
        R3.b(pVar, bE2, c20568f2A);
        R3.b(pVar2, bE2, o1S2);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar3);
        }
        R3.b(pVar4, bE2, vVarC2);
        a(C20576h2.f28641a, location, bE2, 70);
        bE2.X(true);
        Map<Long, RegionSheetState.Location> map = location.f128401e;
        Collection<RegionSheetState.Location> collectionValues = map.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            z12 = false;
        } else {
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                if (((RegionSheetState.Location) it.next()).f128399c == RegionSheetState.Location.CheckboxState.f128409f) {
                    z12 = true;
                    break;
                }
            }
            z12 = false;
        }
        bE2.C(73531573);
        for (RegionSheetState.Location location2 : map.values()) {
            v vVarD3 = C20588k2.d(v.f42878y1, f12);
            if (!z12 && location2.f128399c != RegionSheetState.Location.CheckboxState.f128405b) {
                vVarD3 = C21086w0.c(vVarD3, false, null, null, new e(lVar, location, location2), 7);
            }
            v vVarM2 = R1.m(vVarD3, 48, 0.0f, 0.0f, 0.0f, 14);
            C20585k.f28659a.getClass();
            C20585k.C1589k c1589k = C20585k.f28660b;
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A2 = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
            int i15 = bE2.f37888Q;
            O1 o1S3 = bE2.S();
            v vVarC3 = n.c(bE2, vVarM2);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S3);
            p<InterfaceC22413h, Integer, G0> pVar5 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar5);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC3);
            a(C20576h2.f28641a, location2, bE2, 70);
            bE2.X(true);
            f12 = 1.0f;
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, false, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new f(location, lVar, aVar, i12);
        }
    }
}
