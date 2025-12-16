package com.avito.android.str_cancellation_settings.composables;

import androidx.compose.foundation.C21086w0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.v;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import p0.InterfaceC44967a;

/* compiled from: CancellationDiscountSwitcher.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_str-cancellation-settings_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.str_cancellation_settings.composables.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35117q {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k String str, @Y61.k String str2, boolean z12, boolean z13, @Y61.k Y41.l lVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.ui.v vVarB;
        androidx.compose.ui.v vVar2;
        androidx.compose.runtime.B bE2 = a12.E(-760202948);
        if ((i12 & 14) == 0) {
            i13 = i12 | (bE2.B(str) ? 4 : 2);
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(str2) ? 32 : 16;
        }
        int i14 = i13 | (bE2.j(z12) ? 256 : 128) | (bE2.j(z13) ? 2048 : 1024);
        if ((i12 & 57344) == 0) {
            i14 |= bE2.u(lVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((374491 & i14) == 74898 && bE2.c()) {
            bE2.f();
        } else {
            InterfaceC44967a interfaceC44967a = (InterfaceC44967a) bE2.o(Q0.f41203l);
            bE2.C(-457071490);
            if (z13) {
                v.a aVar = androidx.compose.ui.v.f42878y1;
                bE2.C(-457069348);
                Object objT = bE2.t();
                androidx.compose.runtime.A.f37866a.getClass();
                if (objT == A.a.f37868b) {
                    objT = androidx.compose.foundation.interaction.l.a();
                    bE2.H(objT);
                }
                bE2.X(false);
                vVarB = C21086w0.b(aVar, (androidx.compose.foundation.interaction.m) objT, null, false, null, new C35112l(lVar, z12, interfaceC44967a), 28);
            } else {
                vVarB = androidx.compose.ui.v.f42878y1;
            }
            bE2.X(false);
            com.akita.compose.component.list_item.s sVarG = com.avito.android.bxcontent.mvi.entity.f.g(com.akita.compose.theme.re23.b.f63983a, bE2);
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.component.list_item.s sVarA = com.akita.compose.component.list_item.s.a(sVarG, null, iVar.f65239j, null, 507);
            com.akita.compose.component.list_item.s sVarA2 = com.akita.compose.component.list_item.s.a(com.akita.compose.theme.re23.b.m(bE2).getF66432c(), null, com.akita.compose.foundation.r.a(iVar.f65239j, com.akita.compose.theme.re23.b.f63984b.f63903Z, 0L, 0L, null, 0L, 0L, 1022), null, 507);
            if (z13) {
                vVar2 = vVar;
            } else {
                vVar2 = vVar;
                sVarA = sVarA2;
            }
            com.akita.compose.component.list_item.w.b(str, z12, sVarA, vVar2.d0(vVarB), false, androidx.compose.runtime.internal.r.c(2079606240, new C35110j(str2, z13), bE2), null, bE2, 221184 | (i14 & 14) | ((i14 >> 3) & 112), 64);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C35111k(str, str2, z12, z13, lVar, vVar, i12);
        }
    }
}
