package com.avito.android.iac_dialer_ui.pub.call_screen;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import com.avito.android.iac_dialer_ui.pub.call_screen.IacUICallScreenState;
import com.avito.android.iac_dialer_ui.pub.call_screen.toasts.IacUICallToastState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacUICallScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class p extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f167326l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(int i12) {
        super(2);
        this.f167326l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f167326l | 1);
        B bE2 = a12.E(1862384678);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            y.a(new IacUICallScreenState(new IacUICallScreenState.AudioModeContent(com.avito.android.iac_dialer_ui.pub.common_ui.n.f167509a, com.avito.android.iac_dialer_ui.pub.common_ui.j.f167500a, com.avito.android.iac_dialer_ui.pub.common_ui.f.f167491a, com.avito.android.iac_dialer_ui.pub.call_screen.standalone_status.b.f167333a, com.avito.android.iac_dialer_ui.pub.call_screen.accept_timeout.f.f166924a, new IacUICallScreenState.ControlButtons.Talking(com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking.panel.g.f167234b)), IacUICallToastState.UnstableConnectionToast.INSTANCE, true, com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.w.f167030a), com.avito.android.iac_dialer_ui.pub.call_screen.accept_timeout.f.f166925b, m.f167323l, q.f167327l, r.f167328l, s.f167329l, t.f167339l, u.f167358l, v.f167359l, w.f167396l, x.f167469l, c.f167061l, d.f167260l, e.f167315l, f.f167316l, g.f167317l, h.f167318l, kotlinx.coroutines.channels.A.a(0, null, null, 7), i.f167319l, j.f167320l, k.f167321l, kotlinx.coroutines.channels.A.a(0, null, null, 7), l.f167322l, n.f167324l, kotlinx.coroutines.channels.A.a(0, null, null, 7), o.f167325l, bE2, 920350128, 924544438, 232902);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new p(iA2);
        }
        return G0.f406611a;
    }
}
