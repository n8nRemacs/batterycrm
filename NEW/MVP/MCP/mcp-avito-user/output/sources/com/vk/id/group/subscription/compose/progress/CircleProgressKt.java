package com.vk.id.group.subscription.compose.progress;

import O11.a;
import O11.b;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.graphics.InterfaceC22276o0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import com.vk.id.group.subscription.compose.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: CircleProgress.kt */
@s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\b\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\f¨\u0006\u000f²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "label", "Lkotlin/G0;", "CircleProgress", "(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;Ljava/lang/String;Landroidx/compose/runtime/A;I)V", "CircleProgressWhite", "(Ljava/lang/String;Landroidx/compose/runtime/A;I)V", "CircleProgressBlue", "", "progressRes", "(ILjava/lang/String;Landroidx/compose/runtime/A;I)V", "", "angle", "group-subscription-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CircleProgressKt {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void CircleProgress(@k GroupSubscriptionStyle groupSubscriptionStyle, @k String str, @l A a12, int i12) {
        int i13;
        B bE2 = a12.E(362521346);
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
        } else if (groupSubscriptionStyle instanceof GroupSubscriptionStyle.Light) {
            bE2.I(-969958999);
            CircleProgressWhite(str, bE2, (i13 >> 3) & 14);
            bE2.X(false);
        } else {
            if (!(groupSubscriptionStyle instanceof GroupSubscriptionStyle.Dark)) {
                bE2.I(-969960715);
                bE2.X(false);
                throw new NoWhenBranchMatchedException();
            }
            bE2.I(-969956536);
            CircleProgressBlue(str, bE2, (i13 >> 3) & 14);
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(groupSubscriptionStyle, str, i12, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 CircleProgress$lambda$0(GroupSubscriptionStyle groupSubscriptionStyle, String str, int i12, A a12, int i13) {
        CircleProgress(groupSubscriptionStyle, str, a12, C22066f2.a(i12 | 1));
        return G0.f406611a;
    }

    private static final float CircleProgress$lambda$3(I3<Float> i32) {
        return i32.getF42167b().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 CircleProgress$lambda$5$lambda$4(I3 i32, InterfaceC22276o0 interfaceC22276o0) {
        interfaceC22276o0.d(CircleProgress$lambda$3(i32));
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 CircleProgress$lambda$6(int i12, String str, int i13, A a12, int i14) {
        CircleProgress(i12, str, a12, C22066f2.a(i13 | 1));
        return G0.f406611a;
    }

    @InterfaceC22132o
    @InterfaceC22181t
    private static final void CircleProgressBlue(String str, A a12, int i12) {
        int i13;
        B bE2 = a12.E(-2028856053);
        if ((i12 & 6) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 3) == 2 && bE2.c()) {
            bE2.f();
        } else {
            CircleProgress(R.drawable.vkid_sheet_spinner, str, bE2, (i13 << 3) & 112);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(str, i12, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 CircleProgressBlue$lambda$2(String str, int i12, A a12, int i13) {
        CircleProgressBlue(str, a12, C22066f2.a(i12 | 1));
        return G0.f406611a;
    }

    @InterfaceC22132o
    @InterfaceC22181t
    private static final void CircleProgressWhite(String str, A a12, int i12) {
        int i13;
        B bE2 = a12.E(944364882);
        if ((i12 & 6) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 3) == 2 && bE2.c()) {
            bE2.f();
        } else {
            CircleProgress(R.drawable.vkid_sheet_spinner_white, str, bE2, (i13 << 3) & 112);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(str, i12, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 CircleProgressWhite$lambda$1(String str, int i12, A a12, int i13) {
        CircleProgressWhite(str, a12, C22066f2.a(i12 | 1));
        return G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void CircleProgress(@j.InterfaceC42165v final int r11, final java.lang.String r12, androidx.compose.runtime.A r13, final int r14) {
        /*
            r0 = 1481056002(0x58471f02, float:8.7574397E14)
            androidx.compose.runtime.B r13 = r13.E(r0)
            r0 = r14 & 6
            r1 = 4
            r2 = 2
            if (r0 != 0) goto L18
            boolean r0 = r13.m(r11)
            if (r0 == 0) goto L15
            r0 = r1
            goto L16
        L15:
            r0 = r2
        L16:
            r0 = r0 | r14
            goto L19
        L18:
            r0 = r14
        L19:
            r3 = r14 & 48
            if (r3 != 0) goto L29
            boolean r3 = r13.B(r12)
            if (r3 == 0) goto L26
            r3 = 32
            goto L28
        L26:
            r3 = 16
        L28:
            r0 = r0 | r3
        L29:
            r3 = r0 & 19
            r4 = 18
            if (r3 != r4) goto L3a
            boolean r3 = r13.c()
            if (r3 != 0) goto L36
            goto L3a
        L36:
            r13.f()
            goto La7
        L3a:
            java.lang.String r3 = "vkid_auth_in_progress_spinner"
            r9 = 0
            androidx.compose.animation.core.g0 r3 = androidx.compose.animation.core.C20293k0.c(r3, r13, r9)
            androidx.compose.animation.core.O r4 = androidx.compose.animation.core.Q.f26124d
            r5 = 1000(0x3e8, float:1.401E-42)
            androidx.compose.animation.core.G1 r2 = androidx.compose.animation.core.C20310q.e(r5, r9, r4, r2)
            androidx.compose.animation.core.RepeatMode r4 = androidx.compose.animation.core.RepeatMode.f26133b
            r5 = 0
            androidx.compose.animation.core.f0 r4 = androidx.compose.animation.core.C20310q.a(r2, r4, r5, r1)
            int r1 = r0 << 9
            r2 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r2
            r2 = 4536(0x11b8, float:6.356E-42)
            r7 = r2 | r1
            r2 = 0
            r5 = 1135869952(0x43b40000, float:360.0)
            r8 = 0
            r1 = r3
            r3 = r5
            r5 = r12
            r6 = r13
            androidx.compose.animation.core.g0$a r1 = androidx.compose.animation.core.C20293k0.a(r1, r2, r3, r4, r5, r6, r7, r8)
            androidx.compose.ui.v$a r2 = androidx.compose.ui.v.f42878y1
            r3 = -969926128(0xffffffffc6301a10, float:-11270.516)
            r13.I(r3)
            boolean r3 = r13.B(r1)
            java.lang.Object r4 = r13.t()
            if (r3 != 0) goto L82
            androidx.compose.runtime.A$a r3 = androidx.compose.runtime.A.f37866a
            r3.getClass()
            androidx.compose.runtime.A$a$a r3 = androidx.compose.runtime.A.a.f37868b
            if (r4 != r3) goto L8b
        L82:
            O11.c r4 = new O11.c
            r3 = 0
            r4.<init>(r1, r3)
            r13.H(r4)
        L8b:
            Y41.l r4 = (Y41.l) r4
            r13.X(r9)
            androidx.compose.ui.v r3 = androidx.compose.ui.graphics.C22274n0.a(r2, r4)
            r0 = r0 & 14
            androidx.compose.ui.graphics.painter.e r1 = u0.e.a(r11, r0, r13)
            r6 = 0
            r7 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r9 = 48
            r10 = 120(0x78, float:1.68E-43)
            r8 = r13
            androidx.compose.foundation.C20806p1.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        La7:
            androidx.compose.runtime.c2 r13 = r13.Z()
            if (r13 == 0) goto Lb4
            O11.d r0 = new O11.d
            r0.<init>()
            r13.f38184d = r0
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.id.group.subscription.compose.progress.CircleProgressKt.CircleProgress(int, java.lang.String, androidx.compose.runtime.A, int):void");
    }
}
