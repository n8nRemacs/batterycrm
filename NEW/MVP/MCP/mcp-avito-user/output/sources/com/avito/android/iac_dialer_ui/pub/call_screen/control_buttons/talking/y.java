package com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacUIControlButtonsToggleCamera.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class y extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f167258l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(int i12) {
        super(2);
        this.f167258l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f167258l | 1);
        androidx.compose.runtime.B bE2 = a12.E(-1355477014);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            k.f167212a.getClass();
            com.akita.compose.theme.re23.c.a(false, k.f167213b, bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new y(iA2);
        }
        return G0.f406611a;
    }
}
