package com.vk.id.group.subscription.compose.util;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.InterfaceC20572g2;
import androidx.compose.foundation.shape.n;
import androidx.compose.foundation.shape.o;
import androidx.compose.material3.C21646j2;
import androidx.compose.material3.X1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PrimaryButton.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0007H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "testTag", "Lkotlin/Function0;", "Lkotlin/G0;", "onClick", "Landroidx/compose/runtime/o;", "content", "PrimaryButton", "(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;Ljava/lang/String;LY41/a;LY41/p;Landroidx/compose/runtime/A;I)V", "group-subscription-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PrimaryButtonKt {
    @InterfaceC22132o
    @InterfaceC22137p
    public static final void PrimaryButton(@k GroupSubscriptionStyle groupSubscriptionStyle, @k String str, @k Y41.a<G0> aVar, @k final p<? super A, ? super Integer, G0> pVar, @l A a12, int i12) {
        int i13;
        B bE2 = a12.E(2122988682);
        if ((i12 & 6) == 0) {
            i13 = (bE2.u(groupSubscriptionStyle) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.B(str) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= bE2.u(aVar) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= bE2.u(pVar) ? 2048 : 1024;
        }
        if ((i13 & 1171) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            v vVarD = C20588k2.d(C22501m2.a(v.f42878y1, str), 1.0f);
            float heightDp = groupSubscriptionStyle.getButtonsSizeStyle().getHeightDp();
            h.a aVar2 = h.f42849c;
            v vVarF = C20588k2.f(vVarD, heightDp);
            n nVarA = o.a(groupSubscriptionStyle.getButtonsCornersStyle().getRadiusDp());
            X1 x12 = X1.f35798a;
            long jTextPrimaryButtonBackgroundColor = StylingUtilKt.textPrimaryButtonBackgroundColor(groupSubscriptionStyle, bE2, i13 & 14);
            x12.getClass();
            C21646j2.a(aVar, vVarF, false, nVarA, X1.a(jTextPrimaryButtonBackgroundColor, 0L, bE2, 14), null, null, null, null, r.b(bE2, 404994714, new q<InterfaceC20572g2, A, Integer, G0>() { // from class: com.vk.id.group.subscription.compose.util.PrimaryButtonKt.PrimaryButton.1
                @Override // Y41.q
                public /* bridge */ /* synthetic */ G0 invoke(InterfaceC20572g2 interfaceC20572g2, A a13, Integer num) {
                    invoke(interfaceC20572g2, a13, num.intValue());
                    return G0.f406611a;
                }

                @InterfaceC22132o
                @InterfaceC22181t
                public final void invoke(InterfaceC20572g2 interfaceC20572g2, A a13, int i14) {
                    if ((i14 & 17) == 16 && a13.c()) {
                        a13.f();
                    } else {
                        pVar.invoke(a13, 0);
                    }
                }
            }), bE2, ((i13 >> 6) & 14) | 805306368, 484);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new com.vk.id.group.subscription.compose.ui.k(groupSubscriptionStyle, str, aVar, pVar, i12, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 PrimaryButton$lambda$0(GroupSubscriptionStyle groupSubscriptionStyle, String str, Y41.a aVar, p pVar, int i12, A a12, int i13) {
        PrimaryButton(groupSubscriptionStyle, str, aVar, pVar, a12, C22066f2.a(i12 | 1));
        return G0.f406611a;
    }
}
