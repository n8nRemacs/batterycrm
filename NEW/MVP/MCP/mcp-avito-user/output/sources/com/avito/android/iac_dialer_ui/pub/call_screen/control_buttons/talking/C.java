package com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.platform.C22501m2;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: IacUIControlButtonsToggleMic.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer-ui_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class C {

    /* compiled from: IacUIControlButtonsToggleMic.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f167195a;

        static {
            int[] iArr = new int[IacUIControlButtonsToggleMicState.values().length];
            try {
                iArr[IacUIControlButtonsToggleMicState.MicEnabled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IacUIControlButtonsToggleMicState.MicDisabled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f167195a = iArr;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k IacUIControlButtonsToggleMicState iacUIControlButtonsToggleMicState, @Y61.k Y41.a aVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.ui.v vVar2;
        com.akita.compose.component.button.t tVarI1;
        androidx.compose.runtime.B bE2 = a12.E(1734737962);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(iacUIControlButtonsToggleMicState) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(aVar) ? 32 : 16;
        }
        int i14 = i13 | 384;
        if ((i14 & 731) == 146 && bE2.c()) {
            bE2.f();
            vVar2 = vVar;
        } else {
            vVar2 = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarA = C22501m2.a(vVar2, "IacUITestTags.CallControlButtons.TOGGLE_MIC");
            int[] iArr = a.f167195a;
            int i15 = iArr[iacUIControlButtonsToggleMicState.ordinal()];
            if (i15 != 1 && i15 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(R.drawable.iac_dialer_ui_public_icon_mic_24, 0, bE2);
            int i16 = iArr[iacUIControlButtonsToggleMicState.ordinal()];
            if (i16 == 1) {
                bE2.C(-1369568621);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                tVarI1 = com.akita.compose.theme.re23.b.c(bE2).i1();
                bE2.X(false);
            } else {
                if (i16 != 2) {
                    throw com.avito.android.bxcontent.mvi.entity.f.q(-1369617120, bE2, false);
                }
                bE2.C(-1369564041);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.component.button.t tVarP = com.akita.compose.theme.re23.b.c(bE2).P();
                com.akita.compose.theme.re23.b.f63987e.getClass();
                com.akita.compose.theme.re23.semantic.b.f65954b.getText().getClass();
                tVarI1 = com.akita.compose.component.button.t.c(tVarP, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, X2.h.f18558f, null, null, null, null, null, 33538047);
                bE2.X(false);
            }
            com.akita.compose.component.button.m.f(eVarA, aVar, tVarI1, vVarA, 0.0f, false, false, null, bE2, (i14 & 112) | 520, 240);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new A(iacUIControlButtonsToggleMicState, aVar, vVar2, i12);
        }
    }
}
