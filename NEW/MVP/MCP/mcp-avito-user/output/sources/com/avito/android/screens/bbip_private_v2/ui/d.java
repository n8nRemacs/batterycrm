package com.avito.android.screens.bbip_private_v2.ui;

import Y41.p;
import androidx.compose.runtime.A;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BbipPrivateV2Fragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BbipPrivateV2State f261402l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BbipPrivateV2Fragment f261403m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BbipPrivateV2State bbipPrivateV2State, BbipPrivateV2Fragment bbipPrivateV2Fragment) {
        super(2);
        this.f261402l = bbipPrivateV2State;
        this.f261403m = bbipPrivateV2Fragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    @Override // Y41.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.runtime.A r17, java.lang.Integer r18) {
        /*
            r16 = this;
            r0 = r16
            r6 = r17
            androidx.compose.runtime.A r6 = (androidx.compose.runtime.A) r6
            r1 = r18
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r1 = r1 & 11
            r2 = 2
            if (r1 != r2) goto L1f
            boolean r1 = r6.c()
            if (r1 != 0) goto L1a
            goto L1f
        L1a:
            r6.f()
            goto Lb1
        L1f:
            com.avito.android.screens.bbip_private_v2.ui.BbipPrivateV2Fragment r1 = r0.f261403m
            kotlin.C r2 = r1.f261120o0
            java.lang.Object r3 = r2.getValue()
            com.avito.android.screens.bbip_private_v2.ui.f r3 = (com.avito.android.screens.bbip_private_v2.ui.f) r3
            kotlinx.coroutines.flow.i r3 = r3.getEvents()
            java.lang.Object r2 = r2.getValue()
            r9 = r2
            com.avito.android.screens.bbip_private_v2.ui.f r9 = (com.avito.android.screens.bbip_private_v2.ui.f) r9
            r2 = -1867264354(0xffffffff90b3ce9e, float:-7.0921395E-29)
            r6.C(r2)
            boolean r2 = r6.B(r9)
            java.lang.Object r4 = r6.t()
            androidx.compose.runtime.A$a r5 = androidx.compose.runtime.A.f37866a
            if (r2 != 0) goto L4d
            r5.getClass()
            androidx.compose.runtime.A$a$a r2 = androidx.compose.runtime.A.a.f37868b
            if (r4 != r2) goto L5e
        L4d:
            com.avito.android.screens.bbip_private_v2.ui.a r4 = new com.avito.android.screens.bbip_private_v2.ui.a
            java.lang.String r12 = "accept(Ljava/lang/Object;)V"
            r13 = 0
            r8 = 1
            java.lang.Class<com.avito.android.screens.bbip_private_v2.ui.f> r10 = com.avito.android.screens.bbip_private_v2.ui.f.class
            java.lang.String r11 = "accept"
            r7 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r6.H(r4)
        L5e:
            kotlin.reflect.i r4 = (kotlin.reflect.i) r4
            r6.h()
            Y41.l r4 = (Y41.l) r4
            com.avito.android.deeplink_handler.handler.composite.a r2 = r1.f261122q0
            r7 = 0
            if (r2 == 0) goto L6b
            goto L6c
        L6b:
            r2 = r7
        L6c:
            r8 = -1867262382(0xffffffff90b3d652, float:-7.0933264E-29)
            r6.C(r8)
            boolean r2 = r6.B(r2)
            java.lang.Object r8 = r6.t()
            if (r2 != 0) goto L83
            r5.getClass()
            androidx.compose.runtime.A$a$a r2 = androidx.compose.runtime.A.a.f37868b
            if (r8 != r2) goto L8b
        L83:
            com.avito.android.screens.bbip_private_v2.ui.b r8 = new com.avito.android.screens.bbip_private_v2.ui.b
            r8.<init>(r1)
            r6.H(r8)
        L8b:
            r5 = r8
            Y41.l r5 = (Y41.l) r5
            r6.h()
            com.avito.android.screens.bbip_private_v2.ui.c r15 = new com.avito.android.screens.bbip_private_v2.ui.c
            ZK0.b r1 = r1.f261123r0
            if (r1 == 0) goto L99
            r10 = r1
            goto L9a
        L99:
            r10 = r7
        L9a:
            java.lang.String r13 = "startBblCampaign(Ljava/lang/String;)V"
            r14 = 0
            r9 = 1
            java.lang.Class<ZK0.a> r11 = ZK0.a.class
            java.lang.String r12 = "startBblCampaign"
            r8 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14)
            com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State r1 = r0.f261402l
            r7 = 64
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r15
            com.avito.android.screens.bbip_private_v2.ui.compose.G.a(r1, r2, r3, r4, r5, r6, r7)
        Lb1:
            kotlin.G0 r1 = kotlin.G0.f406611a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.screens.bbip_private_v2.ui.d.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
