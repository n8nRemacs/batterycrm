package com.avito.android.iac_dialer_ui.pub.call_screen.accept_timeout;

import Y41.p;
import Y61.l;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.v;
import com.akita.compose.component.banner.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacUIAcceptTimeoutBanner.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer-ui_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c {

    /* compiled from: IacUIAcceptTimeoutBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ v f166920l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f166921m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v vVar, int i12, int i13) {
            super(2);
            this.f166920l = vVar;
            this.f166921m = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            int i12 = this.f166921m;
            c.a(this.f166920l, a12, iA2, i12);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@l v vVar, @l A a12, int i12, int i13) {
        int i14;
        B bE2 = a12.E(1004097518);
        int i15 = i13 & 1;
        if (i15 != 0) {
            i14 = i12 | 6;
        } else {
            i14 = (bE2.B(vVar) ? 4 : 2) | i12;
        }
        if ((i14 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            if (i15 != 0) {
                vVar = v.f42878y1;
            }
            com.akita.compose.theme.re23.b.f63983a.getClass();
            h f66899i = com.akita.compose.theme.re23.b.b(bE2).getF66899i();
            com.avito.android.iac_dialer_ui.pub.call_screen.accept_timeout.a.f166912a.getClass();
            com.akita.compose.component.banner.g.c(f66899i, vVar, null, null, null, 0.0f, null, com.avito.android.iac_dialer_ui.pub.call_screen.accept_timeout.a.f166913b, bE2, 12582912 | h.f60462o | ((i14 << 3) & 112), 124);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(vVar, i12, i13);
        }
    }
}
