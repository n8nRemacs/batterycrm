package com.avito.android.iac_dialer_ui.pub.call_screen.content;

import androidx.compose.runtime.internal.C22096n;
import com.avito.android.iac_dialer_ui.pub.call_screen.IacUICallScreenState;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: IacUICallScreenVideoModeContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final K f167074a = new K();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f167075b = new C22096n(2051805007, a.f167076l, false);

    /* compiled from: IacUICallScreenVideoModeContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f167076l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                d0.a(new IacUICallScreenState.VideoModeContent(com.avito.android.iac_dialer_ui.pub.call_screen.video_renderer.i.f167393a, com.avito.android.iac_dialer_ui.pub.call_screen.video_renderer.i.f167394b, com.avito.android.iac_dialer_ui.pub.call_screen.video_mode_peer_info.c.f167368a, new IacUICallScreenState.ControlButtons.Talking(com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking.panel.g.f167233a)), com.avito.android.iac_dialer_ui.pub.call_screen.accept_timeout.f.f166925b, B.f167065l, C.f167066l, D.f167067l, E.f167068l, F.f167069l, G.f167070l, H.f167071l, I.f167072l, J.f167073l, null, a13, 920350134, 6);
            }
            return G0.f406611a;
        }
    }
}
