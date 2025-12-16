package com.vk.id.group.subscription.compose.snackbar;

import Y41.a;
import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.R1;
import androidx.compose.material3.Bg;
import androidx.compose.material3.C21914uj;
import androidx.compose.material3.C21991y8;
import androidx.compose.material3.Fe;
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
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.M;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.text.font.C22605a0;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.text.font.Z;
import androidx.compose.ui.text.font.e0;
import androidx.compose.ui.text.style.h;
import androidx.compose.ui.text.style.j;
import androidx.compose.ui.text.style.n;
import androidx.compose.ui.text.x0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import com.vk.id.group.subscription.compose.R;
import com.vk.id.group.subscription.compose.util.StylingUtilKt;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import u0.C48752a;
import u0.e;
import z0.f;

/* compiled from: GroupSubscriptionSnackbar.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "message", "Lkotlin/G0;", "GroupSubscriptionSnackbar", "(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;Ljava/lang/String;Landroidx/compose/runtime/A;I)V", "group-subscription-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GroupSubscriptionSnackbarKt {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void GroupSubscriptionSnackbar(@k final GroupSubscriptionStyle groupSubscriptionStyle, @k final String str, @l A a12, int i12) {
        int i13;
        B bE2 = a12.E(-1779598434);
        if ((i12 & 6) == 0) {
            i13 = (bE2.u(groupSubscriptionStyle) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.B(str) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && bE2.c()) {
            bE2.f();
        } else {
            v vVarA = C22501m2.a(v.f42878y1, "group_subscription_snackbar");
            long jBackgroundColor = StylingUtilKt.backgroundColor(groupSubscriptionStyle, bE2, i13 & 14);
            Fe.f34735a.getClass();
            Bg.a(vVarA, ComposableSingletons$GroupSubscriptionSnackbarKt.INSTANCE.m117getLambda1$group_subscription_compose_release(), null, Fe.f34737c, jBackgroundColor, 0L, 0L, 0L, r.b(bE2, 656028067, new p<A, Integer, G0>() { // from class: com.vk.id.group.subscription.compose.snackbar.GroupSubscriptionSnackbarKt.GroupSubscriptionSnackbar.1
                @Override // Y41.p
                public /* bridge */ /* synthetic */ G0 invoke(A a13, Integer num) {
                    invoke(a13, num.intValue());
                    return G0.f406611a;
                }

                @InterfaceC22132o
                @InterfaceC22181t
                public final void invoke(A a13, int i14) {
                    if ((i14 & 3) == 2 && a13.c()) {
                        a13.f();
                        return;
                    }
                    InterfaceC22215f.f39074a.getClass();
                    i.b bVar = InterfaceC22215f.a.f39086l;
                    GroupSubscriptionStyle groupSubscriptionStyle2 = groupSubscriptionStyle;
                    String str2 = str;
                    a13.I(693286680);
                    v.a aVar = v.f42878y1;
                    C20585k.f28659a.getClass();
                    C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, a13, 48);
                    a13.I(-1323940314);
                    int f37888q = a13.getF37888Q();
                    O1 o1Y = a13.y();
                    InterfaceC22413h.f40789C1.getClass();
                    a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
                    C22096n c22096nC = M.c(aVar);
                    if (a13.F() == null) {
                        C22190v.b();
                        throw null;
                    }
                    a13.A();
                    if (a13.getF37887P()) {
                        a13.b(aVar2);
                    } else {
                        a13.d();
                    }
                    R3.b(InterfaceC22413h.a.f40796g, a13, c20568f2A);
                    R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                    p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                    if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                        androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                    }
                    H.x(0, c22096nC, J2.a(a13), a13, 2058660585);
                    C20576h2 c20576h2 = C20576h2.f28641a;
                    C21991y8.a(e.a(R.drawable.vkid_check_circle_outline, 0, a13), null, aVar, C48752a.a(a13, R.color.vkid_green), a13, 432);
                    x0 x0Var = new x0(StylingUtilKt.textPrimaryColor(groupSubscriptionStyle2, a13, 0), 0L, (e0) null, (Z) null, (C22605a0) null, (E) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (n) null, (f) null, 0L, (j) null, (f1) null, (androidx.compose.ui.graphics.drawscope.j) null, 0, 0, 0L, (androidx.compose.ui.text.style.p) null, (androidx.compose.ui.text.Z) null, (h) null, 0, 0, (androidx.compose.ui.text.style.r) null, 16777214, (C42822w) null);
                    h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
                    C21914uj.b(str2, R1.k(12, 0.0f, 2, aVar), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, x0Var, a13, 48, 0, 65532);
                    a13.O();
                    a13.z();
                    a13.O();
                    a13.O();
                }
            }), bE2, 805306422, 460);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new O11.a(groupSubscriptionStyle, str, i12, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 GroupSubscriptionSnackbar$lambda$0(GroupSubscriptionStyle groupSubscriptionStyle, String str, int i12, A a12, int i13) {
        GroupSubscriptionSnackbar(groupSubscriptionStyle, str, a12, C22066f2.a(i12 | 1));
        return G0.f406611a;
    }
}
