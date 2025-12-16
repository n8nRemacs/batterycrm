package com.avito.android.vas_performance.screens.visual_v2;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VisualVasV2Fragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class d extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ VisualVasV2Fragment f321180l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f321181m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(VisualVasV2Fragment visualVasV2Fragment, InterfaceC22204y1 interfaceC22204y1) {
        super(2);
        this.f321180l = visualVasV2Fragment;
        this.f321181m = interfaceC22204y1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    @Override // Y41.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.runtime.A r18, java.lang.Integer r19) {
        /*
            r17 = this;
            r0 = r17
            r6 = r18
            androidx.compose.runtime.A r6 = (androidx.compose.runtime.A) r6
            r1 = r19
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
            goto Lb0
        L1f:
            androidx.compose.runtime.y1 r1 = r0.f321181m
            java.lang.Object r1 = r1.getF42167b()
            RL0.c r1 = (RL0.c) r1
            com.avito.android.vas_performance.screens.visual_v2.VisualVasV2Fragment r9 = r0.f321180l
            androidx.lifecycle.O0 r2 = r9.f321160o0
            java.lang.Object r3 = r2.getValue()
            com.avito.android.vas_performance.screens.visual_v2.h r3 = (com.avito.android.vas_performance.screens.visual_v2.h) r3
            kotlinx.coroutines.flow.i r3 = r3.getEvents()
            java.lang.Object r2 = r2.getValue()
            r12 = r2
            com.avito.android.vas_performance.screens.visual_v2.h r12 = (com.avito.android.vas_performance.screens.visual_v2.h) r12
            r2 = -620251518(0xffffffffdb07b682, float:-3.819979E16)
            r6.C(r2)
            boolean r2 = r6.B(r12)
            java.lang.Object r4 = r6.t()
            androidx.compose.runtime.A$a r5 = androidx.compose.runtime.A.f37866a
            if (r2 != 0) goto L55
            r5.getClass()
            androidx.compose.runtime.A$a$a r2 = androidx.compose.runtime.A.a.f37868b
            if (r4 != r2) goto L67
        L55:
            com.avito.android.vas_performance.screens.visual_v2.a r4 = new com.avito.android.vas_performance.screens.visual_v2.a
            java.lang.String r15 = "accept(Ljava/lang/Object;)V"
            r16 = 0
            r11 = 1
            java.lang.Class<com.avito.android.vas_performance.screens.visual_v2.h> r13 = com.avito.android.vas_performance.screens.visual_v2.h.class
            java.lang.String r14 = "accept"
            r10 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r6.H(r4)
        L67:
            kotlin.reflect.i r4 = (kotlin.reflect.i) r4
            r6.h()
            Y41.l r4 = (Y41.l) r4
            com.avito.android.deeplink_handler.handler.composite.a r2 = r9.f321162q0
            if (r2 == 0) goto L73
            goto L74
        L73:
            r2 = 0
        L74:
            r7 = -620249683(0xffffffffdb07bdad, float:-3.8207673E16)
            r6.C(r7)
            boolean r2 = r6.B(r2)
            java.lang.Object r7 = r6.t()
            if (r2 != 0) goto L8b
            r5.getClass()
            androidx.compose.runtime.A$a$a r2 = androidx.compose.runtime.A.a.f37868b
            if (r7 != r2) goto L93
        L8b:
            com.avito.android.vas_performance.screens.visual_v2.b r7 = new com.avito.android.vas_performance.screens.visual_v2.b
            r7.<init>(r9)
            r6.H(r7)
        L93:
            r5 = r7
            Y41.l r5 = (Y41.l) r5
            r6.h()
            com.avito.android.vas_performance.screens.visual_v2.c r14 = new com.avito.android.vas_performance.screens.visual_v2.c
            java.lang.Class<com.avito.android.vas_performance.screens.visual_v2.VisualVasV2Fragment> r10 = com.avito.android.vas_performance.screens.visual_v2.VisualVasV2Fragment.class
            java.lang.String r11 = "handleScreenClose"
            r8 = 1
            java.lang.String r12 = "handleScreenClose(Z)V"
            r13 = 0
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r7 = 72
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r14
            com.avito.android.vas_performance.screens.visual_v2.ui.compose.l.a(r1, r2, r3, r4, r5, r6, r7)
        Lb0:
            kotlin.G0 r1 = kotlin.G0.f406611a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vas_performance.screens.visual_v2.d.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
