package com.avito.android.fees_methods.screen.fees_by_package.ui;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FeesByPackageFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ FeesByPackageFragment f158164l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f158165m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(FeesByPackageFragment feesByPackageFragment, InterfaceC22204y1 interfaceC22204y1) {
        super(2);
        this.f158164l = feesByPackageFragment;
        this.f158165m = interfaceC22204y1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    @Override // Y41.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.runtime.A r14, java.lang.Integer r15) {
        /*
            r13 = this;
            r5 = r14
            androidx.compose.runtime.A r5 = (androidx.compose.runtime.A) r5
            java.lang.Number r15 = (java.lang.Number) r15
            int r14 = r15.intValue()
            r14 = r14 & 11
            r15 = 2
            if (r14 != r15) goto L1a
            boolean r14 = r5.c()
            if (r14 != 0) goto L15
            goto L1a
        L15:
            r5.f()
            goto La0
        L1a:
            androidx.compose.runtime.y1 r14 = r13.f158165m
            java.lang.Object r14 = r14.getF42167b()
            r0 = r14
            com.avito.android.fees_methods.screen.fees_by_package.mvi.entity.FeesByPackageState r0 = (com.avito.android.fees_methods.screen.fees_by_package.mvi.entity.FeesByPackageState) r0
            com.avito.android.fees_methods.screen.fees_by_package.ui.FeesByPackageFragment$a r14 = com.avito.android.fees_methods.screen.fees_by_package.ui.FeesByPackageFragment.f158064s0
            com.avito.android.fees_methods.screen.fees_by_package.ui.FeesByPackageFragment r14 = r13.f158164l
            androidx.lifecycle.O0 r15 = r14.f158069r0
            java.lang.Object r1 = r15.getValue()
            com.avito.android.fees_methods.screen.fees_by_package.ui.i r1 = (com.avito.android.fees_methods.screen.fees_by_package.ui.i) r1
            kotlinx.coroutines.flow.i r1 = r1.getEvents()
            com.avito.android.fees_methods.screen.fees_by_package.ui.b r2 = new com.avito.android.fees_methods.screen.fees_by_package.ui.b
            r2.<init>(r14)
            java.lang.Object r15 = r15.getValue()
            r8 = r15
            com.avito.android.fees_methods.screen.fees_by_package.ui.i r8 = (com.avito.android.fees_methods.screen.fees_by_package.ui.i) r8
            r15 = -2016970745(0xffffffff87c77807, float:-3.0012738E-34)
            r5.C(r15)
            boolean r15 = r5.B(r8)
            java.lang.Object r3 = r5.t()
            androidx.compose.runtime.A$a r4 = androidx.compose.runtime.A.f37866a
            if (r15 != 0) goto L58
            r4.getClass()
            androidx.compose.runtime.A$a$a r15 = androidx.compose.runtime.A.a.f37868b
            if (r3 != r15) goto L69
        L58:
            com.avito.android.fees_methods.screen.fees_by_package.ui.c r3 = new com.avito.android.fees_methods.screen.fees_by_package.ui.c
            java.lang.String r11 = "accept(Ljava/lang/Object;)V"
            r12 = 0
            r7 = 1
            java.lang.Class<com.avito.android.fees_methods.screen.fees_by_package.ui.i> r9 = com.avito.android.fees_methods.screen.fees_by_package.ui.i.class
            java.lang.String r10 = "accept"
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r5.H(r3)
        L69:
            kotlin.reflect.i r3 = (kotlin.reflect.i) r3
            r5.h()
            Y41.l r3 = (Y41.l) r3
            com.avito.android.deeplink_handler.handler.composite.a r15 = r14.f158067p0
            if (r15 == 0) goto L75
            goto L76
        L75:
            r15 = 0
        L76:
            r6 = -2016968773(0xffffffff87c77fbb, float:-3.0017265E-34)
            r5.C(r6)
            boolean r15 = r5.B(r15)
            java.lang.Object r6 = r5.t()
            if (r15 != 0) goto L8d
            r4.getClass()
            androidx.compose.runtime.A$a$a r15 = androidx.compose.runtime.A.a.f37868b
            if (r6 != r15) goto L95
        L8d:
            com.avito.android.fees_methods.screen.fees_by_package.ui.d r6 = new com.avito.android.fees_methods.screen.fees_by_package.ui.d
            r6.<init>(r14)
            r5.H(r6)
        L95:
            r4 = r6
            Y41.l r4 = (Y41.l) r4
            r5.h()
            r6 = 64
            com.avito.android.fees_methods.screen.fees_by_package.ui.compose.k.a(r0, r1, r2, r3, r4, r5, r6)
        La0:
            kotlin.G0 r14 = kotlin.G0.f406611a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.fees_methods.screen.fees_by_package.ui.e.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
