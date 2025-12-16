package com.avito.android.iac_dialer_ui.pub.overlay_widget;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import androidx.compose.foundation.O0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.v;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking.IacUIControlButtonsAudioDeviceState;
import kotlin.Metadata;

/* compiled from: IacUIOverlayWidget.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "imageLoaded", "_avito_iac-dialer-ui_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    @SuppressLint({"HardcodeStringDetector"})
    public static final IacUIOverlayWidgetState f167758a = new IacUIOverlayWidgetState(new IacPiiString("Хуберт Блейн  lsdkh lsdj lsdkjf klsdjf dkjfk sdjflskjdf lskdjff"), null, "На связи", 100L, null, IacUIControlButtonsAudioDeviceState.Speaker);

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k IacUIOverlayWidgetState iacUIOverlayWidgetState, @k Y41.a aVar, @k Y41.a aVar2, @k Y41.a aVar3, @l v.a aVar4, @l A a12, int i12) {
        int i13;
        v.a aVar5;
        B bE2 = a12.E(120883418);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(iacUIOverlayWidgetState) ? 4 : 2) | i12;
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
        if (((i13 | 24576) & 46811) == 9362 && bE2.c()) {
            bE2.f();
            aVar5 = aVar4;
        } else {
            v.a aVar6 = v.f42878y1;
            com.akita.compose.theme.re23.c.a(!O0.a(bE2), r.c(-403712033, new e(aVar6, iacUIOverlayWidgetState, aVar2, aVar3, aVar), bE2), bE2, 48, 0);
            aVar5 = aVar6;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new f(iacUIOverlayWidgetState, aVar, aVar2, aVar3, aVar5, i12);
        }
    }
}
