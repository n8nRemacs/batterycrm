package com.avito.android.str_cancellation_settings.composables;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.text.C20981p1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import com.akita.compose.component.input.InputState;
import com.akita.compose.component.input.transformation.k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: CancellationDiscountInput.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002¨\u0006\u0002²\u0006\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "valueInternal", "_avito_str-cancellation-settings_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.str_cancellation_settings.composables.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35107g {
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.l String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.k Y41.l lVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        long jC2;
        androidx.compose.runtime.B bE2 = a12.E(1359785748);
        int i13 = i12 | (bE2.B(str) ? 4 : 2);
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(str2) ? 32 : 16;
        }
        int i14 = i13 | (bE2.B(str3) ? 256 : 128) | (bE2.B(str4) ? 2048 : 1024);
        if ((i12 & 57344) == 0) {
            i14 |= bE2.u(lVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i12 & 458752) == 0) {
            i14 |= bE2.B(vVar) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((374491 & i14) == 74898 && bE2.c()) {
            bE2.f();
        } else {
            androidx.compose.ui.v vVarD = C20588k2.d(vVar, 1.0f);
            C20585k.f28659a.getClass();
            C20585k.l lVar2 = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar2, InterfaceC22215f.a.f39088n, bE2, 0);
            int i15 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarD);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            boolean z12 = str4 != null;
            bE2.C(423349131);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = C22126m3.g(str);
                bE2.H(objT);
            }
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
            bE2.X(false);
            String str5 = (String) interfaceC22204y1.getF42167b();
            if (str5 == null) {
                str5 = "";
            }
            String str6 = str5;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.input.v f66388c = com.akita.compose.theme.re23.b.l(bE2).getF66388c();
            InputState inputState = z12 ? InputState.f61669c : InputState.f61668b;
            String str7 = (String) interfaceC22204y1.getF42167b();
            boolean z13 = !(str7 == null || str7.length() == 0);
            androidx.compose.ui.text.input.C.f42345b.getClass();
            C20981p1 c20981p1 = new C20981p1(0, (Boolean) null, androidx.compose.ui.text.input.C.f42354k, 0, (androidx.compose.ui.text.input.O) null, (Boolean) null, (z0.f) null, 123, (C42822w) null);
            k.j jVar = new k.j("", " %", null, 4, null);
            bE2.C(423356354);
            boolean z14 = (i14 & 57344) == 16384;
            Object objT2 = bE2.t();
            if (z14 || objT2 == c1651a) {
                objT2 = new C35101a(lVar, interfaceC22204y1);
                bE2.H(objT2);
            }
            bE2.X(false);
            com.akita.compose.component.input.u.a(str6, f66388c, (Y41.l) objT2, null, str2, false, inputState, c20981p1, null, jVar, 0, false, 0, null, z13, false, false, null, null, null, null, bE2, ((i14 << 9) & 57344) | 100663296, 0, 0, 8354472);
            String str8 = (str4 == null || str4.length() == 0) ? null : str4;
            if (str8 == null) {
                str8 = (str3 == null || str3.length() == 0) ? null : str3;
            }
            bE2.C(423377670);
            if (str8 != null) {
                com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65244o;
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                androidx.compose.ui.v vVarM = R1.m(androidx.compose.ui.v.f42878y1, 0.0f, 6, 0.0f, 0.0f, 13);
                if (z12) {
                    bE2.C(240028681);
                    jC2 = com.akita.compose.theme.re23.b.f63984b.f63880R0.c(bE2);
                    bE2.X(false);
                } else {
                    bE2.C(240102089);
                    jC2 = com.akita.compose.theme.re23.b.f63984b.f63918e0.c(bE2);
                    bE2.X(false);
                }
                com.akita.compose.foundation.ui.p.b(str8, rVar, vVarM, false, jC2, null, 0, 0, false, null, bE2, 384, 1000);
            }
            bE2.X(false);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C35102b(str, str2, str3, str4, lVar, vVar, i12);
        }
    }
}
