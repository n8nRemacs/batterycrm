package com.avito.android.cpt.pre_activation;

import Y41.p;
import androidx.compose.runtime.A;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PreActivationFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class d extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PreActivationFragment f126683l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f126684m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PreActivationFragment preActivationFragment, com.avito.android.lib.design.bottom_sheet.d dVar) {
        super(2);
        this.f126683l = preActivationFragment;
        this.f126684m = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    @Override // Y41.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.runtime.A r17, java.lang.Integer r18) {
        /*
            r16 = this;
            r0 = r16
            r7 = r17
            androidx.compose.runtime.A r7 = (androidx.compose.runtime.A) r7
            r1 = r18
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r1 = r1 & 11
            r2 = 2
            if (r1 != r2) goto L1f
            boolean r1 = r7.c()
            if (r1 != 0) goto L1a
            goto L1f
        L1a:
            r7.f()
            goto La4
        L1f:
            com.avito.android.cpt.pre_activation.PreActivationFragment r1 = r0.f126683l
            androidx.lifecycle.O0 r2 = r1.f126669i0
            java.lang.Object r3 = r2.getValue()
            com.avito.android.cpt.pre_activation.h r3 = (com.avito.android.cpt.pre_activation.h) r3
            kotlinx.coroutines.flow.n2 r3 = r3.getState()
            androidx.compose.runtime.y1 r3 = androidx.compose.runtime.C22126m3.b(r3, r7)
            java.lang.Object r3 = r3.getF42167b()
            Xr.c r3 = (Xr.c) r3
            java.lang.Object r4 = r2.getValue()
            r10 = r4
            com.avito.android.cpt.pre_activation.h r10 = (com.avito.android.cpt.pre_activation.h) r10
            r4 = 2077539549(0x7bd4bcdd, float:2.209195E36)
            r7.C(r4)
            boolean r4 = r7.B(r10)
            java.lang.Object r5 = r7.t()
            if (r4 != 0) goto L57
            androidx.compose.runtime.A$a r4 = androidx.compose.runtime.A.f37866a
            r4.getClass()
            androidx.compose.runtime.A$a$a r4 = androidx.compose.runtime.A.a.f37868b
            if (r5 != r4) goto L68
        L57:
            com.avito.android.cpt.pre_activation.a r5 = new com.avito.android.cpt.pre_activation.a
            java.lang.String r13 = "accept(Ljava/lang/Object;)V"
            r14 = 0
            r9 = 1
            java.lang.Class<com.avito.android.cpt.pre_activation.h> r11 = com.avito.android.cpt.pre_activation.h.class
            java.lang.String r12 = "accept"
            r8 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r7.H(r5)
        L68:
            kotlin.reflect.i r5 = (kotlin.reflect.i) r5
            r7.h()
            java.lang.Object r2 = r2.getValue()
            com.avito.android.cpt.pre_activation.h r2 = (com.avito.android.cpt.pre_activation.h) r2
            kotlinx.coroutines.flow.i r4 = r2.getEvents()
            com.avito.android.cpt.pre_activation.b r6 = new com.avito.android.cpt.pre_activation.b
            java.lang.Class<com.avito.android.cpt.pre_activation.PreActivationFragment> r11 = com.avito.android.cpt.pre_activation.PreActivationFragment.class
            java.lang.String r12 = "handleDeeplink"
            r9 = 2
            java.lang.String r13 = "handleDeeplink(Lcom/avito/android/deep_linking/links/DeepLink;Z)V"
            r14 = 0
            r8 = r6
            r10 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            com.avito.android.cpt.pre_activation.c r15 = new com.avito.android.cpt.pre_activation.c
            java.lang.Class<com.avito.android.cpt.pre_activation.PreActivationFragment> r11 = com.avito.android.cpt.pre_activation.PreActivationFragment.class
            java.lang.String r12 = "setFragmentResult"
            r9 = 1
            java.lang.String r13 = "setFragmentResult(Landroid/os/Bundle;)V"
            r14 = 0
            r8 = r15
            r10 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r2 = r5
            Y41.l r2 = (Y41.l) r2
            com.avito.android.lib.design.bottom_sheet.d r5 = r0.f126684m
            r8 = 33288(0x8208, float:4.6646E-41)
            r1 = r3
            r3 = r4
            r4 = r6
            r6 = r15
            com.avito.android.cpt.pre_activation.ui.j.a(r1, r2, r3, r4, r5, r6, r7, r8)
        La4:
            kotlin.G0 r1 = kotlin.G0.f406611a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpt.pre_activation.d.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
