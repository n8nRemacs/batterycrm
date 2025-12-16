package com.avito.android.mortgage.manager_usp;

import Y41.p;
import androidx.compose.runtime.A;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ManagerUspDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ManagerUspDialogFragment f200356l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f200357m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ManagerUspDialogFragment managerUspDialogFragment, com.avito.android.lib.design.bottom_sheet.d dVar) {
        super(2);
        this.f200356l = managerUspDialogFragment;
        this.f200357m = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    @Override // Y41.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.runtime.A r8, java.lang.Integer r9) {
        /*
            r7 = this;
            r5 = r8
            androidx.compose.runtime.A r5 = (androidx.compose.runtime.A) r5
            java.lang.Number r9 = (java.lang.Number) r9
            int r8 = r9.intValue()
            r8 = r8 & 11
            r9 = 2
            if (r8 != r9) goto L1a
            boolean r8 = r5.c()
            if (r8 != 0) goto L15
            goto L1a
        L15:
            r5.f()
            goto Le7
        L1a:
            com.avito.android.mortgage.manager_usp.ManagerUspDialogFragment r8 = r7.f200356l
            androidx.lifecycle.O0 r9 = r8.f200337i0
            java.lang.Object r0 = r9.getValue()
            com.avito.android.mortgage.manager_usp.i r0 = (com.avito.android.mortgage.manager_usp.i) r0
            kotlinx.coroutines.flow.n2 r0 = r0.getState()
            androidx.compose.runtime.y1 r0 = androidx.compose.runtime.C22126m3.b(r0, r5)
            java.lang.Object r0 = r0.getF42167b()
            z00.d r0 = (z00.C50335d) r0
            z00.e r0 = r0.f443691e
            java.lang.Object r1 = r9.getValue()
            com.avito.android.mortgage.manager_usp.i r1 = (com.avito.android.mortgage.manager_usp.i) r1
            r2 = -946635190(0xffffffffc7937e4a, float:-75516.58)
            r5.C(r2)
            boolean r1 = r5.B(r1)
            java.lang.Object r2 = r5.t()
            androidx.compose.runtime.A$a r3 = androidx.compose.runtime.A.f37866a
            if (r1 != 0) goto L53
            r3.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r1) goto L5b
        L53:
            com.avito.android.mortgage.manager_usp.a r2 = new com.avito.android.mortgage.manager_usp.a
            r2.<init>(r8)
            r5.H(r2)
        L5b:
            r1 = r2
            Y41.l r1 = (Y41.l) r1
            r5.h()
            java.lang.Object r2 = r9.getValue()
            com.avito.android.mortgage.manager_usp.i r2 = (com.avito.android.mortgage.manager_usp.i) r2
            r4 = -946632158(0xffffffffc7938a22, float:-75540.266)
            r5.C(r4)
            boolean r2 = r5.B(r2)
            java.lang.Object r4 = r5.t()
            if (r2 != 0) goto L7e
            r3.getClass()
            androidx.compose.runtime.A$a$a r2 = androidx.compose.runtime.A.a.f37868b
            if (r4 != r2) goto L8b
        L7e:
            java.lang.Object r9 = r9.getValue()
            com.avito.android.mortgage.manager_usp.i r9 = (com.avito.android.mortgage.manager_usp.i) r9
            kotlinx.coroutines.flow.i r4 = r9.getEvents()
            r5.H(r4)
        L8b:
            kotlinx.coroutines.flow.i r4 = (kotlinx.coroutines.flow.InterfaceC43160i) r4
            r5.h()
            r9 = -946629325(0xffffffffc7939533, float:-75562.4)
            r5.C(r9)
            boolean r9 = r5.B(r8)
            java.lang.Object r2 = r5.t()
            if (r9 != 0) goto La7
            r3.getClass()
            androidx.compose.runtime.A$a$a r9 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r9) goto Lb1
        La7:
            com.avito.android.mortgage.manager_usp.b r2 = new com.avito.android.mortgage.manager_usp.b
            com.avito.android.lib.design.bottom_sheet.d r9 = r7.f200357m
            r2.<init>(r9)
            r5.H(r2)
        Lb1:
            Y41.a r2 = (Y41.a) r2
            r5.h()
            com.avito.android.deeplink_handler.handler.composite.a r9 = r8.f200340l0
            if (r9 == 0) goto Lbb
            goto Lbc
        Lbb:
            r9 = 0
        Lbc:
            r6 = -946625738(0xffffffffc793a336, float:-75590.42)
            r5.C(r6)
            boolean r9 = r5.B(r9)
            java.lang.Object r6 = r5.t()
            if (r9 != 0) goto Ld3
            r3.getClass()
            androidx.compose.runtime.A$a$a r9 = androidx.compose.runtime.A.a.f37868b
            if (r6 != r9) goto Ldb
        Ld3:
            com.avito.android.mortgage.manager_usp.c r6 = new com.avito.android.mortgage.manager_usp.c
            r6.<init>(r8)
            r5.H(r6)
        Ldb:
            r3 = r6
            Y41.l r3 = (Y41.l) r3
            r5.h()
            r6 = 32768(0x8000, float:4.5918E-41)
            com.avito.android.mortgage.manager_usp.h.d(r0, r1, r2, r3, r4, r5, r6)
        Le7:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.manager_usp.d.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
