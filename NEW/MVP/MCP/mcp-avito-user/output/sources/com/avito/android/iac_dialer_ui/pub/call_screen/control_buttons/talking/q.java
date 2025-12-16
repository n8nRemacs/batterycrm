package com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.platform.C22501m2;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: IacUIControlButtonsAudioDevice.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer-ui_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class q {

    /* compiled from: IacUIControlButtonsAudioDevice.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f167245a;

        static {
            int[] iArr = new int[IacUIControlButtonsAudioDeviceState.values().length];
            try {
                iArr[IacUIControlButtonsAudioDeviceState.EarpieceOrWireHeadset.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IacUIControlButtonsAudioDeviceState.Speaker.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IacUIControlButtonsAudioDeviceState.Bluetooth.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f167245a = iArr;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k IacUIControlButtonsAudioDeviceState iacUIControlButtonsAudioDeviceState, @Y61.k Y41.a aVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.ui.v vVar2;
        int i14;
        com.akita.compose.component.button.t tVarI1;
        androidx.compose.runtime.B bE2 = a12.E(-515000719);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(iacUIControlButtonsAudioDeviceState) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(aVar) ? 32 : 16;
        }
        int i15 = i13 | 384;
        if ((i15 & 731) == 146 && bE2.c()) {
            bE2.f();
            vVar2 = vVar;
        } else {
            vVar2 = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarA = C22501m2.a(vVar2, "IacUITestTags.CallControlButtons.AUDIO_DEVICE");
            int[] iArr = a.f167245a;
            int i16 = iArr[iacUIControlButtonsAudioDeviceState.ordinal()];
            if (i16 == 1 || i16 == 2) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.b.f63985c.getClass();
                i14 = com.akita.compose.theme.re23.e.f64524ef;
            } else {
                if (i16 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i14 = R.drawable.iac_dialer_ui_public_icon_bluetooth_24;
            }
            androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(i14, 0, bE2);
            int i17 = iArr[iacUIControlButtonsAudioDeviceState.ordinal()];
            if (i17 == 1) {
                bE2.C(-1784475188);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                tVarI1 = com.akita.compose.theme.re23.b.c(bE2).i1();
                bE2.X(false);
            } else if (i17 == 2) {
                bE2.C(-1784471830);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                tVarI1 = com.akita.compose.theme.re23.b.c(bE2).P();
                bE2.X(false);
            } else {
                if (i17 != 3) {
                    throw com.avito.android.bxcontent.mvi.entity.f.q(-1784527079, bE2, false);
                }
                bE2.C(-1784468470);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                tVarI1 = com.akita.compose.theme.re23.b.c(bE2).P();
                bE2.X(false);
            }
            com.akita.compose.component.button.m.f(eVarA, aVar, tVarI1, vVarA, 0.0f, false, false, null, bE2, (i15 & 112) | 520, 240);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new o(iacUIControlButtonsAudioDeviceState, aVar, vVar2, i12);
        }
    }
}
