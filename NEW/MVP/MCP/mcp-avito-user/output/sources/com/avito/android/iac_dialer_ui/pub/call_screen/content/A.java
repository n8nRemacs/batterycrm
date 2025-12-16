package com.avito.android.iac_dialer_ui.pub.call_screen.content;

import androidx.compose.runtime.internal.C22096n;
import com.avito.android.iac_dialer_ui.pub.call_screen.IacUICallScreenState;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: IacUICallScreenSupportModeContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final A f167062a = new A();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f167063b = new C22096n(1387046627, a.f167064l, false);

    /* compiled from: IacUICallScreenSupportModeContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f167064l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                Z.a(new IacUICallScreenState.SupportModeContent(com.avito.android.iac_dialer_ui.pub.common_ui.n.f167509a, com.avito.android.iac_dialer_ui.pub.common_ui.j.f167500a, new IacUICallScreenState.ControlButtons.Talking(com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking.panel.g.f167234b), IacUICallScreenState.DtmfButtons.VISIBLE), com.avito.android.iac_dialer_ui.pub.call_screen.accept_timeout.f.f166925b, C30878t.f167157l, C30879u.f167158l, C30880v.f167159l, C30881w.f167160l, C30882x.f167161l, C30883y.f167162l, C30884z.f167163l, null, a13, 115043766);
            }
            return G0.f406611a;
        }
    }
}
