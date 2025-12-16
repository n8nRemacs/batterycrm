package com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.platform.C22501m2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: IacUIControlButtonsToggleCamera.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer-ui_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class z {

    /* compiled from: IacUIControlButtonsToggleCamera.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f167259a;

        static {
            int[] iArr = new int[IacUIControlButtonsToggleCameraState.values().length];
            try {
                iArr[IacUIControlButtonsToggleCameraState.CameraEnabled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IacUIControlButtonsToggleCameraState.CameraDisabled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f167259a = iArr;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k IacUIControlButtonsToggleCameraState iacUIControlButtonsToggleCameraState, @Y61.k Y41.a aVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.ui.v vVar2;
        com.akita.compose.component.button.t tVarP;
        androidx.compose.runtime.B bE2 = a12.E(664805808);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(iacUIControlButtonsToggleCameraState) ? 4 : 2) | i12;
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
            androidx.compose.ui.v vVarA = C22501m2.a(vVar2, "IacUITestTags.CallControlButtons.TOGGLE_CAMERA");
            int[] iArr = a.f167259a;
            int i15 = iArr[iacUIControlButtonsToggleCameraState.ordinal()];
            if (i15 != 1 && i15 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63985c.getClass();
            int i16 = com.akita.compose.theme.re23.e.f64883zf;
            androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(i16, 0, bE2);
            int i17 = iArr[iacUIControlButtonsToggleCameraState.ordinal()];
            if (i17 == 1) {
                bE2.C(1551417117);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                tVarP = com.akita.compose.theme.re23.b.c(bE2).P();
                bE2.X(false);
            } else {
                if (i17 != 2) {
                    throw com.avito.android.bxcontent.mvi.entity.f.q(1551370860, bE2, false);
                }
                bE2.C(1551420671);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                tVarP = com.akita.compose.theme.re23.b.c(bE2).i1();
                bE2.X(false);
            }
            com.akita.compose.component.button.m.f(eVarA, aVar, tVarP, vVarA, 0.0f, false, false, null, bE2, (i14 & 112) | 520, 240);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new x(iacUIControlButtonsToggleCameraState, aVar, vVar2, i12);
        }
    }
}
