package com.avito.android.iac_dialer_ui.pub.finished_call_screens.fallback_screen;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import com.avito.android.iac_dialer_ui.pub.common_ui.n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacUIFinishedFallbackScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class h extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f167535l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i12) {
        super(2);
        this.f167535l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f167535l | 1);
        B bE2 = a12.E(1218698133);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            i.a(new j(n.f167509a, com.avito.android.iac_dialer_ui.pub.common_ui.j.f167500a, com.avito.android.iac_dialer_ui.pub.common_ui.f.f167491a, false, true, true), com.avito.android.iac_dialer_ui.pub.call_screen.accept_timeout.f.f166925b, d.f167531l, e.f167532l, f.f167533l, g.f167534l, null, bE2, 224694);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new h(iA2);
        }
        return G0.f406611a;
    }
}
