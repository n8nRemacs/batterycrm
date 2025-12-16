package com.avito.android.iac_dialer_ui.pub.call_screen.toasts;

import Y41.q;
import androidx.compose.foundation.layout.InterfaceC20572g2;
import androidx.compose.runtime.A;
import com.akita.compose.component.button.m;
import com.akita.compose.component.button.t;
import com.akita.compose.component.toast_bar.J;
import com.avito.android.iac_dialer_ui.pub.call_screen.toasts.IacUICallToastState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacUICallToast.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/g2;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/g2;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class f extends N implements q<InterfaceC20572g2, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ IacUICallToastState f167350l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f167351m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ J f167352n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(IacUICallToastState iacUICallToastState, Y41.a<G0> aVar, J j12) {
        super(3);
        this.f167350l = iacUICallToastState;
        this.f167351m = (N) aVar;
        this.f167352n = j12;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.q
    public final G0 invoke(InterfaceC20572g2 interfaceC20572g2, A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else if (this.f167350l instanceof IacUICallToastState.VpnToast) {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63985c.getClass();
            int i12 = com.akita.compose.theme.re23.e.f64237O3;
            t tVarF0 = com.akita.compose.theme.re23.b.c(a13).f0();
            J j12 = this.f167352n;
            m.e(i12, this.f167351m, t.c(tVarF0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, j12.f63217c, null, null, null, null, null, j12.f63215a.f63644a, null, null, null, null, null, 33537791), null, false, false, null, a13, 512, 248);
        }
        return G0.f406611a;
    }
}
