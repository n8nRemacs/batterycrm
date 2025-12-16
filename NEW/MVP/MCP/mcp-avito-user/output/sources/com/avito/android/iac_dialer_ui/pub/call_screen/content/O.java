package com.avito.android.iac_dialer_ui.pub.call_screen.content;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.iac_dialer_ui.pub.call_screen.IacUICallScreenState;
import com.avito.android.iac_dialer_ui.pub.call_screen.accept_timeout.IacUIAcceptTimeoutProgressBarState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;
import shark.AndroidResourceIdNames;

/* compiled from: IacUICallScreenAudioModeContent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer-ui_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class O {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k IacUICallScreenState.AudioModeContent audioModeContent, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2, @Y61.k Y41.a aVar3, @Y61.k Y41.a aVar4, @Y61.k Y41.a aVar5, @Y61.k Y41.a aVar6, @Y61.k Y41.a aVar7, @Y61.k Y41.a aVar8, @Y61.k Y41.a aVar9, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        boolean z12;
        int i14;
        v.a aVar10;
        int i15;
        androidx.compose.ui.v vVar2;
        androidx.compose.runtime.B bE2 = a12.E(1219081683);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(audioModeContent) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(aVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(aVar2) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.u(aVar3) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i13 |= bE2.u(aVar4) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i12) == 0) {
            i13 |= bE2.u(aVar5) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((3670016 & i12) == 0) {
            i13 |= bE2.u(aVar6) ? 1048576 : 524288;
        }
        if ((29360128 & i12) == 0) {
            i13 |= bE2.u(aVar7) ? 8388608 : 4194304;
        }
        if ((234881024 & i12) == 0) {
            i13 |= bE2.u(aVar8) ? 67108864 : 33554432;
        }
        if ((1879048192 & i12) == 0) {
            i13 |= bE2.u(aVar9) ? 536870912 : 268435456;
        }
        if ((1533916891 & i13) == 306783378 && bE2.c()) {
            bE2.f();
            vVar2 = vVar;
        } else {
            v.a aVar11 = androidx.compose.ui.v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            aVar11.getClass();
            androidx.compose.ui.v vVarA = C22501m2.a(fillElement, "IacUITestTags.IacUICallScreen.ROOT_AUDIO_MODE");
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i16 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar12 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar12);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            com.avito.android.iac_dialer_ui.pub.common_ui.n.a(audioModeContent.getCallHeader(), e0.a(aVar11), bE2, 0, 0);
            h.a aVar13 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.g.a(40, null, bE2, 6);
            int i17 = i13 & 112;
            com.avito.android.iac_dialer_ui.pub.common_ui.j.a(audioModeContent.getPeerInfo(), aVar, e0.a(aVar11), bE2, i17, 0);
            com.akita.compose.foundation.ui.g.a(28, null, bE2, 6);
            if (audioModeContent.getItemInfo() != null) {
                bE2.C(1560926895);
                com.avito.android.iac_dialer_ui.pub.common_ui.f.a(audioModeContent.getItemInfo(), aVar2, e0.a(aVar11), bE2, (i13 >> 3) & 112, 0);
                z12 = false;
                bE2.X(false);
            } else {
                z12 = false;
                bE2.C(1561127372);
                com.akita.compose.foundation.ui.g.a(102, null, bE2, 6);
                bE2.X(false);
            }
            com.akita.compose.foundation.ui.g.a(36, null, bE2, 6);
            com.avito.android.iac_dialer_ui.pub.call_screen.standalone_status.b.a(audioModeContent.getStandaloneStatus(), e0.a(aVar11), bE2, z12 ? 1 : 0, z12 ? 1 : 0);
            boolean z13 = true;
            if (audioModeContent.getAcceptTimeoutProgressBar() != null) {
                bE2.C(1561414029);
                com.akita.compose.foundation.ui.g.a(8, null, bE2, 6);
                IacUIAcceptTimeoutProgressBarState acceptTimeoutProgressBar = audioModeContent.getAcceptTimeoutProgressBar();
                androidx.compose.ui.v vVarA2 = e0.a(aVar11);
                boolean z14 = z12 ? 1 : 0;
                com.avito.android.iac_dialer_ui.pub.call_screen.accept_timeout.f.a(acceptTimeoutProgressBar, aVar, vVarA2, bE2, i17, 0);
                i15 = 32;
                com.akita.compose.foundation.ui.g.a(32, null, bE2, 6);
                aVar10 = aVar11;
                z13 = true;
                androidx.compose.ui.v vVarA3 = k12.a(aVar10, 1.0f, true);
                C30860a.f167114a.getClass();
                z12 = z14;
                androidx.compose.foundation.layout.E.a(vVarA3, null, false, C30860a.f167115b, bE2, 3072, 6);
                bE2.X(z12);
                i14 = 6;
            } else {
                i14 = 6;
                aVar10 = aVar11;
                i15 = 32;
                bE2.C(1562231685);
                C20608p2.a(bE2, k12.a(aVar10, 1.0f, true));
                bE2.X(z12);
            }
            float f12 = i15;
            com.akita.compose.foundation.ui.g.a(f12, null, bE2, i14);
            IacUICallScreenState.ControlButtons controlButtons = audioModeContent.getControlButtons();
            if (controlButtons instanceof IacUICallScreenState.ControlButtons.Incoming) {
                bE2.C(1562420909);
                com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.incoming.panel.f.a(aVar3, aVar4, null, bE2, (i13 >> 9) & WebSocketProtocol.PAYLOAD_SHORT);
                bE2.X(z12);
            } else if (controlButtons instanceof IacUICallScreenState.ControlButtons.Talking) {
                bE2.C(1562726445);
                com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking.panel.g.a(((IacUICallScreenState.ControlButtons.Talking) audioModeContent.getControlButtons()).getState(), aVar5, aVar6, aVar7, aVar8, aVar9, e0.a(aVar10), bE2, (i13 >> 12) & 524272, 0);
                bE2.X(z12);
            } else if (controlButtons == null) {
                bE2.C(1563252205);
                bE2.X(z12);
            } else {
                bE2.C(1563303448);
                bE2.X(z12);
            }
            com.akita.compose.foundation.ui.g.a(f12, null, bE2, i14);
            bE2.X(z13);
            vVar2 = aVar10;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new L(audioModeContent, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, vVar2, i12);
        }
    }
}
