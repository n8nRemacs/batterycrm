package com.vk.id.group.subscription.compose.close;

import AK.c;
import Y41.a;
import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.H;
import androidx.compose.foundation.interaction.m;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.J2;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.painter.e;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.layout.M;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.v;
import com.vk.id.group.subscription.compose.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CloseIcon.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Lkotlin/G0;", "onClick", "CloseIcon", "(LY41/a;Landroidx/compose/runtime/A;I)V", "group-subscription-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CloseIconKt {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void CloseIcon(@k a<G0> aVar, @l A a12, int i12) {
        int i13;
        int i14 = 0;
        B bE2 = a12.E(-909803553);
        if ((i12 & 6) == 0) {
            i13 = (bE2.u(aVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 3) == 2 && bE2.c()) {
            bE2.f();
        } else {
            v vVarA = C22501m2.a(v.f42878y1, "group_subscription_close");
            bE2.I(1550028971);
            Object objT = bE2.t();
            A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = androidx.compose.foundation.interaction.l.a();
                bE2.H(objT);
            }
            bE2.X(false);
            v vVarB = C21086w0.b(vVarA, (m) objT, null, false, null, aVar, 28);
            bE2.I(733328855);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0E = C20632w.e(InterfaceC22215f.a.f39076b, false, bE2, 0);
            bE2.I(-1323940314);
            int i15 = bE2.f37888Q;
            O1 o1S = bE2.S();
            InterfaceC22413h.f40789C1.getClass();
            a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            C22096n c22096nC = M.c(vVarB);
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0E);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                c.y(i15, bE2, i15, pVar);
            }
            H.y(0, c22096nC, J2.a(bE2), bE2, 2058660585);
            C20644z c20644z = C20644z.f28804a;
            e eVarA = u0.e.a(R.drawable.vkid_group_subscription_close, 0, bE2);
            InterfaceC22374n.f40491a.getClass();
            C20806p1.a(eVarA, null, null, null, InterfaceC22374n.a.f40494c, 0.0f, null, bE2, 24624, 108);
            H.B(bE2, false, true, false, false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new N11.a(i12, i14, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 CloseIcon$lambda$2(a aVar, int i12, A a12, int i13) {
        CloseIcon(aVar, a12, C22066f2.a(i12 | 1));
        return G0.f406611a;
    }
}
