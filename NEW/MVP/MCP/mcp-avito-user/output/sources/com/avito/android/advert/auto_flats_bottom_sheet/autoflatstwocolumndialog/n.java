package com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog;

import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.lazy.C20650b;
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
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22543x1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AutoFlatsTwoColumnDialogLoadingScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advert-details_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class n {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k U3.c cVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-330197333);
        com.avito.android.analytics.screens.mvi.r perfTrackerParams = cVar.getPerfTrackerParams();
        bE2.C(-976608008);
        bE2.C(2063036140);
        if (((Boolean) bE2.o(C22543x1.f41638a)).booleanValue()) {
            bE2.C(421109671);
            C20650b.a(vVar, null, null, false, null, null, null, false, null, l.f68705l, bE2, 805306368, 510);
            bE2.X(false);
        } else {
            bE2.C(420357239);
            com.avito.android.analytics.screens.compose.a aVar = (com.avito.android.analytics.screens.compose.a) bE2.o(com.avito.android.analytics.screens.compose.c.f90576a);
            if (perfTrackerParams != null) {
                aVar.m(perfTrackerParams.f90666a);
            }
            aVar.l();
            androidx.compose.ui.v vVarD = androidx.compose.ui.draw.o.d(androidx.compose.ui.v.f42878y1, new k(perfTrackerParams, aVar));
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarD);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            C20650b.a(vVar, null, null, false, null, null, null, false, null, l.f68705l, bE2, 805306368, 510);
            bE2.X(true);
            bE2.X(false);
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, false, false);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new m(cVar, vVar, i12);
        }
    }
}
