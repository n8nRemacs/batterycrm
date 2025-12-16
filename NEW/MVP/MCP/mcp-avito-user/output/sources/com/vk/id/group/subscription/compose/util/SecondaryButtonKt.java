package com.vk.id.group.subscription.compose.util;

import Y41.q;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.InterfaceC20572g2;
import androidx.compose.foundation.shape.n;
import androidx.compose.foundation.shape.o;
import androidx.compose.material3.C21646j2;
import androidx.compose.material3.C21859s9;
import androidx.compose.material3.C21914uj;
import androidx.compose.material3.C21942w3;
import androidx.compose.material3.C21964x3;
import androidx.compose.material3.W1;
import androidx.compose.material3.X1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.text.font.C22605a0;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.text.font.Z;
import androidx.compose.ui.text.font.e0;
import androidx.compose.ui.text.style.i;
import androidx.compose.ui.text.style.j;
import androidx.compose.ui.text.style.p;
import androidx.compose.ui.text.x0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.unit.z;
import androidx.compose.ui.v;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import com.vk.id.group.subscription.compose.R;
import d0.C39475y;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import u0.C48752a;
import z0.f;

/* compiled from: SecondaryButton.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "testTag", "text", "Lkotlin/Function0;", "Lkotlin/G0;", "onClick", "SecondaryButton", "(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;Ljava/lang/String;Ljava/lang/String;LY41/a;Landroidx/compose/runtime/A;I)V", "group-subscription-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SecondaryButtonKt {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void SecondaryButton(@k final GroupSubscriptionStyle groupSubscriptionStyle, @k String str, @k final String str2, @k Y41.a<G0> aVar, @l A a12, int i12) {
        int i13;
        B bE2 = a12.E(1583742968);
        if ((i12 & 6) == 0) {
            i13 = (bE2.u(groupSubscriptionStyle) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.B(str) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= bE2.B(str2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= bE2.u(aVar) ? 2048 : 1024;
        }
        if ((i13 & 1171) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            v vVarD = C20588k2.d(C22501m2.a(v.f42878y1, str), 1.0f);
            float heightDp = groupSubscriptionStyle.getButtonsSizeStyle().getHeightDp();
            h.a aVar2 = h.f42849c;
            v vVarF = C20588k2.f(vVarD, heightDp);
            n nVarA = o.a(groupSubscriptionStyle.getButtonsCornersStyle().getRadiusDp());
            X1.f35798a.getClass();
            bE2.I(824987837);
            C21859s9.f37272a.getClass();
            C21942w3 c21942w3A = C21859s9.a(bE2);
            W1 w12 = c21942w3A.f37646L;
            if (w12 == null) {
                C39475y.f393591a.getClass();
                w12 = new W1(C21964x3.c(c21942w3A, C39475y.f393592b), C21964x3.c(c21942w3A, C39475y.f393598h), T.c(C21964x3.c(c21942w3A, C39475y.f393594d), 0.12f), T.c(C21964x3.c(c21942w3A, C39475y.f393595e), 0.38f), null);
                c21942w3A.f37646L = w12;
            }
            bE2.O();
            C21646j2.b(aVar, vVarF, false, nVarA, w12.a(StylingUtilKt.textSecondaryButtonBackgroundColor(groupSubscriptionStyle, bE2, i13 & 14), w12.f35717b, w12.f35718c, w12.f35719d), null, null, null, r.b(bE2, 660799562, new q<InterfaceC20572g2, A, Integer, G0>() { // from class: com.vk.id.group.subscription.compose.util.SecondaryButtonKt.SecondaryButton.1
                @Override // Y41.q
                public /* bridge */ /* synthetic */ G0 invoke(InterfaceC20572g2 interfaceC20572g2, A a13, Integer num) {
                    invoke(interfaceC20572g2, a13, num.intValue());
                    return G0.f406611a;
                }

                @InterfaceC22132o
                @InterfaceC22181t
                public final void invoke(InterfaceC20572g2 interfaceC20572g2, A a13, int i14) {
                    long jA2;
                    if ((i14 & 17) == 16 && a13.c()) {
                        a13.f();
                        return;
                    }
                    String str3 = str2;
                    v.a aVar3 = v.f42878y1;
                    i.f42675b.getClass();
                    int i15 = i.f42678e;
                    GroupSubscriptionStyle groupSubscriptionStyle2 = groupSubscriptionStyle;
                    a13.I(-1489233681);
                    if (groupSubscriptionStyle2 instanceof GroupSubscriptionStyle.Light) {
                        jA2 = C48752a.a(a13, R.color.vkid_azure_300);
                    } else {
                        if (!(groupSubscriptionStyle2 instanceof GroupSubscriptionStyle.Dark)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        T.f39320b.getClass();
                        jA2 = T.f39323e;
                    }
                    long j12 = jA2;
                    a13.O();
                    long jE2 = z.e(groupSubscriptionStyle.getButtonsSizeStyle().getTextSizeSp());
                    long jE3 = z.e(20);
                    e0.f42240c.getClass();
                    C21914uj.b(str3, aVar3, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new x0(j12, jE2, e0.f42248k, (Z) null, (C22605a0) null, (E) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.n) null, (f) null, 0L, (j) null, (f1) null, (androidx.compose.ui.graphics.drawscope.j) null, i15, 0, jE3, (p) null, (androidx.compose.ui.text.Z) null, (androidx.compose.ui.text.style.h) null, 0, 0, (androidx.compose.ui.text.style.r) null, 16613368, (C42822w) null), a13, 48, 0, 65532);
                }
            }), bE2, ((i13 >> 9) & 14) | 805306368);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new com.vk.id.group.subscription.compose.ui.k(groupSubscriptionStyle, str, str2, aVar, i12, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 SecondaryButton$lambda$0(GroupSubscriptionStyle groupSubscriptionStyle, String str, String str2, Y41.a aVar, int i12, A a12, int i13) {
        SecondaryButton(groupSubscriptionStyle, str, str2, aVar, a12, C22066f2.a(i12 | 1));
        return G0.f406611a;
    }
}
