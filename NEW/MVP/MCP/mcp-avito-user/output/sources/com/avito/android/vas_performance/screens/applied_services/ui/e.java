package com.avito.android.vas_performance.screens.applied_services.ui;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AppliedServicesFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AppliedServicesFragment f320379l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f320380m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f320381n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AppliedServicesFragment appliedServicesFragment, com.avito.android.lib.design.bottom_sheet.d dVar, InterfaceC22204y1 interfaceC22204y1) {
        super(2);
        this.f320379l = appliedServicesFragment;
        this.f320380m = dVar;
        this.f320381n = interfaceC22204y1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    @Override // Y41.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.runtime.A r16, java.lang.Integer r17) {
        /*
            r15 = this;
            r0 = r15
            r7 = r16
            androidx.compose.runtime.A r7 = (androidx.compose.runtime.A) r7
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r1 = r1 & 11
            r2 = 2
            if (r1 != r2) goto L1e
            boolean r1 = r7.c()
            if (r1 != 0) goto L19
            goto L1e
        L19:
            r7.f()
            goto L91
        L1e:
            androidx.compose.runtime.y1 r1 = r0.f320381n
            java.lang.Object r1 = r1.getF42167b()
            com.avito.android.vas_performance.screens.applied_services.mvi.entity.AppliedServicesState r1 = (com.avito.android.vas_performance.screens.applied_services.mvi.entity.AppliedServicesState) r1
            com.avito.android.vas_performance.screens.applied_services.ui.AppliedServicesFragment r2 = r0.f320379l
            androidx.lifecycle.O0 r3 = r2.f320328i0
            java.lang.Object r4 = r3.getValue()
            com.avito.android.vas_performance.screens.applied_services.ui.h r4 = (com.avito.android.vas_performance.screens.applied_services.ui.h) r4
            kotlinx.coroutines.flow.i r4 = r4.getEvents()
            java.lang.Object r3 = r3.getValue()
            r10 = r3
            com.avito.android.vas_performance.screens.applied_services.ui.h r10 = (com.avito.android.vas_performance.screens.applied_services.ui.h) r10
            r3 = -2131122651(0xffffffff80f9a625, float:-2.292664E-38)
            r7.C(r3)
            boolean r3 = r7.B(r10)
            java.lang.Object r5 = r7.t()
            if (r3 != 0) goto L54
            androidx.compose.runtime.A$a r3 = androidx.compose.runtime.A.f37866a
            r3.getClass()
            androidx.compose.runtime.A$a$a r3 = androidx.compose.runtime.A.a.f37868b
            if (r5 != r3) goto L65
        L54:
            com.avito.android.vas_performance.screens.applied_services.ui.c r5 = new com.avito.android.vas_performance.screens.applied_services.ui.c
            java.lang.String r13 = "accept(Ljava/lang/Object;)V"
            r14 = 0
            r9 = 1
            java.lang.Class<com.avito.android.vas_performance.screens.applied_services.ui.h> r11 = com.avito.android.vas_performance.screens.applied_services.ui.h.class
            java.lang.String r12 = "accept"
            r8 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r7.H(r5)
        L65:
            kotlin.reflect.i r5 = (kotlin.reflect.i) r5
            r7.h()
            r3 = r5
            Y41.l r3 = (Y41.l) r3
            com.avito.android.vas_performance.screens.applied_services.ui.a r5 = r2.f320332m0
            com.avito.android.vas_performance.screens.applied_services.ui.d r6 = new com.avito.android.vas_performance.screens.applied_services.ui.d
            com.avito.android.deeplink_handler.handler.composite.a r2 = r2.f320330k0
            if (r2 == 0) goto L77
        L75:
            r10 = r2
            goto L79
        L77:
            r2 = 0
            goto L75
        L79:
            java.lang.Class<com.avito.android.deeplink_handler.handler.composite.a> r11 = com.avito.android.deeplink_handler.handler.composite.a.class
            java.lang.String r12 = "handle"
            r9 = 1
            java.lang.String r13 = "handle(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Landroid/os/Bundle;)V"
            r14 = 0
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14)
            com.avito.android.lib.design.bottom_sheet.d r8 = r0.f320380m
            r9 = 32832(0x8040, float:4.6007E-41)
            r2 = r4
            r4 = r5
            r5 = r8
            r8 = r9
            com.avito.android.vas_performance.screens.applied_services.ui.compose.h.a(r1, r2, r3, r4, r5, r6, r7, r8)
        L91:
            kotlin.G0 r1 = kotlin.G0.f406611a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vas_performance.screens.applied_services.ui.e.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
