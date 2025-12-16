package com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.item;

import Y41.p;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.foundation.ui.o;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RegionSheetItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_cpx-promo-geo_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g {

    /* compiled from: RegionSheetItem.kt */
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
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState.Location r30, @Y61.k Y41.l r31, @Y61.k com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState.d r32, @Y61.l androidx.compose.runtime.A r33, int r34) {
        /*
            Method dump skipped, instructions count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.item.g.a(com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState$Location, Y41.l, com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState$d, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(C20576h2 c20576h2, RegionSheetState.Location location, A a12, int i12) {
        B bE2 = a12.E(338979356);
        InterfaceC22215f.f39074a.getClass();
        androidx.compose.ui.i iVar = InterfaceC22215f.a.f39080f;
        v.a aVar = v.f42878y1;
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        v vVarM = R1.m(C20588k2.q(aVar, 21, 36), 0.0f, 15, 0.0f, 0.0f, 13);
        InterfaceC22365i0 interfaceC22365i0D = C20632w.d(iVar, false);
        int i13 = bE2.f37888Q;
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
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20644z c20644z = C20644z.f28804a;
        if (location.f128399c == RegionSheetState.Location.CheckboxState.f128405b) {
            bE2.C(-1328740029);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63986d.getClass();
            o.a(com.akita.compose.theme.re23.g.f64943I2, com.akita.compose.theme.re23.b.f63988f.f65241l, null, null, bE2, 0, 12);
            bE2.X(false);
        } else {
            bE2.C(-1328572350);
            int iOrdinal = location.f128399c.ordinal();
            ToggleableState toggleableState = iOrdinal != 1 ? iOrdinal != 3 ? ToggleableState.f41898d : ToggleableState.f41897c : ToggleableState.f41896b;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.toggle.j.a(toggleableState, null, com.akita.compose.theme.re23.b.v(bE2).getF66823a(), null, null, null, bE2, 48, 120);
            bE2.X(false);
        }
        bE2.X(true);
        float f12 = 12;
        com.akita.compose.foundation.ui.g.b(f12, null, bE2, 6, 2);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.foundation.ui.p.b(location.f128398b, com.akita.compose.theme.re23.b.f63988f.f65241l, R1.k(0.0f, 16, 1, c20576h2.a(aVar, 1.0f, true)), false, 0L, null, 0, 0, false, null, bE2, 0, 1016);
        com.akita.compose.foundation.ui.g.b(f12, null, bE2, 6, 2);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new f(c20576h2, location, i12);
        }
    }
}
