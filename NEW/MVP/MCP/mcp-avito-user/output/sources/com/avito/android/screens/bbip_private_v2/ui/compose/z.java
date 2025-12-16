package com.avito.android.screens.bbip_private_v2.ui.compose;

import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BbipPrivateV2Screen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class z extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BbipPrivateV2State f261400l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f261401m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(BbipPrivateV2State bbipPrivateV2State, InterfaceC22204y1 interfaceC22204y1) {
        super(2);
        this.f261400l = bbipPrivateV2State;
        this.f261401m = interfaceC22204y1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    @Override // Y41.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.runtime.A r12, java.lang.Integer r13) {
        /*
            r11 = this;
            androidx.compose.runtime.A r12 = (androidx.compose.runtime.A) r12
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            r13 = r13 & 11
            r0 = 2
            if (r13 != r0) goto L19
            boolean r13 = r12.c()
            if (r13 != 0) goto L14
            goto L19
        L14:
            r12.f()
            goto Lb9
        L19:
            com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State r13 = r11.f261400l
            java.lang.String r0 = r13.f261022i
            if (r0 != 0) goto Lb9
            boolean r0 = r13.f261023j
            if (r0 != 0) goto Lb9
            r0 = 1118463873(0x42aa6781, float:85.202156)
            r12.C(r0)
            androidx.compose.runtime.y1 r9 = r11.f261401m
            wZ.g r10 = r13.f261025l
            if (r10 != 0) goto L30
            goto L91
        L30:
            androidx.compose.ui.v$a r0 = androidx.compose.ui.v.f42878y1
            java.lang.String r1 = "BBIP_PRIVATE_V2_FLOATING_FOOTER_TEST_TAG"
            androidx.compose.ui.v r2 = androidx.compose.ui.platform.C22501m2.a(r0, r1)
            r0 = 1102290532(0x41b39e64, float:22.45234)
            r12.C(r0)
            boolean r0 = r12.B(r9)
            java.lang.Object r1 = r12.t()
            androidx.compose.runtime.A$a r3 = androidx.compose.runtime.A.f37866a
            if (r0 != 0) goto L51
            r3.getClass()
            androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
            if (r1 != r0) goto L59
        L51:
            com.avito.android.screens.bbip_private_v2.ui.compose.u r1 = new com.avito.android.screens.bbip_private_v2.ui.compose.u
            r1.<init>(r9)
            r12.H(r1)
        L59:
            Y41.l r1 = (Y41.l) r1
            r12.h()
            r0 = 1102303665(0x41b3d1b1, float:22.477388)
            r12.C(r0)
            boolean r0 = r12.B(r9)
            java.lang.Object r4 = r12.t()
            if (r0 != 0) goto L75
            r3.getClass()
            androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
            if (r4 != r0) goto L7d
        L75:
            com.avito.android.screens.bbip_private_v2.ui.compose.v r4 = new com.avito.android.screens.bbip_private_v2.ui.compose.v
            r4.<init>(r9)
            r12.H(r4)
        L7d:
            r3 = r4
            Y41.a r3 = (Y41.a) r3
            r12.h()
            boolean r5 = r13.f261024k
            r7 = 392(0x188, float:5.5E-43)
            r4 = 0
            r8 = 16
            r0 = r10
            r6 = r12
            com.avito.android.mnz_common.compose.C32579b.b(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            kotlin.G0 r0 = kotlin.G0.f406611a
        L91:
            r12.h()
            com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State$c r0 = r13.f261020g
            if (r0 == 0) goto Lb9
            com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State$c r0 = r13.f261019f
            if (r0 == 0) goto Lb9
            if (r10 != 0) goto Lb9
            androidx.compose.ui.v$a r0 = androidx.compose.ui.v.f42878y1
            com.avito.android.screens.bbip_private_v2.ui.compose.y r1 = new com.avito.android.screens.bbip_private_v2.ui.compose.y
            r1.<init>(r13, r9)
            r13 = -165459556(0xfffffffff623499c, float:-8.279662E32)
            androidx.compose.runtime.internal.n r5 = androidx.compose.runtime.internal.r.c(r13, r1, r12)
            r7 = 196614(0x30006, float:2.75515E-40)
            r8 = 30
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = r12
            com.akita.compose.component.floating_container.b.a(r0, r1, r2, r3, r4, r5, r6, r7, r8)
        Lb9:
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.screens.bbip_private_v2.ui.compose.z.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
